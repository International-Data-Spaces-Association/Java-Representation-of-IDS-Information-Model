package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Permission")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface PermissionMixin {
    @JsonProperty("ids:preDuty")
    public List<Duty> getPreDuty();

    @JsonProperty("ids:preDuty")
    public void setPreDuty(List<Duty> _preDuty_);

    @JsonProperty("ids:postDuty")
    public List<Duty> getPostDuty();

    @JsonProperty("ids:postDuty")
    public void setPostDuty(List<Duty> _postDuty_);
}
