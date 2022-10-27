package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConnectorEndpoint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ConnectorEndpointMixin {
    @JsonProperty("ids:endpointArtifact")
    public Artifact getEndpointArtifact();

    @JsonProperty("ids:endpointArtifact")
    public void setEndpointArtifact(Artifact _endpointArtifact_);
}
