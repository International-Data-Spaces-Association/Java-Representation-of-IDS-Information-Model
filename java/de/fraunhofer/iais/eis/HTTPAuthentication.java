package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * HTTP authentication.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = HTTPAuthenticationImpl.class)
})
public interface HTTPAuthentication extends BasicAuthentication {

    // standard methods

    @Beta
    public HTTPAuthentication deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * HTTP authentication URI.
     *
     * More information under https://w3id.org/idsa/core/httpAuthURI
     *
     * @return Returns the URI for the property _httpAuthURI.
     */
    @JsonProperty("ids:httpAuthURI")
    URI getHttpAuthURI();

    /**
     * HTTP authentication URI.
     *
     * More information under https://w3id.org/idsa/core/httpAuthURI
     *
     * @param _httpAuthURI_ desired value for the property _httpAuthURI.
     */
    void setHttpAuthURI(URI _httpAuthURI_);

}
