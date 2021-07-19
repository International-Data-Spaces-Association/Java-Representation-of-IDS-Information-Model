package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Local Logging' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LoggingRequestImpl.class)
})
public interface LoggingRequest extends ContractRequest {

    // standard methods

    @Beta
    public LoggingRequest deepCopy();

}
