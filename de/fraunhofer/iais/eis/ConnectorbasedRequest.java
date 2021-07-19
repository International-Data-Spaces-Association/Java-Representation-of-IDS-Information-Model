package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Connector-restricted Data Usage' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorbasedRequestImpl.class)
})
public interface ConnectorbasedRequest extends ContractRequest {

    // standard methods

    @Beta
    public ConnectorbasedRequest deepCopy();

}
