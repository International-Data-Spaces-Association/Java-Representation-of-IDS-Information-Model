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

	"The class of persons (people)"@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = PersonImpl.class),})
public interface Person {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"phoneNumber"@en

	"Phone number of a person."@en
	*/
	
	
	@JsonProperty("ids:phoneNumber")
	java.util.ArrayList<? extends String> getPhoneNumber();
	/**
	"emailAddress"@en

	"Email contact of a person."@en
	*/
	
	
	@JsonProperty("ids:emailAddress")
	java.util.ArrayList<? extends String> getEmailAddress();
	/**
	"familyName"@en

	"Family name of a Person."@en
	*/
	
	
	@JsonProperty("ids:familyName")
	String getFamilyName();
	/**
	"givenName"@en

	"Given name of a Person."@en
	*/
	
	
	@JsonProperty("ids:givenName")
	String getGivenName();
	/**
	"homepage"@en

	"Website providing additional information about a person."@en
	*/
	
	
	@JsonProperty("ids:homepage")
	String getHomepage();
}
