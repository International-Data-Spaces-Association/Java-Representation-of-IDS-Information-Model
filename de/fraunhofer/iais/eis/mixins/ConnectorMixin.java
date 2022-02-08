package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Connector")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Broker.class),
    @JsonSubTypes.Type(value = AppStore.class),
    @JsonSubTypes.Type(value = ParIS.class),
    @JsonSubTypes.Type(value = BaseConnector.class),
    @JsonSubTypes.Type(value = TrustedConnector.class)
})
public interface ConnectorMixin {
    @JsonProperty("ids:hasDefaultEndpoint")
    @NotNull
    public ConnectorEndpoint getHasDefaultEndpoint();

    @JsonProperty("ids:hasDefaultEndpoint")
    public void setHasDefaultEndpoint(ConnectorEndpoint _hasDefaultEndpoint_);

    @JsonProperty("ids:hasEndpoint")
    public List<ConnectorEndpoint> getHasEndpoint();

    @JsonProperty("ids:hasEndpoint")
    public void setHasEndpoint(List<ConnectorEndpoint> _hasEndpoint_);

    @JsonProperty("ids:authInfo")
    public AuthInfo getAuthInfo();

    @JsonProperty("ids:authInfo")
    public void setAuthInfo(AuthInfo _authInfo_);

    @JsonProperty("ids:resourceCatalog")
    public List<ResourceCatalog> getResourceCatalog();

    @JsonProperty("ids:resourceCatalog")
    public void setResourceCatalog(List<ResourceCatalog> _resourceCatalog_);

    @JsonProperty("ids:hasAgent")
    public List<URI> getHasAgent();

    @JsonProperty("ids:hasAgent")
    public void setHasAgent(List<URI> _hasAgent_);

    @JsonProperty("ids:securityProfile")
    @NotNull
    public SecurityProfile getSecurityProfile();

    @JsonProperty("ids:securityProfile")
    public void setSecurityProfile(SecurityProfile _securityProfile_);

    @JsonProperty("ids:extendedGuarantee")
    public List<SecurityGuarantee> getExtendedGuarantee();

    @JsonProperty("ids:extendedGuarantee")
    public void setExtendedGuarantee(List<SecurityGuarantee> _extendedGuarantee_);
}
