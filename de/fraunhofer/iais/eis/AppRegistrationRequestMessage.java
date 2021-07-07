package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

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
public interface AppRegistrationRequestMessage extends ModelClass, RequestMessage {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

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
