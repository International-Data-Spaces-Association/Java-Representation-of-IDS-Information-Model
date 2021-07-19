package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Resource (at least partially) comprising Software.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SoftwareResourceImpl.class)
})
public interface SoftwareResource extends Resource {

    // standard methods

    @Beta
    public SoftwareResource deepCopy();

}
