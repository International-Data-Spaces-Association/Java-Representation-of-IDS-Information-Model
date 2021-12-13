package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Resource control for deployed services.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppExecutionResourcesImpl.class)
})
public interface AppExecutionResources extends SecurityGuarantee {

    // standard methods

    @Beta
    public AppExecutionResources deepCopy();

}
