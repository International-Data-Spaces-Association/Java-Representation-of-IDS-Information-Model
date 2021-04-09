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
* "Route step"@en
* "RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold\n    one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication between app endpoints remain distinguishable.\n    "@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:RouteStep")
public class RouteStepImpl implements Serializable, RouteStep {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Route step", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold    one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication between app endpoints remain distinguishable.    ", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "app route broker"@en
	* "One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteBroker", "appRouteBroker"})
	protected ArrayList<? extends Broker> _appRouteBroker;


	/**
	* "app route broker"@en
	* "One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteClearingHouse", "appRouteClearingHouse"})
	protected ArrayList<? extends ClearingHouse> _appRouteClearingHouse;


	/**
	* "app route end"@en
	* "End of a route."@en
	*/
	@JsonAlias({"ids:appRouteEnd", "appRouteEnd"})
	protected ArrayList<? extends Endpoint> _appRouteEnd;


	/**
	* "app route output"@en
	* "ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	*/
	@JsonAlias({"ids:appRouteOutput", "appRouteOutput"})
	protected ArrayList<? extends Resource> _appRouteOutput;


	/**
	* "app route start"@en
	* "Start of a route."@en
	*/
	@JsonAlias({"ids:appRouteStart", "appRouteStart"})
	protected ArrayList<? extends Endpoint> _appRouteStart;


	/**
	* "sub route"@en
	* "Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	@JsonAlias({"ids:hasSubRoute", "hasSubRoute"})
	protected ArrayList<? extends RouteStep> _hasSubRoute;


	/**
	* "requiredDataApp"@en
	* "Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp) which is deployed in the Connector maintained by the Configuration Model and\n    whoose endpoint (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part of the catalog of AppResources in the\n    corresponding Configuration Model (cf. ids:configuredAppResource property in class ids:ConfigurationModel).\n    "@en
	*/
	@JsonAlias({"ids:requiredDataApp", "requiredDataApp"})
	protected AppRepresentation _requiredDataApp;


	/**
	* "route configuration"@en
	* "Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	*/
	@JsonAlias({"ids:routeConfiguration", "routeConfiguration"})
	protected String _routeConfiguration;


	/**
	* "route deploy method"@en
	* "Supplementary information about, e.g., the technology used, for routes."
	*/
	@NotNull
	@JsonAlias({"ids:routeDeployMethod", "routeDeployMethod"})
	protected String _routeDeployMethod;


	/**
	* "route description "@en
	* "Route description."@en
	*/
	@JsonAlias({"ids:routeDescription", "routeDescription"})
	protected String _routeDescription;


	// no manual construction
	protected RouteStepImpl() {
		id = VocabUtil.getInstance().createRandomUrl("routeStep");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp) which is deployed in the Connector maintained by the Configuration Model and\n    whoose endpoint (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part of the catalog of AppResources in the\n    corresponding Configuration Model (cf. ids:configuredAppResource property in class ids:ConfigurationModel).\n    "@en
	* @return Returns the AppRepresentation for the property requiredDataApp.
	* More information under https://w3id.org/idsa/core/requiredDataApp
	*/
	@JsonProperty("ids:requiredDataApp")
	final public AppRepresentation getRequiredDataApp() {
		return _requiredDataApp;
	}

	
	/**
	* "Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp) which is deployed in the Connector maintained by the Configuration Model and\n    whoose endpoint (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part of the catalog of AppResources in the\n    corresponding Configuration Model (cf. ids:configuredAppResource property in class ids:ConfigurationModel).\n    "@en
	* @param _requiredDataApp_ desired value for the property requiredDataApp.
	* More information under https://w3id.org/idsa/core/requiredDataApp
	*/
	final public void setRequiredDataApp (AppRepresentation _requiredDataApp_) {
		this._requiredDataApp = _requiredDataApp_;
	}

	/**
	* "Supplementary information about, e.g., the technology used, for routes."
	* @return Returns the String for the property routeDeployMethod.
	* More information under https://w3id.org/idsa/core/routeDeployMethod
	*/
	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	final public String getRouteDeployMethod() {
		return _routeDeployMethod;
	}

	
	/**
	* "Supplementary information about, e.g., the technology used, for routes."
	* @param _routeDeployMethod_ desired value for the property routeDeployMethod.
	* More information under https://w3id.org/idsa/core/routeDeployMethod
	*/
	final public void setRouteDeployMethod (String _routeDeployMethod_) {
		this._routeDeployMethod = _routeDeployMethod_;
	}

	/**
	* "Route between two or more app endpoints inside a app routing pipeline."@en
	* @return Returns the ArrayList of RouteStep for the property hasSubRoute.
	* More information under https://w3id.org/idsa/core/hasSubRoute
	*/
	@JsonProperty("ids:hasSubRoute")
	final public ArrayList<? extends RouteStep> getHasSubRoute() {
		return _hasSubRoute;
	}

	
	/**
	* "Route between two or more app endpoints inside a app routing pipeline."@en
	* @param _hasSubRoute_ desired value for the property hasSubRoute.
	* More information under https://w3id.org/idsa/core/hasSubRoute
	*/
	final public void setHasSubRoute (ArrayList<? extends RouteStep> _hasSubRoute_) {
		this._hasSubRoute = _hasSubRoute_;
	}

	/**
	* "Start of a route."@en
	* @return Returns the ArrayList of Endpoint for the property appRouteStart.
	* More information under https://w3id.org/idsa/core/appRouteStart
	*/
	@JsonProperty("ids:appRouteStart")
	final public ArrayList<? extends Endpoint> getAppRouteStart() {
		return _appRouteStart;
	}

	
	/**
	* "Start of a route."@en
	* @param _appRouteStart_ desired value for the property appRouteStart.
	* More information under https://w3id.org/idsa/core/appRouteStart
	*/
	final public void setAppRouteStart (ArrayList<? extends Endpoint> _appRouteStart_) {
		this._appRouteStart = _appRouteStart_;
	}

	/**
	* "End of a route."@en
	* @return Returns the ArrayList of Endpoint for the property appRouteEnd.
	* More information under https://w3id.org/idsa/core/appRouteEnd
	*/
	@JsonProperty("ids:appRouteEnd")
	final public ArrayList<? extends Endpoint> getAppRouteEnd() {
		return _appRouteEnd;
	}

	
	/**
	* "End of a route."@en
	* @param _appRouteEnd_ desired value for the property appRouteEnd.
	* More information under https://w3id.org/idsa/core/appRouteEnd
	*/
	final public void setAppRouteEnd (ArrayList<? extends Endpoint> _appRouteEnd_) {
		this._appRouteEnd = _appRouteEnd_;
	}

	/**
	* "ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	* @return Returns the ArrayList of Resource for the property appRouteOutput.
	* More information under https://w3id.org/idsa/core/appRouteOutput
	*/
	@JsonProperty("ids:appRouteOutput")
	final public ArrayList<? extends Resource> getAppRouteOutput() {
		return _appRouteOutput;
	}

	
	/**
	* "ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	* @param _appRouteOutput_ desired value for the property appRouteOutput.
	* More information under https://w3id.org/idsa/core/appRouteOutput
	*/
	final public void setAppRouteOutput (ArrayList<? extends Resource> _appRouteOutput_) {
		this._appRouteOutput = _appRouteOutput_;
	}

	/**
	* "One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @return Returns the ArrayList of Broker for the property appRouteBroker.
	* More information under https://w3id.org/idsa/core/appRouteBroker
	*/
	@JsonProperty("ids:appRouteBroker")
	final public ArrayList<? extends Broker> getAppRouteBroker() {
		return _appRouteBroker;
	}

	
	/**
	* "One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @param _appRouteBroker_ desired value for the property appRouteBroker.
	* More information under https://w3id.org/idsa/core/appRouteBroker
	*/
	final public void setAppRouteBroker (ArrayList<? extends Broker> _appRouteBroker_) {
		this._appRouteBroker = _appRouteBroker_;
	}

	/**
	* "One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @return Returns the ArrayList of ClearingHouse for the property appRouteClearingHouse.
	* More information under https://w3id.org/idsa/core/appRouteClearingHouse
	*/
	@JsonProperty("ids:appRouteClearingHouse")
	final public ArrayList<? extends ClearingHouse> getAppRouteClearingHouse() {
		return _appRouteClearingHouse;
	}

	
	/**
	* "One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	* @param _appRouteClearingHouse_ desired value for the property appRouteClearingHouse.
	* More information under https://w3id.org/idsa/core/appRouteClearingHouse
	*/
	final public void setAppRouteClearingHouse (ArrayList<? extends ClearingHouse> _appRouteClearingHouse_) {
		this._appRouteClearingHouse = _appRouteClearingHouse_;
	}

	/**
	* "Route description."@en
	* @return Returns the String for the property routeDescription.
	* More information under https://w3id.org/idsa/core/routeDescription
	*/
	@JsonProperty("ids:routeDescription")
	final public String getRouteDescription() {
		return _routeDescription;
	}

	
	/**
	* "Route description."@en
	* @param _routeDescription_ desired value for the property routeDescription.
	* More information under https://w3id.org/idsa/core/routeDescription
	*/
	final public void setRouteDescription (String _routeDescription_) {
		this._routeDescription = _routeDescription_;
	}

	/**
	* "Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	* @return Returns the String for the property routeConfiguration.
	* More information under https://w3id.org/idsa/core/routeConfiguration
	*/
	@JsonProperty("ids:routeConfiguration")
	final public String getRouteConfiguration() {
		return _routeConfiguration;
	}

	
	/**
	* "Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	* @param _routeConfiguration_ desired value for the property routeConfiguration.
	* More information under https://w3id.org/idsa/core/routeConfiguration
	*/
	final public void setRouteConfiguration (String _routeConfiguration_) {
		this._routeConfiguration = _routeConfiguration_;
	}
}
