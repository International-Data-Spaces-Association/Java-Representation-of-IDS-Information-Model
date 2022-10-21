package de.fraunhofer.iais.eis;



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
public interface ContractOffer extends Contract {

    // standard methods

    @Beta
    public ContractOffer deepCopy();

}
