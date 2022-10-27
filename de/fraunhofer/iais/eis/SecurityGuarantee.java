package de.fraunhofer.iais.eis;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Security guarantee claimed by a security profile.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SecurityGuaranteeImpl.class),
    @JsonSubTypes.Type(value = IntegrityGuarantee.class),
    @JsonSubTypes.Type(value = IntegrityVerificationScopeGuarantee.class),
    @JsonSubTypes.Type(value = AuthenticationGuarantee.class),
    @JsonSubTypes.Type(value = ServiceIsolationGuarantee.class),
    @JsonSubTypes.Type(value = AppExecutionResources.class),
    @JsonSubTypes.Type(value = UsageControlGuarantee.class),
    @JsonSubTypes.Type(value = AuditGuarantee.class),
    @JsonSubTypes.Type(value = LocalDataConfidentialityGuarantee.class)
})
public interface SecurityGuarantee extends ModelClass {

    // standard methods

    @Beta
    public SecurityGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

}
