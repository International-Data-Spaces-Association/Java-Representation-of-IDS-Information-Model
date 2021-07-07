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
 * Holds authentication information so that connections to the Connector's data offerings can be
 * establised.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AuthInfoImpl.class)
})
public interface AuthInfo extends ModelClass {

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
     * The URL of the authentication service that is provided by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authService
     *
     * @return Returns the URI for the property _authService.
     */
    @NotNull
    @JsonProperty("ids:authService")
    URI getAuthService();

    /**
     * The URL of the authentication service that is provided by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authService
     *
     * @param _authService_ desired value for the property _authService.
     */
    void setAuthService(URI _authService_);

    /**
     * The standard used by the authentication service that is provided by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authStandard
     *
     * @return Returns the AuthStandard for the property _authStandard.
     */
    @JsonProperty("ids:authStandard")
    AuthStandard getAuthStandard();

    /**
     * The standard used by the authentication service that is provided by the Connector.
     *
     * More information under https://w3id.org/idsa/core/authStandard
     *
     * @param _authStandard_ desired value for the property _authStandard.
     */
    void setAuthStandard(AuthStandard _authStandard_);

}
