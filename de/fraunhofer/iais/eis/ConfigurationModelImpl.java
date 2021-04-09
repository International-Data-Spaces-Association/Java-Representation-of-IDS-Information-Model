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
* "Configuration Model"@en
* "Configuration Model is used for Connector deployment."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ConfigurationModel")
public class ConfigurationModelImpl implements Serializable, ConfigurationModel {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Configuration Model", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Configuration Model is used for Connector deployment.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "app route"
	*/
	@JsonAlias({"ids:appRoute", "appRoute"})
	protected ArrayList<? extends AppRoute> _appRoute;


	/**
	* "configuration model log level"@en
	* "Log level configuration for a Connector which is deployed using the Configuration Model"@en
	*/
	@NotNull
	@JsonAlias({"ids:configurationModelLogLevel", "configurationModelLogLevel"})
	protected LogLevel _configurationModelLogLevel;


	/**
	* "configured app resources"@en
	* "Catalog of app resources for a given Configuration Model. Used to persist configured / installed apps."@en
	*/
	@JsonAlias({"ids:configuredAppResource", "configuredAppResource"})
	protected AppResourceCatalog _configuredAppResource;


	/**
	* "configured appstore"@en
	* "One or more app stores to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk, e.g. to retrieve apps from them."@en
	*/
	@JsonAlias({"ids:configuredAppStore", "configuredAppStore"})
	protected AppStoreCatalog _configuredAppStore;


	/**
	* "configured broker"@en
	* "Catalog of Brokers to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk."@en
	*/
	@JsonAlias({"ids:configuredBroker", "configuredBroker"})
	protected BrokerCatalog _configuredBroker;


	/**
	* "configured clearing house"@en
	* "Catalog of clearing houses for a given Configuration Model."@en
	*/
	@JsonAlias({"ids:configuredClearingHouse", "configuredClearingHouse"})
	protected ClearingHouseCatalog _configuredClearingHouse;


	/**
	* "connector deploy mode"@en
	* "Deply mode of a Connector in the Configuration Model"@en
	*/
	@NotNull
	@JsonAlias({"ids:connectorDeployMode", "connectorDeployMode"})
	protected ConnectorDeployMode _connectorDeployMode;


	/**
	* "Connector description"@en
	* "References to Connector which is deployed / maintained in the Configuration Model"@en
	*/
	@JsonAlias({"ids:connectorDescription", "connectorDescription"})
	protected Connector _connectorDescription;


	/**
	* "Connector proxy"@en
	* "Proxies for a Connector which is deployed using the Configuration Model"@en
	*/
	@JsonAlias({"ids:connectorProxy", "connectorProxy"})
	protected ArrayList<? extends Proxy> _connectorProxy;


	/**
	* "Connector Status"@en
	* "Status of a Connector deployed by the Configuration Model"@en
	*/
	@NotNull
	@JsonAlias({"ids:connectorStatus", "connectorStatus"})
	protected ConnectorStatus _connectorStatus;


	/**
	* "key store"@en
	* "URI of the key store server."@en
	*/
	@JsonAlias({"ids:keyStore", "keyStore"})
	protected URI _keyStore;


	/**
	* "key store password"@en
	* "Password of the key store server."@en
	*/
	@JsonAlias({"ids:keyStorePassword", "keyStorePassword"})
	protected ArrayList<? extends String> _keyStorePassword;


	/**
	* "trust store"@en
	* "URI of the trust store server."@en
	*/
	@JsonAlias({"ids:trustStore", "trustStore"})
	protected URI _trustStore;


	/**
	* "trust store password"@en
	* "Password of the trust store server."@en
	*/
	@JsonAlias({"ids:trustStorePassword", "trustStorePassword"})
	protected ArrayList<? extends String> _trustStorePassword;


	/**
	* "user authentication"@en
	* "authentication methods allowed in a Configuration Model"@en
	*/
	@JsonAlias({"ids:userAuthentication", "userAuthentication"})
	protected ArrayList<? extends UserAuthentication> _userAuthentication;


	// no manual construction
	protected ConfigurationModelImpl() {
		id = VocabUtil.getInstance().createRandomUrl("configurationModel");
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
	* "Log level configuration for a Connector which is deployed using the Configuration Model"@en
	* @return Returns the LogLevel for the property configurationModelLogLevel.
	* More information under https://w3id.org/idsa/core/configurationModelLogLevel
	*/
	@NotNull
	@JsonProperty("ids:configurationModelLogLevel")
	final public LogLevel getConfigurationModelLogLevel() {
		return _configurationModelLogLevel;
	}

	
	/**
	* "Log level configuration for a Connector which is deployed using the Configuration Model"@en
	* @param _configurationModelLogLevel_ desired value for the property configurationModelLogLevel.
	* More information under https://w3id.org/idsa/core/configurationModelLogLevel
	*/
	final public void setConfigurationModelLogLevel (LogLevel _configurationModelLogLevel_) {
		this._configurationModelLogLevel = _configurationModelLogLevel_;
	}

	/**
	* "Status of a Connector deployed by the Configuration Model"@en
	* @return Returns the ConnectorStatus for the property connectorStatus.
	* More information under https://w3id.org/idsa/core/connectorStatus
	*/
	@NotNull
	@JsonProperty("ids:connectorStatus")
	final public ConnectorStatus getConnectorStatus() {
		return _connectorStatus;
	}

	
	/**
	* "Status of a Connector deployed by the Configuration Model"@en
	* @param _connectorStatus_ desired value for the property connectorStatus.
	* More information under https://w3id.org/idsa/core/connectorStatus
	*/
	final public void setConnectorStatus (ConnectorStatus _connectorStatus_) {
		this._connectorStatus = _connectorStatus_;
	}

	/**
	* "Deply mode of a Connector in the Configuration Model"@en
	* @return Returns the ConnectorDeployMode for the property connectorDeployMode.
	* More information under https://w3id.org/idsa/core/connectorDeployMode
	*/
	@NotNull
	@JsonProperty("ids:connectorDeployMode")
	final public ConnectorDeployMode getConnectorDeployMode() {
		return _connectorDeployMode;
	}

	
	/**
	* "Deply mode of a Connector in the Configuration Model"@en
	* @param _connectorDeployMode_ desired value for the property connectorDeployMode.
	* More information under https://w3id.org/idsa/core/connectorDeployMode
	*/
	final public void setConnectorDeployMode (ConnectorDeployMode _connectorDeployMode_) {
		this._connectorDeployMode = _connectorDeployMode_;
	}

	/**
	* "authentication methods allowed in a Configuration Model"@en
	* @return Returns the ArrayList of UserAuthentication for the property userAuthentication.
	* More information under https://w3id.org/idsa/core/userAuthentication
	*/
	@JsonProperty("ids:userAuthentication")
	final public ArrayList<? extends UserAuthentication> getUserAuthentication() {
		return _userAuthentication;
	}

	
	/**
	* "authentication methods allowed in a Configuration Model"@en
	* @param _userAuthentication_ desired value for the property userAuthentication.
	* More information under https://w3id.org/idsa/core/userAuthentication
	*/
	final public void setUserAuthentication (ArrayList<? extends UserAuthentication> _userAuthentication_) {
		this._userAuthentication = _userAuthentication_;
	}

	/**
	* "Proxies for a Connector which is deployed using the Configuration Model"@en
	* @return Returns the ArrayList of Proxy for the property connectorProxy.
	* More information under https://w3id.org/idsa/core/connectorProxy
	*/
	@JsonProperty("ids:connectorProxy")
	final public ArrayList<? extends Proxy> getConnectorProxy() {
		return _connectorProxy;
	}

	
	/**
	* "Proxies for a Connector which is deployed using the Configuration Model"@en
	* @param _connectorProxy_ desired value for the property connectorProxy.
	* More information under https://w3id.org/idsa/core/connectorProxy
	*/
	final public void setConnectorProxy (ArrayList<? extends Proxy> _connectorProxy_) {
		this._connectorProxy = _connectorProxy_;
	}

	/**
	* @return Returns the ArrayList of AppRoute for the property appRoute.
	* More information under https://w3id.org/idsa/core/appRoute
	*/
	@JsonProperty("ids:appRoute")
	final public ArrayList<? extends AppRoute> getAppRoute() {
		return _appRoute;
	}

	
	/**
	* @param _appRoute_ desired value for the property appRoute.
	* More information under https://w3id.org/idsa/core/appRoute
	*/
	final public void setAppRoute (ArrayList<? extends AppRoute> _appRoute_) {
		this._appRoute = _appRoute_;
	}

	/**
	* "References to Connector which is deployed / maintained in the Configuration Model"@en
	* @return Returns the Connector for the property connectorDescription.
	* More information under https://w3id.org/idsa/core/connectorDescription
	*/
	@JsonProperty("ids:connectorDescription")
	final public Connector getConnectorDescription() {
		return _connectorDescription;
	}

	
	/**
	* "References to Connector which is deployed / maintained in the Configuration Model"@en
	* @param _connectorDescription_ desired value for the property connectorDescription.
	* More information under https://w3id.org/idsa/core/connectorDescription
	*/
	final public void setConnectorDescription (Connector _connectorDescription_) {
		this._connectorDescription = _connectorDescription_;
	}

	/**
	* "URI of the trust store server."@en
	* @return Returns the URI for the property trustStore.
	* More information under https://w3id.org/idsa/core/trustStore
	*/
	@JsonProperty("ids:trustStore")
	final public URI getTrustStore() {
		return _trustStore;
	}

	
	/**
	* "URI of the trust store server."@en
	* @param _trustStore_ desired value for the property trustStore.
	* More information under https://w3id.org/idsa/core/trustStore
	*/
	final public void setTrustStore (URI _trustStore_) {
		this._trustStore = _trustStore_;
	}

	/**
	* "Password of the trust store server."@en
	* @return Returns the ArrayList of String for the property trustStorePassword.
	* More information under https://w3id.org/idsa/core/trustStorePassword
	*/
	@JsonProperty("ids:trustStorePassword")
	final public ArrayList<? extends String> getTrustStorePassword() {
		return _trustStorePassword;
	}

	
	/**
	* "Password of the trust store server."@en
	* @param _trustStorePassword_ desired value for the property trustStorePassword.
	* More information under https://w3id.org/idsa/core/trustStorePassword
	*/
	final public void setTrustStorePassword (ArrayList<? extends String> _trustStorePassword_) {
		this._trustStorePassword = _trustStorePassword_;
	}

	/**
	* "URI of the key store server."@en
	* @return Returns the URI for the property keyStore.
	* More information under https://w3id.org/idsa/core/keyStore
	*/
	@JsonProperty("ids:keyStore")
	final public URI getKeyStore() {
		return _keyStore;
	}

	
	/**
	* "URI of the key store server."@en
	* @param _keyStore_ desired value for the property keyStore.
	* More information under https://w3id.org/idsa/core/keyStore
	*/
	final public void setKeyStore (URI _keyStore_) {
		this._keyStore = _keyStore_;
	}

	/**
	* "Password of the key store server."@en
	* @return Returns the ArrayList of String for the property keyStorePassword.
	* More information under https://w3id.org/idsa/core/keyStorePassword
	*/
	@JsonProperty("ids:keyStorePassword")
	final public ArrayList<? extends String> getKeyStorePassword() {
		return _keyStorePassword;
	}

	
	/**
	* "Password of the key store server."@en
	* @param _keyStorePassword_ desired value for the property keyStorePassword.
	* More information under https://w3id.org/idsa/core/keyStorePassword
	*/
	final public void setKeyStorePassword (ArrayList<? extends String> _keyStorePassword_) {
		this._keyStorePassword = _keyStorePassword_;
	}

	/**
	* "Catalog of Brokers to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk."@en
	* @return Returns the BrokerCatalog for the property configuredBroker.
	* More information under https://w3id.org/idsa/core/configuredBroker
	*/
	@JsonProperty("ids:configuredBroker")
	final public BrokerCatalog getConfiguredBroker() {
		return _configuredBroker;
	}

	
	/**
	* "Catalog of Brokers to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk."@en
	* @param _configuredBroker_ desired value for the property configuredBroker.
	* More information under https://w3id.org/idsa/core/configuredBroker
	*/
	final public void setConfiguredBroker (BrokerCatalog _configuredBroker_) {
		this._configuredBroker = _configuredBroker_;
	}

	/**
	* "One or more app stores to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk, e.g. to retrieve apps from them."@en
	* @return Returns the AppStoreCatalog for the property configuredAppStore.
	* More information under https://w3id.org/idsa/core/configuredAppStore
	*/
	@JsonProperty("ids:configuredAppStore")
	final public AppStoreCatalog getConfiguredAppStore() {
		return _configuredAppStore;
	}

	
	/**
	* "One or more app stores to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk, e.g. to retrieve apps from them."@en
	* @param _configuredAppStore_ desired value for the property configuredAppStore.
	* More information under https://w3id.org/idsa/core/configuredAppStore
	*/
	final public void setConfiguredAppStore (AppStoreCatalog _configuredAppStore_) {
		this._configuredAppStore = _configuredAppStore_;
	}

	/**
	* "Catalog of app resources for a given Configuration Model. Used to persist configured / installed apps."@en
	* @return Returns the AppResourceCatalog for the property configuredAppResource.
	* More information under https://w3id.org/idsa/core/configuredAppResource
	*/
	@JsonProperty("ids:configuredAppResource")
	final public AppResourceCatalog getConfiguredAppResource() {
		return _configuredAppResource;
	}

	
	/**
	* "Catalog of app resources for a given Configuration Model. Used to persist configured / installed apps."@en
	* @param _configuredAppResource_ desired value for the property configuredAppResource.
	* More information under https://w3id.org/idsa/core/configuredAppResource
	*/
	final public void setConfiguredAppResource (AppResourceCatalog _configuredAppResource_) {
		this._configuredAppResource = _configuredAppResource_;
	}

	/**
	* "Catalog of clearing houses for a given Configuration Model."@en
	* @return Returns the ClearingHouseCatalog for the property configuredClearingHouse.
	* More information under https://w3id.org/idsa/core/configuredClearingHouse
	*/
	@JsonProperty("ids:configuredClearingHouse")
	final public ClearingHouseCatalog getConfiguredClearingHouse() {
		return _configuredClearingHouse;
	}

	
	/**
	* "Catalog of clearing houses for a given Configuration Model."@en
	* @param _configuredClearingHouse_ desired value for the property configuredClearingHouse.
	* More information under https://w3id.org/idsa/core/configuredClearingHouse
	*/
	final public void setConfiguredClearingHouse (ClearingHouseCatalog _configuredClearingHouse_) {
		this._configuredClearingHouse = _configuredClearingHouse_;
	}
}
