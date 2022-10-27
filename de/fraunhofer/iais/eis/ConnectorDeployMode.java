package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Deploy mode of a Connector. Used mainly to capture a Connectors deployment type in the
 * Configuration Model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorDeployModeImpl.class)
})
public interface ConnectorDeployMode extends ModelClass {

    // standard methods

    @Beta
    public ConnectorDeployMode deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * Indicates that a Connector is deployed for productive use.
     */
    ConnectorDeployMode PRODUCTIVE_DEPLOYMENT =
        new ConnectorDeployModeBuilder(URI.create("https://w3id.org/idsa/code/PRODUCTIVE_DEPLOYMENT")).build();

    /**
     * Indicates that a Connector is deployed for testing.
     */
    ConnectorDeployMode TEST_DEPLOYMENT = new ConnectorDeployModeBuilder(URI.create("https://w3id.org/idsa/code/TEST_DEPLOYMENT")).build();

}
