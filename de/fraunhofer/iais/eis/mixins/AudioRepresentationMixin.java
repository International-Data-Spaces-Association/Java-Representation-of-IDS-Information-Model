package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AudioRepresentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AudioRepresentationMixin {
    @JsonProperty("ids:samplingRate")
    public java.math.BigDecimal getSamplingRate();

    @JsonProperty("ids:samplingRate")
    public void setSamplingRate(java.math.BigDecimal _samplingRate_);
}
