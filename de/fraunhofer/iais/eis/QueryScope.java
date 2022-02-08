package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of scopes that may limit the space of query results, e.g., ALL, ACTIVE_ONLY.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QueryScopeImpl.class)
})
public interface QueryScope extends ModelClass {

    // standard methods

    @Beta
    public QueryScope deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    QueryScope ACTIVE_ONLY = new QueryScopeBuilder(URI.create("https://w3id.org/idsa/code/ACTIVE_ONLY")).build();

    /** 
    */
    QueryScope ALL = new QueryScopeBuilder(URI.create("https://w3id.org/idsa/code/ALL")).build();

    /** 
    */
    QueryScope INACTIVE_ONLY = new QueryScopeBuilder(URI.create("https://w3id.org/idsa/code/INACTIVE_ONLY")).build();

}
