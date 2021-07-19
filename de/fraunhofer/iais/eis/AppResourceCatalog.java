package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates App Resources from a (distributable) Catalog. May be used to list installed
 * apps in a component.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppResourceCatalogImpl.class)
})
public interface AppResourceCatalog extends Catalog {

    // standard methods

    @Beta
    public AppResourceCatalog deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * An AppResource that is part of an AppResourceCatalog.
     *
     * More information under https://w3id.org/idsa/core/listedAppResource
     *
     * @return Returns the List of AppResources for the property _listedAppResource.
     */
    @JsonProperty("ids:listedAppResource")
    List<AppResource> getListedAppResource();

    /**
     * An AppResource that is part of an AppResourceCatalog.
     *
     * More information under https://w3id.org/idsa/core/listedAppResource
     *
     * @param _listedAppResource_ desired value for the property _listedAppResource.
     */
    void setListedAppResource(List<AppResource> _listedAppResource_);

}
