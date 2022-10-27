package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("RouteStep")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface RouteStepMixin {
    @JsonProperty("ids:requiredDataApp")
    public AppRepresentation getRequiredDataApp();

    @JsonProperty("ids:requiredDataApp")
    public void setRequiredDataApp(AppRepresentation _requiredDataApp_);
}
