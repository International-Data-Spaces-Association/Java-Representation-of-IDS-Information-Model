package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Basic authentication using username / password
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicAuthenticationImpl.class),
    @JsonSubTypes.Type(value = HTTPAuthentication.class)
})
public interface BasicAuthentication extends UserAuthentication {

    // standard methods

    @Beta
    public BasicAuthentication deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authPassword
     *
     * @return Returns the String for the property _authPassword.
     */
    @JsonProperty("ids:authPassword")
    String getAuthPassword();

    /**
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authPassword
     *
     * @param _authPassword_ desired value for the property _authPassword.
     */
    void setAuthPassword(String _authPassword_);

}
