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
	"Route step"@en

	"RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold\n    one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication between app endpoints remain distinguishable.\n    "@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:RouteStep")
public class RouteStepImpl implements Serializable, RouteStep {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Route step", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold    one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication between app endpoints remain distinguishable.    ", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"app route broker"@en

	"One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteBroker", "appRouteBroker"})
	 java.util.ArrayList<? extends Broker> _appRouteBroker;

	/**
	"app route broker"@en

	"One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteClearingHouse", "appRouteClearingHouse"})
	 java.util.ArrayList<? extends ClearingHouse> _appRouteClearingHouse;

	/**
	"app route end"@en

	"End of a route."@en
	*/
	@JsonAlias({"ids:appRouteEnd", "appRouteEnd"})
	 java.util.ArrayList<? extends Endpoint> _appRouteEnd;

	/**
	"app route output"@en

	"ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	*/
	@JsonAlias({"ids:appRouteOutput", "appRouteOutput"})
	 java.util.ArrayList<? extends Resource> _appRouteOutput;

	/**
	"app route start"@en

	"Start of a route."@en
	*/
	@JsonAlias({"ids:appRouteStart", "appRouteStart"})
	 java.util.ArrayList<? extends Endpoint> _appRouteStart;

	/**
	"sub route"@en

	"Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	@JsonAlias({"ids:hasSubRoute", "hasSubRoute"})
	 java.util.ArrayList<? extends RouteStep> _hasSubRoute;

	/**
	"requiredDataApp"@en

	"Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp) which is deployed in the Connector maintained by the Configuration Model and\n    whoose endpoint (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part of the catalog of AppResources in the\n    corresponding Configuration Model (cf. ids:configuredAppResource property in class ids:ConfigurationModel).\n    "@en
	*/
	@JsonAlias({"ids:requiredDataApp", "requiredDataApp"})
	 AppRepresentation _requiredDataApp;

	/**
	"route configuration"@en

	"Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	*/
	@JsonAlias({"ids:routeConfiguration", "routeConfiguration"})
	 String _routeConfiguration;

	/**
	"route deploy method"@en

	"Supplementary information about, e.g., the technology used, for routes."
	*/
	@NotNull@JsonAlias({"ids:routeDeployMethod", "routeDeployMethod"})
	 String _routeDeployMethod;

	/**
	"route description "@en

	"Route description."@en
	*/
	@JsonAlias({"ids:routeDescription", "routeDescription"})
	 String _routeDescription;

	// no manual construction
	RouteStepImpl() {
		id = VocabUtil.getInstance().createRandomUrl("routeStep");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:requiredDataApp")
	AppRepresentation getRequiredDataApp() {
		return _requiredDataApp;
	}
	final public void setRequiredDataApp (AppRepresentation _requiredDataApp_) {
		this._requiredDataApp = _requiredDataApp_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	String getRouteDeployMethod() {
		return _routeDeployMethod;
	}
	final public void setRouteDeployMethod (String _routeDeployMethod_) {
		this._routeDeployMethod = _routeDeployMethod_;
	}

	final public 
	
	
	@JsonProperty("ids:hasSubRoute")
	java.util.ArrayList<? extends RouteStep> getHasSubRoute() {
		return _hasSubRoute;
	}
	final public void setHasSubRoute (java.util.ArrayList<? extends RouteStep> _hasSubRoute_) {
		this._hasSubRoute = _hasSubRoute_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteStart")
	java.util.ArrayList<? extends Endpoint> getAppRouteStart() {
		return _appRouteStart;
	}
	final public void setAppRouteStart (java.util.ArrayList<? extends Endpoint> _appRouteStart_) {
		this._appRouteStart = _appRouteStart_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteEnd")
	java.util.ArrayList<? extends Endpoint> getAppRouteEnd() {
		return _appRouteEnd;
	}
	final public void setAppRouteEnd (java.util.ArrayList<? extends Endpoint> _appRouteEnd_) {
		this._appRouteEnd = _appRouteEnd_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteOutput")
	java.util.ArrayList<? extends Resource> getAppRouteOutput() {
		return _appRouteOutput;
	}
	final public void setAppRouteOutput (java.util.ArrayList<? extends Resource> _appRouteOutput_) {
		this._appRouteOutput = _appRouteOutput_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteBroker")
	java.util.ArrayList<? extends Broker> getAppRouteBroker() {
		return _appRouteBroker;
	}
	final public void setAppRouteBroker (java.util.ArrayList<? extends Broker> _appRouteBroker_) {
		this._appRouteBroker = _appRouteBroker_;
	}

	final public 
	
	
	@JsonProperty("ids:appRouteClearingHouse")
	java.util.ArrayList<? extends ClearingHouse> getAppRouteClearingHouse() {
		return _appRouteClearingHouse;
	}
	final public void setAppRouteClearingHouse (java.util.ArrayList<? extends ClearingHouse> _appRouteClearingHouse_) {
		this._appRouteClearingHouse = _appRouteClearingHouse_;
	}

	final public 
	
	
	@JsonProperty("ids:routeDescription")
	String getRouteDescription() {
		return _routeDescription;
	}
	final public void setRouteDescription (String _routeDescription_) {
		this._routeDescription = _routeDescription_;
	}

	final public 
	
	
	@JsonProperty("ids:routeConfiguration")
	String getRouteConfiguration() {
		return _routeConfiguration;
	}
	final public void setRouteConfiguration (String _routeConfiguration_) {
		this._routeConfiguration = _routeConfiguration_;
	}
}
