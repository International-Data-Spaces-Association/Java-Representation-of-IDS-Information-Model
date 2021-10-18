package de.fraunhofer.iais.eis;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Defines an area of interest as a set of connected points.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BoundingPolygonImpl.class)
})
public interface BoundingPolygon extends Geometry {

    // standard methods

    @Beta
    public BoundingPolygon deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Refers to a GeoPoint that is member of a BoundingPolygon.
     *
     * More information under https://w3id.org/idsa/core/geoPoint
     *
     * @return Returns the List of GeoPoints for the property _geoPoint.
     */
    @NotEmpty
    @JsonProperty("ids:geoPoint")
    List<GeoPoint> getGeoPoint();

    /**
     * Refers to a GeoPoint that is member of a BoundingPolygon.
     *
     * More information under https://w3id.org/idsa/core/geoPoint
     *
     * @param _geoPoint_ desired value for the property _geoPoint.
     */
    void setGeoPoint(List<GeoPoint> _geoPoint_);

}
