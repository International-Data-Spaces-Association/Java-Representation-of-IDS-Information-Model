package de.fraunhofer.iais.eis;



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

}
