package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Cryptographic Key Type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = KeyTypeImpl.class)
})
public interface KeyType extends ModelClass {

    // standard methods

    @Beta
    public KeyType deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    KeyType DSA = new KeyTypeBuilder(URI.create("https://w3id.org/idsa/code/DSA")).build();

    /** 
    */
    KeyType ECDSA = new KeyTypeBuilder(URI.create("https://w3id.org/idsa/code/ECDSA")).build();

    /** 
    */
    KeyType ED25519 = new KeyTypeBuilder(URI.create("https://w3id.org/idsa/code/ED25519")).build();

    /** 
    */
    KeyType RSA = new KeyTypeBuilder(URI.create("https://w3id.org/idsa/code/RSA")).build();

}
