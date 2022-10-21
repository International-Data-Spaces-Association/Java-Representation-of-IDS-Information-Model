package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing supplemental information to access resources of a contract (e.g., resource
 * access tokens).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractSupplementMessageImpl.class)
})
public interface ContractSupplementMessage extends NotificationMessage {

    // standard methods

    @Beta
    public ContractSupplementMessage deepCopy();

}
