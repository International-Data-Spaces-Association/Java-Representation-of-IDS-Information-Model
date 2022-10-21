package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Result messages are intended to annotate the results of a query command.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResultMessageImpl.class)
})
public interface ResultMessage extends ResponseMessage {

    // standard methods

    @Beta
    public ResultMessage deepCopy();

}
