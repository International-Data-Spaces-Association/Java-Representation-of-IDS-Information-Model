package de.fraunhofer.iais.eis;



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

}
