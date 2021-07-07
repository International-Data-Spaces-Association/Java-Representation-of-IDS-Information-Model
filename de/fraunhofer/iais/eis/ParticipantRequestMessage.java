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
 * This class is deprecated. Use ids:DescriptionRequestMessage instead. Message asking for
 * retrieving the specified Participants information as the payload of an ids:ParticipantResponse
 * message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantRequestMessageImpl.class)
})
public interface ParticipantRequestMessage extends ModelClass, RequestMessage {

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
     * This property is deprecated. Use ids:requestedElement along with ids:DescriptionRequestMessage
     * instead. References a Participant in the context of a request.
     *
     * More information under https://w3id.org/idsa/core/requestedParticipant
     *
     * @return Returns the URI for the property _requestedParticipant.
     */
    @NotNull
    @JsonProperty("ids:requestedParticipant")
    URI getRequestedParticipant();

    /**
     * This property is deprecated. Use ids:requestedElement along with ids:DescriptionRequestMessage
     * instead. References a Participant in the context of a request.
     *
     * More information under https://w3id.org/idsa/core/requestedParticipant
     *
     * @param _requestedParticipant_ desired value for the property _requestedParticipant.
     */
    void setRequestedParticipant(URI _requestedParticipant_);

}
