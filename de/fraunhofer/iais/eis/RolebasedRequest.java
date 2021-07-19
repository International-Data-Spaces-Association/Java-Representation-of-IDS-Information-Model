package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Role-restricted Data Usage' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RolebasedRequestImpl.class)
})
public interface RolebasedRequest extends ContractRequest {

    // standard methods

    @Beta
    public RolebasedRequest deepCopy();

}
