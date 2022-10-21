package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Holds Proxy information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProxyImpl.class)
})
public interface Proxy extends ModelClass {

    // standard methods

    @Beta
    public Proxy deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * URI of the proxy server.
     *
     * More information under https://w3id.org/idsa/core/proxyURI
     *
     * @return Returns the URI for the property _proxyURI.
     */
    @NotNull
    @JsonProperty("ids:proxyURI")
    URI getProxyURI();

    /**
     * URI of the proxy server.
     *
     * More information under https://w3id.org/idsa/core/proxyURI
     *
     * @param _proxyURI_ desired value for the property _proxyURI.
     */
    void setProxyURI(URI _proxyURI_);

    /**
     * URLs that should be excluded from proxying.GNU emcs documentation contains a good explanation for
     * the usage of noProxy.
     *
     * More information under https://w3id.org/idsa/core/noProxy
     *
     * @return Returns the List of URIs for the property _noProxy.
     */
    @JsonProperty("ids:noProxy")
    List<URI> getNoProxy();

    /**
     * URLs that should be excluded from proxying.GNU emcs documentation contains a good explanation for
     * the usage of noProxy.
     *
     * More information under https://w3id.org/idsa/core/noProxy
     *
     * @param _noProxy_ desired value for the property _noProxy.
     */
    void setNoProxy(List<URI> _noProxy_);

    /**
     * authentication information for the proxy
     *
     * More information under https://w3id.org/idsa/core/proxyAuthentication
     *
     * @return Returns the BasicAuthentication for the property _proxyAuthentication.
     */
    @JsonProperty("ids:proxyAuthentication")
    BasicAuthentication getProxyAuthentication();

    /**
     * authentication information for the proxy
     *
     * More information under https://w3id.org/idsa/core/proxyAuthentication
     *
     * @param _proxyAuthentication_ desired value for the property _proxyAuthentication.
     */
    void setProxyAuthentication(BasicAuthentication _proxyAuthentication_);

}
