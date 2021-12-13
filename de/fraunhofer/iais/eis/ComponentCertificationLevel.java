package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Level of a Component Certification
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ComponentCertificationLevelImpl.class)
})
public interface ComponentCertificationLevel extends CertificationLevel {

    // standard methods

    @Beta
    public ComponentCertificationLevel deepCopy();

}
