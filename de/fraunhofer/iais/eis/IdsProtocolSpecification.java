package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * List of all defined Protocol Specifications, for instance IDS-CP or IDS over Multipart.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IdsProtocolSpecificationImpl.class)
})
public interface IdsProtocolSpecification extends ModelClass {

    // standard methods

    @Beta
    public IdsProtocolSpecification deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * The IDS-CP specification of the IDS interactions.
     */
    IdsProtocolSpecification IDS_CP = new IdsProtocolSpecificationBuilder(URI.create("https://w3id.org/idsa/code/IDS-CP")).build();

    /**
     * The REST specification of the IDS interactions.
     */
    IdsProtocolSpecification IDS_REST = new IdsProtocolSpecificationBuilder(URI.create("https://w3id.org/idsa/code/IDS-REST")).build();

    /**
     * The Multipart Messages implementation of the IDS interactions.
     */
    IdsProtocolSpecification MULTIPART = new IdsProtocolSpecificationBuilder(URI.create("https://w3id.org/idsa/code/MULTIPART")).build();

    /**
     * Queries conforming to IDS specifications.
     */
    IdsProtocolSpecification QUERY = new IdsProtocolSpecificationBuilder(URI.create("https://w3id.org/idsa/code/QUERY")).build();

}
