package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

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
public interface GenericEndpoint extends ModelClass, Endpoint {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

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
