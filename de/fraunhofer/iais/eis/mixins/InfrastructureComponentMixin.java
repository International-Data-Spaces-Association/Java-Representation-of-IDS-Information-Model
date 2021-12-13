package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("InfrastructureComponent")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ClearingHouse.class),
    @JsonSubTypes.Type(value = Connector.class),
    @JsonSubTypes.Type(value = DAPS.class),
    @JsonSubTypes.Type(value = IdentityProvider.class)
})
public interface InfrastructureComponentMixin {
    @JsonIgnore
    public Participant getMaintainerAsObject();

    @JsonIgnore
    public URI getMaintainerAsUri();

    @JsonIgnore(false)
    @JsonGetter("ids:maintainer")
    @NotNull
    public UriOrModelClass getMaintainer();

    @JsonIgnore
    public void setMaintainerAsObject(Participant _maintainer_);

    @JsonIgnore
    public void setMaintainerAsUri(URI _maintainer_);

    @JsonIgnore
    public Participant getCuratorAsObject();

    @JsonIgnore
    public URI getCuratorAsUri();

    @JsonIgnore(false)
    @JsonGetter("ids:curator")
    public UriOrModelClass getCurator();

    @JsonIgnore
    public void setCuratorAsObject(Participant _curator_);

    @JsonIgnore
    public void setCuratorAsUri(URI _curator_);

    @JsonProperty("ids:physicalLocation")
    public Location getPhysicalLocation();

    @JsonProperty("ids:physicalLocation")
    public void setPhysicalLocation(Location _physicalLocation_);

    @JsonProperty("ids:inboundModelVersion")
    @NotEmpty
    public List<String> getInboundModelVersion();

    @JsonProperty("ids:inboundModelVersion")
    public void setInboundModelVersion(List<String> _inboundModelVersion_);

    @JsonProperty("ids:outboundModelVersion")
    @NotNull
    public String getOutboundModelVersion();

    @JsonProperty("ids:outboundModelVersion")
    public void setOutboundModelVersion(String _outboundModelVersion_);

    @JsonProperty("ids:componentCertification")
    public ComponentCertification getComponentCertification();

    @JsonProperty("ids:componentCertification")
    public void setComponentCertification(ComponentCertification _componentCertification_);

    @JsonProperty("ids:publicKey")
    public PublicKey getPublicKey();

    @JsonProperty("ids:publicKey")
    public void setPublicKey(PublicKey _publicKey_);
}
