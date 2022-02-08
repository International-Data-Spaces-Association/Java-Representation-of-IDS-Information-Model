package de.fraunhofer.iais.eis;

import java.net.URI;


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

    // Default instances of this class as defined in the ontology

    /** 
    */
    AuthenticationGuarantee AUTHENTICATION_MUTUAL =
        new AuthenticationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUTHENTICATION_MUTUAL")).build();

    /** 
    */
    AuthenticationGuarantee AUTHENTICATION_NONE =
        new AuthenticationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUTHENTICATION_NONE")).build();

    /** 
    */
    AuthenticationGuarantee AUTHENTICATION_SERVER_SIDE =
        new AuthenticationGuaranteeBuilder(URI.create("https://w3id.org/idsa/code/AUTHENTICATION_SERVER_SIDE")).build();

}
