package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Event-restricted Usage Policy' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EventRequestImpl.class)
})
public interface EventRequest extends ContractRequest {

    // standard methods

    @Beta
    public EventRequest deepCopy();

}
