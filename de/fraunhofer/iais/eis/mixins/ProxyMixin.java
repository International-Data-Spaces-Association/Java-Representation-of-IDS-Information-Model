package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Proxy")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ProxyMixin {
    @JsonProperty("ids:proxyURI")
    @NotNull
    public URI getProxyURI();

    @JsonProperty("ids:proxyURI")
    public void setProxyURI(URI _proxyURI_);

    @JsonProperty("ids:noProxy")
    public List<URI> getNoProxy();

    @JsonProperty("ids:noProxy")
    public void setNoProxy(List<URI> _noProxy_);

    @JsonProperty("ids:proxyAuthentication")
    public BasicAuthentication getProxyAuthentication();

    @JsonProperty("ids:proxyAuthentication")
    public void setProxyAuthentication(BasicAuthentication _proxyAuthentication_);
}
