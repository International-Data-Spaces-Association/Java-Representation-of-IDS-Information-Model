package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Security Level Restricted Policy' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SecurityOfferImpl.class)
})
public interface SecurityOffer extends ContractOffer {

    // standard methods

    @Beta
    public SecurityOffer deepCopy();

}
