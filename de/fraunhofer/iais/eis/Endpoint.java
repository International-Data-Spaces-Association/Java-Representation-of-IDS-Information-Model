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
* "Endpoint"@en
* "Access point of data exchange, service interaction and service description."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = EndpointImpl.class),
	@JsonSubTypes.Type(value = ConnectorEndpoint.class),
	@JsonSubTypes.Type(value = AppEndpoint.class),
	@JsonSubTypes.Type(value = GenericEndpoint.class)
})
public interface Endpoint {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Human-readable information and description of the endpoint."@en
	* @return Returns the ArrayList of TypedLiteral for the property endpointInformation.
	* More information under https://w3id.org/idsa/core/endpointInformation
	*/
	@JsonProperty("ids:endpointInformation")
	public ArrayList<? extends TypedLiteral> getEndpointInformation();

	/**
	* "IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based documentation."@en
	* @return Returns the ArrayList of URI for the property endpointDocumentation.
	* More information under https://w3id.org/idsa/core/endpointDocumentation
	*/
	@JsonProperty("ids:endpointDocumentation")
	public ArrayList<? extends URI> getEndpointDocumentation();

	/**
	* "Access URL of an endpoint."@en
	* @return Returns the URI for the property accessURL.
	* More information under https://w3id.org/idsa/core/accessURL
	*/
	@JsonProperty("ids:accessURL")
	public URI getAccessURL();

	/**
	* "Relative path, topic or queue at which the content is published by the related host."@en
	* @return Returns the String for the property path.
	* More information under https://w3id.org/idsa/core/path
	*/
	@JsonProperty("ids:path")
	public String getPath();

	/**
	* "Relative path used for inbound communication via this endpoint, i.e., input messages and faults only."@en
	* @return Returns the String for the property inboundPath.
	* More information under https://w3id.org/idsa/core/inboundPath
	*/
	@JsonProperty("ids:inboundPath")
	public String getInboundPath();

	/**
	* "Relative path used for outbound communication via this endpoint, i.e., output messages and faults only."@en
	* @return Returns the String for the property outboundPath.
	* More information under https://w3id.org/idsa/core/outboundPath
	*/
	@JsonProperty("ids:outboundPath")
	public String getOutboundPath();

}
