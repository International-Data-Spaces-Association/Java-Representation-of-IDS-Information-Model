package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating that the result of a former InvokeOperation message is available. May transfer
 * the result data in its associated payload section.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = OperationResultMessageImpl.class)
})
public interface OperationResultMessage extends ResponseMessage {

    // standard methods

    @Beta
    public OperationResultMessage deepCopy();

}
