package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Dedicated communication server for sending and receiving data in compliance with the Connector
 * specification. There are different types of Connectors according to provided capabilities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Broker.class),
    @JsonSubTypes.Type(value = AppStore.class),
    @JsonSubTypes.Type(value = BaseConnector.class),
    @JsonSubTypes.Type(value = TrustedConnector.class),
    @JsonSubTypes.Type(value = ParIS.class)
})
public interface Connector extends InfrastructureComponent {

    // standard methods

    @Beta
    public Connector deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Indicates the default endpoint that should be used for basic infrastructure interactions, e.g.,
     * providing the self description.
     *
     * More information under https://w3id.org/idsa/core/hasDefaultEndpoint
     *
     * @return Returns the ConnectorEndpoint for the property _hasDefaultEndpoint.
     */
    @NotNull
    @JsonProperty("ids:hasDefaultEndpoint")
    ConnectorEndpoint getHasDefaultEndpoint();

    /**
     * Indicates the default endpoint that should be used for basic infrastructure interactions, e.g.,
     * providing the self description.
     *
     * More information under https://w3id.org/idsa/core/hasDefaultEndpoint
     *
     * @param _hasDefaultEndpoint_ desired value for the property _hasDefaultEndpoint.
     */
    void setHasDefaultEndpoint(ConnectorEndpoint _hasDefaultEndpoint_);

    /**
     * Reference to the Endpoints that serve the resource's content or let you exchange messages with an
     * IDS Connector.
     *
     * More information under https://w3id.org/idsa/core/hasEndpoint
     *
     * @return Returns the List of ConnectorEndpoints for the property _hasEndpoint.
     */
    @JsonProperty("ids:hasEndpoint")
    List<ConnectorEndpoint> getHasEndpoint();

    /**
     * Reference to the Endpoints that serve the resource's content or let you exchange messages with an
     * IDS Connector.
     *
     * More information under https://w3id.org/idsa/core/hasEndpoint
     *
     * @param _hasEndpoint_ desired value for the property _hasEndpoint.
     */
    void setHasEndpoint(List<ConnectorEndpoint> _hasEndpoint_);

    /**
     * Information of the authentication service used by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authInfo
     *
     * @return Returns the AuthInfo for the property _authInfo.
     */
    @JsonProperty("ids:authInfo")
    AuthInfo getAuthInfo();

    /**
     * Information of the authentication service used by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authInfo
     *
     * @param _authInfo_ desired value for the property _authInfo.
     */
    void setAuthInfo(AuthInfo _authInfo_);

    /**
     * References the Catalog of published or requested resource by this Connector.
     *
     * More information under https://w3id.org/idsa/core/resourceCatalog
     *
     * @return Returns the List of ResourceCatalogs for the property _resourceCatalog.
     */
    @JsonProperty("ids:resourceCatalog")
    List<ResourceCatalog> getResourceCatalog();

    /**
     * References the Catalog of published or requested resource by this Connector.
     *
     * More information under https://w3id.org/idsa/core/resourceCatalog
     *
     * @param _resourceCatalog_ desired value for the property _resourceCatalog.
     */
    void setResourceCatalog(List<ResourceCatalog> _resourceCatalog_);

    /**
     * The Agents for which this Connector may initiate and receive Messages.
     *
     * More information under https://w3id.org/idsa/core/hasAgent
     *
     * @return Returns the List of URIs for the property _hasAgent.
     */
    @JsonProperty("ids:hasAgent")
    List<URI> getHasAgent();

    /**
     * The Agents for which this Connector may initiate and receive Messages.
     *
     * More information under https://w3id.org/idsa/core/hasAgent
     *
     * @param _hasAgent_ desired value for the property _hasAgent.
     */
    void setHasAgent(List<URI> _hasAgent_);

    /**
     * The SecurityProfile supported by the Connector.
     *
     * More information under https://w3id.org/idsa/core/securityProfile
     *
     * @return Returns the SecurityProfile for the property _securityProfile.
     */
    @NotNull
    @JsonProperty("ids:securityProfile")
    SecurityProfile getSecurityProfile();

    /**
     * The SecurityProfile supported by the Connector.
     *
     * More information under https://w3id.org/idsa/core/securityProfile
     *
     * @param _securityProfile_ desired value for the property _securityProfile.
     */
    void setSecurityProfile(SecurityProfile _securityProfile_);

    /**
     * Reference to a security guarantee that, if used in combination with a security profile instance,
     * overrides the respective guarantee of the given predefined instance.
     *
     * More information under https://w3id.org/idsa/core/extendedGuarantee
     *
     * @return Returns the List of SecurityGuarantees for the property _extendedGuarantee.
     */
    @JsonProperty("ids:extendedGuarantee")
    List<SecurityGuarantee> getExtendedGuarantee();

    /**
     * Reference to a security guarantee that, if used in combination with a security profile instance,
     * overrides the respective guarantee of the given predefined instance.
     *
     * More information under https://w3id.org/idsa/core/extendedGuarantee
     *
     * @param _extendedGuarantee_ desired value for the property _extendedGuarantee.
     */
    void setExtendedGuarantee(List<SecurityGuarantee> _extendedGuarantee_);

}
