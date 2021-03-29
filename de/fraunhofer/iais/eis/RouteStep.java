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

	"RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold\n    one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication between app endpoints remain distinguishable.\n    "@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RouteStepImpl.class),})
public interface RouteStep extends AppRoute {

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
	"requiredDataApp"@en

	"Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp) which is deployed in the Connector maintained by the Configuration Model and\n    whoose endpoint (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part of the catalog of AppResources in the\n    corresponding Configuration Model (cf. ids:configuredAppResource property in class ids:ConfigurationModel).\n    "@en
	*/
	
	
	@JsonProperty("ids:requiredDataApp")
	AppRepresentation getRequiredDataApp();
}
