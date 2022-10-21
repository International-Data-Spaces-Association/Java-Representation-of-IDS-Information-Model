package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Distribute only if Encrypted' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DistributeEcryptedAgreementImpl.class)
})
public interface DistributeEcryptedAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public DistributeEcryptedAgreement deepCopy();

}
