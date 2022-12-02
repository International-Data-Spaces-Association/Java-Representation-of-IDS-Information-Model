package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("QualityMeasurement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface QualityMeasurementMixin {
    @JsonProperty("http://www.w3.org/ns/dqv#isMeasurementOf")
    public Metric getIsMeasurementOf();

    @JsonProperty("http://www.w3.org/ns/dqv#isMeasurementOf")
    public void setIsMeasurementOf(Metric _isMeasurementOf_);

    @JsonProperty("http://www.w3.org/ns/dqv#value")
    public TypedLiteral getValue();

    @JsonProperty("http://www.w3.org/ns/dqv#value")
    public void setValue(TypedLiteral _value_);
}
