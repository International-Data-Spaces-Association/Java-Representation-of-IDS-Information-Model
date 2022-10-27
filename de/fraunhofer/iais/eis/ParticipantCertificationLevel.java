package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Level of a Participant Certification
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificationLevelImpl.class)
})
public interface ParticipantCertificationLevel extends CertificationLevel {

    // standard methods

    @Beta
    public ParticipantCertificationLevel deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_CONTROL_FRAMEWORK"))
            .build();

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_CENTRAL_LEVEL_MANAGEMENT_SYSTEM"))
            .build();

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_MANAGEMENT_SYSTEM"))
            .build();

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_ENTRY_LEVEL_SELF_ASSESSMENT")).build();

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_CONTROL_FRAMEWORK"))
            .build();

    /** 
    */
    ParticipantCertificationLevel PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM =
        new ParticipantCertificationLevelBuilder(URI.create("https://w3id.org/idsa/code/PARTICIPANT_MEMBER_LEVEL_MANAGEMENT_SYSTEM"))
            .build();

}
