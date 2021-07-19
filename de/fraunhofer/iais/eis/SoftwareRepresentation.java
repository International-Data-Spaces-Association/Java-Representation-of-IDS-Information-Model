package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Software representation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SoftwareRepresentationImpl.class),
    @JsonSubTypes.Type(value = AppRepresentation.class)
})
public interface SoftwareRepresentation extends Representation {

    // standard methods

    @Beta
    public SoftwareRepresentation deepCopy();

}
