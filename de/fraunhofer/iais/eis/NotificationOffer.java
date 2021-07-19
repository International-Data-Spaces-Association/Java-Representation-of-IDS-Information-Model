package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Remote Notifications' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotificationOfferImpl.class)
})
public interface NotificationOffer extends ContractOffer {

    // standard methods

    @Beta
    public NotificationOffer deepCopy();

}
