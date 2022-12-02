package de.fraunhofer.iais.eis.mixins;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppRegistrationRequestMessage")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AppRegistrationRequestMessageMixin {
    @JsonProperty("ids:affectedDataApp")
    public URI getAffectedDataApp();

    @JsonProperty("ids:affectedDataApp")
    public void setAffectedDataApp(URI _affectedDataApp_);
}
