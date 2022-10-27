package de.fraunhofer.iais.eis.mixins;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AppRepresentation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface AppRepresentationMixin {
    @JsonProperty("ids:dataAppInformation")
    public DataApp getDataAppInformation();

    @JsonProperty("ids:dataAppInformation")
    public void setDataAppInformation(DataApp _dataAppInformation_);

    @JsonProperty("ids:dataAppDistributionService")
    public URI getDataAppDistributionService();

    @JsonProperty("ids:dataAppDistributionService")
    public void setDataAppDistributionService(URI _dataAppDistributionService_);

    @JsonProperty("ids:dataAppRuntimeEnvironment")
    public String getDataAppRuntimeEnvironment();

    @JsonProperty("ids:dataAppRuntimeEnvironment")
    public void setDataAppRuntimeEnvironment(String _dataAppRuntimeEnvironment_);
}
