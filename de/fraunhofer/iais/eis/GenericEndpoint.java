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
	"Generic Endpoint"@en

	"Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = GenericEndpointImpl.class),})
public interface GenericEndpoint extends Endpoint {

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
	"generic endpoint authentication"@en

	"Authentication credentials for generic endpoints. "@en
	*/
	
	
	@JsonProperty("ids:genericEndpointAuthentication")
	BasicAuthentication getGenericEndpointAuthentication();
	/**
	"generic endpoint configuration"@en

	"Endpoint-specific configuration details (e.g., contents of a config file) used for the endpoint."@en
	*/
	
	
	@JsonProperty("ids:genericEndpointConfiguration")
	String getGenericEndpointConfiguration();
}
