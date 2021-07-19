package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Response to an access token request, intended for point-to-point communication.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AccessTokenResponseMessageImpl.class)
})
public interface AccessTokenResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public AccessTokenResponseMessage deepCopy();

}
