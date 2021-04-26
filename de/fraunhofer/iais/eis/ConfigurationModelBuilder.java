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

public class ConfigurationModelBuilder {

	private ConfigurationModelImpl configurationModelImpl;

	public ConfigurationModelBuilder() {
		configurationModelImpl = new ConfigurationModelImpl();
	}

	public ConfigurationModelBuilder(URI id) {
		this();
		configurationModelImpl.id = id;
	}

	/**
	* This function allows setting a value for _userAuthentication
	* @param _userAuthentication_ desired value to be set
	* @return Builder object with new value for _userAuthentication
	*/
	final public ConfigurationModelBuilder _userAuthentication_(List<UserAuthentication> _userAuthentication_) {
		this.configurationModelImpl._userAuthentication = _userAuthentication_;
		return this;
	}


	/**
	* This function allows setting a value for _configurationModelLogLevel
	* @param _configurationModelLogLevel_ desired value to be set
	* @return Builder object with new value for _configurationModelLogLevel
	*/
	final public ConfigurationModelBuilder _configurationModelLogLevel_(LogLevel _configurationModelLogLevel_) {
		this.configurationModelImpl._configurationModelLogLevel = _configurationModelLogLevel_;
		return this;
	}


	/**
	* This function allows setting a value for _connectorStatus
	* @param _connectorStatus_ desired value to be set
	* @return Builder object with new value for _connectorStatus
	*/
	final public ConfigurationModelBuilder _connectorStatus_(ConnectorStatus _connectorStatus_) {
		this.configurationModelImpl._connectorStatus = _connectorStatus_;
		return this;
	}


	/**
	* This function allows setting a value for _connectorDeployMode
	* @param _connectorDeployMode_ desired value to be set
	* @return Builder object with new value for _connectorDeployMode
	*/
	final public ConfigurationModelBuilder _connectorDeployMode_(ConnectorDeployMode _connectorDeployMode_) {
		this.configurationModelImpl._connectorDeployMode = _connectorDeployMode_;
		return this;
	}


	/**
	* This function allows setting a value for _connectorDescription
	* @param _connectorDescription_ desired value to be set
	* @return Builder object with new value for _connectorDescription
	*/
	final public ConfigurationModelBuilder _connectorDescription_(Connector _connectorDescription_) {
		this.configurationModelImpl._connectorDescription = _connectorDescription_;
		return this;
	}


	/**
	* This function allows setting a value for _connectorProxy
	* @param _connectorProxy_ desired value to be set
	* @return Builder object with new value for _connectorProxy
	*/
	final public ConfigurationModelBuilder _connectorProxy_(List<Proxy> _connectorProxy_) {
		this.configurationModelImpl._connectorProxy = _connectorProxy_;
		return this;
	}


	/**
	* This function allows setting a value for _trustStore
	* @param _trustStore_ desired value to be set
	* @return Builder object with new value for _trustStore
	*/
	final public ConfigurationModelBuilder _trustStore_(URI _trustStore_) {
		this.configurationModelImpl._trustStore = _trustStore_;
		return this;
	}


	/**
	* This function allows setting a value for _trustStoreAlias
	* @param _trustStoreAlias_ desired value to be set
	* @return Builder object with new value for _trustStoreAlias
	*/
	final public ConfigurationModelBuilder _trustStoreAlias_(String _trustStoreAlias_) {
		this.configurationModelImpl._trustStoreAlias = _trustStoreAlias_;
		return this;
	}


	/**
	* This function allows setting a value for _trustStorePassword
	* @param _trustStorePassword_ desired value to be set
	* @return Builder object with new value for _trustStorePassword
	*/
	final public ConfigurationModelBuilder _trustStorePassword_(String _trustStorePassword_) {
		this.configurationModelImpl._trustStorePassword = _trustStorePassword_;
		return this;
	}


	/**
	* This function allows setting a value for _keyStore
	* @param _keyStore_ desired value to be set
	* @return Builder object with new value for _keyStore
	*/
	final public ConfigurationModelBuilder _keyStore_(URI _keyStore_) {
		this.configurationModelImpl._keyStore = _keyStore_;
		return this;
	}


	/**
	* This function allows setting a value for _keyStoreAlias
	* @param _keyStoreAlias_ desired value to be set
	* @return Builder object with new value for _keyStoreAlias
	*/
	final public ConfigurationModelBuilder _keyStoreAlias_(String _keyStoreAlias_) {
		this.configurationModelImpl._keyStoreAlias = _keyStoreAlias_;
		return this;
	}


	/**
	* This function allows setting a value for _keyStorePassword
	* @param _keyStorePassword_ desired value to be set
	* @return Builder object with new value for _keyStorePassword
	*/
	final public ConfigurationModelBuilder _keyStorePassword_(String _keyStorePassword_) {
		this.configurationModelImpl._keyStorePassword = _keyStorePassword_;
		return this;
	}


	/**
	* This function allows setting a value for _configuredBroker
	* @param _configuredBroker_ desired value to be set
	* @return Builder object with new value for _configuredBroker
	*/
	final public ConfigurationModelBuilder _configuredBroker_(BrokerCatalog _configuredBroker_) {
		this.configurationModelImpl._configuredBroker = _configuredBroker_;
		return this;
	}


	/**
	* This function allows setting a value for _appRoute
	* @param _appRoute_ desired value to be set
	* @return Builder object with new value for _appRoute
	*/
	final public ConfigurationModelBuilder _appRoute_(List<AppRoute> _appRoute_) {
		this.configurationModelImpl._appRoute = _appRoute_;
		return this;
	}


	/**
	* This function allows setting a value for _configuredAppStore
	* @param _configuredAppStore_ desired value to be set
	* @return Builder object with new value for _configuredAppStore
	*/
	final public ConfigurationModelBuilder _configuredAppStore_(AppStoreCatalog _configuredAppStore_) {
		this.configurationModelImpl._configuredAppStore = _configuredAppStore_;
		return this;
	}


	/**
	* This function allows setting a value for _configuredAppResource
	* @param _configuredAppResource_ desired value to be set
	* @return Builder object with new value for _configuredAppResource
	*/
	final public ConfigurationModelBuilder _configuredAppResource_(AppResourceCatalog _configuredAppResource_) {
		this.configurationModelImpl._configuredAppResource = _configuredAppResource_;
		return this;
	}


	/**
	* This function allows setting a value for _configuredClearingHouse
	* @param _configuredClearingHouse_ desired value to be set
	* @return Builder object with new value for _configuredClearingHouse
	*/
	final public ConfigurationModelBuilder _configuredClearingHouse_(ClearingHouseCatalog _configuredClearingHouse_) {
		this.configurationModelImpl._configuredClearingHouse = _configuredClearingHouse_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ConfigurationModel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(configurationModelImpl);
		return configurationModelImpl;
	}
}
