package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractAgreement class representing the 'Event-restricted Usage Policy' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EventAgreementImpl.class)
})
public interface EventAgreement extends ContractAgreement {

    // standard methods

    @Beta
    public EventAgreement deepCopy();

}
