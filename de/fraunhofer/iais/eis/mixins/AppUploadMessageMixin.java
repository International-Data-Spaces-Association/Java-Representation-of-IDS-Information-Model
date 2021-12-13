package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppUploadMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AppUploadMessageMixin {
    @JsonProperty("ids:appArtifactReference")
    @NotNull
    public URI getAppArtifactReference();

    @JsonProperty("ids:appArtifactReference")
    public void setAppArtifactReference(URI _appArtifactReference_);
}
