package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Asset")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Artifact.class),
    @JsonSubTypes.Type(value = AssetCollection.class),
    @JsonSubTypes.Type(value = Representation.class)
})
public interface AssetMixin {

}
