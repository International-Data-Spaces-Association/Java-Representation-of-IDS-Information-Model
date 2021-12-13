package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Class of reasons that might lead to issuing a Rejection message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = RejectionReasonImpl.class)
})
public interface RejectionReason extends ModelClass {

    // standard methods

    @Beta
    public RejectionReason deepCopy();

}
