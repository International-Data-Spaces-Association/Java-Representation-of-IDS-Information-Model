package de.fraunhofer.iais.eis;



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

}
