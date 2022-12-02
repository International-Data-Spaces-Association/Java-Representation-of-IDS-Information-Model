package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates Brokers from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BrokerCatalogImpl.class)
})
public interface BrokerCatalog extends ConnectorCatalog {

    // standard methods

    @Beta
    public BrokerCatalog deepCopy();

    // Default instances of this class as defined in the ontology

}
