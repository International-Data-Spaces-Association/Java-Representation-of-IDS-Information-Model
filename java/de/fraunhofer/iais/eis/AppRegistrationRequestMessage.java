package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message that asks for registration or update of a data app to the App Store. Payload contains
 * app-related metadata (instance of class ids:AppResource). Message header may contain an app
 * identifier parameter of a prior registered data app. If the app identifier is supplied, the
 * message should be interpreted as a registration for an app update. Otherwise this message is used
 * to register a new app.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppRegistrationRequestMessageImpl.class)
})
public interface AppRegistrationRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public AppRegistrationRequestMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The affected data app that is referenced in the App-related messages.
     *
     * More information under https://w3id.org/idsa/core/affectedDataApp
     *
     * @return Returns the URI for the property _affectedDataApp.
     */
    @JsonProperty("ids:affectedDataApp")
    URI getAffectedDataApp();

    /**
     * The affected data app that is referenced in the App-related messages.
     *
     * More information under https://w3id.org/idsa/core/affectedDataApp
     *
     * @param _affectedDataApp_ desired value for the property _affectedDataApp.
     */
    void setAffectedDataApp(URI _affectedDataApp_);

}
