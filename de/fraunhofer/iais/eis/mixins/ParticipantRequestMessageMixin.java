package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParticipantRequestMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParticipantRequestMessageMixin {
    @JsonProperty("ids:requestedParticipant")
    @NotNull
    public URI getRequestedParticipant();

    @JsonProperty("ids:requestedParticipant")
    public void setRequestedParticipant(URI _requestedParticipant_);
}
