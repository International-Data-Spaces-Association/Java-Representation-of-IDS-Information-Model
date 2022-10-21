package de.fraunhofer.iais.eis;

import java.net.URI;

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
public interface ResourceNotificationMessage extends NotificationMessage {

    // standard methods

    @Beta
    public ResourceNotificationMessage deepCopy();

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
