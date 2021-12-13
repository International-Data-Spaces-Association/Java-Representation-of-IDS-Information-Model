package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("VideoRepresentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface VideoRepresentationMixin {
    @JsonProperty("ids:frameRate")
    public java.math.BigDecimal getFrameRate();

    @JsonProperty("ids:frameRate")
    public void setFrameRate(java.math.BigDecimal _frameRate_);
}
