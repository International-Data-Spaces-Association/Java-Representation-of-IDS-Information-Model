package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("BasicAuthentication")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = HTTPAuthentication.class)
})
public interface BasicAuthenticationMixin {
    @JsonProperty("ids:authPassword")
    public String getAuthPassword();

    @JsonProperty("ids:authPassword")
    public void setAuthPassword(String _authPassword_);
}
