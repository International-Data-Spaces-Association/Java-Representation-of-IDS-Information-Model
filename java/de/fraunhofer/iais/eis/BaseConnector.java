package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Implementation of the Connector specification providing only restricted security capabilities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BaseConnectorImpl.class)
})
public interface BaseConnector extends Connector {

    // standard methods

    @Beta
    public BaseConnector deepCopy();

}
