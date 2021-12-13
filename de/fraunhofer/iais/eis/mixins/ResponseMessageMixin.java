package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ResponseMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
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
public interface ResponseMessageMixin {

}
