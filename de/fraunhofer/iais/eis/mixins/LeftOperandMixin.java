package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("LeftOperand")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface LeftOperandMixin {
    @JsonProperty("ids:broader")
    public LeftOperand getBroader();

    @JsonProperty("ids:broader")
    public void setBroader(LeftOperand _broader_);
}
