package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.ConfigurationModel
 * 
 * Configuration Model is used for Connector deployment.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:ConfigurationModel")
public class ConfigurationModelImpl implements ConfigurationModel {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Configuration Model", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Configuration Model is used for Connector deployment.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:appRoute", "appRoute"})
    protected List<AppRoute> _appRoute = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:configurationModelLogLevel", "configurationModelLogLevel"})
    protected LogLevel _configurationModelLogLevel;

    @JsonAlias({"ids:configuredAppResource", "configuredAppResource"})
    protected AppResourceCatalog _configuredAppResource;

    @JsonAlias({"ids:configuredAppStore", "configuredAppStore"})
    protected AppStoreCatalog _configuredAppStore;

    @JsonAlias({"ids:configuredBroker", "configuredBroker"})
    protected BrokerCatalog _configuredBroker;

    @JsonAlias({"ids:configuredClearingHouse", "configuredClearingHouse"})
    protected ClearingHouseCatalog _configuredClearingHouse;

    @NotNull
    @JsonAlias({"ids:connectorDeployMode", "connectorDeployMode"})
    protected ConnectorDeployMode _connectorDeployMode;

    @JsonAlias({"ids:connectorDescription", "connectorDescription"})
    protected Connector _connectorDescription;

    @JsonAlias({"ids:connectorProxy", "connectorProxy"})
    protected List<Proxy> _connectorProxy = new ArrayList<>();

    @NotNull
    @JsonAlias({"ids:connectorStatus", "connectorStatus"})
    protected ConnectorStatus _connectorStatus;

    @JsonAlias({"ids:keyStore", "keyStore"})
    protected URI _keyStore;

    @JsonAlias({"ids:keyStoreAlias", "keyStoreAlias"})
    protected String _keyStoreAlias;

    @JsonAlias({"ids:keyStorePassword", "keyStorePassword"})
    protected String _keyStorePassword;

    @JsonAlias({"ids:trustStore", "trustStore"})
    protected URI _trustStore;

    @JsonAlias({"ids:trustStoreAlias", "trustStoreAlias"})
    protected String _trustStoreAlias;

    @JsonAlias({"ids:trustStorePassword", "trustStorePassword"})
    protected String _trustStorePassword;

    @JsonAlias({"ids:userAuthentication", "userAuthentication"})
    protected List<UserAuthentication> _userAuthentication = new ArrayList<>();

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

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._userAuthentication,
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
            this._configuredClearingHouse);
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

    @Override
    public ConfigurationModel deepCopy() {
        ConfigurationModelBuilder builder = new ConfigurationModelBuilder();
        for (UserAuthentication item : this._userAuthentication) {
            if (item != null) {
                builder._userAuthentication_(item.deepCopy());
            }
        }
        builder._configurationModelLogLevel_(this._configurationModelLogLevel);
        builder._connectorStatus_(this._connectorStatus);
        builder._connectorDeployMode_(this._connectorDeployMode);
        if (this._connectorDescription != null) {
            builder._connectorDescription_(this._connectorDescription.deepCopy());
        }
        for (Proxy item : this._connectorProxy) {
            if (item != null) {
                builder._connectorProxy_(item.deepCopy());
            }
        }
        if (this._trustStore != null) {
            builder._trustStore_(URI.create(this._trustStore.toString()));
        }
        builder._trustStoreAlias_(this._trustStoreAlias);
        builder._trustStorePassword_(this._trustStorePassword);
        if (this._keyStore != null) {
            builder._keyStore_(URI.create(this._keyStore.toString()));
        }
        builder._keyStoreAlias_(this._keyStoreAlias);
        builder._keyStorePassword_(this._keyStorePassword);
        if (this._configuredBroker != null) {
            builder._configuredBroker_(this._configuredBroker.deepCopy());
        }
        for (AppRoute item : this._appRoute) {
            if (item != null) {
                builder._appRoute_(item.deepCopy());
            }
        }
        if (this._configuredAppStore != null) {
            builder._configuredAppStore_(this._configuredAppStore.deepCopy());
        }
        if (this._configuredAppResource != null) {
            builder._configuredAppResource_(this._configuredAppResource.deepCopy());
        }
        if (this._configuredClearingHouse != null) {
            builder._configuredClearingHouse_(this._configuredClearingHouse.deepCopy());
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public List<UserAuthentication> getUserAuthentication() {
        return _userAuthentication;
    }

    @Override
    public void setUserAuthentication(List<UserAuthentication> _userAuthentication_) {
        this._userAuthentication = _userAuthentication_;
    }

    @Override
    @NotNull
    public LogLevel getConfigurationModelLogLevel() {
        return _configurationModelLogLevel;
    }

    @Override
    public void setConfigurationModelLogLevel(LogLevel _configurationModelLogLevel_) {
        this._configurationModelLogLevel = _configurationModelLogLevel_;
    }

    @Override
    @NotNull
    public ConnectorStatus getConnectorStatus() {
        return _connectorStatus;
    }

    @Override
    public void setConnectorStatus(ConnectorStatus _connectorStatus_) {
        this._connectorStatus = _connectorStatus_;
    }

    @Override
    @NotNull
    public ConnectorDeployMode getConnectorDeployMode() {
        return _connectorDeployMode;
    }

    @Override
    public void setConnectorDeployMode(ConnectorDeployMode _connectorDeployMode_) {
        this._connectorDeployMode = _connectorDeployMode_;
    }

    @Override
    public Connector getConnectorDescription() {
        return _connectorDescription;
    }

    @Override
    public void setConnectorDescription(Connector _connectorDescription_) {
        this._connectorDescription = _connectorDescription_;
    }

    @Override
    public List<Proxy> getConnectorProxy() {
        return _connectorProxy;
    }

    @Override
    public void setConnectorProxy(List<Proxy> _connectorProxy_) {
        this._connectorProxy = _connectorProxy_;
    }

    @Override
    public URI getTrustStore() {
        return _trustStore;
    }

    @Override
    public void setTrustStore(URI _trustStore_) {
        this._trustStore = _trustStore_;
    }

    @Override
    public String getTrustStoreAlias() {
        return _trustStoreAlias;
    }

    @Override
    public void setTrustStoreAlias(String _trustStoreAlias_) {
        this._trustStoreAlias = _trustStoreAlias_;
    }

    @Override
    public String getTrustStorePassword() {
        return _trustStorePassword;
    }

    @Override
    public void setTrustStorePassword(String _trustStorePassword_) {
        this._trustStorePassword = _trustStorePassword_;
    }

    @Override
    public URI getKeyStore() {
        return _keyStore;
    }

    @Override
    public void setKeyStore(URI _keyStore_) {
        this._keyStore = _keyStore_;
    }

    @Override
    public String getKeyStoreAlias() {
        return _keyStoreAlias;
    }

    @Override
    public void setKeyStoreAlias(String _keyStoreAlias_) {
        this._keyStoreAlias = _keyStoreAlias_;
    }

    @Override
    public String getKeyStorePassword() {
        return _keyStorePassword;
    }

    @Override
    public void setKeyStorePassword(String _keyStorePassword_) {
        this._keyStorePassword = _keyStorePassword_;
    }

    @Override
    public BrokerCatalog getConfiguredBroker() {
        return _configuredBroker;
    }

    @Override
    public void setConfiguredBroker(BrokerCatalog _configuredBroker_) {
        this._configuredBroker = _configuredBroker_;
    }

    @Override
    public List<AppRoute> getAppRoute() {
        return _appRoute;
    }

    @Override
    public void setAppRoute(List<AppRoute> _appRoute_) {
        this._appRoute = _appRoute_;
    }

    @Override
    public AppStoreCatalog getConfiguredAppStore() {
        return _configuredAppStore;
    }

    @Override
    public void setConfiguredAppStore(AppStoreCatalog _configuredAppStore_) {
        this._configuredAppStore = _configuredAppStore_;
    }

    @Override
    public AppResourceCatalog getConfiguredAppResource() {
        return _configuredAppResource;
    }

    @Override
    public void setConfiguredAppResource(AppResourceCatalog _configuredAppResource_) {
        this._configuredAppResource = _configuredAppResource_;
    }

    @Override
    public ClearingHouseCatalog getConfiguredClearingHouse() {
        return _configuredClearingHouse;
    }

    @Override
    public void setConfiguredClearingHouse(ClearingHouseCatalog _configuredClearingHouse_) {
        this._configuredClearingHouse = _configuredClearingHouse_;
    }
}
