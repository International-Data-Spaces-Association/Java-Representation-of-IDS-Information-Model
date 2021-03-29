package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Person"@en

	"The class of persons (people)"@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Person")
public class PersonImpl implements Serializable, Person {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Person", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of persons (people)", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"emailAddress"@en

	"Email contact of a person."@en
	*/
	@JsonAlias({"ids:emailAddress", "emailAddress"})
	 java.util.ArrayList<? extends String> _emailAddress;

	/**
	"familyName"@en

	"Family name of a Person."@en
	*/
	@JsonAlias({"ids:familyName", "familyName"})
	 String _familyName;

	/**
	"givenName"@en

	"Given name of a Person."@en
	*/
	@JsonAlias({"ids:givenName", "givenName"})
	 String _givenName;

	/**
	"homepage"@en

	"Website providing additional information about a person."@en
	*/
	@JsonAlias({"ids:homepage", "homepage"})
	 String _homepage;

	/**
	"phoneNumber"@en

	"Phone number of a person."@en
	*/
	@JsonAlias({"ids:phoneNumber", "phoneNumber"})
	 java.util.ArrayList<? extends String> _phoneNumber;

	// no manual construction
	PersonImpl() {
		id = VocabUtil.getInstance().createRandomUrl("person");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:phoneNumber")
	java.util.ArrayList<? extends String> getPhoneNumber() {
		return _phoneNumber;
	}
	final public void setPhoneNumber (java.util.ArrayList<? extends String> _phoneNumber_) {
		this._phoneNumber = _phoneNumber_;
	}

	final public 
	
	
	@JsonProperty("ids:emailAddress")
	java.util.ArrayList<? extends String> getEmailAddress() {
		return _emailAddress;
	}
	final public void setEmailAddress (java.util.ArrayList<? extends String> _emailAddress_) {
		this._emailAddress = _emailAddress_;
	}

	final public 
	
	
	@JsonProperty("ids:familyName")
	String getFamilyName() {
		return _familyName;
	}
	final public void setFamilyName (String _familyName_) {
		this._familyName = _familyName_;
	}

	final public 
	
	
	@JsonProperty("ids:givenName")
	String getGivenName() {
		return _givenName;
	}
	final public void setGivenName (String _givenName_) {
		this._givenName = _givenName_;
	}

	final public 
	
	
	@JsonProperty("ids:homepage")
	String getHomepage() {
		return _homepage;
	}
	final public void setHomepage (String _homepage_) {
		this._homepage = _homepage_;
	}

}
