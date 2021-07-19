package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Configuration Model is used for Connector deployment.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConfigurationModelImpl.class)
})
public interface ConfigurationModel extends ModelClass {

    // standard methods

    @Beta
    public ConfigurationModel deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * authentication methods allowed in a Configuration Model
     *
     * More information under https://w3id.org/idsa/core/userAuthentication
     *
     * @return Returns the List of UserAuthentications for the property _userAuthentication.
     */
    @JsonProperty("ids:userAuthentication")
    List<UserAuthentication> getUserAuthentication();

    /**
     * authentication methods allowed in a Configuration Model
     *
     * More information under https://w3id.org/idsa/core/userAuthentication
     *
     * @param _userAuthentication_ desired value for the property _userAuthentication.
     */
    void setUserAuthentication(List<UserAuthentication> _userAuthentication_);

    /**
     * Log level configuration for a Connector which is deployed using the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/configurationModelLogLevel
     *
     * @return Returns the LogLevel for the property _configurationModelLogLevel.
     */
    @NotNull
    @JsonProperty("ids:configurationModelLogLevel")
    LogLevel getConfigurationModelLogLevel();

    /**
     * Log level configuration for a Connector which is deployed using the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/configurationModelLogLevel
     *
     * @param _configurationModelLogLevel_ desired value for the property _configurationModelLogLevel.
     */
    void setConfigurationModelLogLevel(LogLevel _configurationModelLogLevel_);

    /**
     * Status of a Connector deployed by the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorStatus
     *
     * @return Returns the ConnectorStatus for the property _connectorStatus.
     */
    @NotNull
    @JsonProperty("ids:connectorStatus")
    ConnectorStatus getConnectorStatus();

    /**
     * Status of a Connector deployed by the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorStatus
     *
     * @param _connectorStatus_ desired value for the property _connectorStatus.
     */
    void setConnectorStatus(ConnectorStatus _connectorStatus_);

    /**
     * Deply mode of a Connector in the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorDeployMode
     *
     * @return Returns the ConnectorDeployMode for the property _connectorDeployMode.
     */
    @NotNull
    @JsonProperty("ids:connectorDeployMode")
    ConnectorDeployMode getConnectorDeployMode();

    /**
     * Deply mode of a Connector in the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorDeployMode
     *
     * @param _connectorDeployMode_ desired value for the property _connectorDeployMode.
     */
    void setConnectorDeployMode(ConnectorDeployMode _connectorDeployMode_);

    /**
     * References to Connector which is deployed / maintained in the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorDescription
     *
     * @return Returns the Connector for the property _connectorDescription.
     */
    @JsonProperty("ids:connectorDescription")
    Connector getConnectorDescription();

    /**
     * References to Connector which is deployed / maintained in the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorDescription
     *
     * @param _connectorDescription_ desired value for the property _connectorDescription.
     */
    void setConnectorDescription(Connector _connectorDescription_);

    /**
     * Proxies for a Connector which is deployed using the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorProxy
     *
     * @return Returns the List of Proxys for the property _connectorProxy.
     */
    @JsonProperty("ids:connectorProxy")
    List<Proxy> getConnectorProxy();

    /**
     * Proxies for a Connector which is deployed using the Configuration Model
     *
     * More information under https://w3id.org/idsa/core/connectorProxy
     *
     * @param _connectorProxy_ desired value for the property _connectorProxy.
     */
    void setConnectorProxy(List<Proxy> _connectorProxy_);

    /**
     * URI of the trust store server.
     *
     * More information under https://w3id.org/idsa/core/trustStore
     *
     * @return Returns the URI for the property _trustStore.
     */
    @JsonProperty("ids:trustStore")
    URI getTrustStore();

    /**
     * URI of the trust store server.
     *
     * More information under https://w3id.org/idsa/core/trustStore
     *
     * @param _trustStore_ desired value for the property _trustStore.
     */
    void setTrustStore(URI _trustStore_);

    /**
     * alias for the trust store.
     *
     * More information under https://w3id.org/idsa/core/trustStoreAlias
     *
     * @return Returns the String for the property _trustStoreAlias.
     */
    @JsonProperty("ids:trustStoreAlias")
    String getTrustStoreAlias();

    /**
     * alias for the trust store.
     *
     * More information under https://w3id.org/idsa/core/trustStoreAlias
     *
     * @param _trustStoreAlias_ desired value for the property _trustStoreAlias.
     */
    void setTrustStoreAlias(String _trustStoreAlias_);

    /**
     * Password of the trust store server.
     *
     * More information under https://w3id.org/idsa/core/trustStorePassword
     *
     * @return Returns the String for the property _trustStorePassword.
     */
    @JsonProperty("ids:trustStorePassword")
    String getTrustStorePassword();

    /**
     * Password of the trust store server.
     *
     * More information under https://w3id.org/idsa/core/trustStorePassword
     *
     * @param _trustStorePassword_ desired value for the property _trustStorePassword.
     */
    void setTrustStorePassword(String _trustStorePassword_);

    /**
     * URI of the key store server.
     *
     * More information under https://w3id.org/idsa/core/keyStore
     *
     * @return Returns the URI for the property _keyStore.
     */
    @JsonProperty("ids:keyStore")
    URI getKeyStore();

    /**
     * URI of the key store server.
     *
     * More information under https://w3id.org/idsa/core/keyStore
     *
     * @param _keyStore_ desired value for the property _keyStore.
     */
    void setKeyStore(URI _keyStore_);

    /**
     * alias for the key store.
     *
     * More information under https://w3id.org/idsa/core/keyStoreAlias
     *
     * @return Returns the String for the property _keyStoreAlias.
     */
    @JsonProperty("ids:keyStoreAlias")
    String getKeyStoreAlias();

    /**
     * alias for the key store.
     *
     * More information under https://w3id.org/idsa/core/keyStoreAlias
     *
     * @param _keyStoreAlias_ desired value for the property _keyStoreAlias.
     */
    void setKeyStoreAlias(String _keyStoreAlias_);

    /**
     * Password of the key store server.
     *
     * More information under https://w3id.org/idsa/core/keyStorePassword
     *
     * @return Returns the String for the property _keyStorePassword.
     */
    @JsonProperty("ids:keyStorePassword")
    String getKeyStorePassword();

    /**
     * Password of the key store server.
     *
     * More information under https://w3id.org/idsa/core/keyStorePassword
     *
     * @param _keyStorePassword_ desired value for the property _keyStorePassword.
     */
    void setKeyStorePassword(String _keyStorePassword_);

    /**
     * Catalog of Brokers to which the ids:Connector that we are configuring (cf.
     * ids:connectorDescription) may want to talk.
     *
     * More information under https://w3id.org/idsa/core/configuredBroker
     *
     * @return Returns the BrokerCatalog for the property _configuredBroker.
     */
    @JsonProperty("ids:configuredBroker")
    BrokerCatalog getConfiguredBroker();

    /**
     * Catalog of Brokers to which the ids:Connector that we are configuring (cf.
     * ids:connectorDescription) may want to talk.
     *
     * More information under https://w3id.org/idsa/core/configuredBroker
     *
     * @param _configuredBroker_ desired value for the property _configuredBroker.
     */
    void setConfiguredBroker(BrokerCatalog _configuredBroker_);

    /**
     *
     * More information under https://w3id.org/idsa/core/appRoute
     *
     * @return Returns the List of AppRoutes for the property _appRoute.
     */
    @JsonProperty("ids:appRoute")
    List<AppRoute> getAppRoute();

    /**
     *
     * More information under https://w3id.org/idsa/core/appRoute
     *
     * @param _appRoute_ desired value for the property _appRoute.
     */
    void setAppRoute(List<AppRoute> _appRoute_);

    /**
     * One or more app stores to which the ids:Connector that we are configuring (cf.
     * ids:connectorDescription) may want to talk, e.g., to retrieve apps from them.
     *
     * More information under https://w3id.org/idsa/core/configuredAppStore
     *
     * @return Returns the AppStoreCatalog for the property _configuredAppStore.
     */
    @JsonProperty("ids:configuredAppStore")
    AppStoreCatalog getConfiguredAppStore();

    /**
     * One or more app stores to which the ids:Connector that we are configuring (cf.
     * ids:connectorDescription) may want to talk, e.g., to retrieve apps from them.
     *
     * More information under https://w3id.org/idsa/core/configuredAppStore
     *
     * @param _configuredAppStore_ desired value for the property _configuredAppStore.
     */
    void setConfiguredAppStore(AppStoreCatalog _configuredAppStore_);

    /**
     * Catalog of app resources for a given Configuration Model. Used to persist configured / installed
     * apps.
     *
     * More information under https://w3id.org/idsa/core/configuredAppResource
     *
     * @return Returns the AppResourceCatalog for the property _configuredAppResource.
     */
    @JsonProperty("ids:configuredAppResource")
    AppResourceCatalog getConfiguredAppResource();

    /**
     * Catalog of app resources for a given Configuration Model. Used to persist configured / installed
     * apps.
     *
     * More information under https://w3id.org/idsa/core/configuredAppResource
     *
     * @param _configuredAppResource_ desired value for the property _configuredAppResource.
     */
    void setConfiguredAppResource(AppResourceCatalog _configuredAppResource_);

    /**
     * Catalog of clearing houses for a given Configuration Model.
     *
     * More information under https://w3id.org/idsa/core/configuredClearingHouse
     *
     * @return Returns the ClearingHouseCatalog for the property _configuredClearingHouse.
     */
    @JsonProperty("ids:configuredClearingHouse")
    ClearingHouseCatalog getConfiguredClearingHouse();

    /**
     * Catalog of clearing houses for a given Configuration Model.
     *
     * More information under https://w3id.org/idsa/core/configuredClearingHouse
     *
     * @param _configuredClearingHouse_ desired value for the property _configuredClearingHouse.
     */
    void setConfiguredClearingHouse(ClearingHouseCatalog _configuredClearingHouse_);

}
