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
 * Public key as used in asymmetric cryptography.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PublicKeyImpl.class)
})
public interface PublicKey extends ModelClass {

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
     * Type of the public key.
     *
     * More information under https://w3id.org/idsa/core/keyType
     *
     * @return Returns the KeyType for the property _keyType.
     */
    @JsonProperty("ids:keyType")
    KeyType getKeyType();

    /**
     * Type of the public key.
     *
     * More information under https://w3id.org/idsa/core/keyType
     *
     * @param _keyType_ desired value for the property _keyType.
     */
    void setKeyType(KeyType _keyType_);

    /**
     * Binary representation of the key.
     *
     * More information under https://w3id.org/idsa/core/keyValue
     *
     * @return Returns the byte[] for the property _keyValue.
     */
    @JsonProperty("ids:keyValue")
    byte[] getKeyValue();

    /**
     * Binary representation of the key.
     *
     * More information under https://w3id.org/idsa/core/keyValue
     *
     * @param _keyValue_ desired value for the property _keyValue.
     */
    void setKeyValue(byte[] _keyValue_);

}
