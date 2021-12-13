package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ContractRequest")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
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
public interface ContractRequestMixin {

}
