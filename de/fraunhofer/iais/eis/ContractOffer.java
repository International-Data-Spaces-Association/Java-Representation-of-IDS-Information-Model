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
 * Contract issued by the Data Provider offering the usage of a Resource at particular conditions.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractOfferImpl.class),
    @JsonSubTypes.Type(value = SalesOffer.class),
    @JsonSubTypes.Type(value = PurposeOffer.class),
    @JsonSubTypes.Type(value = SecurityOffer.class),
    @JsonSubTypes.Type(value = NotMoreThanNOffer.class),
    @JsonSubTypes.Type(value = RentalOffer.class),
    @JsonSubTypes.Type(value = SwapOffer.class),
    @JsonSubTypes.Type(value = RolebasedOffer.class),
    @JsonSubTypes.Type(value = ConnectorbasedOffer.class),
    @JsonSubTypes.Type(value = EventOffer.class),
    @JsonSubTypes.Type(value = DurationOffer.class),
    @JsonSubTypes.Type(value = IntervalUsageOffer.class),
    @JsonSubTypes.Type(value = SpatialOffer.class),
    @JsonSubTypes.Type(value = DeleteAfterIntervalOffer.class),
    @JsonSubTypes.Type(value = DistributeEcryptedOffer.class),
    @JsonSubTypes.Type(value = LoggingOffer.class),
    @JsonSubTypes.Type(value = NotificationOffer.class)
})
public interface ContractOffer extends ModelClass, Contract {

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
