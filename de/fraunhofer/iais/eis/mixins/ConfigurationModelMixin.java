package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConfigurationModel")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ConfigurationModelMixin {
    @JsonProperty("ids:userAuthentication")
    public List<UserAuthentication> getUserAuthentication();

    @JsonProperty("ids:userAuthentication")
    public void setUserAuthentication(List<UserAuthentication> _userAuthentication_);

    @JsonProperty("ids:configurationModelLogLevel")
    @NotNull
    public LogLevel getConfigurationModelLogLevel();

    @JsonProperty("ids:configurationModelLogLevel")
    public void setConfigurationModelLogLevel(LogLevel _configurationModelLogLevel_);

    @JsonProperty("ids:connectorStatus")
    @NotNull
    public ConnectorStatus getConnectorStatus();

    @JsonProperty("ids:connectorStatus")
    public void setConnectorStatus(ConnectorStatus _connectorStatus_);

    @JsonProperty("ids:connectorDeployMode")
    @NotNull
    public ConnectorDeployMode getConnectorDeployMode();

    @JsonProperty("ids:connectorDeployMode")
    public void setConnectorDeployMode(ConnectorDeployMode _connectorDeployMode_);

    @JsonProperty("ids:connectorDescription")
    public Connector getConnectorDescription();

    @JsonProperty("ids:connectorDescription")
    public void setConnectorDescription(Connector _connectorDescription_);

    @JsonProperty("ids:connectorProxy")
    public List<Proxy> getConnectorProxy();

    @JsonProperty("ids:connectorProxy")
    public void setConnectorProxy(List<Proxy> _connectorProxy_);

    @JsonProperty("ids:trustStore")
    public URI getTrustStore();

    @JsonProperty("ids:trustStore")
    public void setTrustStore(URI _trustStore_);

    @JsonProperty("ids:trustStoreAlias")
    public String getTrustStoreAlias();

    @JsonProperty("ids:trustStoreAlias")
    public void setTrustStoreAlias(String _trustStoreAlias_);

    @JsonProperty("ids:trustStorePassword")
    public String getTrustStorePassword();

    @JsonProperty("ids:trustStorePassword")
    public void setTrustStorePassword(String _trustStorePassword_);

    @JsonProperty("ids:keyStore")
    public URI getKeyStore();

    @JsonProperty("ids:keyStore")
    public void setKeyStore(URI _keyStore_);

    @JsonProperty("ids:keyStoreAlias")
    public String getKeyStoreAlias();

    @JsonProperty("ids:keyStoreAlias")
    public void setKeyStoreAlias(String _keyStoreAlias_);

    @JsonProperty("ids:keyStorePassword")
    public String getKeyStorePassword();

    @JsonProperty("ids:keyStorePassword")
    public void setKeyStorePassword(String _keyStorePassword_);

    @JsonProperty("ids:configuredBroker")
    public BrokerCatalog getConfiguredBroker();

    @JsonProperty("ids:configuredBroker")
    public void setConfiguredBroker(BrokerCatalog _configuredBroker_);

    @JsonProperty("ids:appRoute")
    public List<AppRoute> getAppRoute();

    @JsonProperty("ids:appRoute")
    public void setAppRoute(List<AppRoute> _appRoute_);

    @JsonProperty("ids:configuredAppStore")
    public AppStoreCatalog getConfiguredAppStore();

    @JsonProperty("ids:configuredAppStore")
    public void setConfiguredAppStore(AppStoreCatalog _configuredAppStore_);

    @JsonProperty("ids:configuredAppResource")
    public AppResourceCatalog getConfiguredAppResource();

    @JsonProperty("ids:configuredAppResource")
    public void setConfiguredAppResource(AppResourceCatalog _configuredAppResource_);

    @JsonProperty("ids:configuredClearingHouse")
    public ClearingHouseCatalog getConfiguredClearingHouse();

    @JsonProperty("ids:configuredClearingHouse")
    public void setConfiguredClearingHouse(ClearingHouseCatalog _configuredClearingHouse_);
}
