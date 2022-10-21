package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Connector-specific endpoint exposing Artifacts.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConnectorEndpointImpl.class)
})
public interface ConnectorEndpoint extends Endpoint {

    // standard methods

    @Beta
    public ConnectorEndpoint deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Content instance mediated via this individual endpoint (1:1 mapping).
     *
     * More information under https://w3id.org/idsa/core/endpointArtifact
     *
     * @return Returns the Artifact for the property _endpointArtifact.
     */
    @JsonProperty("ids:endpointArtifact")
    Artifact getEndpointArtifact();

    /**
     * Content instance mediated via this individual endpoint (1:1 mapping).
     *
     * More information under https://w3id.org/idsa/core/endpointArtifact
     *
     * @param _endpointArtifact_ desired value for the property _endpointArtifact.
     */
    void setEndpointArtifact(Artifact _endpointArtifact_);

}
