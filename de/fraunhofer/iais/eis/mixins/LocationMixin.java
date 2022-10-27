package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Location")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = GeoPoint.class),
    @JsonSubTypes.Type(value = GeoFeature.class),
    @JsonSubTypes.Type(value = Geometry.class)
})
public interface LocationMixin {

}
