package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("InvokeOperationMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface InvokeOperationMessageMixin {
    @JsonProperty("ids:operationReference")
    @NotNull
    public URI getOperationReference();

    @JsonProperty("ids:operationReference")
    public void setOperationReference(URI _operationReference_);
}
