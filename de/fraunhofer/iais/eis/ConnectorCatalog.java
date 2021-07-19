package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class that aggregates Connectors from a (distributable) Catalog.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorCatalogImpl.class),
    @JsonSubTypes.Type(value = BrokerCatalog.class),
    @JsonSubTypes.Type(value = AppStoreCatalog.class)
})
public interface ConnectorCatalog extends Catalog {

    // standard methods

    @Beta
    public ConnectorCatalog deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * A Connector that is part of a Connector catalog.
     *
     * More information under https://w3id.org/idsa/core/listedConnector
     *
     * @return Returns the List of Connectors for the property _listedConnector.
     */
    @JsonProperty("ids:listedConnector")
    List<Connector> getListedConnector();

    /**
     * A Connector that is part of a Connector catalog.
     *
     * More information under https://w3id.org/idsa/core/listedConnector
     *
     * @param _listedConnector_ desired value for the property _listedConnector.
     */
    void setListedConnector(List<Connector> _listedConnector_);

}
