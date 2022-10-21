package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A particular instance of given representation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Artifact.class),
    @JsonSubTypes.Type(value = Value.class)
})
public interface RepresentationInstance extends ModelClass {

    // standard methods

    @Beta
    public RepresentationInstance deepCopy();

}
