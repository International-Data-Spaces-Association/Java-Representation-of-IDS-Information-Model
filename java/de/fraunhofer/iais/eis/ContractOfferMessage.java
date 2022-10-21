package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing a offered content contract (as offered by a data provider to the data
 * consumer) in the associated payload (which is an instance of ids:ContractOffer). In contrast to
 * the ids:ContractResponseMessage, the ids:ContractOfferMessage is not related to a previous
 * contract
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContractOfferMessageImpl.class)
})
public interface ContractOfferMessage extends NotificationMessage {

    // standard methods

    @Beta
    public ContractOfferMessage deepCopy();

}
