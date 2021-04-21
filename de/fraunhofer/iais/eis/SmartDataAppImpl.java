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
* "Smart DataApp"@en
* "Smart DataApps are executing any kind of necessary data processing or transformation."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:SmartDataApp")
public class SmartDataAppImpl implements Serializable, SmartDataApp {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Smart DataApp", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Smart DataApps are executing any kind of necessary data processing or transformation.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "app documentation"@en
	* "text documentation of the data app"@en
	*/
	@JsonAlias({"ids:appDocumentation", "appDocumentation"})
	protected String _appDocumentation;


	/**
	* "app endpoint"@en
	* "Endpoints of a data app"@en
	*/
	@NotEmpty
	@JsonAlias({"ids:appEndpoint", "appEndpoint"})
	protected List<AppEndpoint> _appEndpoint;


	/**
	* "app environment variables"@en
	* "Necessary or optional environment variables of a data app."@en
	*/
	@JsonAlias({"ids:appEnvironmentVariables", "appEnvironmentVariables"})
	protected String _appEnvironmentVariables;


	/**
	* "app storage configuration"@en
	* "Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	*/
	@JsonAlias({"ids:appStorageConfiguration", "appStorageConfiguration"})
	protected String _appStorageConfiguration;


	/**
	* "supported usage policies"@en
	* "IDS Usage Policies a DataApp supports"@en
	*/
	@JsonAlias({"ids:supportedUsagePolicies", "supportedUsagePolicies"})
	protected List<UsagePolicyClass> _supportedUsagePolicies;


	// no manual construction
	protected SmartDataAppImpl() {
		id = VocabUtil.getInstance().createRandomUrl("smartDataApp");
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
	public int hashCode() {
		return Objects.hash(new Object[]{this._appEndpoint,
			this._supportedUsagePolicies,
			this._appDocumentation,
			this._appEnvironmentVariables,
			this._appStorageConfiguration});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			SmartDataAppImpl other = (SmartDataAppImpl) obj;
			return Objects.equals(this._appEndpoint, other._appEndpoint) &&
				Objects.equals(this._supportedUsagePolicies, other._supportedUsagePolicies) &&
				Objects.equals(this._appDocumentation, other._appDocumentation) &&
				Objects.equals(this._appEnvironmentVariables, other._appEnvironmentVariables) &&
				Objects.equals(this._appStorageConfiguration, other._appStorageConfiguration);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology



	@NotEmpty
	@JsonProperty("ids:appEndpoint")
	final public List<AppEndpoint> getAppEndpoint() {
		return _appEndpoint;
	}
	
	final public void setAppEndpoint (List<AppEndpoint> _appEndpoint_) {
		this._appEndpoint = _appEndpoint_;
	}

	@JsonProperty("ids:supportedUsagePolicies")
	final public List<UsagePolicyClass> getSupportedUsagePolicies() {
		return _supportedUsagePolicies;
	}
	
	final public void setSupportedUsagePolicies (List<UsagePolicyClass> _supportedUsagePolicies_) {
		this._supportedUsagePolicies = _supportedUsagePolicies_;
	}

	@JsonProperty("ids:appDocumentation")
	final public String getAppDocumentation() {
		return _appDocumentation;
	}
	
	final public void setAppDocumentation (String _appDocumentation_) {
		this._appDocumentation = _appDocumentation_;
	}

	@JsonProperty("ids:appEnvironmentVariables")
	final public String getAppEnvironmentVariables() {
		return _appEnvironmentVariables;
	}
	
	final public void setAppEnvironmentVariables (String _appEnvironmentVariables_) {
		this._appEnvironmentVariables = _appEnvironmentVariables_;
	}

	@JsonProperty("ids:appStorageConfiguration")
	final public String getAppStorageConfiguration() {
		return _appStorageConfiguration;
	}
	
	final public void setAppStorageConfiguration (String _appStorageConfiguration_) {
		this._appStorageConfiguration = _appStorageConfiguration_;
	}
}
