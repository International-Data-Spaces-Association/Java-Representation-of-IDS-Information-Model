package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Data Rental' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RentalAgreementImpl.class)
})
public interface RentalAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public RentalAgreement deepCopy();

}
