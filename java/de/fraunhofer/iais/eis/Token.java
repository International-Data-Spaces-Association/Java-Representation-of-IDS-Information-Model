package de.fraunhofer.iais.eis;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * A token (e.g., for authorization) mediated as part of the message.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TokenImpl.class),
    @JsonSubTypes.Type(value = DynamicAttributeToken.class)
})
public interface Token extends ModelClass {

    // standard methods

    @Beta
    public Token deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * An authentication token value like JSON Web Token.
     *
     * More information under https://w3id.org/idsa/core/tokenValue
     *
     * @return Returns the String for the property _tokenValue.
     */
    @NotNull
    @JsonProperty("ids:tokenValue")
    String getTokenValue();

    /**
     * An authentication token value like JSON Web Token.
     *
     * More information under https://w3id.org/idsa/core/tokenValue
     *
     * @param _tokenValue_ desired value for the property _tokenValue.
     */
    void setTokenValue(String _tokenValue_);

    /**
     * Describes the format of the authentication token.
     *
     * More information under https://w3id.org/idsa/core/tokenFormat
     *
     * @return Returns the TokenFormat for the property _tokenFormat.
     */
    @NotNull
    @JsonProperty("ids:tokenFormat")
    TokenFormat getTokenFormat();

    /**
     * Describes the format of the authentication token.
     *
     * More information under https://w3id.org/idsa/core/tokenFormat
     *
     * @param _tokenFormat_ desired value for the property _tokenFormat.
     */
    void setTokenFormat(TokenFormat _tokenFormat_);

}
