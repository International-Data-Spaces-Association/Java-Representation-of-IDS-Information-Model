package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating the availability and current description of a specific resource. The resource
 * must be present in the payload of this message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceUpdateMessageImpl.class)
})
public interface ResourceUpdateMessage extends ResourceNotificationMessage {

    // standard methods

    @Beta
    public ResourceUpdateMessage deepCopy();

}
