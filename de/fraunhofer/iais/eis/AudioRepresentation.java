package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Audio representation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AudioRepresentationImpl.class)
})
public interface AudioRepresentation extends Representation {

    // standard methods

    @Beta
    public AudioRepresentation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Audio sampling rate.
     *
     * More information under https://w3id.org/idsa/core/samplingRate
     *
     * @return Returns the java.math.BigDecimal for the property _samplingRate.
     */
    @JsonAlias({"https://w3id.org/idsa/core/samplingRate", "ids:samplingRate", "samplingRate"})
    java.math.BigDecimal getSamplingRate();

    /**
     * Audio sampling rate.
     *
     * More information under https://w3id.org/idsa/core/samplingRate
     *
     * @param _samplingRate_ desired value for the property _samplingRate.
     */
    void setSamplingRate(java.math.BigDecimal _samplingRate_);

    // Default instances of this class as defined in the ontology

}
