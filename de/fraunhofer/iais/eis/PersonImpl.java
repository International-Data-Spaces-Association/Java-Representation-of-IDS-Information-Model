package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 
* "Person"@en
* "The class of persons (people)"@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Person")
public class PersonImpl implements Serializable, Person {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Person", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of persons (people)", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "emailAddress"@en
	* "Email contact of a person."@en
	*/
	@JsonAlias({"ids:emailAddress", "emailAddress"})
	protected ArrayList<? extends String> _emailAddress;


	/**
	* "familyName"@en
	* "Family name of a Person."@en
	*/
	@JsonAlias({"ids:familyName", "familyName"})
	protected String _familyName;


	/**
	* "givenName"@en
	* "Given name of a Person."@en
	*/
	@JsonAlias({"ids:givenName", "givenName"})
	protected String _givenName;


	/**
	* "homepage"@en
	* "Website providing additional information about a person."@en
	*/
	@JsonAlias({"ids:homepage", "homepage"})
	protected String _homepage;


	/**
	* "phoneNumber"@en
	* "Phone number of a person."@en
	*/
	@JsonAlias({"ids:phoneNumber", "phoneNumber"})
	protected ArrayList<? extends String> _phoneNumber;


	// no manual construction
	protected PersonImpl() {
		id = VocabUtil.getInstance().createRandomUrl("person");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "Phone number of a person."@en
	* @return Returns the ArrayList of String for the property phoneNumber.
	* More information under https://w3id.org/idsa/core/phoneNumber
	*/
	@JsonProperty("ids:phoneNumber")
	final public ArrayList<? extends String> getPhoneNumber() {
		return _phoneNumber;
	}

	
	/**
	* "Phone number of a person."@en
	* @param _phoneNumber_ desired value for the property phoneNumber.
	* More information under https://w3id.org/idsa/core/phoneNumber
	*/
	final public void setPhoneNumber (ArrayList<? extends String> _phoneNumber_) {
		this._phoneNumber = _phoneNumber_;
	}

	/**
	* "Email contact of a person."@en
	* @return Returns the ArrayList of String for the property emailAddress.
	* More information under https://w3id.org/idsa/core/emailAddress
	*/
	@JsonProperty("ids:emailAddress")
	final public ArrayList<? extends String> getEmailAddress() {
		return _emailAddress;
	}

	
	/**
	* "Email contact of a person."@en
	* @param _emailAddress_ desired value for the property emailAddress.
	* More information under https://w3id.org/idsa/core/emailAddress
	*/
	final public void setEmailAddress (ArrayList<? extends String> _emailAddress_) {
		this._emailAddress = _emailAddress_;
	}

	/**
	* "Family name of a Person."@en
	* @return Returns the String for the property familyName.
	* More information under https://w3id.org/idsa/core/familyName
	*/
	@JsonProperty("ids:familyName")
	final public String getFamilyName() {
		return _familyName;
	}

	
	/**
	* "Family name of a Person."@en
	* @param _familyName_ desired value for the property familyName.
	* More information under https://w3id.org/idsa/core/familyName
	*/
	final public void setFamilyName (String _familyName_) {
		this._familyName = _familyName_;
	}

	/**
	* "Given name of a Person."@en
	* @return Returns the String for the property givenName.
	* More information under https://w3id.org/idsa/core/givenName
	*/
	@JsonProperty("ids:givenName")
	final public String getGivenName() {
		return _givenName;
	}

	
	/**
	* "Given name of a Person."@en
	* @param _givenName_ desired value for the property givenName.
	* More information under https://w3id.org/idsa/core/givenName
	*/
	final public void setGivenName (String _givenName_) {
		this._givenName = _givenName_;
	}

	/**
	* "Website providing additional information about a person."@en
	* @return Returns the String for the property homepage.
	* More information under https://w3id.org/idsa/core/homepage
	*/
	@JsonProperty("ids:homepage")
	final public String getHomepage() {
		return _homepage;
	}

	
	/**
	* "Website providing additional information about a person."@en
	* @param _homepage_ desired value for the property homepage.
	* More information under https://w3id.org/idsa/core/homepage
	*/
	final public void setHomepage (String _homepage_) {
		this._homepage = _homepage_;
	}

}
