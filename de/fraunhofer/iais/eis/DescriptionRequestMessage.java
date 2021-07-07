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
public interface DescriptionRequestMessage extends ModelClass, RequestMessage {

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
