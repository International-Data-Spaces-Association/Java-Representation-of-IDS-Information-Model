package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AuthInfo")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AuthInfoMixin {
    @JsonProperty("ids:authService")
    @NotNull
    public URI getAuthService();

    @JsonProperty("ids:authService")
    public void setAuthService(URI _authService_);

    @JsonProperty("ids:authStandard")
    public AuthStandard getAuthStandard();

    @JsonProperty("ids:authStandard")
    public void setAuthStandard(AuthStandard _authStandard_);
}
