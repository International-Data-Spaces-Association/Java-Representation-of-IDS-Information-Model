package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message requesting metadata. If no URI is supplied via the ids:requestedElement field, this
 * messages is treated like a self-description request and the recipient should return its
 * self-description via an ids:DescriptionResponseMessage. However, if a URI is supplied, the
 * Connector should either return metadata about the requested element via an
 * ids:DescriptionResponseMessage, or send an ids:RejectionMessage, e.g., because the element was
 * not found.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DescriptionRequestMessageImpl.class)
})
public interface DescriptionRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public DescriptionRequestMessage deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The element whose metadata is requested.
     *
     * More information under https://w3id.org/idsa/core/requestedElement
     *
     * @return Returns the URI for the property _requestedElement.
     */
    @JsonProperty("ids:requestedElement")
    URI getRequestedElement();

    /**
     * The element whose metadata is requested.
     *
     * More information under https://w3id.org/idsa/core/requestedElement
     *
     * @param _requestedElement_ desired value for the property _requestedElement.
     */
    void setRequestedElement(URI _requestedElement_);

}
