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

public class ConfigurationModelBuilder {

	private ConfigurationModelImpl configurationModelImpl;

	public ConfigurationModelBuilder() {
		configurationModelImpl = new ConfigurationModelImpl();
	}

	public ConfigurationModelBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		configurationModelImpl.id = id;
	}

	final public ConfigurationModelBuilder _configurationModelLogLevel_(LogLevel _configurationModelLogLevel_) {
		this.configurationModelImpl._configurationModelLogLevel = _configurationModelLogLevel_;
		return this;
	}


	final public ConfigurationModelBuilder _connectorStatus_(ConnectorStatus _connectorStatus_) {
		this.configurationModelImpl._connectorStatus = _connectorStatus_;
		return this;
	}


	final public ConfigurationModelBuilder _connectorDeployMode_(ConnectorDeployMode _connectorDeployMode_) {
		this.configurationModelImpl._connectorDeployMode = _connectorDeployMode_;
		return this;
	}


	final public ConfigurationModelBuilder _userAuthentication_(java.util.ArrayList<? extends UserAuthentication> _userAuthentication_) {
		this.configurationModelImpl._userAuthentication = _userAuthentication_;
		return this;
	}


	final public ConfigurationModelBuilder _connectorProxy_(java.util.ArrayList<? extends Proxy> _connectorProxy_) {
		this.configurationModelImpl._connectorProxy = _connectorProxy_;
		return this;
	}


	final public ConfigurationModelBuilder _appRoute_(java.util.ArrayList<? extends AppRoute> _appRoute_) {
		this.configurationModelImpl._appRoute = _appRoute_;
		return this;
	}


	final public ConfigurationModelBuilder _connectorDescription_(Connector _connectorDescription_) {
		this.configurationModelImpl._connectorDescription = _connectorDescription_;
		return this;
	}


	final public ConfigurationModelBuilder _trustStore_(URI _trustStore_) {
		this.configurationModelImpl._trustStore = _trustStore_;
		return this;
	}


	final public ConfigurationModelBuilder _trustStorePassword_(String _trustStorePassword_) {
		this.configurationModelImpl._trustStorePassword = _trustStorePassword_;
		return this;
	}


	final public ConfigurationModelBuilder _keyStore_(URI _keyStore_) {
		this.configurationModelImpl._keyStore = _keyStore_;
		return this;
	}


	final public ConfigurationModelBuilder _keyStorePassword_(String _keyStorePassword_) {
		this.configurationModelImpl._keyStorePassword = _keyStorePassword_;
		return this;
	}


	final public ConfigurationModelBuilder _configuredBroker_(BrokerCatalog _configuredBroker_) {
		this.configurationModelImpl._configuredBroker = _configuredBroker_;
		return this;
	}


	final public ConfigurationModelBuilder _configuredAppStore_(AppStoreCatalog _configuredAppStore_) {
		this.configurationModelImpl._configuredAppStore = _configuredAppStore_;
		return this;
	}


	final public ConfigurationModelBuilder _configuredAppResource_(AppResourceCatalog _configuredAppResource_) {
		this.configurationModelImpl._configuredAppResource = _configuredAppResource_;
		return this;
	}


	final public ConfigurationModelBuilder _configuredClearingHouse_(ClearingHouseCatalog _configuredClearingHouse_) {
		this.configurationModelImpl._configuredClearingHouse = _configuredClearingHouse_;
		return this;
	}

	public final ConfigurationModel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(configurationModelImpl);
		return configurationModelImpl;
	}
}
