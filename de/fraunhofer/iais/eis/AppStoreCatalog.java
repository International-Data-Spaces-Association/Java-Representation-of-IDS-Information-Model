package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates AppStores from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppStoreCatalogImpl.class)
})
public interface AppStoreCatalog extends ConnectorCatalog {

    // standard methods

    @Beta
    public AppStoreCatalog deepCopy();

}
