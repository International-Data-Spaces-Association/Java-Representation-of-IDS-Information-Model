package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Video representation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = VideoRepresentationImpl.class)
})
public interface VideoRepresentation extends Representation {

    // standard methods

    @Beta
    public VideoRepresentation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Video frame rate, as frames/second.
     *
     * More information under https://w3id.org/idsa/core/frameRate
     *
     * @return Returns the java.math.BigDecimal for the property _frameRate.
     */
    @JsonProperty("ids:frameRate")
    java.math.BigDecimal getFrameRate();

    /**
     * Video frame rate, as frames/second.
     *
     * More information under https://w3id.org/idsa/core/frameRate
     *
     * @param _frameRate_ desired value for the property _frameRate.
     */
    void setFrameRate(java.math.BigDecimal _frameRate_);

}
