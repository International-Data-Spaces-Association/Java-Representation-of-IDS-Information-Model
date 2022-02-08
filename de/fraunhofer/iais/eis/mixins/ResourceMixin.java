package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Resource")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TextResource.class),
    @JsonSubTypes.Type(value = AppResource.class),
    @JsonSubTypes.Type(value = DataResource.class),
    @JsonSubTypes.Type(value = AudioResource.class),
    @JsonSubTypes.Type(value = ImageResource.class),
    @JsonSubTypes.Type(value = VideoResource.class),
    @JsonSubTypes.Type(value = SoftwareResource.class)
})
public interface ResourceMixin {
    @JsonProperty("ids:standardLicense")
    public URI getStandardLicense();

    @JsonProperty("ids:standardLicense")
    public void setStandardLicense(URI _standardLicense_);

    @JsonProperty("ids:customLicense")
    public URI getCustomLicense();

    @JsonProperty("ids:customLicense")
    public void setCustomLicense(URI _customLicense_);

    @JsonProperty("ids:resourcePart")
    public List<Resource> getResourcePart();

    @JsonProperty("ids:resourcePart")
    public void setResourcePart(List<Resource> _resourcePart_);

    @JsonProperty("ids:resourceEndpoint")
    public List<ConnectorEndpoint> getResourceEndpoint();

    @JsonProperty("ids:resourceEndpoint")
    public void setResourceEndpoint(List<ConnectorEndpoint> _resourceEndpoint_);

    @JsonProperty("ids:contractOffer")
    public List<ContractOffer> getContractOffer();

    @JsonProperty("ids:contractOffer")
    public void setContractOffer(List<ContractOffer> _contractOffer_);

    @JsonProperty("ids:paymentModality")
    public PaymentModality getPaymentModality();

    @JsonProperty("ids:paymentModality")
    public void setPaymentModality(PaymentModality _paymentModality_);

    @JsonProperty("ids:publisher")
    public URI getPublisher();

    @JsonProperty("ids:publisher")
    public void setPublisher(URI _publisher_);

    @JsonProperty("ids:sovereign")
    public URI getSovereign();

    @JsonProperty("ids:sovereign")
    public void setSovereign(URI _sovereign_);

    @JsonProperty("ids:sample")
    public List<Resource> getSample();

    @JsonProperty("ids:sample")
    public void setSample(List<Resource> _sample_);

    @JsonProperty("ids:variant")
    public Resource getVariant();

    @JsonProperty("ids:variant")
    public void setVariant(Resource _variant_);
}
