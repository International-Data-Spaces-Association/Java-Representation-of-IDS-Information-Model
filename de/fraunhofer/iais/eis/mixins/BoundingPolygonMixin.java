package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("BoundingPolygon")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface BoundingPolygonMixin {
    @JsonProperty("ids:geoPoint")
    @NotEmpty
    public List<GeoPoint> getGeoPoint();

    @JsonProperty("ids:geoPoint")
    public void setGeoPoint(List<GeoPoint> _geoPoint_);
}
