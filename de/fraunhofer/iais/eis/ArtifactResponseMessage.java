package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message that follows up a RetrieveArtifact Message and contains the Artifact's data in the
 * payload section.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArtifactResponseMessageImpl.class)
})
public interface ArtifactResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public ArtifactResponseMessage deepCopy();

}
