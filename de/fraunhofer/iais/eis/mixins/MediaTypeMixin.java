package de.fraunhofer.iais.eis.mixins;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("MediaType")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomMediaType.class),
    @JsonSubTypes.Type(value = IANAMediaType.class)
})
public interface MediaTypeMixin {
    @JsonProperty("ids:filenameExtension")
    public String getFilenameExtension();

    @JsonProperty("ids:filenameExtension")
    public void setFilenameExtension(String _filenameExtension_);
}
