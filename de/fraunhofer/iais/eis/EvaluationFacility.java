package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Evaluation Facilities carry out the evaluation work during a certification process and issue the
 * corresponding Certifications.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EvaluationFacilityImpl.class)
})
public interface EvaluationFacility extends ModelClass {

    // standard methods

    @Beta
    public EvaluationFacility deepCopy();

}
