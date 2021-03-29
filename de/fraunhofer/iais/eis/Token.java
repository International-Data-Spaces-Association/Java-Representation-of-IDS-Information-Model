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
	"Token."@en

	"A token (e.g., for authorization) mediated as part of the message."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = TokenImpl.class),
@JsonSubTypes.Type(value = DynamicAttributeToken.class),})
public interface Token {

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
	"tokenValue"@en

	"An authentication token value like JSON Web Token."@en
	*/
	
	@NotNull
	@JsonProperty("ids:tokenValue")
	String getTokenValue();
	/**
	"tokenFormat"@en

	"Describes the format of the authentication token."@en
	*/
	
	
	@JsonProperty("ids:tokenFormat")
	TokenFormat getTokenFormat();
}
