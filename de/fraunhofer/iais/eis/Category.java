package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Represents a group of quality dimensions in which a common type of information is used as quality
 * indicator.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CategoryImpl.class)
})
public interface Category extends ModelClass {

    // standard methods

    @Beta
    public Category deepCopy();

    // Default instances of this class as defined in the ontology

}
