package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("RequestMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
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
public interface RequestMessageMixin {

}
