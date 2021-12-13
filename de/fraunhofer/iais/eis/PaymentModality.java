package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Various pricing modalities such as idsc:FREE, idsc:FIXED_PRICE and idsc:NEGOTIATION_BASIS can be
 * used as a pre-selection to annotate the terms of the contract. Depending on the requirements,
 * additional free text information can be attached.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PaymentModalityImpl.class)
})
public interface PaymentModality extends ModelClass {

    // standard methods

    @Beta
    public PaymentModality deepCopy();

}
