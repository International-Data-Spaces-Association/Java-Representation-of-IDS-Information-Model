package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Extent of supporting usage control.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UsageControlGuaranteeImpl.class)
})
public interface UsageControlGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public UsageControlGuarantee deepCopy();

}
