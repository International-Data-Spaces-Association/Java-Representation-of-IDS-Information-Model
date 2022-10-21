package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Image representation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ImageRepresentationImpl.class)
})
public interface ImageRepresentation extends Representation {

    // standard methods

    @Beta
    public ImageRepresentation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Width of the visible frame.
     *
     * More information under https://w3id.org/idsa/core/width
     *
     * @return Returns the java.math.BigDecimal for the property _width.
     */
    @JsonProperty("ids:width")
    java.math.BigDecimal getWidth();

    /**
     * Width of the visible frame.
     *
     * More information under https://w3id.org/idsa/core/width
     *
     * @param _width_ desired value for the property _width.
     */
    void setWidth(java.math.BigDecimal _width_);

    /**
     * Height of the visible frame.
     *
     * More information under https://w3id.org/idsa/core/height
     *
     * @return Returns the java.math.BigDecimal for the property _height.
     */
    @JsonProperty("ids:height")
    java.math.BigDecimal getHeight();

    /**
     * Height of the visible frame.
     *
     * More information under https://w3id.org/idsa/core/height
     *
     * @param _height_ desired value for the property _height.
     */
    void setHeight(java.math.BigDecimal _height_);

}
