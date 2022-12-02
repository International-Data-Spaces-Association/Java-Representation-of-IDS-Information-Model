package de.fraunhofer.iais.eis.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Action")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ActionMixin {
    @JsonProperty("ids:actionRefinement")
    public List<Constraint> getActionRefinement();

    @JsonProperty("ids:actionRefinement")
    public void setActionRefinement(List<Constraint> _actionRefinement_);

    @JsonProperty("ids:includedIn")
    public Action getIncludedIn();

    @JsonProperty("ids:includedIn")
    public void setIncludedIn(Action _includedIn_);

    @JsonProperty("ids:pxpEndpoint")
    public PXP getPxpEndpoint();

    @JsonProperty("ids:pxpEndpoint")
    public void setPxpEndpoint(PXP _pxpEndpoint_);
}
