package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Clearing House provides clearing and settlement services B2B interactions within the
 * International Data Spaces.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ClearingHouseImpl.class)
})
public interface ClearingHouse extends InfrastructureComponent {

    // standard methods

    @Beta
    public ClearingHouse deepCopy();

}
