package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Authentication mechanism applied prior to opening a connection. Examples are the verification
 * server's identity or doing mutual authentication.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AuthenticationGuaranteeImpl.class)
})
public interface AuthenticationGuarantee extends SecurityGuarantee {

    // standard methods

    @Beta
    public AuthenticationGuarantee deepCopy();

}
