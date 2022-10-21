package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Broker holding an index of published data endpoints.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BrokerImpl.class)
})
public interface Broker extends Connector {

    // standard methods

    @Beta
    public Broker deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Reference to catalog of Connectors, which are listed in the Broker.
     *
     * More information under https://w3id.org/idsa/core/connectorCatalog
     *
     * @return Returns the List of ConnectorCatalogs for the property _connectorCatalog.
     */
    @JsonProperty("ids:connectorCatalog")
    List<ConnectorCatalog> getConnectorCatalog();

    /**
     * Reference to catalog of Connectors, which are listed in the Broker.
     *
     * More information under https://w3id.org/idsa/core/connectorCatalog
     *
     * @param _connectorCatalog_ desired value for the property _connectorCatalog.
     */
    void setConnectorCatalog(List<ConnectorCatalog> _connectorCatalog_);

}
