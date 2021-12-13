package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Endpoint")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorEndpoint.class),
    @JsonSubTypes.Type(value = AppEndpoint.class),
    @JsonSubTypes.Type(value = GenericEndpoint.class)
})
public interface EndpointMixin {
    @JsonProperty("ids:accessURL")
    public URI getAccessURL();

    @JsonProperty("ids:accessURL")
    public void setAccessURL(URI _accessURL_);

    @JsonProperty("ids:endpointInformation")
    public List<TypedLiteral> getEndpointInformation();

    @JsonProperty("ids:endpointInformation")
    public void setEndpointInformation(List<TypedLiteral> _endpointInformation_);

    @JsonProperty("ids:endpointDocumentation")
    public List<URI> getEndpointDocumentation();

    @JsonProperty("ids:endpointDocumentation")
    public void setEndpointDocumentation(List<URI> _endpointDocumentation_);

    @JsonProperty("ids:path")
    public String getPath();

    @JsonProperty("ids:path")
    public void setPath(String _path_);

    @JsonProperty("ids:inboundPath")
    public String getInboundPath();

    @JsonProperty("ids:inboundPath")
    public void setInboundPath(String _inboundPath_);

    @JsonProperty("ids:outboundPath")
    public String getOutboundPath();

    @JsonProperty("ids:outboundPath")
    public void setOutboundPath(String _outboundPath_);

    @JsonProperty("ids:apiSpecifiation")
    public List<IdsProtocolSpecification> getApiSpecifiation();

    @JsonProperty("ids:apiSpecifiation")
    public void setApiSpecifiation(List<IdsProtocolSpecification> _apiSpecifiation_);
}
