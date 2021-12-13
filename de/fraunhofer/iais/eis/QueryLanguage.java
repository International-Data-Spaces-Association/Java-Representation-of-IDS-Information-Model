package de.fraunhofer.iais.eis;



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

}
