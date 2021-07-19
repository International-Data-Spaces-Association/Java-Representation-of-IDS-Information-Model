package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating that a specific App should be available (again) in the AppStore.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppAvailableMessageImpl.class)
})
public interface AppAvailableMessage extends AppNotificationMessage {

    // standard methods

    @Beta
    public AppAvailableMessage deepCopy();

}
