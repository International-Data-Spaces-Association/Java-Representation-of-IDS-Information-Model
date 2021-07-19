package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Event notifying the recipient(s) about the availability and current configuration of a connector.
 * The payload of the message must contain the updated connector's self-description.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorUpdateMessageImpl.class)
})
public interface ConnectorUpdateMessage extends ConnectorNotificationMessage {

    // standard methods

    @Beta
    public ConnectorUpdateMessage deepCopy();

}
