package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Data Swap' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SwapOfferImpl.class)
})
public interface SwapOffer extends ContractOffer {

    // standard methods

    @Beta
    public SwapOffer deepCopy();

}
