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
* "Configuration Model"@en
* "Configuration Model is used for Connector deployment."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ConfigurationModel")
public class ConfigurationModelImpl implements ConfigurationModel {

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

	// instance fields as derived from the IDS Information Model ontology

	/**
	* "app route"
	*/
	@JsonAlias({"ids:appRoute", "appRoute"})
	protected List<AppRoute> _appRoute;


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
	* "One or more app stores to which the ids:Connector that we are configuring (cf. ids:connectorDescription) may want to talk, e.g., to retrieve apps from them."@en
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
	protected List<Proxy> _connectorProxy;


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
	* "key store alias"@en
	* "alias for the key store."@en
	*/
	@JsonAlias({"ids:keyStoreAlias", "keyStoreAlias"})
	protected String _keyStoreAlias;


	/**
	* "key store password"@en
	* "Password of the key store server."@en
	*/
	@JsonAlias({"ids:keyStorePassword", "keyStorePassword"})
	protected String _keyStorePassword;


	/**
	* "trust store"@en
	* "URI of the trust store server."@en
	*/
	@JsonAlias({"ids:trustStore", "trustStore"})
	protected URI _trustStore;


	/**
	* "trust store alias"@en
	* "alias for the trust store."@en
	*/
	@JsonAlias({"ids:trustStoreAlias", "trustStoreAlias"})
	protected String _trustStoreAlias;


	/**
	* "trust store password"@en
	* "Password of the trust store server."@en
	*/
	@JsonAlias({"ids:trustStorePassword", "trustStorePassword"})
	protected String _trustStorePassword;


	/**
	* "user authentication"@en
	* "authentication methods allowed in a Configuration Model"@en
	*/
	@JsonAlias({"ids:userAuthentication", "userAuthentication"})
	protected List<UserAuthentication> _userAuthentication;


	// no manual construction
	protected ConfigurationModelImpl() {
		id = VocabUtil.getInstance().createRandomUrl("configurationModel");
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
		return Objects.hash(new Object[]{this._userAuthentication,
			this._configurationModelLogLevel,
			this._connectorStatus,
			this._connectorDeployMode,
			this._connectorDescription,
			this._connectorProxy,
			this._trustStore,
			this._trustStoreAlias,
			this._trustStorePassword,
			this._keyStore,
			this._keyStoreAlias,
			this._keyStorePassword,
			this._configuredBroker,
			this._appRoute,
			this._configuredAppStore,
			this._configuredAppResource,
			this._configuredClearingHouse});
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
			ConfigurationModelImpl other = (ConfigurationModelImpl) obj;
			return Objects.equals(this._userAuthentication, other._userAuthentication) &&
				Objects.equals(this._configurationModelLogLevel, other._configurationModelLogLevel) &&
				Objects.equals(this._connectorStatus, other._connectorStatus) &&
				Objects.equals(this._connectorDeployMode, other._connectorDeployMode) &&
				Objects.equals(this._connectorDescription, other._connectorDescription) &&
				Objects.equals(this._connectorProxy, other._connectorProxy) &&
				Objects.equals(this._trustStore, other._trustStore) &&
				Objects.equals(this._trustStoreAlias, other._trustStoreAlias) &&
				Objects.equals(this._trustStorePassword, other._trustStorePassword) &&
				Objects.equals(this._keyStore, other._keyStore) &&
				Objects.equals(this._keyStoreAlias, other._keyStoreAlias) &&
				Objects.equals(this._keyStorePassword, other._keyStorePassword) &&
				Objects.equals(this._configuredBroker, other._configuredBroker) &&
				Objects.equals(this._appRoute, other._appRoute) &&
				Objects.equals(this._configuredAppStore, other._configuredAppStore) &&
				Objects.equals(this._configuredAppResource, other._configuredAppResource) &&
				Objects.equals(this._configuredClearingHouse, other._configuredClearingHouse);
		}
	}


	// accessor method implementations as derived from the IDS Information Model ontology


	@JsonProperty("ids:userAuthentication")
	final public List<UserAuthentication> getUserAuthentication() {
		return _userAuthentication;
	}
	
	final public void setUserAuthentication (List<UserAuthentication> _userAuthentication_) {
		this._userAuthentication = _userAuthentication_;
	}

	@NotNull
	@JsonProperty("ids:configurationModelLogLevel")
	final public LogLevel getConfigurationModelLogLevel() {
		return _configurationModelLogLevel;
	}
	
	final public void setConfigurationModelLogLevel (LogLevel _configurationModelLogLevel_) {
		this._configurationModelLogLevel = _configurationModelLogLevel_;
	}

	@NotNull
	@JsonProperty("ids:connectorStatus")
	final public ConnectorStatus getConnectorStatus() {
		return _connectorStatus;
	}
	
	final public void setConnectorStatus (ConnectorStatus _connectorStatus_) {
		this._connectorStatus = _connectorStatus_;
	}

	@NotNull
	@JsonProperty("ids:connectorDeployMode")
	final public ConnectorDeployMode getConnectorDeployMode() {
		return _connectorDeployMode;
	}
	
	final public void setConnectorDeployMode (ConnectorDeployMode _connectorDeployMode_) {
		this._connectorDeployMode = _connectorDeployMode_;
	}

	@JsonProperty("ids:connectorDescription")
	final public Connector getConnectorDescription() {
		return _connectorDescription;
	}
	
	final public void setConnectorDescription (Connector _connectorDescription_) {
		this._connectorDescription = _connectorDescription_;
	}

	@JsonProperty("ids:connectorProxy")
	final public List<Proxy> getConnectorProxy() {
		return _connectorProxy;
	}
	
	final public void setConnectorProxy (List<Proxy> _connectorProxy_) {
		this._connectorProxy = _connectorProxy_;
	}

	@JsonProperty("ids:trustStore")
	final public URI getTrustStore() {
		return _trustStore;
	}
	
	final public void setTrustStore (URI _trustStore_) {
		this._trustStore = _trustStore_;
	}

	@JsonProperty("ids:trustStoreAlias")
	final public String getTrustStoreAlias() {
		return _trustStoreAlias;
	}
	
	final public void setTrustStoreAlias (String _trustStoreAlias_) {
		this._trustStoreAlias = _trustStoreAlias_;
	}

	@JsonProperty("ids:trustStorePassword")
	final public String getTrustStorePassword() {
		return _trustStorePassword;
	}
	
	final public void setTrustStorePassword (String _trustStorePassword_) {
		this._trustStorePassword = _trustStorePassword_;
	}

	@JsonProperty("ids:keyStore")
	final public URI getKeyStore() {
		return _keyStore;
	}
	
	final public void setKeyStore (URI _keyStore_) {
		this._keyStore = _keyStore_;
	}

	@JsonProperty("ids:keyStoreAlias")
	final public String getKeyStoreAlias() {
		return _keyStoreAlias;
	}
	
	final public void setKeyStoreAlias (String _keyStoreAlias_) {
		this._keyStoreAlias = _keyStoreAlias_;
	}

	@JsonProperty("ids:keyStorePassword")
	final public String getKeyStorePassword() {
		return _keyStorePassword;
	}
	
	final public void setKeyStorePassword (String _keyStorePassword_) {
		this._keyStorePassword = _keyStorePassword_;
	}

	@JsonProperty("ids:configuredBroker")
	final public BrokerCatalog getConfiguredBroker() {
		return _configuredBroker;
	}
	
	final public void setConfiguredBroker (BrokerCatalog _configuredBroker_) {
		this._configuredBroker = _configuredBroker_;
	}

	@JsonProperty("ids:appRoute")
	final public List<AppRoute> getAppRoute() {
		return _appRoute;
	}
	
	final public void setAppRoute (List<AppRoute> _appRoute_) {
		this._appRoute = _appRoute_;
	}

	@JsonProperty("ids:configuredAppStore")
	final public AppStoreCatalog getConfiguredAppStore() {
		return _configuredAppStore;
	}
	
	final public void setConfiguredAppStore (AppStoreCatalog _configuredAppStore_) {
		this._configuredAppStore = _configuredAppStore_;
	}

	@JsonProperty("ids:configuredAppResource")
	final public AppResourceCatalog getConfiguredAppResource() {
		return _configuredAppResource;
	}
	
	final public void setConfiguredAppResource (AppResourceCatalog _configuredAppResource_) {
		this._configuredAppResource = _configuredAppResource_;
	}

	@JsonProperty("ids:configuredClearingHouse")
	final public ClearingHouseCatalog getConfiguredClearingHouse() {
		return _configuredClearingHouse;
	}
	
	final public void setConfiguredClearingHouse (ClearingHouseCatalog _configuredClearingHouse_) {
		this._configuredClearingHouse = _configuredClearingHouse_;
	}
}
