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
 * Event messages are informative and no response is expected by the sender.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificationMessageImpl.class),
    @JsonSubTypes.Type(value = ConnectorNotificationMessage.class),
    @JsonSubTypes.Type(value = ParticipantNotificationMessage.class),
    @JsonSubTypes.Type(value = ContractOfferMessage.class),
    @JsonSubTypes.Type(value = ContractSupplementMessage.class),
    @JsonSubTypes.Type(value = ResourceNotificationMessage.class),
    @JsonSubTypes.Type(value = RequestInProcessMessage.class),
    @JsonSubTypes.Type(value = MessageProcessedNotificationMessage.class),
    @JsonSubTypes.Type(value = LogMessage.class)
})
public interface NotificationMessage extends ModelClass, Message {

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

}
