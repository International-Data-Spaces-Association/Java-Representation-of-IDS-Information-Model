package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ContractOffer")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
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
public interface ContractOfferMixin {

}
