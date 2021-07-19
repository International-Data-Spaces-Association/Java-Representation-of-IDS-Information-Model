package de.fraunhofer.iais.eis;


import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Abstract certification of compliance according to given Certification Scheme.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ComponentCertification.class),
    @JsonSubTypes.Type(value = ParticipantCertification.class)
})
public interface Certification extends ManagedEntity {

    // standard methods

    @Beta
    public Certification deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Level of certification (based on a combination of requierements, evaluation method etc.)
     *
     * More information under https://w3id.org/idsa/core/certificationLevel
     *
     * @return Returns the CertificationLevel for the property _certificationLevel.
     */
    @JsonProperty("ids:certificationLevel")
    CertificationLevel getCertificationLevel();

    /**
     * Level of certification (based on a combination of requierements, evaluation method etc.)
     *
     * More information under https://w3id.org/idsa/core/certificationLevel
     *
     * @param _certificationLevel_ desired value for the property _certificationLevel.
     */
    void setCertificationLevel(CertificationLevel _certificationLevel_);

    /**
     * Last date (as xsd:dateTimeStamp) the given Certification is considered valid.
     *
     * More information under https://w3id.org/idsa/core/lastValidDate
     *
     * @return Returns the XMLGregorianCalendar for the property _lastValidDate.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    @JsonProperty("ids:lastValidDate")
    XMLGregorianCalendar getLastValidDate();

    /**
     * Last date (as xsd:dateTimeStamp) the given Certification is considered valid.
     *
     * More information under https://w3id.org/idsa/core/lastValidDate
     *
     * @param _lastValidDate_ desired value for the property _lastValidDate.
     */
    void setLastValidDate(XMLGregorianCalendar _lastValidDate_);

    /**
     * Evaluation Facility that performed and issued given Certification
     *
     * More information under https://w3id.org/idsa/core/evaluationFacility
     *
     * @return Returns the EvaluationFacility for the property _evaluationFacility.
     */
    @JsonProperty("ids:evaluationFacility")
    EvaluationFacility getEvaluationFacility();

    /**
     * Evaluation Facility that performed and issued given Certification
     *
     * More information under https://w3id.org/idsa/core/evaluationFacility
     *
     * @param _evaluationFacility_ desired value for the property _evaluationFacility.
     */
    void setEvaluationFacility(EvaluationFacility _evaluationFacility_);

}
