package de.fraunhofer.iais.eis.mixins;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppEndpoint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AppEndpointMixin {
    @JsonProperty("ids:appEndpointType")
    @NotNull
    public AppEndpointType getAppEndpointType();

    @JsonProperty("ids:appEndpointType")
    public void setAppEndpointType(AppEndpointType _appEndpointType_);

    @JsonProperty("ids:appEndpointPort")
    public BigInteger getAppEndpointPort();

    @JsonProperty("ids:appEndpointPort")
    public void setAppEndpointPort(BigInteger _appEndpointPort_);

    @JsonProperty("ids:appEndpointMediaType")
    public MediaType getAppEndpointMediaType();

    @JsonProperty("ids:appEndpointMediaType")
    public void setAppEndpointMediaType(MediaType _appEndpointMediaType_);

    @JsonProperty("ids:appEndpointProtocol")
    public String getAppEndpointProtocol();

    @JsonProperty("ids:appEndpointProtocol")
    public void setAppEndpointProtocol(String _appEndpointProtocol_);

    @JsonProperty("ids:language")
    public Language getLanguage();

    @JsonProperty("ids:language")
    public void setLanguage(Language _language_);
}
