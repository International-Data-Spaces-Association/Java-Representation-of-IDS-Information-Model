package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message that follows up an AppRegistrationRequestMessage and contains the app registration
 * confimation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppRegistrationResponseMessageImpl.class)
})
public interface AppRegistrationResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public AppRegistrationResponseMessage deepCopy();

}
