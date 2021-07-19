package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Holds User authentication information. Differs from ids:AuthInfo. This class refers to user
 * authentication methods that are not intended for direct data exchange with a connector.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicAuthentication.class)
})
public interface UserAuthentication extends ModelClass {

    // standard methods

    @Beta
    public UserAuthentication deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authUsername
     *
     * @return Returns the String for the property _authUsername.
     */
    @JsonProperty("ids:authUsername")
    String getAuthUsername();

    /**
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authUsername
     *
     * @param _authUsername_ desired value for the property _authUsername.
     */
    void setAuthUsername(String _authUsername_);

}
