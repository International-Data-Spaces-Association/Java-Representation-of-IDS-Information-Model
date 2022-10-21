package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Response messages hold information about the reaction of a recipient to a formerly sent command
 * or event. They must be correlated to this message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResponseMessageImpl.class),
    @JsonSubTypes.Type(value = ResultMessage.class),
    @JsonSubTypes.Type(value = RejectionMessage.class),
    @JsonSubTypes.Type(value = DescriptionResponseMessage.class),
    @JsonSubTypes.Type(value = ContractResponseMessage.class),
    @JsonSubTypes.Type(value = ContractAgreementMessage.class),
    @JsonSubTypes.Type(value = AccessTokenResponseMessage.class),
    @JsonSubTypes.Type(value = OperationResultMessage.class),
    @JsonSubTypes.Type(value = ArtifactResponseMessage.class),
    @JsonSubTypes.Type(value = UploadResponseMessage.class),
    @JsonSubTypes.Type(value = ParticipantResponseMessage.class),
    @JsonSubTypes.Type(value = AppRegistrationResponseMessage.class)
})
public interface ResponseMessage extends Message {

    // standard methods

    @Beta
    public ResponseMessage deepCopy();

}
