package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    @JsonProperty("ids:maintainer")
    @NotNull
    public URI getMaintainer();

    @JsonProperty("ids:maintainer")
    public void setMaintainer(URI _maintainer_);

    @JsonProperty("ids:curator")
    @NotNull
    public URI getCurator();

    @JsonProperty("ids:curator")
    public void setCurator(URI _curator_);

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
