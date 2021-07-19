package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Remote Notifications' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificationAgreementImpl.class)
})
public interface NotificationAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public NotificationAgreement deepCopy();

}
