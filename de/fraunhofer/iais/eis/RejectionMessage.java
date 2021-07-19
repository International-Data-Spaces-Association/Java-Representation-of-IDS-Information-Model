package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Rejection messages are specialized response messages that notify the sender of a message that
 * processing of this message has failed.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RejectionMessageImpl.class),
    @JsonSubTypes.Type(value = ContractRejectionMessage.class)
})
public interface RejectionMessage extends ResponseMessage {

    // standard methods

    @Beta
    public RejectionMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Specifies the reason of the rejection.
     *
     * More information under https://w3id.org/idsa/core/rejectionReason
     *
     * @return Returns the RejectionReason for the property _rejectionReason.
     */
    @JsonProperty("ids:rejectionReason")
    RejectionReason getRejectionReason();

    /**
     * Specifies the reason of the rejection.
     *
     * More information under https://w3id.org/idsa/core/rejectionReason
     *
     * @param _rejectionReason_ desired value for the property _rejectionReason.
     */
    void setRejectionReason(RejectionReason _rejectionReason_);

}
