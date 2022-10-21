package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing a suggested content contract (as offered by the data consumer to the data
 * provider) in the associated payload (which is an instance of ids:ContractRequest).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractRequestMessageImpl.class)
})
public interface ContractRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public ContractRequestMessage deepCopy();

}
