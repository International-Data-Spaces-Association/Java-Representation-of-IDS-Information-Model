package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message containing the metadata, which a Connector previously requested via the
 * ids:DescriptionRequestMessage, in its payload.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DescriptionResponseMessageImpl.class)
})
public interface DescriptionResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public DescriptionResponseMessage deepCopy();

}
