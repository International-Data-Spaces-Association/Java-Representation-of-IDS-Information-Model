package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("UsageControlComponent")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PIP.class),
    @JsonSubTypes.Type(value = PXP.class)
})
public interface UsageControlComponentMixin {
    @JsonProperty("ids:interfaceDescription")
    @NotNull
    public URI getInterfaceDescription();

    @JsonProperty("ids:interfaceDescription")
    public void setInterfaceDescription(URI _interfaceDescription_);

    @JsonProperty("ids:endpointURI")
    public URI getEndpointURI();

    @JsonProperty("ids:endpointURI")
    public void setEndpointURI(URI _endpointURI_);
}
