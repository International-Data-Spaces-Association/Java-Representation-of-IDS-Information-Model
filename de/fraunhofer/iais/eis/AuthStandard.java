package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of authentication standards that may be supported by Connectors.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AuthStandardImpl.class)
})
public interface AuthStandard extends ModelClass {

    // standard methods

    @Beta
    public AuthStandard deepCopy();

}
