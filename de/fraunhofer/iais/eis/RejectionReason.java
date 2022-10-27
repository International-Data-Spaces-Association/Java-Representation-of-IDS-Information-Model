package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Class of reasons that might lead to issuing a Rejection message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RejectionReasonImpl.class)
})
public interface RejectionReason extends ModelClass {

    // standard methods

    @Beta
    public RejectionReason deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * At least one query or operation parameter is not acceptable for the sender of this rejection
     * message.
     */
    RejectionReason BAD_PARAMETERS = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/BAD_PARAMETERS")).build();

    /**
     * The message recipient encountered an internal error while processing the message (e.g., storage
     * capacity exceeded).
     */
    RejectionReason INTERNAL_RECIPIENT_ERROR =
        new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/INTERNAL_RECIPIENT_ERROR")).build();

    /**
     * The originating message is malformed or missing information.
     */
    RejectionReason MALFORMED_MESSAGE = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/MALFORMED_MESSAGE")).build();

    /**
     * The sender of the rejection does not support the incoming message type (e.g., ids:QueryMessage).
     */
    RejectionReason MESSAGE_TYPE_NOT_SUPPORTED =
        new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/MESSAGE_TYPE_NOT_SUPPORTED")).build();

    /**
     * The sender of the rejection does not implement a certain functionality stated in the message
     * (e.g., query language).
     */
    RejectionReason METHOD_NOT_SUPPORTED =
        new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/METHOD_NOT_SUPPORTED")).build();

    /**
     * Authenticity of a message sender has failed or is not verifiable.
     */
    RejectionReason NOT_AUTHENTICATED = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/NOT_AUTHENTICATED")).build();

    /**
     * Sender is not authorized to initiate the command.
     */
    RejectionReason NOT_AUTHORIZED = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/NOT_AUTHORIZED")).build();

    /**
     * Requested Resource was not found.
     */
    RejectionReason NOT_FOUND = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/NOT_FOUND")).build();

    /**
     * The requested resource, representation or artifact is temporarily not available but might be back
     * later.
     */
    RejectionReason TEMPORARILY_NOT_AVAILABLE =
        new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/TEMPORARILY_NOT_AVAILABLE")).build();

    /**
     * Processing of the command would lead to too many results (computational or bandwidth limitations)
     */
    RejectionReason TOO_MANY_RESULTS = new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/TOO_MANY_RESULTS")).build();

    /**
     * The version of the information model against which the referenced message should be interpreted,
     * is not supported by the recipient.
     */
    RejectionReason VERSION_NOT_SUPPORTED =
        new RejectionReasonBuilder(URI.create("https://w3id.org/idsa/code/VERSION_NOT_SUPPORTED")).build();

}
