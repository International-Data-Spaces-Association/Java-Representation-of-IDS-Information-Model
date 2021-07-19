package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Interval-restricted Data Usage' policy class with
 * the further obligation to delete the data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeleteAfterIntervalAgreementImpl.class)
})
public interface DeleteAfterIntervalAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public DeleteAfterIntervalAgreement deepCopy();

}
