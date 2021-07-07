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
 * Basic authentication using username / password
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicAuthenticationImpl.class),
    @JsonSubTypes.Type(value = HTTPAuthentication.class)
})
public interface BasicAuthentication extends ModelClass, UserAuthentication {

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
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authPassword
     *
     * @return Returns the String for the property _authPassword.
     */
    @JsonProperty("ids:authPassword")
    String getAuthPassword();

    /**
     * Username / ID used for authentication.
     *
     * More information under https://w3id.org/idsa/core/authPassword
     *
     * @param _authPassword_ desired value for the property _authPassword.
     */
    void setAuthPassword(String _authPassword_);

}
