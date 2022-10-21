package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Distribute only if Encrypted' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DistributeEcryptedRequestImpl.class)
})
public interface DistributeEcryptedRequest extends ContractRequest {

    // standard methods

    @Beta
    public DistributeEcryptedRequest deepCopy();

}
