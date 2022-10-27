package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Level/extent of verifying the software stack.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IntegrityVerificationScopeGuaranteeImpl.class)
})
public interface IntegrityVerificationScopeGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public IntegrityVerificationScopeGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    IntegrityVerificationScopeGuarantee INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER = new IntegrityVerificationScopeGuaranteeBuilder(
        URI.create("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER")).build();

    /** 
    */
    IntegrityVerificationScopeGuarantee INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION =
        new IntegrityVerificationScopeGuaranteeBuilder(
            URI.create("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_KERNEL_CORE_CONTAINER_APPLICATION")).build();

    /** 
    */
    IntegrityVerificationScopeGuarantee INTEGRITY_VERIFICATION_SCOPE_NONE =
        new IntegrityVerificationScopeGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_SCOPE_NONE")).build();

}
