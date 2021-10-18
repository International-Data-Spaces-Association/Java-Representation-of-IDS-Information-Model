package de.fraunhofer.iais.eis;


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
public interface GeoPoint extends Location {

    // standard methods

    @Beta
    public GeoPoint deepCopy();

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
