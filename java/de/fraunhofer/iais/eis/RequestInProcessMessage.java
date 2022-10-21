package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Notification that a request has been accepted and is being processed.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RequestInProcessMessageImpl.class)
})
public interface RequestInProcessMessage extends NotificationMessage {

    // standard methods

    @Beta
    public RequestInProcessMessage deepCopy();

}
