package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Notification that a message has been successfully processed (i.e. not ignored or rejected).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = MessageProcessedNotificationMessageImpl.class)
})
public interface MessageProcessedNotificationMessage extends NotificationMessage {

    // standard methods

    @Beta
    public MessageProcessedNotificationMessage deepCopy();

}
