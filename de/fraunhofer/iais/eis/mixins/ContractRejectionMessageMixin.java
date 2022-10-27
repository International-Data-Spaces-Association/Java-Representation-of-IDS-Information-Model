package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ContractRejectionMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ContractRejectionMessageMixin {
    @JsonProperty("ids:contractRejectionReason")
    public TypedLiteral getContractRejectionReason();

    @JsonProperty("ids:contractRejectionReason")
    public void setContractRejectionReason(TypedLiteral _contractRejectionReason_);
}
