package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("CertificationLevel")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantCertificationLevel.class),
    @JsonSubTypes.Type(value = ComponentCertificationLevel.class)
})
public interface CertificationLevelMixin {
    @JsonProperty("ids:includedCertificationLevel")
    public CertificationLevel getIncludedCertificationLevel();

    @JsonProperty("ids:includedCertificationLevel")
    public void setIncludedCertificationLevel(CertificationLevel _includedCertificationLevel_);
}
