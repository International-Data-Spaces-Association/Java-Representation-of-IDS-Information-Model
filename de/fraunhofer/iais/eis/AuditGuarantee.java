package de.fraunhofer.iais.eis;



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

}
