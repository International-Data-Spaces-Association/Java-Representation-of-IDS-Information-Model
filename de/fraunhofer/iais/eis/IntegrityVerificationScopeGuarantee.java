package de.fraunhofer.iais.eis;



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

}
