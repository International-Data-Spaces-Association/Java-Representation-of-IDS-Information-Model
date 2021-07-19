package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message requesting an access token. This is intended for point-to-point communication with, e.g.,
 * Brokers.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AccessTokenRequestMessageImpl.class)
})
public interface AccessTokenRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public AccessTokenRequestMessage deepCopy();

}
