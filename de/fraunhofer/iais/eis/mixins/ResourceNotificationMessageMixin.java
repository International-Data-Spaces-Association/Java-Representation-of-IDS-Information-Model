package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ResourceNotificationMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceUpdateMessage.class),
    @JsonSubTypes.Type(value = ResourceUnavailableMessage.class),
    @JsonSubTypes.Type(value = AppNotificationMessage.class)
})
public interface ResourceNotificationMessageMixin {
    @JsonProperty("ids:affectedResource")
    @NotNull
    public URI getAffectedResource();

    @JsonProperty("ids:affectedResource")
    public void setAffectedResource(URI _affectedResource_);
}
