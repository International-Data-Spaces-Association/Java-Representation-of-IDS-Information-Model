package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of media types registered with IANA.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IANAMediaTypeImpl.class)
})
public interface IANAMediaType extends MediaType {

    // standard methods

    @Beta
    public IANAMediaType deepCopy();

}
