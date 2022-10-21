package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Event notifying the recipient(s) that a participant will be unavailable. The same participant may
 * be available again in the future.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantUnavailableMessageImpl.class)
})
public interface ParticipantUnavailableMessage extends ParticipantNotificationMessage {

    // standard methods

    @Beta
    public ParticipantUnavailableMessage deepCopy();

}
