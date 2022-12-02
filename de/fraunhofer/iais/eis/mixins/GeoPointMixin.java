package de.fraunhofer.iais.eis.mixins;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("GeoPoint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface GeoPointMixin {
    @JsonProperty("ids:latitude")
    @NotNull
    public float getLatitude();

    @JsonProperty("ids:latitude")
    public void setLatitude(float _latitude_);

    @JsonProperty("ids:longitude")
    @NotNull
    public float getLongitude();

    @JsonProperty("ids:longitude")
    public void setLongitude(float _longitude_);
}
