package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Represents criteria relevant for assessing quality. Each quality dimension must have one or more
 * metric to measure it. A dimension is linked with a category using the dqv:inCategory property.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DimensionImpl.class)
})
public interface Dimension extends ModelClass {

    // standard methods

    @Beta
    public Dimension deepCopy();

    // Default instances of this class as defined in the ontology

}
