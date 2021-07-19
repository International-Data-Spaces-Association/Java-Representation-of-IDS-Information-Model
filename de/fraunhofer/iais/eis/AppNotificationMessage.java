package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Superclass of all messages, indicating a change of a DataApp. Unlike Resource-related Messages,
 * AppNotificationMessages should lead to a state change for an app at the recipient, the AppStore.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppAvailableMessage.class),
    @JsonSubTypes.Type(value = AppUnavailableMessage.class),
    @JsonSubTypes.Type(value = AppDeleteMessage.class)
})
public interface AppNotificationMessage extends ResourceNotificationMessage {

    // standard methods

    @Beta
    public AppNotificationMessage deepCopy();

}
