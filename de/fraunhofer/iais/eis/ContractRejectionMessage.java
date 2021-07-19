package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message indicating rejection of a contract.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractRejectionMessageImpl.class)
})
public interface ContractRejectionMessage extends RejectionMessage {

    // standard methods

    @Beta
    public ContractRejectionMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Human-readable text describing the reason for contract rejection.
     *
     * More information under https://w3id.org/idsa/core/contractRejectionReason
     *
     * @return Returns the TypedLiteral for the property _contractRejectionReason.
     */
    @JsonProperty("ids:contractRejectionReason")
    TypedLiteral getContractRejectionReason();

    /**
     * Human-readable text describing the reason for contract rejection.
     *
     * More information under https://w3id.org/idsa/core/contractRejectionReason
     *
     * @param _contractRejectionReason_ desired value for the property _contractRejectionReason.
     */
    void setContractRejectionReason(TypedLiteral _contractRejectionReason_);

}
