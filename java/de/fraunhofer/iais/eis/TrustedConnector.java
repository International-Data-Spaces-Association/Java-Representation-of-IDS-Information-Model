package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Hardened implementation of the Connector specification providing enhanced security capabilities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TrustedConnectorImpl.class)
})
public interface TrustedConnector extends Connector {

    // standard methods

    @Beta
    public TrustedConnector deepCopy();

}
