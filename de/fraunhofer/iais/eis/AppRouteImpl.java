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
 * Default implementation of package de.fraunhofer.iais.eis.AppRoute
 * 
 * 
 * ids:AppRoute describes the communication between data apps (such as in a data processing
 * pipeline) inside an IDS Connector. An ids:AppRoute consist of multiple app endpoints which
 * exchange data. The communication pipeline between two adjacent data apps is represented by the
 * ids:RouteStep class. ids:AppRoute also holds the information about the app endpoints, which are
 * at the start and end of the whole processing pipeline.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:AppRoute")
public class AppRouteImpl implements AppRoute {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("App Route", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "    ids:AppRoute describes the communication between data apps (such as in a data processing pipeline) inside an IDS Connector.    An ids:AppRoute consist of multiple app endpoints which exchange data. The communication pipeline between two adjacent data apps is represented by the ids:RouteStep class.    ids:AppRoute also holds the information about the app endpoints, which are at the start and end of the whole processing pipeline.    ",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:appRouteBroker", "appRouteBroker"})
    protected List<Broker> _appRouteBroker = new ArrayList<>();

    @JsonAlias({"ids:appRouteClearingHouse", "appRouteClearingHouse"})
    protected List<ClearingHouse> _appRouteClearingHouse = new ArrayList<>();

    @JsonAlias({"ids:appRouteEnd", "appRouteEnd"})
    protected List<Endpoint> _appRouteEnd = new ArrayList<>();

    @JsonAlias({"ids:appRouteOutput", "appRouteOutput"})
    protected List<Resource> _appRouteOutput = new ArrayList<>();

    @JsonAlias({"ids:appRouteStart", "appRouteStart"})
    protected List<Endpoint> _appRouteStart = new ArrayList<>();

    @JsonAlias({"ids:hasSubRoute", "hasSubRoute"})
    protected List<RouteStep> _hasSubRoute = new ArrayList<>();

    @JsonAlias({"ids:routeConfiguration", "routeConfiguration"})
    protected String _routeConfiguration;

    @NotNull
    @JsonAlias({"ids:routeDeployMethod", "routeDeployMethod"})
    protected String _routeDeployMethod;

    @JsonAlias({"ids:routeDescription", "routeDescription"})
    protected String _routeDescription;

    protected AppRouteImpl() {
        id = VocabUtil.getInstance().createRandomUrl("appRoute");
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
        return Objects.hash(this._routeDeployMethod,
            this._routeDescription,
            this._routeConfiguration,
            this._hasSubRoute,
            this._appRouteStart,
            this._appRouteEnd,
            this._appRouteOutput,
            this._appRouteBroker,
            this._appRouteClearingHouse);
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
            AppRouteImpl other = (AppRouteImpl) obj;
            return Objects.equals(this._routeDeployMethod, other._routeDeployMethod) &&
                Objects.equals(this._routeDescription, other._routeDescription) &&
                Objects.equals(this._routeConfiguration, other._routeConfiguration) &&
                Objects.equals(this._hasSubRoute, other._hasSubRoute) &&
                Objects.equals(this._appRouteStart, other._appRouteStart) &&
                Objects.equals(this._appRouteEnd, other._appRouteEnd) &&
                Objects.equals(this._appRouteOutput, other._appRouteOutput) &&
                Objects.equals(this._appRouteBroker, other._appRouteBroker) &&
                Objects.equals(this._appRouteClearingHouse, other._appRouteClearingHouse);
        }
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    @NotNull
    public String getRouteDeployMethod() {
        return _routeDeployMethod;
    }

    @Override
    public void setRouteDeployMethod(String _routeDeployMethod_) {
        this._routeDeployMethod = _routeDeployMethod_;
    }

    @Override
    public String getRouteDescription() {
        return _routeDescription;
    }

    @Override
    public void setRouteDescription(String _routeDescription_) {
        this._routeDescription = _routeDescription_;
    }

    @Override
    public String getRouteConfiguration() {
        return _routeConfiguration;
    }

    @Override
    public void setRouteConfiguration(String _routeConfiguration_) {
        this._routeConfiguration = _routeConfiguration_;
    }

    @Override
    public List<RouteStep> getHasSubRoute() {
        return _hasSubRoute;
    }

    @Override
    public void setHasSubRoute(List<RouteStep> _hasSubRoute_) {
        this._hasSubRoute = _hasSubRoute_;
    }

    @Override
    public List<Endpoint> getAppRouteStart() {
        return _appRouteStart;
    }

    @Override
    public void setAppRouteStart(List<Endpoint> _appRouteStart_) {
        this._appRouteStart = _appRouteStart_;
    }

    @Override
    public List<Endpoint> getAppRouteEnd() {
        return _appRouteEnd;
    }

    @Override
    public void setAppRouteEnd(List<Endpoint> _appRouteEnd_) {
        this._appRouteEnd = _appRouteEnd_;
    }

    @Override
    public List<Resource> getAppRouteOutput() {
        return _appRouteOutput;
    }

    @Override
    public void setAppRouteOutput(List<Resource> _appRouteOutput_) {
        this._appRouteOutput = _appRouteOutput_;
    }

    @Override
    public List<Broker> getAppRouteBroker() {
        return _appRouteBroker;
    }

    @Override
    public void setAppRouteBroker(List<Broker> _appRouteBroker_) {
        this._appRouteBroker = _appRouteBroker_;
    }

    @Override
    public List<ClearingHouse> getAppRouteClearingHouse() {
        return _appRouteClearingHouse;
    }

    @Override
    public void setAppRouteClearingHouse(List<ClearingHouse> _appRouteClearingHouse_) {
        this._appRouteClearingHouse = _appRouteClearingHouse_;
    }
}
