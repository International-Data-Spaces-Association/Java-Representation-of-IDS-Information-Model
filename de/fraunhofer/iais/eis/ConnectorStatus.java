package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Connector Status is used to represent a Connectors current state inside the Configuration Model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorStatusImpl.class)
})
public interface ConnectorStatus extends ModelClass {

    // standard methods

    @Beta
    public ConnectorStatus deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * Indicates that a Connector is badly configured.
     */
    ConnectorStatus CONNECTOR_BADLY_CONFIGURED =
        new ConnectorStatusBuilder(URI.create("https://w3id.org/idsa/code/CONNECTOR_BADLY_CONFIGURED")).build();

    /**
     * Indicates that a Connector is offline.
     */
    ConnectorStatus CONNECTOR_OFFLINE = new ConnectorStatusBuilder(URI.create("https://w3id.org/idsa/code/CONNECTOR_OFFLINE")).build();

    /**
     * Indicates that a Connector is online.
     */
    ConnectorStatus CONNECTOR_ONLINE = new ConnectorStatusBuilder(URI.create("https://w3id.org/idsa/code/CONNECTOR_ONLINE")).build();

}
