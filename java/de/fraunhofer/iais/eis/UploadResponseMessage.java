package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message that follows up a UploadMessage and contains the upload confirmation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = UploadResponseMessageImpl.class),
    @JsonSubTypes.Type(value = AppUploadResponseMessage.class)
})
public interface UploadResponseMessage extends ResponseMessage {

    // standard methods

    @Beta
    public UploadResponseMessage deepCopy();

}
