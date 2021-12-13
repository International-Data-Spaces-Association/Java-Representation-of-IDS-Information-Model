package de.fraunhofer.iais.eis;



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

}
