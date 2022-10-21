package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Restricted Number of Usages' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotMoreThanNOfferImpl.class)
})
public interface NotMoreThanNOffer extends ContractOffer {

    // standard methods

    @Beta
    public NotMoreThanNOffer deepCopy();

}
