package de.fraunhofer.iais.eis.mixins;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Named")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface NamedMixin {
    @JsonProperty("ids:name")
    @NotNull
    public String getName();

    @JsonProperty("ids:name")
    public void setName(String _name_);
}
