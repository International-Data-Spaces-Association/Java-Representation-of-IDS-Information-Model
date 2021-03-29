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
	"App Representation"@en

	"App representation"@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AppRepresentationImpl.class),})
public interface AppRepresentation extends SoftwareRepresentation {

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
	"data app information"@en

	"Information about the concrete data app implementation"@en
	*/
	
	
	@JsonProperty("ids:dataAppInformation")
	DataApp getDataAppInformation();
	/**
	"data app distribution service"@en

	"IRI reference to storage and distribution system for the correspending data app. Unlinke regular representations for IDS resources, a data app may not be retrieved directly from a connector but from a separate registry instead."@en
	*/
	
	
	@JsonProperty("ids:dataAppDistributionService")
	URI getDataAppDistributionService();
	/**
	"data app runtime environment"@en

	"Runtime environment of a data app, e.g. software (or hardware) required to run the app."@en
	*/
	
	
	@JsonProperty("ids:dataAppRuntimeEnvironment")
	String getDataAppRuntimeEnvironment();
}
