package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * An Asset is either an ids:Resource, an ids:Representation, or an ids:Artifact. The Asset is used
 * to reference the target of an ids:Contract.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Resource.class),
    @JsonSubTypes.Type(value = Artifact.class),
    @JsonSubTypes.Type(value = AssetCollection.class),
    @JsonSubTypes.Type(value = Representation.class)
})
public interface Asset extends ModelClass {

    // standard methods

    @Beta
    public Asset deepCopy();

}
