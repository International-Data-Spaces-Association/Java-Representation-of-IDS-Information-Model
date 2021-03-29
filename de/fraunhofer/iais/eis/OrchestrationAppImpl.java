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
	"Orchestration App"@en

	"Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:OrchestrationApp")
public class OrchestrationAppImpl implements Serializable, OrchestrationApp {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Orchestration App", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"app documentation"@en

	"text documentation of the data app"@en
	*/
	@JsonAlias({"ids:appDocumentation", "appDocumentation"})
	 String _appDocumentation;

	/**
	"app endpoint"@en

	"Endpoints of a data app"@en
	*/
	@NotEmpty@JsonAlias({"ids:appEndpoint", "appEndpoint"})
	 java.util.ArrayList<? extends AppEndpoint> _appEndpoint;

	/**
	"app environment variables"@en

	"Necessary or optional environment variables of a data app."@en
	*/
	@JsonAlias({"ids:appEnvironmentVariables", "appEnvironmentVariables"})
	 String _appEnvironmentVariables;

	/**
	"app storage configuration"@en

	"Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	*/
	@JsonAlias({"ids:appStorageConfiguration", "appStorageConfiguration"})
	 String _appStorageConfiguration;

	/**
	"supported usage policies"@en

	"IDS Usage Policies a DataApp supports"@en
	*/
	@JsonAlias({"ids:supportedUsagePolicies", "supportedUsagePolicies"})
	 java.util.ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies;

	// no manual construction
	OrchestrationAppImpl() {
		id = VocabUtil.getInstance().createRandomUrl("orchestrationApp");
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
	
	@NotEmpty
	@JsonProperty("ids:appEndpoint")
	java.util.ArrayList<? extends AppEndpoint> getAppEndpoint() {
		return _appEndpoint;
	}
	final public void setAppEndpoint (java.util.ArrayList<? extends AppEndpoint> _appEndpoint_) {
		this._appEndpoint = _appEndpoint_;
	}

	final public 
	
	
	@JsonProperty("ids:supportedUsagePolicies")
	java.util.ArrayList<? extends UsagePolicyClass> getSupportedUsagePolicies() {
		return _supportedUsagePolicies;
	}
	final public void setSupportedUsagePolicies (java.util.ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies_) {
		this._supportedUsagePolicies = _supportedUsagePolicies_;
	}

	final public 
	
	
	@JsonProperty("ids:appDocumentation")
	String getAppDocumentation() {
		return _appDocumentation;
	}
	final public void setAppDocumentation (String _appDocumentation_) {
		this._appDocumentation = _appDocumentation_;
	}

	final public 
	
	
	@JsonProperty("ids:appEnvironmentVariables")
	String getAppEnvironmentVariables() {
		return _appEnvironmentVariables;
	}
	final public void setAppEnvironmentVariables (String _appEnvironmentVariables_) {
		this._appEnvironmentVariables = _appEnvironmentVariables_;
	}

	final public 
	
	
	@JsonProperty("ids:appStorageConfiguration")
	String getAppStorageConfiguration() {
		return _appStorageConfiguration;
	}
	final public void setAppStorageConfiguration (String _appStorageConfiguration_) {
		this._appStorageConfiguration = _appStorageConfiguration_;
	}
}
