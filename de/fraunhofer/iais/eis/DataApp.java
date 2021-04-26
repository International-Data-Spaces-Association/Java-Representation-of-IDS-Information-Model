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
* "DataApp"@en
* "Self-contained, self-descriptive software package that is distributed via the App Store and deployed inside a Connector; provides access to data and data processing capa­bilities; the interface of a Data App is semantically described by the IDS Information Model."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = SystemAdapter.class),
	@JsonSubTypes.Type(value = OrchestrationApp.class),
	@JsonSubTypes.Type(value = SmartDataApp.class)
})
public interface DataApp {

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

	/**
	* This function returns a hash code value for the DataApp for the benefit of e.g. hash tables.
	* @return a hash code value for the DataApp
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this DataApp is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "text documentation of the data app"@en
	* @return Returns the String for the property _appDocumentation.
	* More information under https://w3id.org/idsa/core/appDocumentation
	*/
	@JsonProperty("ids:appDocumentation")
	public String getAppDocumentation();

	/**
	* "Endpoints of a data app"@en
	* @return Returns the List of AppEndpoints for the property _appEndpoint.
	* More information under https://w3id.org/idsa/core/appEndpoint
	*/
	@NotEmpty
	@JsonProperty("ids:appEndpoint")
	public List<AppEndpoint> getAppEndpoint();

	/**
	* "Necessary or optional environment variables of a data app."@en
	* @return Returns the String for the property _appEnvironmentVariables.
	* More information under https://w3id.org/idsa/core/appEnvironmentVariables
	*/
	@JsonProperty("ids:appEnvironmentVariables")
	public String getAppEnvironmentVariables();

	/**
	* "Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	* @return Returns the String for the property _appStorageConfiguration.
	* More information under https://w3id.org/idsa/core/appStorageConfiguration
	*/
	@JsonProperty("ids:appStorageConfiguration")
	public String getAppStorageConfiguration();

	/**
	* "IDS Usage Policies a DataApp supports"@en
	* @return Returns the List of UsagePolicyClasss for the property _supportedUsagePolicies.
	* More information under https://w3id.org/idsa/core/supportedUsagePolicies
	*/
	@JsonProperty("ids:supportedUsagePolicies")
	public List<UsagePolicyClass> getSupportedUsagePolicies();

}
