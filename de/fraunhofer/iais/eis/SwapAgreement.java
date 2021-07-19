package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Data Swap' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SwapAgreementImpl.class)
})
public interface SwapAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public SwapAgreement deepCopy();

}
