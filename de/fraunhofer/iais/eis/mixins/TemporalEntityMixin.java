package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("TemporalEntity")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Instant.class),
    @JsonSubTypes.Type(value = Interval.class),
    @JsonSubTypes.Type(value = DurationEntity.class)
})
public interface TemporalEntityMixin {
    @JsonProperty("ids:hasDuration")
    public javax.xml.datatype.Duration getHasDuration();

    @JsonProperty("ids:hasDuration")
    public void setHasDuration(javax.xml.datatype.Duration _hasDuration_);
}
