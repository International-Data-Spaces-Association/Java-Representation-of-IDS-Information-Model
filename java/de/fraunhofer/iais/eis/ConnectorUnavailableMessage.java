package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Event notifying the recipient(s) that a connector will be unavailable. The same connector may be
 * available again in the future.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorUnavailableMessageImpl.class)
})
public interface ConnectorUnavailableMessage extends ConnectorNotificationMessage {

    // standard methods

    @Beta
    public ConnectorUnavailableMessage deepCopy();

}
