package de.fraunhofer.iais.eis.mixins;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DescribedSemantically")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Representation.class)
})
public interface DescribedSemanticallyMixin {
    @JsonProperty("ids:shapesGraph")
    public URI getShapesGraph();

    @JsonProperty("ids:shapesGraph")
    public void setShapesGraph(URI _shapesGraph_);
}
