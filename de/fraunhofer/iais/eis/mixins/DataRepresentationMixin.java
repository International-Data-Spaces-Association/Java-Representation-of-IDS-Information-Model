package de.fraunhofer.iais.eis.mixins;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataRepresentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface DataRepresentationMixin {
    @JsonProperty("ids:dataType")
    public URI getDataType();

    @JsonProperty("ids:dataType")
    public void setDataType(URI _dataType_);

    @JsonProperty("ids:dataTypeSchema")
    public Resource getDataTypeSchema();

    @JsonProperty("ids:dataTypeSchema")
    public void setDataTypeSchema(Resource _dataTypeSchema_);
}
