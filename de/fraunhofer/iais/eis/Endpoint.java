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
	"Endpoint"@en

	"Access point of data exchange, service interaction and service description."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = EndpointImpl.class),
@JsonSubTypes.Type(value = AppEndpoint.class),

@JsonSubTypes.Type(value = ConnectorEndpoint.class),

@JsonSubTypes.Type(value = GenericEndpoint.class),})
public interface Endpoint {

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
	"endpoint information"@en

	"Human-readable information and description of the endpoint."@en
	*/
	
	
	@JsonProperty("ids:endpointInformation")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getEndpointInformation();
	/**
	"endpoint documentation"@en

	"IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	*/
	
	
	@JsonProperty("ids:endpointDocumentation")
	java.util.ArrayList<? extends URI> getEndpointDocumentation();
	/**
	"access URL"@en

	"Access URL of an endpoint."@en
	*/
	
	
	@JsonProperty("ids:accessURL")
	URI getAccessURL();
	/**
	"path"@en

	"Relative path, topic or queue at which the content is published by the related host."@en
	*/
	
	
	@JsonProperty("ids:path")
	String getPath();
	/**
	"inbound topic"@en

	"Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	*/
	
	
	@JsonProperty("ids:inboundPath")
	String getInboundPath();
	/**
	"outbound topic"@en

	"Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	*/
	
	
	@JsonProperty("ids:outboundPath")
	String getOutboundPath();
}
