package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("RejectionMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractRejectionMessage.class)
})
public interface RejectionMessageMixin {
    @JsonProperty("ids:rejectionReason")
    public RejectionReason getRejectionReason();

    @JsonProperty("ids:rejectionReason")
    public void setRejectionReason(RejectionReason _rejectionReason_);
}
