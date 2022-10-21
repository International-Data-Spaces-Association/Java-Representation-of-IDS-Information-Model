package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Client-generated message initiating a communication, motivated by a certain reason and with an
 * answer expected.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RequestMessageImpl.class),
    @JsonSubTypes.Type(value = CommandMessage.class),
    @JsonSubTypes.Type(value = DescriptionRequestMessage.class),
    @JsonSubTypes.Type(value = QueryMessage.class),
    @JsonSubTypes.Type(value = ContractRequestMessage.class),
    @JsonSubTypes.Type(value = AccessTokenRequestMessage.class),
    @JsonSubTypes.Type(value = InvokeOperationMessage.class),
    @JsonSubTypes.Type(value = ArtifactRequestMessage.class),
    @JsonSubTypes.Type(value = UploadMessage.class),
    @JsonSubTypes.Type(value = ParticipantRequestMessage.class),
    @JsonSubTypes.Type(value = AppRegistrationRequestMessage.class)
})
public interface RequestMessage extends Message {

    // standard methods

    @Beta
    public RequestMessage deepCopy();

}
