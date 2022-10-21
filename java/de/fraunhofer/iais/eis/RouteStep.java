package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * RouteSteps hold information about a communication pipelines between apps. A RouteStep should hold
 * one value for the ids:appRouteStart and/or ids:appRouteEnd properties, so that communication
 * between app endpoints remain distinguishable.
 * 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RouteStepImpl.class)
})
public interface RouteStep extends AppRoute {

    // standard methods

    @Beta
    public RouteStep deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp)
     * which is deployed in the Connector maintained by the Configuration Model and whoose endpoint
     * (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part
     * of the catalog of AppResources in the corresponding Configuration Model (cf.
     * ids:configuredAppResource property in class ids:ConfigurationModel).
     *
     * 
     * More information under https://w3id.org/idsa/core/requiredDataApp
     *
     * @return Returns the AppRepresentation for the property _requiredDataApp.
     */
    @JsonProperty("ids:requiredDataApp")
    AppRepresentation getRequiredDataApp();

    /**
     * Refers to the concrete app representation (ids:AppRepresentation) for a data app (ids:DataApp)
     * which is deployed in the Connector maintained by the Configuration Model and whoose endpoint
     * (ids:AppEndpoint) is used in this ids:RouteStep. The referred app representation should be part
     * of the catalog of AppResources in the corresponding Configuration Model (cf.
     * ids:configuredAppResource property in class ids:ConfigurationModel).
     *
     * 
     * More information under https://w3id.org/idsa/core/requiredDataApp
     *
     * @param _requiredDataApp_ desired value for the property _requiredDataApp.
     */
    void setRequiredDataApp(AppRepresentation _requiredDataApp_);

}
