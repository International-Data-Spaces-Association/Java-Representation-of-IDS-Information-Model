package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of query languages in which query strings may be formalized.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QueryLanguageImpl.class)
})
public interface QueryLanguage extends ModelClass {

    // standard methods

    @Beta
    public QueryLanguage deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    QueryLanguage SPARQL = new QueryLanguageBuilder(URI.create("https://w3id.org/idsa/code/SPARQL")).build();

    /** 
    */
    QueryLanguage SQL = new QueryLanguageBuilder(URI.create("https://w3id.org/idsa/code/SQL")).build();

    /** 
    */
    QueryLanguage XQUERY = new QueryLanguageBuilder(URI.create("https://w3id.org/idsa/code/XQUERY")).build();

}
