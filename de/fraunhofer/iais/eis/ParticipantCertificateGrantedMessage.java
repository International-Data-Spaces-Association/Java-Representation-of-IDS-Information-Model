package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Whenever a Participant has been successfully certified by the Certification Body, the Identity
 * Provider can use this message to notify Infrastructure Components.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificateGrantedMessageImpl.class)
})
public interface ParticipantCertificateGrantedMessage extends ParticipantNotificationMessage {

    // standard methods

    @Beta
    public ParticipantCertificateGrantedMessage deepCopy();

}
