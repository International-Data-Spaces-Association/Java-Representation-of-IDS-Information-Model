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
* "Orchestration App"@en
* "Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:OrchestrationApp")
public class OrchestrationAppImpl implements Serializable, OrchestrationApp {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Orchestration App", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector.", "en"));

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
	protected ArrayList<? extends AppEndpoint> _appEndpoint;


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
	protected ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies;


	// no manual construction
	protected OrchestrationAppImpl() {
		id = VocabUtil.getInstance().createRandomUrl("orchestrationApp");
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
	* "Endpoints of a data app"@en
	* @return Returns the ArrayList of AppEndpoint for the property appEndpoint.
	* More information under https://w3id.org/idsa/core/appEndpoint
	*/
	@NotEmpty
	@JsonProperty("ids:appEndpoint")
	final public ArrayList<? extends AppEndpoint> getAppEndpoint() {
		return _appEndpoint;
	}

	
	/**
	* "Endpoints of a data app"@en
	* @param _appEndpoint_ desired value for the property appEndpoint.
	* More information under https://w3id.org/idsa/core/appEndpoint
	*/
	final public void setAppEndpoint (ArrayList<? extends AppEndpoint> _appEndpoint_) {
		this._appEndpoint = _appEndpoint_;
	}

	/**
	* "IDS Usage Policies a DataApp supports"@en
	* @return Returns the ArrayList of UsagePolicyClass for the property supportedUsagePolicies.
	* More information under https://w3id.org/idsa/core/supportedUsagePolicies
	*/
	@JsonProperty("ids:supportedUsagePolicies")
	final public ArrayList<? extends UsagePolicyClass> getSupportedUsagePolicies() {
		return _supportedUsagePolicies;
	}

	
	/**
	* "IDS Usage Policies a DataApp supports"@en
	* @param _supportedUsagePolicies_ desired value for the property supportedUsagePolicies.
	* More information under https://w3id.org/idsa/core/supportedUsagePolicies
	*/
	final public void setSupportedUsagePolicies (ArrayList<? extends UsagePolicyClass> _supportedUsagePolicies_) {
		this._supportedUsagePolicies = _supportedUsagePolicies_;
	}

	/**
	* "text documentation of the data app"@en
	* @return Returns the String for the property appDocumentation.
	* More information under https://w3id.org/idsa/core/appDocumentation
	*/
	@JsonProperty("ids:appDocumentation")
	final public String getAppDocumentation() {
		return _appDocumentation;
	}

	
	/**
	* "text documentation of the data app"@en
	* @param _appDocumentation_ desired value for the property appDocumentation.
	* More information under https://w3id.org/idsa/core/appDocumentation
	*/
	final public void setAppDocumentation (String _appDocumentation_) {
		this._appDocumentation = _appDocumentation_;
	}

	/**
	* "Necessary or optional environment variables of a data app."@en
	* @return Returns the String for the property appEnvironmentVariables.
	* More information under https://w3id.org/idsa/core/appEnvironmentVariables
	*/
	@JsonProperty("ids:appEnvironmentVariables")
	final public String getAppEnvironmentVariables() {
		return _appEnvironmentVariables;
	}

	
	/**
	* "Necessary or optional environment variables of a data app."@en
	* @param _appEnvironmentVariables_ desired value for the property appEnvironmentVariables.
	* More information under https://w3id.org/idsa/core/appEnvironmentVariables
	*/
	final public void setAppEnvironmentVariables (String _appEnvironmentVariables_) {
		this._appEnvironmentVariables = _appEnvironmentVariables_;
	}

	/**
	* "Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	* @return Returns the String for the property appStorageConfiguration.
	* More information under https://w3id.org/idsa/core/appStorageConfiguration
	*/
	@JsonProperty("ids:appStorageConfiguration")
	final public String getAppStorageConfiguration() {
		return _appStorageConfiguration;
	}

	
	/**
	* "Storage configuration of a data app. Value may differ based on the app ecosystem, e.g. a writeable path in the file system or a volume name (e.g. for containerized apps)"@en
	* @param _appStorageConfiguration_ desired value for the property appStorageConfiguration.
	* More information under https://w3id.org/idsa/core/appStorageConfiguration
	*/
	final public void setAppStorageConfiguration (String _appStorageConfiguration_) {
		this._appStorageConfiguration = _appStorageConfiguration_;
	}
}
