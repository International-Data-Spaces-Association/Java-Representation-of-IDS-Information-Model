package de.fraunhofer.iais.eis.mixins;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("BusinessIdentifier")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface BusinessIdentifierMixin {
    @JsonProperty("ids:identifierSystem")
    @NotNull
    public String getIdentifierSystem();

    @JsonProperty("ids:identifierSystem")
    public void setIdentifierSystem(String _identifierSystem_);

    @JsonProperty("ids:identifierNumber")
    @NotNull
    public String getIdentifierNumber();

    @JsonProperty("ids:identifierNumber")
    public void setIdentifierNumber(String _identifierNumber_);
}
