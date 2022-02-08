package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of recipients of a query message, e.g., BROKER, APPSTORE, ANY.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QueryTargetImpl.class)
})
public interface QueryTarget extends ModelClass {

    // standard methods

    @Beta
    public QueryTarget deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    QueryTarget ANY = new QueryTargetBuilder(URI.create("https://w3id.org/idsa/code/ANY")).build();

    /** 
    */
    QueryTarget APPSTORE = new QueryTargetBuilder(URI.create("https://w3id.org/idsa/code/APPSTORE")).build();

    /** 
    */
    QueryTarget BROKER = new QueryTargetBuilder(URI.create("https://w3id.org/idsa/code/BROKER")).build();

    /** 
    */
    QueryTarget CLEARING_HOUSE = new QueryTargetBuilder(URI.create("https://w3id.org/idsa/code/CLEARING_HOUSE")).build();

    /** 
    */
    QueryTarget PARIS = new QueryTargetBuilder(URI.create("https://w3id.org/idsa/code/PARIS")).build();

}
