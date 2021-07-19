package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Data Apps that integrate sources and sinks of digital content maintained internally on
 * Participant's premises with a Connector.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SystemAdapterImpl.class)
})
public interface SystemAdapter extends DataApp {

    // standard methods

    @Beta
    public SystemAdapter deepCopy();

}
