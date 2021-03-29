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
	"DataApp Endpoint"@en

	"Description of endpoints a DataApp offers."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppEndpointImpl.class),})
public interface AppEndpoint extends Endpoint {

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
	"App endpoint type"@en

	"Type of an app endpoint. Data apps have different endpoint types, e.g., for input, output or health status."@en
	*/
	
	@NotNull
	@JsonProperty("ids:appEndpointType")
	AppEndpointType getAppEndpointType();
	/**
	"app endpoint port"@en

	"Port used to access the endpoint."@en
	*/
	
	
	@JsonProperty("ids:appEndpointPort")
	BigInteger getAppEndpointPort();
	/**
	"app endpoint media type"@en

	"Mediatype, such as IANA types, of the data an endpoint expects or returns ."@en
	*/
	
	
	@JsonProperty("ids:appEndpointMediaType")
	MediaType getAppEndpointMediaType();
	/**
	"app endpoint protocol"@en

	"Protocol used to communicate with the app endpoint."@en
	*/
	
	
	@JsonProperty("ids:appEndpointProtocol")
	String getAppEndpointProtocol();
	/**
	"language"@en

	"Natural language(s) used within the content."@en
	*/
	
	
	@JsonProperty("ids:language")
	Language getLanguage();
}
