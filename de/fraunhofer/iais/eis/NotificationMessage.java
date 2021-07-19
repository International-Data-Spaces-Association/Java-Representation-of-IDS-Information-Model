package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Event messages are informative and no response is expected by the sender.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificationMessageImpl.class),
    @JsonSubTypes.Type(value = ConnectorNotificationMessage.class),
    @JsonSubTypes.Type(value = ParticipantNotificationMessage.class),
    @JsonSubTypes.Type(value = ContractOfferMessage.class),
    @JsonSubTypes.Type(value = ContractSupplementMessage.class),
    @JsonSubTypes.Type(value = ResourceNotificationMessage.class),
    @JsonSubTypes.Type(value = RequestInProcessMessage.class),
    @JsonSubTypes.Type(value = MessageProcessedNotificationMessage.class),
    @JsonSubTypes.Type(value = LogMessage.class)
})
public interface NotificationMessage extends Message {

    // standard methods

    @Beta
    public NotificationMessage deepCopy();

}
