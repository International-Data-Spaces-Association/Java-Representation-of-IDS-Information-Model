package de.fraunhofer.iais.eis;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * The reference to the PXP that operates a specific action, URI or reference to an associated PXP
 * interface.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PXPImpl.class)
})
public interface PXP extends UsageControlComponent {

    // standard methods

    @Beta
    public PXP deepCopy();

    // Default instances of this class as defined in the ontology

}
