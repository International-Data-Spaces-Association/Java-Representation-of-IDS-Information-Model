package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating that a specific resource is unavailable. The same resource may be available
 * again in the future.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceUnavailableMessageImpl.class)
})
public interface ResourceUnavailableMessage extends ResourceNotificationMessage {

    // standard methods

    @Beta
    public ResourceUnavailableMessage deepCopy();

}
