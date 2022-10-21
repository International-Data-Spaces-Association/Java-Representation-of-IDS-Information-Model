package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message used to upload a data to a recipient. Payload contains data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UploadMessageImpl.class),
    @JsonSubTypes.Type(value = AppUploadMessage.class)
})
public interface UploadMessage extends RequestMessage {

    // standard methods

    @Beta
    public UploadMessage deepCopy();

}
