package de.fraunhofer.iais.eis.mixins;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataApp")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SystemAdapter.class),
    @JsonSubTypes.Type(value = OrchestrationApp.class),
    @JsonSubTypes.Type(value = SmartDataApp.class)
})
public interface DataAppMixin {
    @JsonProperty("ids:appDocumentation")
    public String getAppDocumentation();

    @JsonProperty("ids:appDocumentation")
    public void setAppDocumentation(String _appDocumentation_);

    @JsonProperty("ids:appEndpoint")
    @NotEmpty
    public List<AppEndpoint> getAppEndpoint();

    @JsonProperty("ids:appEndpoint")
    public void setAppEndpoint(List<AppEndpoint> _appEndpoint_);

    @JsonProperty("ids:appEnvironmentVariables")
    public String getAppEnvironmentVariables();

    @JsonProperty("ids:appEnvironmentVariables")
    public void setAppEnvironmentVariables(String _appEnvironmentVariables_);

    @JsonProperty("ids:appStorageConfiguration")
    public String getAppStorageConfiguration();

    @JsonProperty("ids:appStorageConfiguration")
    public void setAppStorageConfiguration(String _appStorageConfiguration_);

    @JsonProperty("ids:supportedUsagePolicies")
    public List<UsagePolicyClass> getSupportedUsagePolicies();

    @JsonProperty("ids:supportedUsagePolicies")
    public void setSupportedUsagePolicies(List<UsagePolicyClass> _supportedUsagePolicies_);
}
