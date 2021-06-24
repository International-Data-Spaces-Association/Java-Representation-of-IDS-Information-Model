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
* "DataApp Endpoint"@en
* "Description of endpoints a DataApp offers."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AppEndpointImpl.class)
})
public interface AppEndpoint extends Endpoint {

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

	// accessor methods as derived from the IDS Information Model ontology


	/**
	* "Type of an app endpoint. Data apps have different endpoint types, e.g., for input, output or health status."@en
	* @return Returns the AppEndpointType for the property _appEndpointType.
	* More information under https://w3id.org/idsa/core/appEndpointType
	*/
	@NotNull
	@JsonProperty("ids:appEndpointType")
	public AppEndpointType getAppEndpointType();

	/**
	* "Port used to access the endpoint."@en
	* @return Returns the BigInteger for the property _appEndpointPort.
	* More information under https://w3id.org/idsa/core/appEndpointPort
	*/
	@JsonProperty("ids:appEndpointPort")
	public BigInteger getAppEndpointPort();

	/**
	* "Mediatype, such as IANA types, of the data an endpoint expects or returns ."@en
	* @return Returns the MediaType for the property _appEndpointMediaType.
	* More information under https://w3id.org/idsa/core/appEndpointMediaType
	*/
	@JsonProperty("ids:appEndpointMediaType")
	public MediaType getAppEndpointMediaType();

	/**
	* "Protocol used to communicate with the app endpoint."@en
	* @return Returns the String for the property _appEndpointProtocol.
	* More information under https://w3id.org/idsa/core/appEndpointProtocol
	*/
	@JsonProperty("ids:appEndpointProtocol")
	public String getAppEndpointProtocol();

	/**
	* "Natural language(s) used within the content."@en
	* @return Returns the Language for the property _language.
	* More information under https://w3id.org/idsa/core/language
	*/
	@JsonProperty("ids:language")
	public Language getLanguage();

}
