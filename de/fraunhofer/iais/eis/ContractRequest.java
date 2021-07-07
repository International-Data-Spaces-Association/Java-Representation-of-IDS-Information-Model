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
 * Contract issued by the Data Consumer requesting the usage of a Resource at particular conditions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractRequestImpl.class),
    @JsonSubTypes.Type(value = SalesRequest.class),
    @JsonSubTypes.Type(value = PurposeRequest.class),
    @JsonSubTypes.Type(value = SecurityRequest.class),
    @JsonSubTypes.Type(value = NotMoreThanNRequest.class),
    @JsonSubTypes.Type(value = RentalRequest.class),
    @JsonSubTypes.Type(value = SwapRequest.class),
    @JsonSubTypes.Type(value = RolebasedRequest.class),
    @JsonSubTypes.Type(value = ConnectorbasedRequest.class),
    @JsonSubTypes.Type(value = EventRequest.class),
    @JsonSubTypes.Type(value = DurationRequest.class),
    @JsonSubTypes.Type(value = IntervalUsageRequest.class),
    @JsonSubTypes.Type(value = SpatialRequest.class),
    @JsonSubTypes.Type(value = DeleteAfterIntervalRequest.class),
    @JsonSubTypes.Type(value = DistributeEcryptedRequest.class),
    @JsonSubTypes.Type(value = LoggingRequest.class),
    @JsonSubTypes.Type(value = NotificationRequest.class)
})
public interface ContractRequest extends ModelClass, Contract {

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
