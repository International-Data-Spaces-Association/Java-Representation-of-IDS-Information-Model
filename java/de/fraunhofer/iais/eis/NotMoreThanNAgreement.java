package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Restricted Number of Usages' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotMoreThanNAgreementImpl.class)
})
public interface NotMoreThanNAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public NotMoreThanNAgreement deepCopy();

}
