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
 * Superclass of all messages, indicating a change of a resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourceUpdateMessage.class),
    @JsonSubTypes.Type(value = ResourceUnavailableMessage.class),
    @JsonSubTypes.Type(value = AppNotificationMessage.class)
})
public interface ResourceNotificationMessage extends ModelClass, NotificationMessage {

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
     * The affected resource that is referenced in the resource-related notification messages.
     *
     * More information under https://w3id.org/idsa/core/affectedResource
     *
     * @return Returns the URI for the property _affectedResource.
     */
    @NotNull
    @JsonProperty("ids:affectedResource")
    URI getAffectedResource();

    /**
     * The affected resource that is referenced in the resource-related notification messages.
     *
     * More information under https://w3id.org/idsa/core/affectedResource
     *
     * @param _affectedResource_ desired value for the property _affectedResource.
     */
    void setAffectedResource(URI _affectedResource_);

}
