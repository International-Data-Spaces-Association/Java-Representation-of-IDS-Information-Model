package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Internal or external Agent interacting with the International Data Spaces, not necessarily an IDS
 * Participant.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AgentImpl.class),
    @JsonSubTypes.Type(value = Participant.class)
})
public interface Agent extends Described {

    // standard methods

    @Beta
    public Agent deepCopy();

}
