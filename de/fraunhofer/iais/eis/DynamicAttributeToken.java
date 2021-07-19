package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A JSON Web Token (e.g., for authorization) mediated as part of the message, formerly known as the
 * 'DAPS Token'. The complete JWT *including* header, payload and signiture is referenced by this
 * class and *not* only the JSON element in the payload. See ids:DatPayload for the payload
 * definition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DynamicAttributeTokenImpl.class)
})
public interface DynamicAttributeToken extends Token {

    // standard methods

    @Beta
    public DynamicAttributeToken deepCopy();

}
