package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ImageRepresentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ImageRepresentationMixin {
    @JsonProperty("ids:width")
    public java.math.BigDecimal getWidth();

    @JsonProperty("ids:width")
    public void setWidth(java.math.BigDecimal _width_);

    @JsonProperty("ids:height")
    public java.math.BigDecimal getHeight();

    @JsonProperty("ids:height")
    public void setHeight(java.math.BigDecimal _height_);
}
