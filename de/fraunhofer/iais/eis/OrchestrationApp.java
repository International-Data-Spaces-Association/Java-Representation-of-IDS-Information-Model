package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Apps for orchestrating System Adapter Apps or Smart Data Apps, inside a Connector.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = OrchestrationAppImpl.class)
})
public interface OrchestrationApp extends DataApp {

    // standard methods

    @Beta
    public OrchestrationApp deepCopy();

}
