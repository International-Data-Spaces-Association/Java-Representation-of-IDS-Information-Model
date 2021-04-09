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
* "App Route"@en
* "\n    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.\n    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between two adjacent data apps is represented by the ids:RouteStep class.\n    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.\n    "@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AppRouteImpl.class),
	@JsonSubTypes.Type(value = RouteStep.class)
})
public interface AppRoute {

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
	* "Supplementary information about, e.g., the technology used, for routes."
	* @return Returns the String for the property routeDeployMethod.
	* More information under https://w3id.org/idsa/core/routeDeployMethod
	*/
	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	public String getRouteDeployMethod();

	/**
	* "Route between two or more app endpoints inside a app routing pipeline."@en
	* @return Returns the ArrayList of RouteStep for the property hasSubRoute.
	* More information under https://w3id.org/idsa/core/hasSubRoute
	*/
	@JsonProperty("ids:hasSubRoute")
	public ArrayList<? extends RouteStep> getHasSubRoute();

	/**
	* "Start of a route."@en
	* @return Returns the ArrayList of Endpoint for the property appRouteStart.
	* More information under https://w3id.org/idsa/core/appRouteStart
	*/
	@JsonProperty("ids:appRouteStart")
	public ArrayList<? extends Endpoint> getAppRouteStart();

	/**
	* "End of a route."@en
	* @return Returns the ArrayList of Endpoint for the property appRouteEnd.
	* More information under https://w3id.org/idsa/core/appRouteEnd
	*/
	@JsonProperty("ids:appRouteEnd")
	public ArrayList<? extends Endpoint> getAppRouteEnd();

	/**
	* "ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	* @return Returns the ArrayList of Resource for the property appRouteOutput.
	* More information under https://w3id.org/idsa/core/appRouteOutput
	*/
	@JsonProperty("ids:appRouteOutput")
	public ArrayList<? extends Resource> getAppRouteOutput();

	/**
	* "One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @return Returns the ArrayList of Broker for the property appRouteBroker.
	* More information under https://w3id.org/idsa/core/appRouteBroker
	*/
	@JsonProperty("ids:appRouteBroker")
	public ArrayList<? extends Broker> getAppRouteBroker();

	/**
	* "One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @return Returns the ArrayList of ClearingHouse for the property appRouteClearingHouse.
	* More information under https://w3id.org/idsa/core/appRouteClearingHouse
	*/
	@JsonProperty("ids:appRouteClearingHouse")
	public ArrayList<? extends ClearingHouse> getAppRouteClearingHouse();

	/**
	* "Route description."@en
	* @return Returns the String for the property routeDescription.
	* More information under https://w3id.org/idsa/core/routeDescription
	*/
	@JsonProperty("ids:routeDescription")
	public String getRouteDescription();

	/**
	* "Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	* @return Returns the String for the property routeConfiguration.
	* More information under https://w3id.org/idsa/core/routeConfiguration
	*/
	@JsonProperty("ids:routeConfiguration")
	public String getRouteConfiguration();

}
