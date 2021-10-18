package de.fraunhofer.iais.eis;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Description of endpoints a DataApp offers.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppEndpointImpl.class)
})
public interface AppEndpoint extends Endpoint {

    // standard methods

    @Beta
    public AppEndpoint deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Type of an app endpoint. Data apps have different endpoint types, e.g., for input, output or
     * health status.
     *
     * More information under https://w3id.org/idsa/core/appEndpointType
     *
     * @return Returns the AppEndpointType for the property _appEndpointType.
     */
    @NotNull
    @JsonProperty("ids:appEndpointType")
    AppEndpointType getAppEndpointType();

    /**
     * Type of an app endpoint. Data apps have different endpoint types, e.g., for input, output or
     * health status.
     *
     * More information under https://w3id.org/idsa/core/appEndpointType
     *
     * @param _appEndpointType_ desired value for the property _appEndpointType.
     */
    void setAppEndpointType(AppEndpointType _appEndpointType_);

    /**
     * Port used to access the endpoint.
     *
     * More information under https://w3id.org/idsa/core/appEndpointPort
     *
     * @return Returns the BigInteger for the property _appEndpointPort.
     */
    @JsonProperty("ids:appEndpointPort")
    BigInteger getAppEndpointPort();

    /**
     * Port used to access the endpoint.
     *
     * More information under https://w3id.org/idsa/core/appEndpointPort
     *
     * @param _appEndpointPort_ desired value for the property _appEndpointPort.
     */
    void setAppEndpointPort(BigInteger _appEndpointPort_);

    /**
     * Mediatype, such as IANA types, of the data an endpoint expects or returns .
     *
     * More information under https://w3id.org/idsa/core/appEndpointMediaType
     *
     * @return Returns the MediaType for the property _appEndpointMediaType.
     */
    @JsonProperty("ids:appEndpointMediaType")
    MediaType getAppEndpointMediaType();

    /**
     * Mediatype, such as IANA types, of the data an endpoint expects or returns .
     *
     * More information under https://w3id.org/idsa/core/appEndpointMediaType
     *
     * @param _appEndpointMediaType_ desired value for the property _appEndpointMediaType.
     */
    void setAppEndpointMediaType(MediaType _appEndpointMediaType_);

    /**
     * Protocol used to communicate with the app endpoint.
     *
     * More information under https://w3id.org/idsa/core/appEndpointProtocol
     *
     * @return Returns the String for the property _appEndpointProtocol.
     */
    @JsonProperty("ids:appEndpointProtocol")
    String getAppEndpointProtocol();

    /**
     * Protocol used to communicate with the app endpoint.
     *
     * More information under https://w3id.org/idsa/core/appEndpointProtocol
     *
     * @param _appEndpointProtocol_ desired value for the property _appEndpointProtocol.
     */
    void setAppEndpointProtocol(String _appEndpointProtocol_);

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @return Returns the Language for the property _language.
     */
    @JsonProperty("ids:language")
    Language getLanguage();

    /**
     * Natural language(s) used within the content.
     *
     * More information under https://w3id.org/idsa/core/language
     *
     * @param _language_ desired value for the property _language.
     */
    void setLanguage(Language _language_);

}
