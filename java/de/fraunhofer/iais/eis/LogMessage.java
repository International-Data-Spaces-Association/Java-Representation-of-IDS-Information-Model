package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Log Message which can be used to transfer logs e.g., to the clearing house.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LogMessageImpl.class)
})
public interface LogMessage extends NotificationMessage {

    // standard methods

    @Beta
    public LogMessage deepCopy();

}
