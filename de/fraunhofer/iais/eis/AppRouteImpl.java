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
* "App Route"@en
* "\n    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.\n    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between two adjacent data apps is represented by the ids:RouteStep class.\n    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.\n    "@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppRoute")
public class AppRouteImpl implements AppRoute {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Route", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between two adjacent data apps is represented by the ids:RouteStep class.    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.    ", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "app route broker"@en
	* "One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteBroker", "appRouteBroker"})
	protected List<Broker> _appRouteBroker;


	/**
	* "app route broker"@en
	* "One or more ids:ClearingHouse(s) to which information of this route\'s data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	@JsonAlias({"ids:appRouteClearingHouse", "appRouteClearingHouse"})
	protected List<ClearingHouse> _appRouteClearingHouse;


	/**
	* "app route end"@en
	* "End of a route."@en
	*/
	@JsonAlias({"ids:appRouteEnd", "appRouteEnd"})
	protected List<Endpoint> _appRouteEnd;


	/**
	* "app route output"@en
	* "ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	*/
	@JsonAlias({"ids:appRouteOutput", "appRouteOutput"})
	protected List<Resource> _appRouteOutput;


	/**
	* "app route start"@en
	* "Start of a route."@en
	*/
	@JsonAlias({"ids:appRouteStart", "appRouteStart"})
	protected List<Endpoint> _appRouteStart;


	/**
	* "sub route"@en
	* "Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	@JsonAlias({"ids:hasSubRoute", "hasSubRoute"})
	protected List<RouteStep> _hasSubRoute;


	/**
	* "route configuration"@en
	* "Configuration details (e.g., contents of a config file) used to configure the route. Should be Base64 encoded."@en
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
	protected AppRouteImpl() {
		id = VocabUtil.getInstance().createRandomUrl("appRoute");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._routeDeployMethod,
			this._routeDescription,
			this._routeConfiguration,
			this._hasSubRoute,
			this._appRouteStart,
			this._appRouteEnd,
			this._appRouteOutput,
			this._appRouteBroker,
			this._appRouteClearingHouse});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			AppRouteImpl other = (AppRouteImpl) obj;
			return Objects.equals(this._routeDeployMethod, other._routeDeployMethod) &&
				Objects.equals(this._routeDescription, other._routeDescription) &&
				Objects.equals(this._routeConfiguration, other._routeConfiguration) &&
				Objects.equals(this._hasSubRoute, other._hasSubRoute) &&
				Objects.equals(this._appRouteStart, other._appRouteStart) &&
				Objects.equals(this._appRouteEnd, other._appRouteEnd) &&
				Objects.equals(this._appRouteOutput, other._appRouteOutput) &&
				Objects.equals(this._appRouteBroker, other._appRouteBroker) &&
				Objects.equals(this._appRouteClearingHouse, other._appRouteClearingHouse);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	final public String getRouteDeployMethod() {
		return _routeDeployMethod;
	}
	
	final public void setRouteDeployMethod (String _routeDeployMethod_) {
		this._routeDeployMethod = _routeDeployMethod_;
	}

	@JsonProperty("ids:routeDescription")
	final public String getRouteDescription() {
		return _routeDescription;
	}
	
	final public void setRouteDescription (String _routeDescription_) {
		this._routeDescription = _routeDescription_;
	}

	@JsonProperty("ids:routeConfiguration")
	final public String getRouteConfiguration() {
		return _routeConfiguration;
	}
	
	final public void setRouteConfiguration (String _routeConfiguration_) {
		this._routeConfiguration = _routeConfiguration_;
	}

	@JsonProperty("ids:hasSubRoute")
	final public List<RouteStep> getHasSubRoute() {
		return _hasSubRoute;
	}
	
	final public void setHasSubRoute (List<RouteStep> _hasSubRoute_) {
		this._hasSubRoute = _hasSubRoute_;
	}

	@JsonProperty("ids:appRouteStart")
	final public List<Endpoint> getAppRouteStart() {
		return _appRouteStart;
	}
	
	final public void setAppRouteStart (List<Endpoint> _appRouteStart_) {
		this._appRouteStart = _appRouteStart_;
	}

	@JsonProperty("ids:appRouteEnd")
	final public List<Endpoint> getAppRouteEnd() {
		return _appRouteEnd;
	}
	
	final public void setAppRouteEnd (List<Endpoint> _appRouteEnd_) {
		this._appRouteEnd = _appRouteEnd_;
	}

	@JsonProperty("ids:appRouteOutput")
	final public List<Resource> getAppRouteOutput() {
		return _appRouteOutput;
	}
	
	final public void setAppRouteOutput (List<Resource> _appRouteOutput_) {
		this._appRouteOutput = _appRouteOutput_;
	}

	@JsonProperty("ids:appRouteBroker")
	final public List<Broker> getAppRouteBroker() {
		return _appRouteBroker;
	}
	
	final public void setAppRouteBroker (List<Broker> _appRouteBroker_) {
		this._appRouteBroker = _appRouteBroker_;
	}

	@JsonProperty("ids:appRouteClearingHouse")
	final public List<ClearingHouse> getAppRouteClearingHouse() {
		return _appRouteClearingHouse;
	}
	
	final public void setAppRouteClearingHouse (List<ClearingHouse> _appRouteClearingHouse_) {
		this._appRouteClearingHouse = _appRouteClearingHouse_;
	}
}
