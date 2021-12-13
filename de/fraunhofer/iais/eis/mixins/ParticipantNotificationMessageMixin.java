package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ParticipantNotificationMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantUpdateMessage.class),
    @JsonSubTypes.Type(value = ParticipantUnavailableMessage.class),
    @JsonSubTypes.Type(value = ParticipantCertificateGrantedMessage.class),
    @JsonSubTypes.Type(value = ParticipantCertificateRevokedMessage.class)
})
public interface ParticipantNotificationMessageMixin {
    @JsonProperty("ids:affectedParticipant")
    @NotNull
    public URI getAffectedParticipant();

    @JsonProperty("ids:affectedParticipant")
    public void setAffectedParticipant(URI _affectedParticipant_);
}
