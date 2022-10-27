package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ManagedEntity")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Participant.class),
    @JsonSubTypes.Type(value = Certification.class),
    @JsonSubTypes.Type(value = InfrastructureComponent.class)
})
public interface ManagedEntityMixin {
    @JsonProperty("ids:version")
    public String getVersion();

    @JsonProperty("ids:version")
    public void setVersion(String _version_);
}
