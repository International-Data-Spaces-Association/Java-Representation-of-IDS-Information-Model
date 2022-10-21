package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing a contract, as an instance of ids:ContractAgreement, with resource access
 * modalities on which two parties have agreed in the payload.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractAgreementMessageImpl.class)
})
public interface ContractAgreementMessage extends ResponseMessage {

    // standard methods

    @Beta
    public ContractAgreementMessage deepCopy();

}
