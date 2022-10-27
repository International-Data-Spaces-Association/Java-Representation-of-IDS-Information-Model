package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("HTTPAuthentication")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface HTTPAuthenticationMixin {
    @JsonProperty("ids:httpAuthURI")
    public URI getHttpAuthURI();

    @JsonProperty("ids:httpAuthURI")
    public void setHttpAuthURI(URI _httpAuthURI_);
}
