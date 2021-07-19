package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The Identity Provider manages and validates the digital identity of International Data Spaces
 * Participants.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IdentityProviderImpl.class)
})
public interface IdentityProvider extends InfrastructureComponent {

    // standard methods

    @Beta
    public IdentityProvider deepCopy();

}
