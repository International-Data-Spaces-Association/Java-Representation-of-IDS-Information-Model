package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Means by which local data is protected.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LocalDataConfidentialityGuaranteeImpl.class)
})
public interface LocalDataConfidentialityGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public LocalDataConfidentialityGuarantee deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    LocalDataConfidentialityGuarantee LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION =
        new LocalDataConfidentialityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION"))
            .build();

    /** 
    */
    LocalDataConfidentialityGuarantee LOCAL_DATA_CONFIDENTIALITY_NONE =
        new LocalDataConfidentialityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_NONE")).build();

    /** 
    */
    LocalDataConfidentialityGuarantee LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE =
        new LocalDataConfidentialityGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE"))
            .build();

}
