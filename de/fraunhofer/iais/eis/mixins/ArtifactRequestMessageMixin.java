package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ArtifactRequestMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ArtifactRequestMessageMixin {
    @JsonProperty("ids:requestedArtifact")
    @NotNull
    public URI getRequestedArtifact();

    @JsonProperty("ids:requestedArtifact")
    public void setRequestedArtifact(URI _requestedArtifact_);
}
