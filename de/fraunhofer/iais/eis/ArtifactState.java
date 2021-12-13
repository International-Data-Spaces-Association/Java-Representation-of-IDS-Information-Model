package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The state which an ids:Artifact may have or not.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArtifactStateImpl.class)
})
public interface ArtifactState extends ModelClass {

    // standard methods

    @Beta
    public ArtifactState deepCopy();

}
