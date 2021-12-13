package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Defined usage policy classes in the IDS.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsagePolicyClassImpl.class)
})
public interface UsagePolicyClass extends ModelClass {

    // standard methods

    @Beta
    public UsagePolicyClass deepCopy();

}
