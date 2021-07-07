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
 * Contract governing the actual usage of a Resource that has been agreed by all parties.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractAgreementImpl.class),
    @JsonSubTypes.Type(value = SalesAgreement.class),
    @JsonSubTypes.Type(value = PurposeAgreement.class),
    @JsonSubTypes.Type(value = SecurityAgreement.class),
    @JsonSubTypes.Type(value = NotMoreThanNAgreement.class),
    @JsonSubTypes.Type(value = RentalAgreement.class),
    @JsonSubTypes.Type(value = SwapAgreement.class),
    @JsonSubTypes.Type(value = RolebasedAgreement.class),
    @JsonSubTypes.Type(value = ConnectorbasedAgreement.class),
    @JsonSubTypes.Type(value = EventAgreement.class),
    @JsonSubTypes.Type(value = DurationAgreement.class),
    @JsonSubTypes.Type(value = IntervalUsageAgreement.class),
    @JsonSubTypes.Type(value = SpatialAgreement.class),
    @JsonSubTypes.Type(value = DeleteAfterIntervalAgreement.class),
    @JsonSubTypes.Type(value = DistributeEcryptedAgreement.class),
    @JsonSubTypes.Type(value = LoggingAgreement.class),
    @JsonSubTypes.Type(value = NotificationAgreement.class)
})
public interface ContractAgreement extends ModelClass, Contract {

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
