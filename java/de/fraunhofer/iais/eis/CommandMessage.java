package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Command messages are usually sent when a response is expected by the sender. Changes state on the
 * recipient side. Therefore, commands are not 'safe' in the sense of REST.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CommandMessageImpl.class)
})
public interface CommandMessage extends RequestMessage {

    // standard methods

    @Beta
    public CommandMessage deepCopy();

}
