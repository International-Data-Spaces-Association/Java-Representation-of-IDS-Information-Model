package de.fraunhofer.iais.eis.mixins;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Interval")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface IntervalMixin {
    @JsonProperty("ids:begin")
    @NotNull
    public Instant getBegin();

    @JsonProperty("ids:begin")
    public void setBegin(Instant _begin_);

    @JsonProperty("ids:end")
    public Instant getEnd();

    @JsonProperty("ids:end")
    public void setEnd(Instant _end_);
}
