package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("GenericEndpoint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface GenericEndpointMixin {
    @JsonProperty("ids:genericEndpointAuthentication")
    public BasicAuthentication getGenericEndpointAuthentication();

    @JsonProperty("ids:genericEndpointAuthentication")
    public void setGenericEndpointAuthentication(BasicAuthentication _genericEndpointAuthentication_);

    @JsonProperty("ids:genericEndpointConfiguration")
    public String getGenericEndpointConfiguration();

    @JsonProperty("ids:genericEndpointConfiguration")
    public void setGenericEndpointConfiguration(String _genericEndpointConfiguration_);
}
