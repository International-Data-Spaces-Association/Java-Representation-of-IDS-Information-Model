package de.fraunhofer.iais.eis;

import java.net.URI;

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

    // Default instances of this class as defined in the ontology

    /**
     * OAUTH2 via JWT
     */
    AuthStandard OAUTH2_JWT = new AuthStandardBuilder(URI.create("https://w3id.org/idsa/code/OAUTH2_JWT")).build();

}
