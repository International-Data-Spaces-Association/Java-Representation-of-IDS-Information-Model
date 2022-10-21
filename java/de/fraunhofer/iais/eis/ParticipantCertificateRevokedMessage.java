package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Indicates that a (previously certified) Participant is no more certified. This could happen, for
 * instance, if the Certification Body revokes a granted certificate or if the certificate just
 * expires.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificateRevokedMessageImpl.class)
})
public interface ParticipantCertificateRevokedMessage extends ParticipantNotificationMessage {

    // standard methods

    @Beta
    public ParticipantCertificateRevokedMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Plain Text containing the reason for revoking an existing certificate of either a connector or
     * participant.
     *
     * More information under https://w3id.org/idsa/core/revocationReason
     *
     * @return Returns the TypedLiteral for the property _revocationReason.
     */
    @JsonProperty("ids:revocationReason")
    TypedLiteral getRevocationReason();

    /**
     * Plain Text containing the reason for revoking an existing certificate of either a connector or
     * participant.
     *
     * More information under https://w3id.org/idsa/core/revocationReason
     *
     * @param _revocationReason_ desired value for the property _revocationReason.
     */
    void setRevocationReason(TypedLiteral _revocationReason_);

}
