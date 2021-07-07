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
 * A location identified by geo coordinates.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = GeoPointImpl.class)
})
public interface GeoPoint extends ModelClass, Location {

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
     * Latitude of a GeoPoint (decimal degrees).
     *
     * More information under https://w3id.org/idsa/core/latitude
     *
     * @return Returns the float for the property _latitude.
     */
    @NotNull
    @JsonProperty("ids:latitude")
    float getLatitude();

    /**
     * Latitude of a GeoPoint (decimal degrees).
     *
     * More information under https://w3id.org/idsa/core/latitude
     *
     * @param _latitude_ desired value for the property _latitude.
     */
    void setLatitude(float _latitude_);

    /**
     * Longitude of a GeoPoint (decimal degrees).
     *
     * More information under https://w3id.org/idsa/core/longitude
     *
     * @return Returns the float for the property _longitude.
     */
    @NotNull
    @JsonProperty("ids:longitude")
    float getLongitude();

    /**
     * Longitude of a GeoPoint (decimal degrees).
     *
     * More information under https://w3id.org/idsa/core/longitude
     *
     * @param _longitude_ desired value for the property _longitude.
     */
    void setLongitude(float _longitude_);

}
