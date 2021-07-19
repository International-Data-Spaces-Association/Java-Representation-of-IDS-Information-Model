package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Event notifying the recipient(s) about the availability and current description of a participant.
 * The payload of the message must contain the participant's self-description.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantUpdateMessageImpl.class)
})
public interface ParticipantUpdateMessage extends ParticipantNotificationMessage {

    // standard methods

    @Beta
    public ParticipantUpdateMessage deepCopy();

}
