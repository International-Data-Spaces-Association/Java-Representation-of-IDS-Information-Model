package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractOffer class representing the 'Local Logging' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LoggingOfferImpl.class)
})
public interface LoggingOffer extends ContractOffer {

    // standard methods

    @Beta
    public LoggingOffer deepCopy();

}
