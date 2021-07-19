package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing a response to a contract request (of a data consumer) in form of a
 * counter-proposal of a contract in the associated payload (which is an instance of
 * ids:ContractOffer).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractResponseMessageImpl.class)
})
public interface ContractResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public ContractResponseMessage deepCopy();

}
