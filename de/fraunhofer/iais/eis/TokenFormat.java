package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Possible formats for (security-related) tokens.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TokenFormatImpl.class)
})
public interface TokenFormat extends ModelClass {

    // standard methods

    @Beta
    public TokenFormat deepCopy();

}
