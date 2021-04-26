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
import java.util.Objects;
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
	protected List<String> _emailAddress;


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
	protected List<String> _phoneNumber;


	// no manual construction
	protected PersonImpl() {
		id = VocabUtil.getInstance().createRandomUrl("person");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	public int hashCode() {
		return Objects.hash(new Object[]{this._familyName,
			this._givenName,
			this._phoneNumber,
			this._emailAddress,
			this._homepage});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			PersonImpl other = (PersonImpl) obj;
			return Objects.equals(this._familyName, other._familyName) &&
				Objects.equals(this._givenName, other._givenName) &&
				Objects.equals(this._phoneNumber, other._phoneNumber) &&
				Objects.equals(this._emailAddress, other._emailAddress) &&
				Objects.equals(this._homepage, other._homepage);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@JsonProperty("ids:familyName")
	final public String getFamilyName() {
		return _familyName;
	}
	
	final public void setFamilyName (String _familyName_) {
		this._familyName = _familyName_;
	}

	@JsonProperty("ids:givenName")
	final public String getGivenName() {
		return _givenName;
	}
	
	final public void setGivenName (String _givenName_) {
		this._givenName = _givenName_;
	}

	@JsonProperty("ids:phoneNumber")
	final public List<String> getPhoneNumber() {
		return _phoneNumber;
	}
	
	final public void setPhoneNumber (List<String> _phoneNumber_) {
		this._phoneNumber = _phoneNumber_;
	}

	@JsonProperty("ids:emailAddress")
	final public List<String> getEmailAddress() {
		return _emailAddress;
	}
	
	final public void setEmailAddress (List<String> _emailAddress_) {
		this._emailAddress = _emailAddress_;
	}

	@JsonProperty("ids:homepage")
	final public String getHomepage() {
		return _homepage;
	}
	
	final public void setHomepage (String _homepage_) {
		this._homepage = _homepage_;
	}

}
