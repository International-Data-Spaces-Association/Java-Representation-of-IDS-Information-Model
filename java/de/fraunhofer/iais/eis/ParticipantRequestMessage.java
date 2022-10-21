package de.fraunhofer.iais.eis;

import java.net.URI;

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
public interface ParticipantRequestMessage extends RequestMessage {

    // standard methods

    @Beta
    public ParticipantRequestMessage deepCopy();

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
