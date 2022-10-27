package de.fraunhofer.iais.eis;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Level of Certification
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificationLevel.class),
    @JsonSubTypes.Type(value = ComponentCertificationLevel.class)
})
public interface CertificationLevel extends ModelClass {

    // standard methods

    @Beta
    public CertificationLevel deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Certification Level transitively implied by given Certification Level of same root type.
     *
     * More information under https://w3id.org/idsa/core/includedCertificationLevel
     *
     * @return Returns the CertificationLevel for the property _includedCertificationLevel.
     */
    @JsonAlias({"https://w3id.org/idsa/core/includedCertificationLevel", "ids:includedCertificationLevel", "includedCertificationLevel"})
    CertificationLevel getIncludedCertificationLevel();

    /**
     * Certification Level transitively implied by given Certification Level of same root type.
     *
     * More information under https://w3id.org/idsa/core/includedCertificationLevel
     *
     * @param _includedCertificationLevel_ desired value for the property _includedCertificationLevel.
     */
    void setIncludedCertificationLevel(CertificationLevel _includedCertificationLevel_);

}
