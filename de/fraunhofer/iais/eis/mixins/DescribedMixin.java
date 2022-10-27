package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Described")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Agent.class),
    @JsonSubTypes.Type(value = DigitalContent.class),
    @JsonSubTypes.Type(value = Representation.class),
    @JsonSubTypes.Type(value = ManagedEntity.class),
    @JsonSubTypes.Type(value = Rule.class)
})
public interface DescribedMixin {
    @JsonProperty("ids:title")
    public List<TypedLiteral> getTitle();

    @JsonProperty("ids:title")
    public void setTitle(List<TypedLiteral> _title_);

    @JsonProperty("ids:description")
    public List<TypedLiteral> getDescription();

    @JsonProperty("ids:description")
    public void setDescription(List<TypedLiteral> _description_);
}
