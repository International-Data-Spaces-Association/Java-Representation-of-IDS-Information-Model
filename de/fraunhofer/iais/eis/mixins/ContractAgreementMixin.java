package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ContractAgreement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
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
public interface ContractAgreementMixin {

}
