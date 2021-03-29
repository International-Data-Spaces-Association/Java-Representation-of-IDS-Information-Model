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
	"App Route"@en

	"\n    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.\n    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between two adjacent data apps is represented by the ids:RouteStep class.\n    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.\n    "@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppRouteImpl.class),
@JsonSubTypes.Type(value = RouteStep.class),})
public interface AppRoute {

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
	"route deploy method"@en

	"Supplementary information about, e.g., the technology used, for routes."
	*/
	
	@NotNull
	@JsonProperty("ids:routeDeployMethod")
	String getRouteDeployMethod();
	/**
	"sub route"@en

	"Route between two or more app endpoints inside a app routing pipeline."@en
	*/
	
	
	@JsonProperty("ids:hasSubRoute")
	java.util.ArrayList<? extends RouteStep> getHasSubRoute();
	/**
	"app route start"@en

	"Start of a route."@en
	*/
	
	
	@JsonProperty("ids:appRouteStart")
	java.util.ArrayList<? extends Endpoint> getAppRouteStart();
	/**
	"app route end"@en

	"End of a route."@en
	*/
	
	
	@JsonProperty("ids:appRouteEnd")
	java.util.ArrayList<? extends Endpoint> getAppRouteEnd();
	/**
	"app route output"@en

	"ids:Resource that corresponds to the output of an app route.\nRationale: whereas an ids:Endpoint can have an ids:endpointArtifact, it is additionally important that the data flow inside the ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of ids:Resource!) associated with the data coming into the Connector or going out of the Connector.\nUse: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s) configured for this AppRoute.\nNote: In an ids:AppRoute that is the sequence of multiple ids:RouteSteps, the output resource of one step serves immediately as the input that is processed by the subsequent step(s).  An ids:SystemAdapter typically does not change the ids:Resource, but might rather make it available in a different ids:Representation.  An ids:SmartDataApp might replate its input(s) by an entirely different (e.g., fused) resource.\n"@en
	*/
	
	
	@JsonProperty("ids:appRouteOutput")
	java.util.ArrayList<? extends Resource> getAppRouteOutput();
	/**
	"app route broker"@en

	"One or more ids:Broker(s) to which changes/updates of this route\'s ids:appRouteOutput ids:Resource are announced.\nThis should be a subset of those Brokers that have been configured as ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	
	
	@JsonProperty("ids:appRouteBroker")
	java.util.ArrayList<? extends Broker> getAppRouteBroker();
	/**
	"app route broker"@en

	"One or more ids:ClearingHouse(s) to which information of this route\'s  data exchange are notified.\nThis should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog for a given configuration model. The Configuration Model ids:configuredClearingHouse in the ids:ConfigurationModel of which this is an ids:appRoute.\n"@en
	*/
	
	
	@JsonProperty("ids:appRouteClearingHouse")
	java.util.ArrayList<? extends ClearingHouse> getAppRouteClearingHouse();
	/**
	"route description "@en

	"Route description."@en
	*/
	
	
	@JsonProperty("ids:routeDescription")
	String getRouteDescription();
	/**
	"route configuration"@en

	"Configuration details (e.g. contents of a config file) used to configure the route. Should be Base64 encoded."@en
	*/
	
	
	@JsonProperty("ids:routeConfiguration")
	String getRouteConfiguration();
}
