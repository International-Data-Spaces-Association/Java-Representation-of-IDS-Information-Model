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
 * Response messages hold information about the reaction of a recipient to a formerly sent command
 * or event. They must be correlated to this message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResponseMessageImpl.class),
    @JsonSubTypes.Type(value = ResultMessage.class),
    @JsonSubTypes.Type(value = RejectionMessage.class),
    @JsonSubTypes.Type(value = DescriptionResponseMessage.class),
    @JsonSubTypes.Type(value = ContractResponseMessage.class),
    @JsonSubTypes.Type(value = ContractAgreementMessage.class),
    @JsonSubTypes.Type(value = AccessTokenResponseMessage.class),
    @JsonSubTypes.Type(value = OperationResultMessage.class),
    @JsonSubTypes.Type(value = ArtifactResponseMessage.class),
    @JsonSubTypes.Type(value = UploadResponseMessage.class),
    @JsonSubTypes.Type(value = ParticipantResponseMessage.class),
    @JsonSubTypes.Type(value = AppRegistrationResponseMessage.class)
})
public interface ResponseMessage extends ModelClass, Message {

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
