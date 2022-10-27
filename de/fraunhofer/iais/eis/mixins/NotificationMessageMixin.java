package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("NotificationMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorNotificationMessage.class),
    @JsonSubTypes.Type(value = ParticipantNotificationMessage.class),
    @JsonSubTypes.Type(value = ContractOfferMessage.class),
    @JsonSubTypes.Type(value = ContractSupplementMessage.class),
    @JsonSubTypes.Type(value = ResourceNotificationMessage.class),
    @JsonSubTypes.Type(value = RequestInProcessMessage.class),
    @JsonSubTypes.Type(value = MessageProcessedNotificationMessage.class),
    @JsonSubTypes.Type(value = LogMessage.class)
})
public interface NotificationMessageMixin {

}
