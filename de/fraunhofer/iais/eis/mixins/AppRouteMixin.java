package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppRoute")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RouteStep.class)
})
public interface AppRouteMixin {
    @JsonProperty("ids:routeDeployMethod")
    @NotNull
    public String getRouteDeployMethod();

    @JsonProperty("ids:routeDeployMethod")
    public void setRouteDeployMethod(String _routeDeployMethod_);

    @JsonProperty("ids:routeDescription")
    public String getRouteDescription();

    @JsonProperty("ids:routeDescription")
    public void setRouteDescription(String _routeDescription_);

    @JsonProperty("ids:routeConfiguration")
    public String getRouteConfiguration();

    @JsonProperty("ids:routeConfiguration")
    public void setRouteConfiguration(String _routeConfiguration_);

    @JsonProperty("ids:hasSubRoute")
    public List<RouteStep> getHasSubRoute();

    @JsonProperty("ids:hasSubRoute")
    public void setHasSubRoute(List<RouteStep> _hasSubRoute_);

    @JsonProperty("ids:appRouteStart")
    public List<Endpoint> getAppRouteStart();

    @JsonProperty("ids:appRouteStart")
    public void setAppRouteStart(List<Endpoint> _appRouteStart_);

    @JsonProperty("ids:appRouteEnd")
    public List<Endpoint> getAppRouteEnd();

    @JsonProperty("ids:appRouteEnd")
    public void setAppRouteEnd(List<Endpoint> _appRouteEnd_);

    @JsonProperty("ids:appRouteOutput")
    public List<Resource> getAppRouteOutput();

    @JsonProperty("ids:appRouteOutput")
    public void setAppRouteOutput(List<Resource> _appRouteOutput_);

    @JsonProperty("ids:appRouteBroker")
    public List<Broker> getAppRouteBroker();

    @JsonProperty("ids:appRouteBroker")
    public void setAppRouteBroker(List<Broker> _appRouteBroker_);

    @JsonProperty("ids:appRouteClearingHouse")
    public List<ClearingHouse> getAppRouteClearingHouse();

    @JsonProperty("ids:appRouteClearingHouse")
    public void setAppRouteClearingHouse(List<ClearingHouse> _appRouteClearingHouse_);
}
