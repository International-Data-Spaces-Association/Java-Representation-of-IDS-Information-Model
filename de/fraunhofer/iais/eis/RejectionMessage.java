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
 * Rejection messages are specialized response messages that notify the sender of a message that
 * processing of this message has failed.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RejectionMessageImpl.class),
    @JsonSubTypes.Type(value = ContractRejectionMessage.class)
})
public interface RejectionMessage extends ModelClass, ResponseMessage {

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
     * Specifies the reason of the rejection.
     *
     * More information under https://w3id.org/idsa/core/rejectionReason
     *
     * @return Returns the RejectionReason for the property _rejectionReason.
     */
    @JsonProperty("ids:rejectionReason")
    RejectionReason getRejectionReason();

    /**
     * Specifies the reason of the rejection.
     *
     * More information under https://w3id.org/idsa/core/rejectionReason
     *
     * @param _rejectionReason_ desired value for the property _rejectionReason.
     */
    void setRejectionReason(RejectionReason _rejectionReason_);

}
