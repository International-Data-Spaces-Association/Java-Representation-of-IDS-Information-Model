package de.fraunhofer.iais.eis;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Superclass of all messages, indicating a change of a particpants's conditions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantUpdateMessage.class),
    @JsonSubTypes.Type(value = ParticipantUnavailableMessage.class),
    @JsonSubTypes.Type(value = ParticipantCertificateGrantedMessage.class),
    @JsonSubTypes.Type(value = ParticipantCertificateRevokedMessage.class)
})
public interface ParticipantNotificationMessage extends NotificationMessage {

    // standard methods

    @Beta
    public ParticipantNotificationMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * References the participant that is referenced in the participant-related notification messages.
     *
     * More information under https://w3id.org/idsa/core/affectedParticipant
     *
     * @return Returns the URI for the property _affectedParticipant.
     */
    @NotNull
    @JsonProperty("ids:affectedParticipant")
    URI getAffectedParticipant();

    /**
     * References the participant that is referenced in the participant-related notification messages.
     *
     * More information under https://w3id.org/idsa/core/affectedParticipant
     *
     * @param _affectedParticipant_ desired value for the property _affectedParticipant.
     */
    void setAffectedParticipant(URI _affectedParticipant_);

}
