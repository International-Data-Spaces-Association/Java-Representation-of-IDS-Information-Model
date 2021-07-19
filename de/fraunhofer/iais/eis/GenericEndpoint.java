package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Generic endpoints describe non-IDS-specific endpoints, e.g., to integrate external services.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = GenericEndpointImpl.class)
})
public interface GenericEndpoint extends Endpoint {

    // standard methods

    @Beta
    public GenericEndpoint deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Authentication credentials for generic endpoints.
     *
     * More information under https://w3id.org/idsa/core/genericEndpointAuthentication
     *
     * @return Returns the BasicAuthentication for the property _genericEndpointAuthentication.
     */
    @JsonProperty("ids:genericEndpointAuthentication")
    BasicAuthentication getGenericEndpointAuthentication();

    /**
     * Authentication credentials for generic endpoints.
     *
     * More information under https://w3id.org/idsa/core/genericEndpointAuthentication
     *
     * @param _genericEndpointAuthentication_ desired value for the property
     *        _genericEndpointAuthentication.
     */
    void setGenericEndpointAuthentication(BasicAuthentication _genericEndpointAuthentication_);

    /**
     * Endpoint-specific configuration details (e.g., contents of a config file) used for the endpoint.
     *
     * More information under https://w3id.org/idsa/core/genericEndpointConfiguration
     *
     * @return Returns the String for the property _genericEndpointConfiguration.
     */
    @JsonProperty("ids:genericEndpointConfiguration")
    String getGenericEndpointConfiguration();

    /**
     * Endpoint-specific configuration details (e.g., contents of a config file) used for the endpoint.
     *
     * More information under https://w3id.org/idsa/core/genericEndpointConfiguration
     *
     * @param _genericEndpointConfiguration_ desired value for the property
     *        _genericEndpointConfiguration.
     */
    void setGenericEndpointConfiguration(String _genericEndpointConfiguration_);

}
