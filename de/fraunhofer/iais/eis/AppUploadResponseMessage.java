package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Message that follows up an AppUploadMessage and contains the app upload confimation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppUploadResponseMessageImpl.class)
})
public interface AppUploadResponseMessage extends UploadResponseMessage {

    // standard methods

    @Beta
    public AppUploadResponseMessage deepCopy();

}
