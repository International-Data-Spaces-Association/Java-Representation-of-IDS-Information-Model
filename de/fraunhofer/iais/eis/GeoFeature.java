package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A location identified by a geonames URL.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = GeoFeatureImpl.class)
})
public interface GeoFeature extends Location {

    // standard methods

    @Beta
    public GeoFeature deepCopy();

}
