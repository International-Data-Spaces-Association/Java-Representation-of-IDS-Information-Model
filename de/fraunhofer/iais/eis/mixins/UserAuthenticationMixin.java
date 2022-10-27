package de.fraunhofer.iais.eis.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("UserAuthentication")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicAuthentication.class)
})
public interface UserAuthenticationMixin {
    @JsonProperty("ids:authUsername")
    public String getAuthUsername();

    @JsonProperty("ids:authUsername")
    public void setAuthUsername(String _authUsername_);
}
