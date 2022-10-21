package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A selection of custom media types to be used for data published on the IDS when no IANA type is
 * available.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomMediaTypeImpl.class)
})
public interface CustomMediaType extends MediaType {

    // standard methods

    @Beta
    public CustomMediaType deepCopy();

}
