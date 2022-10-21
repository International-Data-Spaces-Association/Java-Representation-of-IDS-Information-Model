package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;
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
 * Default implementation of package de.fraunhofer.iais.eis.OrchestrationApp
 * 
 * Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:OrchestrationApp")
public class OrchestrationAppImpl implements OrchestrationApp {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Orchestration App", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment =
        Arrays.asList(new TypedLiteral("Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector.", "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:appDocumentation", "appDocumentation"})
    protected String _appDocumentation;

    @NotEmpty
    @JsonAlias({"ids:appEndpoint", "appEndpoint"})
    protected List<AppEndpoint> _appEndpoint = new ArrayList<>();

    @JsonAlias({"ids:appEnvironmentVariables", "appEnvironmentVariables"})
    protected String _appEnvironmentVariables;

    @JsonAlias({"ids:appStorageConfiguration", "appStorageConfiguration"})
    protected String _appStorageConfiguration;

    @JsonAlias({"ids:supportedUsagePolicies", "supportedUsagePolicies"})
    protected List<UsagePolicyClass> _supportedUsagePolicies = new ArrayList<>();

    protected OrchestrationAppImpl() {
        id = VocabUtil.getInstance().createRandomUrl("orchestrationApp");
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
        return Objects.hash(this._appDocumentation,
            this._appEndpoint,
            this._appEnvironmentVariables,
            this._appStorageConfiguration,
            this._supportedUsagePolicies);
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
            OrchestrationAppImpl other = (OrchestrationAppImpl) obj;
            return Objects.equals(this._appDocumentation, other._appDocumentation) &&
                Objects.equals(this._appEndpoint, other._appEndpoint) &&
                Objects.equals(this._appEnvironmentVariables, other._appEnvironmentVariables) &&
                Objects.equals(this._appStorageConfiguration, other._appStorageConfiguration) &&
                Objects.equals(this._supportedUsagePolicies, other._supportedUsagePolicies);
        }
    }

    @Override
    public OrchestrationApp deepCopy() {
        OrchestrationAppBuilder builder = new OrchestrationAppBuilder();
        builder._appDocumentation_(this._appDocumentation);
        for (AppEndpoint item : this._appEndpoint) {
            if (item != null) {
                builder._appEndpoint_(item.deepCopy());
            }
        }
        builder._appEnvironmentVariables_(this._appEnvironmentVariables);
        builder._appStorageConfiguration_(this._appStorageConfiguration);
        for (UsagePolicyClass item : this._supportedUsagePolicies) {
            builder._supportedUsagePolicies_(item);
        }
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public String getAppDocumentation() {
        return _appDocumentation;
    }

    @Override
    public void setAppDocumentation(String _appDocumentation_) {
        this._appDocumentation = _appDocumentation_;
    }

    @Override
    @NotEmpty
    public List<AppEndpoint> getAppEndpoint() {
        return _appEndpoint;
    }

    @Override
    public void setAppEndpoint(List<AppEndpoint> _appEndpoint_) {
        this._appEndpoint = _appEndpoint_;
    }

    @Override
    public String getAppEnvironmentVariables() {
        return _appEnvironmentVariables;
    }

    @Override
    public void setAppEnvironmentVariables(String _appEnvironmentVariables_) {
        this._appEnvironmentVariables = _appEnvironmentVariables_;
    }

    @Override
    public String getAppStorageConfiguration() {
        return _appStorageConfiguration;
    }

    @Override
    public void setAppStorageConfiguration(String _appStorageConfiguration_) {
        this._appStorageConfiguration = _appStorageConfiguration_;
    }

    @Override
    public List<UsagePolicyClass> getSupportedUsagePolicies() {
        return _supportedUsagePolicies;
    }

    @Override
    public void setSupportedUsagePolicies(List<UsagePolicyClass> _supportedUsagePolicies_) {
        this._supportedUsagePolicies = _supportedUsagePolicies_;
    }
}
