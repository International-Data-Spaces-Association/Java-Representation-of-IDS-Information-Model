package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Level of integrity protection and verification of the installed software stack. Trusted boot is
 * an example of local integrity protection, remote integrity verification comprises, for example,
 * remote attestation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IntegrityGuaranteeImpl.class)
})
public interface IntegrityGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public IntegrityGuarantee deepCopy();

}
