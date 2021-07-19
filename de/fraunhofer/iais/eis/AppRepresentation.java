package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * App representation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppRepresentationImpl.class)
})
public interface AppRepresentation extends SoftwareRepresentation {

    // standard methods

    @Beta
    public AppRepresentation deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Information about the concrete data app implementation
     *
     * More information under https://w3id.org/idsa/core/dataAppInformation
     *
     * @return Returns the DataApp for the property _dataAppInformation.
     */
    @JsonProperty("ids:dataAppInformation")
    DataApp getDataAppInformation();

    /**
     * Information about the concrete data app implementation
     *
     * More information under https://w3id.org/idsa/core/dataAppInformation
     *
     * @param _dataAppInformation_ desired value for the property _dataAppInformation.
     */
    void setDataAppInformation(DataApp _dataAppInformation_);

    /**
     * IRI reference to storage and distribution system for the correspending data app. Unlinke regular
     * representations for IDS resources, a data app may not be retrieved directly from a connector but
     * from a separate registry instead.
     *
     * More information under https://w3id.org/idsa/core/dataAppDistributionService
     *
     * @return Returns the URI for the property _dataAppDistributionService.
     */
    @JsonProperty("ids:dataAppDistributionService")
    URI getDataAppDistributionService();

    /**
     * IRI reference to storage and distribution system for the correspending data app. Unlinke regular
     * representations for IDS resources, a data app may not be retrieved directly from a connector but
     * from a separate registry instead.
     *
     * More information under https://w3id.org/idsa/core/dataAppDistributionService
     *
     * @param _dataAppDistributionService_ desired value for the property _dataAppDistributionService.
     */
    void setDataAppDistributionService(URI _dataAppDistributionService_);

    /**
     * Runtime environment of a data app, e.g., software (or hardware) required to run the app.
     *
     * More information under https://w3id.org/idsa/core/dataAppRuntimeEnvironment
     *
     * @return Returns the String for the property _dataAppRuntimeEnvironment.
     */
    @JsonProperty("ids:dataAppRuntimeEnvironment")
    String getDataAppRuntimeEnvironment();

    /**
     * Runtime environment of a data app, e.g., software (or hardware) required to run the app.
     *
     * More information under https://w3id.org/idsa/core/dataAppRuntimeEnvironment
     *
     * @param _dataAppRuntimeEnvironment_ desired value for the property _dataAppRuntimeEnvironment.
     */
    void setDataAppRuntimeEnvironment(String _dataAppRuntimeEnvironment_);

}
