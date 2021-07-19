package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * This class is deprecated. Use ids:DescriptionResponseMessage instead. ParticipantResponseMessage
 * follows up a ParticipantRequestMessage and contains the Participant's information in the payload
 * section.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantResponseMessageImpl.class)
})
public interface ParticipantResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public ParticipantResponseMessage deepCopy();

}
