package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Refers to the PIP that provides a specific piece of information (URI/reference to an associated
 * PIP interface).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PIPImpl.class)
})
public interface PIP extends UsageControlComponent {

    // standard methods

    @Beta
    public PIP deepCopy();

    // Default instances of this class as defined in the ontology

}
