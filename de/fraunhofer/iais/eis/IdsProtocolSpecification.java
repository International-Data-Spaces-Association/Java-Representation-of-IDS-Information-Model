package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * List of all defined Protocol Specifications, for instance IDS-CP or IDS over Multipart.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IdsProtocolSpecificationImpl.class)
})
public interface IdsProtocolSpecification extends ModelClass {

    // standard methods

    @Beta
    public IdsProtocolSpecification deepCopy();

}
