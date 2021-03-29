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
	"DataApp"@en

	"Self-contained, self-descriptive software package that is distributed via the App Store and deployed inside a Connector; provides access to data and data processing capa­bilities; the interface of a Data App is semantically described by the IDS Information Model."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = OrchestrationApp.class),

@JsonSubTypes.Type(value = SmartDataApp.class),

@JsonSubTypes.Type(value = SystemAdapter.class),})
public interface DataApp {

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
	"app endpoint"@en

	"Endpoints of a data app"@en
	*/
	
	@NotEmpty
	@JsonProperty("ids:appEndpoint")
	java.util.ArrayList<? extends AppEndpoint> getAppEndpoint();
	/**
	"supported usage policies"@en

	"IDS Usage Policies a DataApp supports"@en
	*/
	
	
	@JsonProperty("ids:supportedUsagePolicies")
	java.util.ArrayList<? extends UsagePolicyClass> getSupportedUsagePolicies();
	/**
	"app documentation"@en

	"text documentation of the data app"@en
	*/
	
	
	@JsonProperty("ids:appDocumentation")
	String getAppDocumentation();
	/**
	"app environment variables"@en

	"Necessary or optional environment variables of a data app."@en
	*/
	
	
	@JsonProperty("ids:appEnvironmentVariables")
	String getAppEnvironmentVariables();
	/**
	"app storage configuration"@en

	"Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	*/
	
	
	@JsonProperty("ids:appStorageConfiguration")
	String getAppStorageConfiguration();
}
