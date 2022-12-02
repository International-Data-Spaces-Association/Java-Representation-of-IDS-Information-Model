package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Access point of data exchange, service interaction and service description.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EndpointImpl.class),
    @JsonSubTypes.Type(value = ConnectorEndpoint.class),
    @JsonSubTypes.Type(value = AppEndpoint.class),
    @JsonSubTypes.Type(value = GenericEndpoint.class)
})
public interface Endpoint extends ModelClass {

    // standard methods

    @Beta
    public Endpoint deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Access URL of an endpoint.
     *
     * More information under https://w3id.org/idsa/core/accessURL
     *
     * @return Returns the URI for the property _accessURL.
     */
    @JsonAlias({"https://w3id.org/idsa/core/accessURL", "ids:accessURL", "accessURL"})
    URI getAccessURL();

    /**
     * Access URL of an endpoint.
     *
     * More information under https://w3id.org/idsa/core/accessURL
     *
     * @param _accessURL_ desired value for the property _accessURL.
     */
    void setAccessURL(URI _accessURL_);

    /**
     * Human-readable information and description of the endpoint.
     *
     * More information under https://w3id.org/idsa/core/endpointInformation
     *
     * @return Returns the List of TypedLiterals for the property _endpointInformation.
     */
    @JsonAlias({"https://w3id.org/idsa/core/endpointInformation", "ids:endpointInformation", "endpointInformation"})
    List<TypedLiteral> getEndpointInformation();

    /**
     * Human-readable information and description of the endpoint.
     *
     * More information under https://w3id.org/idsa/core/endpointInformation
     *
     * @param _endpointInformation_ desired value for the property _endpointInformation.
     */
    void setEndpointInformation(List<TypedLiteral> _endpointInformation_);

    /**
     * IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based
     * documentation.
     *
     * More information under https://w3id.org/idsa/core/endpointDocumentation
     *
     * @return Returns the List of URIs for the property _endpointDocumentation.
     */
    @JsonAlias({"https://w3id.org/idsa/core/endpointDocumentation", "ids:endpointDocumentation", "endpointDocumentation"})
    List<URI> getEndpointDocumentation();

    /**
     * IRI reference to a documentation of the endpoint, e.g., reference to an OpenAPI-based
     * documentation.
     *
     * More information under https://w3id.org/idsa/core/endpointDocumentation
     *
     * @param _endpointDocumentation_ desired value for the property _endpointDocumentation.
     */
    void setEndpointDocumentation(List<URI> _endpointDocumentation_);

    /**
     * Relative path, topic or queue at which the content is published by the related host.
     *
     * More information under https://w3id.org/idsa/core/path
     *
     * @return Returns the String for the property _path.
     */
    @JsonAlias({"https://w3id.org/idsa/core/path", "ids:path", "path"})
    String getPath();

    /**
     * Relative path, topic or queue at which the content is published by the related host.
     *
     * More information under https://w3id.org/idsa/core/path
     *
     * @param _path_ desired value for the property _path.
     */
    void setPath(String _path_);

    /**
     * Relative path used for inbound communication via this endpoint, i.e., input messages and faults
     * only.
     *
     * More information under https://w3id.org/idsa/core/inboundPath
     *
     * @return Returns the String for the property _inboundPath.
     */
    @JsonAlias({"https://w3id.org/idsa/core/inboundPath", "ids:inboundPath", "inboundPath"})
    String getInboundPath();

    /**
     * Relative path used for inbound communication via this endpoint, i.e., input messages and faults
     * only.
     *
     * More information under https://w3id.org/idsa/core/inboundPath
     *
     * @param _inboundPath_ desired value for the property _inboundPath.
     */
    void setInboundPath(String _inboundPath_);

    /**
     * Relative path used for outbound communication via this endpoint, i.e., output messages and faults
     * only.
     *
     * More information under https://w3id.org/idsa/core/outboundPath
     *
     * @return Returns the String for the property _outboundPath.
     */
    @JsonAlias({"https://w3id.org/idsa/core/outboundPath", "ids:outboundPath", "outboundPath"})
    String getOutboundPath();

    /**
     * Relative path used for outbound communication via this endpoint, i.e., output messages and faults
     * only.
     *
     * More information under https://w3id.org/idsa/core/outboundPath
     *
     * @param _outboundPath_ desired value for the property _outboundPath.
     */
    void setOutboundPath(String _outboundPath_);

    /**
     * Declares which endpoint specification is supported by this IDS endpoint.
     *
     * More information under https://w3id.org/idsa/core/apiSpecifiation
     *
     * @return Returns the List of IdsProtocolSpecifications for the property _apiSpecifiation.
     */
    @JsonAlias({"https://w3id.org/idsa/core/apiSpecifiation", "ids:apiSpecifiation", "apiSpecifiation"})
    List<IdsProtocolSpecification> getApiSpecifiation();

    /**
     * Declares which endpoint specification is supported by this IDS endpoint.
     *
     * More information under https://w3id.org/idsa/core/apiSpecifiation
     *
     * @param _apiSpecifiation_ desired value for the property _apiSpecifiation.
     */
    void setApiSpecifiation(List<IdsProtocolSpecification> _apiSpecifiation_);

    // Default instances of this class as defined in the ontology

}
