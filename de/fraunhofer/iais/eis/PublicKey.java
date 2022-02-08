package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonAlias;
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

    @Beta
    public PublicKey deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * Type of the public key.
     *
     * More information under https://w3id.org/idsa/core/keyType
     *
     * @return Returns the KeyType for the property _keyType.
     */
    @JsonAlias({"https://w3id.org/idsa/core/keyType", "ids:keyType", "keyType"})
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
    @JsonAlias({"https://w3id.org/idsa/core/keyValue", "ids:keyValue", "keyValue"})
    byte[] getKeyValue();

    /**
     * Binary representation of the key.
     *
     * More information under https://w3id.org/idsa/core/keyValue
     *
     * @param _keyValue_ desired value for the property _keyValue.
     */
    void setKeyValue(byte[] _keyValue_);

    // Default instances of this class as defined in the ontology

}
