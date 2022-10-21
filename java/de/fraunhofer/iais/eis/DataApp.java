package de.fraunhofer.iais.eis;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Self-contained, self-descriptive software package that is distributed via the App Store and
 * deployed inside a Connector; provides access to data and data processing capa­bilities; the
 * interface of a Data App is semantically described by the IDS Information Model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SystemAdapter.class),
    @JsonSubTypes.Type(value = OrchestrationApp.class),
    @JsonSubTypes.Type(value = SmartDataApp.class)
})
public interface DataApp extends ModelClass {

    // standard methods

    @Beta
    public DataApp deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * text documentation of the data app
     *
     * More information under https://w3id.org/idsa/core/appDocumentation
     *
     * @return Returns the String for the property _appDocumentation.
     */
    @JsonProperty("ids:appDocumentation")
    String getAppDocumentation();

    /**
     * text documentation of the data app
     *
     * More information under https://w3id.org/idsa/core/appDocumentation
     *
     * @param _appDocumentation_ desired value for the property _appDocumentation.
     */
    void setAppDocumentation(String _appDocumentation_);

    /**
     * Endpoints of a data app
     *
     * More information under https://w3id.org/idsa/core/appEndpoint
     *
     * @return Returns the List of AppEndpoints for the property _appEndpoint.
     */
    @NotEmpty
    @JsonProperty("ids:appEndpoint")
    List<AppEndpoint> getAppEndpoint();

    /**
     * Endpoints of a data app
     *
     * More information under https://w3id.org/idsa/core/appEndpoint
     *
     * @param _appEndpoint_ desired value for the property _appEndpoint.
     */
    void setAppEndpoint(List<AppEndpoint> _appEndpoint_);

    /**
     * Necessary or optional environment variables of a data app.
     *
     * More information under https://w3id.org/idsa/core/appEnvironmentVariables
     *
     * @return Returns the String for the property _appEnvironmentVariables.
     */
    @JsonProperty("ids:appEnvironmentVariables")
    String getAppEnvironmentVariables();

    /**
     * Necessary or optional environment variables of a data app.
     *
     * More information under https://w3id.org/idsa/core/appEnvironmentVariables
     *
     * @param _appEnvironmentVariables_ desired value for the property _appEnvironmentVariables.
     */
    void setAppEnvironmentVariables(String _appEnvironmentVariables_);

    /**
     * Storage configuration of a data app. Value may differ based on the app ecosystem, e.g., a
     * writeable path in the file system or a volume name (e.g., for containerized apps)
     *
     * More information under https://w3id.org/idsa/core/appStorageConfiguration
     *
     * @return Returns the String for the property _appStorageConfiguration.
     */
    @JsonProperty("ids:appStorageConfiguration")
    String getAppStorageConfiguration();

    /**
     * Storage configuration of a data app. Value may differ based on the app ecosystem, e.g., a
     * writeable path in the file system or a volume name (e.g., for containerized apps)
     *
     * More information under https://w3id.org/idsa/core/appStorageConfiguration
     *
     * @param _appStorageConfiguration_ desired value for the property _appStorageConfiguration.
     */
    void setAppStorageConfiguration(String _appStorageConfiguration_);

    /**
     * IDS Usage Policies a DataApp supports
     *
     * More information under https://w3id.org/idsa/core/supportedUsagePolicies
     *
     * @return Returns the List of UsagePolicyClasss for the property _supportedUsagePolicies.
     */
    @JsonProperty("ids:supportedUsagePolicies")
    List<UsagePolicyClass> getSupportedUsagePolicies();

    /**
     * IDS Usage Policies a DataApp supports
     *
     * More information under https://w3id.org/idsa/core/supportedUsagePolicies
     *
     * @param _supportedUsagePolicies_ desired value for the property _supportedUsagePolicies.
     */
    void setSupportedUsagePolicies(List<UsagePolicyClass> _supportedUsagePolicies_);

}
