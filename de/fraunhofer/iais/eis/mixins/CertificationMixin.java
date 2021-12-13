package de.fraunhofer.iais.eis.mixins;


import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Certification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ComponentCertification.class),
    @JsonSubTypes.Type(value = ParticipantCertification.class)
})
public interface CertificationMixin {
    @JsonProperty("ids:certificationLevel")
    public CertificationLevel getCertificationLevel();

    @JsonProperty("ids:certificationLevel")
    public void setCertificationLevel(CertificationLevel _certificationLevel_);

    @JsonProperty("ids:lastValidDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSzzz")
    public XMLGregorianCalendar getLastValidDate();

    @JsonProperty("ids:lastValidDate")
    public void setLastValidDate(XMLGregorianCalendar _lastValidDate_);

    @JsonProperty("ids:evaluationFacility")
    public EvaluationFacility getEvaluationFacility();

    @JsonProperty("ids:evaluationFacility")
    public void setEvaluationFacility(EvaluationFacility _evaluationFacility_);
}
