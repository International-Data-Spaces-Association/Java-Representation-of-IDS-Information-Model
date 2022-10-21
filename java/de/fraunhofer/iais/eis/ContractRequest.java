package de.fraunhofer.iais.eis;



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
public interface ContractRequest extends Contract {

    // standard methods

    @Beta
    public ContractRequest deepCopy();

}
