package de.fraunhofer.iais.eis;

import java.net.URI;


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

    // Default instances of this class as defined in the ontology

    /** 
    */
    IntegrityGuarantee INTEGRITY_PROTECTION_LOCAL =
        new IntegrityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_LOCAL")).build();

    /** 
    */
    IntegrityGuarantee INTEGRITY_PROTECTION_NONE =
        new IntegrityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/INTEGRITY_PROTECTION_NONE")).build();

    /** 
    */
    IntegrityGuarantee INTEGRITY_VERIFICATION_REMOTE =
        new IntegrityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/INTEGRITY_VERIFICATION_REMOTE")).build();

}
