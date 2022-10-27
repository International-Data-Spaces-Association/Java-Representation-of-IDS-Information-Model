package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("SecurityGuarantee")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IntegrityGuarantee.class),
    @JsonSubTypes.Type(value = IntegrityVerificationScopeGuarantee.class),
    @JsonSubTypes.Type(value = AuthenticationGuarantee.class),
    @JsonSubTypes.Type(value = ServiceIsolationGuarantee.class),
    @JsonSubTypes.Type(value = AppExecutionResources.class),
    @JsonSubTypes.Type(value = UsageControlGuarantee.class),
    @JsonSubTypes.Type(value = AuditGuarantee.class),
    @JsonSubTypes.Type(value = LocalDataConfidentialityGuarantee.class)
})
public interface SecurityGuaranteeMixin {

}
