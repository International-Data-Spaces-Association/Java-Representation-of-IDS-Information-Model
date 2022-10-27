package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Local audit logging (including integrity protection) is the baseline for auditing and clearing.
 * Remote audit log tracing provides means to do external audit verification.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AuditGuaranteeImpl.class)
})
public interface AuditGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public AuditGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    AuditGuarantee AUDIT_LOCAL_LOGGING = new AuditGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUDIT_LOCAL_LOGGING")).build();

    /** 
    */
    AuditGuarantee AUDIT_NONE = new AuditGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUDIT_NONE")).build();

    /** 
    */
    AuditGuarantee AUDIT_REMOTE_TRACING = new AuditGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUDIT_REMOTE_TRACING")).build();

}
