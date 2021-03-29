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
	"AuthInfo"@en

	"Holds authentication information so that connections to the Connector\'s data offerings can be establised."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AuthInfoImpl.class),})
public interface AuthInfo {

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
	"authService"@en

	"The URL of the authentication service that is provided by the Connector."@en
	*/
	
	@NotNull
	@JsonProperty("ids:authService")
	URI getAuthService();
	/**
	"authStandard"@en

	"The standard used by the authentication service that is provided by the Connector."@en
	*/
	
	
	@JsonProperty("ids:authStandard")
	AuthStandard getAuthStandard();
}
