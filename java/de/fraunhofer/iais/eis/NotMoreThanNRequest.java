package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The ContractRequest class representing the 'Restricted Number of Usages' policy class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NotMoreThanNRequestImpl.class)
})
public interface NotMoreThanNRequest extends ContractRequest {

    // standard methods

    @Beta
    public NotMoreThanNRequest deepCopy();

}
