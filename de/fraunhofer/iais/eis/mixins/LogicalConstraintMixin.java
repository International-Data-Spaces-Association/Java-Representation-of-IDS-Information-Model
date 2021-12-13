package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("LogicalConstraint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface LogicalConstraintMixin {
    @JsonProperty("ids:and")
    public List<Constraint> getAnd();

    @JsonProperty("ids:and")
    public void setAnd(List<Constraint> _and_);

    @JsonProperty("ids:or")
    public List<Constraint> getOr();

    @JsonProperty("ids:or")
    public void setOr(List<Constraint> _or_);

    @JsonProperty("ids:xone")
    public List<Constraint> getXone();

    @JsonProperty("ids:xone")
    public void setXone(List<Constraint> _xone_);
}
