package de.fraunhofer.iais.eis;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * 
 * ids:AppRoute describes the communication between data apps (such as in a data processing
 * pipeline) inside an IDS Connector. An ids:AppRoute consist of multiple app endpoints which
 * exchange data. The communication pipeline between two adjacent data apps is represented by the
 * ids:RouteStep class. ids:AppRoute also holds the information about the app endpoints, which are
 * at the start and end of the whole processing pipeline.
 * 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppRouteImpl.class),
    @JsonSubTypes.Type(value = RouteStep.class)
})
public interface AppRoute extends ModelClass {

    // standard methods

    @Beta
    public AppRoute deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Supplementary information about, e.g., the technology used, for routes.
     *
     * More information under https://w3id.org/idsa/core/routeDeployMethod
     *
     * @return Returns the String for the property _routeDeployMethod.
     */
    @NotNull
    @JsonProperty("ids:routeDeployMethod")
    String getRouteDeployMethod();

    /**
     * Supplementary information about, e.g., the technology used, for routes.
     *
     * More information under https://w3id.org/idsa/core/routeDeployMethod
     *
     * @param _routeDeployMethod_ desired value for the property _routeDeployMethod.
     */
    void setRouteDeployMethod(String _routeDeployMethod_);

    /**
     * Route description.
     *
     * More information under https://w3id.org/idsa/core/routeDescription
     *
     * @return Returns the String for the property _routeDescription.
     */
    @JsonProperty("ids:routeDescription")
    String getRouteDescription();

    /**
     * Route description.
     *
     * More information under https://w3id.org/idsa/core/routeDescription
     *
     * @param _routeDescription_ desired value for the property _routeDescription.
     */
    void setRouteDescription(String _routeDescription_);

    /**
     * Configuration details (e.g., contents of a config file) used to configure the route. Should be
     * Base64 encoded.
     *
     * More information under https://w3id.org/idsa/core/routeConfiguration
     *
     * @return Returns the String for the property _routeConfiguration.
     */
    @JsonProperty("ids:routeConfiguration")
    String getRouteConfiguration();

    /**
     * Configuration details (e.g., contents of a config file) used to configure the route. Should be
     * Base64 encoded.
     *
     * More information under https://w3id.org/idsa/core/routeConfiguration
     *
     * @param _routeConfiguration_ desired value for the property _routeConfiguration.
     */
    void setRouteConfiguration(String _routeConfiguration_);

    /**
     * Route between two or more app endpoints inside a app routing pipeline.
     *
     * More information under https://w3id.org/idsa/core/hasSubRoute
     *
     * @return Returns the List of RouteSteps for the property _hasSubRoute.
     */
    @JsonProperty("ids:hasSubRoute")
    List<RouteStep> getHasSubRoute();

    /**
     * Route between two or more app endpoints inside a app routing pipeline.
     *
     * More information under https://w3id.org/idsa/core/hasSubRoute
     *
     * @param _hasSubRoute_ desired value for the property _hasSubRoute.
     */
    void setHasSubRoute(List<RouteStep> _hasSubRoute_);

    /**
     * Start of a route.
     *
     * More information under https://w3id.org/idsa/core/appRouteStart
     *
     * @return Returns the List of Endpoints for the property _appRouteStart.
     */
    @JsonProperty("ids:appRouteStart")
    List<Endpoint> getAppRouteStart();

    /**
     * Start of a route.
     *
     * More information under https://w3id.org/idsa/core/appRouteStart
     *
     * @param _appRouteStart_ desired value for the property _appRouteStart.
     */
    void setAppRouteStart(List<Endpoint> _appRouteStart_);

    /**
     * End of a route.
     *
     * More information under https://w3id.org/idsa/core/appRouteEnd
     *
     * @return Returns the List of Endpoints for the property _appRouteEnd.
     */
    @JsonProperty("ids:appRouteEnd")
    List<Endpoint> getAppRouteEnd();

    /**
     * End of a route.
     *
     * More information under https://w3id.org/idsa/core/appRouteEnd
     *
     * @param _appRouteEnd_ desired value for the property _appRouteEnd.
     */
    void setAppRouteEnd(List<Endpoint> _appRouteEnd_);

    /**
     * ids:Resource that corresponds to the output of an app route. Rationale: whereas an ids:Endpoint
     * can have an ids:endpointArtifact, it is additionally important that the data flow inside the
     * ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of
     * ids:Resource!) associated with the data coming into the Connector or going out of the Connector.
     * Use: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s)
     * configured for this AppRoute. Note: In an ids:AppRoute that is the sequence of multiple
     * ids:RouteSteps, the output resource of one step serves immediately as the input that is processed
     * by the subsequent step(s). An ids:SystemAdapter typically does not change the ids:Resource, but
     * might rather make it available in a different ids:Representation. An ids:SmartDataApp might
     * replate its input(s) by an entirely different (e.g., fused) resource.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteOutput
     *
     * @return Returns the List of Resources for the property _appRouteOutput.
     */
    @JsonProperty("ids:appRouteOutput")
    List<Resource> getAppRouteOutput();

    /**
     * ids:Resource that corresponds to the output of an app route. Rationale: whereas an ids:Endpoint
     * can have an ids:endpointArtifact, it is additionally important that the data flow inside the
     * ids:Connector / ids:ConfigurationModel is aware of the ids:ContractOffer (a property of
     * ids:Resource!) associated with the data coming into the Connector or going out of the Connector.
     * Use: Whenever properties of this Resource change, it may make sense to notify the ids:broker(s)
     * configured for this AppRoute. Note: In an ids:AppRoute that is the sequence of multiple
     * ids:RouteSteps, the output resource of one step serves immediately as the input that is processed
     * by the subsequent step(s). An ids:SystemAdapter typically does not change the ids:Resource, but
     * might rather make it available in a different ids:Representation. An ids:SmartDataApp might
     * replate its input(s) by an entirely different (e.g., fused) resource.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteOutput
     *
     * @param _appRouteOutput_ desired value for the property _appRouteOutput.
     */
    void setAppRouteOutput(List<Resource> _appRouteOutput_);

    /**
     * One or more ids:Broker(s) to which changes/updates of this route's ids:appRouteOutput
     * ids:Resource are announced. This should be a subset of those Brokers that have been configured as
     * ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteBroker
     *
     * @return Returns the List of Brokers for the property _appRouteBroker.
     */
    @JsonProperty("ids:appRouteBroker")
    List<Broker> getAppRouteBroker();

    /**
     * One or more ids:Broker(s) to which changes/updates of this route's ids:appRouteOutput
     * ids:Resource are announced. This should be a subset of those Brokers that have been configured as
     * ids:configuredBrokers in the ids:ConfigurationModel of which this is an ids:appRoute.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteBroker
     *
     * @param _appRouteBroker_ desired value for the property _appRouteBroker.
     */
    void setAppRouteBroker(List<Broker> _appRouteBroker_);

    /**
     * One or more ids:ClearingHouse(s) to which information of this route's data exchange are notified.
     * This should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog
     * for a given configuration model. The Configuration Model ids:configuredClearingHouse in the
     * ids:ConfigurationModel of which this is an ids:appRoute.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteClearingHouse
     *
     * @return Returns the List of ClearingHouses for the property _appRouteClearingHouse.
     */
    @JsonProperty("ids:appRouteClearingHouse")
    List<ClearingHouse> getAppRouteClearingHouse();

    /**
     * One or more ids:ClearingHouse(s) to which information of this route's data exchange are notified.
     * This should be a subset of clearing houses listed in the corresponding ids:ClearingHouseCatalog
     * for a given configuration model. The Configuration Model ids:configuredClearingHouse in the
     * ids:ConfigurationModel of which this is an ids:appRoute.
     *
     * 
     * More information under https://w3id.org/idsa/core/appRouteClearingHouse
     *
     * @param _appRouteClearingHouse_ desired value for the property _appRouteClearingHouse.
     */
    void setAppRouteClearingHouse(List<ClearingHouse> _appRouteClearingHouse_);

}
