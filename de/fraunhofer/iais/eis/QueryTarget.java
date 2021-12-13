package de.fraunhofer.iais.eis;



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

}
