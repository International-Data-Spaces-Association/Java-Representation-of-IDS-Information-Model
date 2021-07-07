package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

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
public interface VideoRepresentation extends ModelClass, Representation {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

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
