package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Process and result of certifying a software component/servivce in order to become a certified
 * part of the International Data Space infrastructure.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ComponentCertificationImpl.class)
})
public interface ComponentCertification extends Certification {

    // standard methods

    @Beta
    public ComponentCertification deepCopy();

}
