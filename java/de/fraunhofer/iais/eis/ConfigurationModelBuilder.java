package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ConfigurationModelBuilder implements Builder<ConfigurationModel> {

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
     * 
     * @param _userAuthentication_ desired value to be set
     * @return Builder object with new value for _userAuthentication
     */
    public ConfigurationModelBuilder _userAuthentication_(List<UserAuthentication> _userAuthentication_) {
        this.configurationModelImpl.setUserAuthentication(_userAuthentication_);
        return this;
    }

    /**
     * This function allows adding a value to the List _userAuthentication
     * 
     * @param _userAuthentication_ desired value to be added
     * @return Builder object with new value for _userAuthentication
     */
    public ConfigurationModelBuilder _userAuthentication_(UserAuthentication _userAuthentication_) {
        this.configurationModelImpl.getUserAuthentication().add(_userAuthentication_);
        return this;
    }

    /**
     * This function allows setting a value for _configurationModelLogLevel
     * 
     * @param _configurationModelLogLevel_ desired value to be set
     * @return Builder object with new value for _configurationModelLogLevel
     */
    public ConfigurationModelBuilder _configurationModelLogLevel_(LogLevel _configurationModelLogLevel_) {
        this.configurationModelImpl.setConfigurationModelLogLevel(_configurationModelLogLevel_);
        return this;
    }

    /**
     * This function allows setting a value for _connectorStatus
     * 
     * @param _connectorStatus_ desired value to be set
     * @return Builder object with new value for _connectorStatus
     */
    public ConfigurationModelBuilder _connectorStatus_(ConnectorStatus _connectorStatus_) {
        this.configurationModelImpl.setConnectorStatus(_connectorStatus_);
        return this;
    }

    /**
     * This function allows setting a value for _connectorDeployMode
     * 
     * @param _connectorDeployMode_ desired value to be set
     * @return Builder object with new value for _connectorDeployMode
     */
    public ConfigurationModelBuilder _connectorDeployMode_(ConnectorDeployMode _connectorDeployMode_) {
        this.configurationModelImpl.setConnectorDeployMode(_connectorDeployMode_);
        return this;
    }

    /**
     * This function allows setting a value for _connectorDescription
     * 
     * @param _connectorDescription_ desired value to be set
     * @return Builder object with new value for _connectorDescription
     */
    public ConfigurationModelBuilder _connectorDescription_(Connector _connectorDescription_) {
        this.configurationModelImpl.setConnectorDescription(_connectorDescription_);
        return this;
    }

    /**
     * This function allows setting a value for _connectorProxy
     * 
     * @param _connectorProxy_ desired value to be set
     * @return Builder object with new value for _connectorProxy
     */
    public ConfigurationModelBuilder _connectorProxy_(List<Proxy> _connectorProxy_) {
        this.configurationModelImpl.setConnectorProxy(_connectorProxy_);
        return this;
    }

    /**
     * This function allows adding a value to the List _connectorProxy
     * 
     * @param _connectorProxy_ desired value to be added
     * @return Builder object with new value for _connectorProxy
     */
    public ConfigurationModelBuilder _connectorProxy_(Proxy _connectorProxy_) {
        this.configurationModelImpl.getConnectorProxy().add(_connectorProxy_);
        return this;
    }

    /**
     * This function allows setting a value for _trustStore
     * 
     * @param _trustStore_ desired value to be set
     * @return Builder object with new value for _trustStore
     */
    public ConfigurationModelBuilder _trustStore_(URI _trustStore_) {
        this.configurationModelImpl.setTrustStore(_trustStore_);
        return this;
    }

    /**
     * This function allows setting a value for _trustStoreAlias
     * 
     * @param _trustStoreAlias_ desired value to be set
     * @return Builder object with new value for _trustStoreAlias
     */
    public ConfigurationModelBuilder _trustStoreAlias_(String _trustStoreAlias_) {
        this.configurationModelImpl.setTrustStoreAlias(_trustStoreAlias_);
        return this;
    }

    /**
     * This function allows setting a value for _trustStorePassword
     * 
     * @param _trustStorePassword_ desired value to be set
     * @return Builder object with new value for _trustStorePassword
     */
    public ConfigurationModelBuilder _trustStorePassword_(String _trustStorePassword_) {
        this.configurationModelImpl.setTrustStorePassword(_trustStorePassword_);
        return this;
    }

    /**
     * This function allows setting a value for _keyStore
     * 
     * @param _keyStore_ desired value to be set
     * @return Builder object with new value for _keyStore
     */
    public ConfigurationModelBuilder _keyStore_(URI _keyStore_) {
        this.configurationModelImpl.setKeyStore(_keyStore_);
        return this;
    }

    /**
     * This function allows setting a value for _keyStoreAlias
     * 
     * @param _keyStoreAlias_ desired value to be set
     * @return Builder object with new value for _keyStoreAlias
     */
    public ConfigurationModelBuilder _keyStoreAlias_(String _keyStoreAlias_) {
        this.configurationModelImpl.setKeyStoreAlias(_keyStoreAlias_);
        return this;
    }

    /**
     * This function allows setting a value for _keyStorePassword
     * 
     * @param _keyStorePassword_ desired value to be set
     * @return Builder object with new value for _keyStorePassword
     */
    public ConfigurationModelBuilder _keyStorePassword_(String _keyStorePassword_) {
        this.configurationModelImpl.setKeyStorePassword(_keyStorePassword_);
        return this;
    }

    /**
     * This function allows setting a value for _configuredBroker
     * 
     * @param _configuredBroker_ desired value to be set
     * @return Builder object with new value for _configuredBroker
     */
    public ConfigurationModelBuilder _configuredBroker_(BrokerCatalog _configuredBroker_) {
        this.configurationModelImpl.setConfiguredBroker(_configuredBroker_);
        return this;
    }

    /**
     * This function allows setting a value for _appRoute
     * 
     * @param _appRoute_ desired value to be set
     * @return Builder object with new value for _appRoute
     */
    public ConfigurationModelBuilder _appRoute_(List<AppRoute> _appRoute_) {
        this.configurationModelImpl.setAppRoute(_appRoute_);
        return this;
    }

    /**
     * This function allows adding a value to the List _appRoute
     * 
     * @param _appRoute_ desired value to be added
     * @return Builder object with new value for _appRoute
     */
    public ConfigurationModelBuilder _appRoute_(AppRoute _appRoute_) {
        this.configurationModelImpl.getAppRoute().add(_appRoute_);
        return this;
    }

    /**
     * This function allows setting a value for _configuredAppStore
     * 
     * @param _configuredAppStore_ desired value to be set
     * @return Builder object with new value for _configuredAppStore
     */
    public ConfigurationModelBuilder _configuredAppStore_(AppStoreCatalog _configuredAppStore_) {
        this.configurationModelImpl.setConfiguredAppStore(_configuredAppStore_);
        return this;
    }

    /**
     * This function allows setting a value for _configuredAppResource
     * 
     * @param _configuredAppResource_ desired value to be set
     * @return Builder object with new value for _configuredAppResource
     */
    public ConfigurationModelBuilder _configuredAppResource_(AppResourceCatalog _configuredAppResource_) {
        this.configurationModelImpl.setConfiguredAppResource(_configuredAppResource_);
        return this;
    }

    /**
     * This function allows setting a value for _configuredClearingHouse
     * 
     * @param _configuredClearingHouse_ desired value to be set
     * @return Builder object with new value for _configuredClearingHouse
     */
    public ConfigurationModelBuilder _configuredClearingHouse_(ClearingHouseCatalog _configuredClearingHouse_) {
        this.configurationModelImpl.setConfiguredClearingHouse(_configuredClearingHouse_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public ConfigurationModel build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(configurationModelImpl);
        return configurationModelImpl;
    }
}
