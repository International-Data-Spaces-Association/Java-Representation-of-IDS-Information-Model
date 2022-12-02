package de.fraunhofer.iais.eis.mixins;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DescriptionRequestMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DescriptionRequestMessageMixin {
    @JsonProperty("ids:requestedElement")
    public URI getRequestedElement();

    @JsonProperty("ids:requestedElement")
    public void setRequestedElement(URI _requestedElement_);
}
