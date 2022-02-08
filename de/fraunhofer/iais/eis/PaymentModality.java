package de.fraunhofer.iais.eis;

import java.net.URI;


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

    // Default instances of this class as defined in the ontology

    /**
     * To express that the exchange of resource is with a fixed price
     */
    PaymentModality FIXED_PRICE = new PaymentModalityBuilder(URI.create("https://w3id.org/idsa/code/FIXED_PRICE")).build();

    /**
     * To express that the exchange of resource is free
     */
    PaymentModality FREE = new PaymentModalityBuilder(URI.create("https://w3id.org/idsa/code/FREE")).build();

    /**
     * To express that the exchange of resource is negotiation-based.
     */
    PaymentModality NEGOTIATION_BASIS = new PaymentModalityBuilder(URI.create("https://w3id.org/idsa/code/NEGOTIATION_BASIS")).build();

}
