package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of all locations.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = GeoPoint.class),
    @JsonSubTypes.Type(value = GeoFeature.class),
    @JsonSubTypes.Type(value = Geometry.class)
})
public interface Location extends ModelClass {

    // standard methods

    @Beta
    public Location deepCopy();

}
