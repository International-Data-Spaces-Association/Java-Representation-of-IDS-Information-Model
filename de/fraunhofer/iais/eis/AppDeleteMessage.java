package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating that an App should be deleted from the AppStore.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppDeleteMessageImpl.class)
})
public interface AppDeleteMessage extends AppNotificationMessage {

    // standard methods

    @Beta
    public AppDeleteMessage deepCopy();

}
