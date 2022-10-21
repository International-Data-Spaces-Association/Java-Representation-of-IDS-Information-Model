package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Distribute only if Encrypted' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DistributeEcryptedOfferImpl.class)
})
public interface DistributeEcryptedOffer extends ContractOffer {

    // standard methods

    @Beta
    public DistributeEcryptedOffer deepCopy();

}
