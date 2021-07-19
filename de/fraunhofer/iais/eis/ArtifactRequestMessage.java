package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message asking for retrieving the specified Artifact as the payload of an ArtifactResponse
 * message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArtifactRequestMessageImpl.class)
})
public interface ArtifactRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public ArtifactRequestMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * References an artifact in the context of a request.
     *
     * More information under https://w3id.org/idsa/core/requestedArtifact
     *
     * @return Returns the URI for the property _requestedArtifact.
     */
    @NotNull
    @JsonProperty("ids:requestedArtifact")
    URI getRequestedArtifact();

    /**
     * References an artifact in the context of a request.
     *
     * More information under https://w3id.org/idsa/core/requestedArtifact
     *
     * @param _requestedArtifact_ desired value for the property _requestedArtifact.
     */
    void setRequestedArtifact(URI _requestedArtifact_);

}
