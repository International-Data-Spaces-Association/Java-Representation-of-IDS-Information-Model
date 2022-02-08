package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Possible formats for (security-related) tokens.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TokenFormatImpl.class)
})
public interface TokenFormat extends ModelClass {

    // standard methods

    @Beta
    public TokenFormat deepCopy();

    // Default instances of this class as defined in the ontology

    /** 
    */
    TokenFormat JWT = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/JWT")).build();

    /** 
    */
    TokenFormat OTHER = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/OTHER")).build();

    /** 
    */
    TokenFormat SAML_1_1 = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/SAML_1_1")).build();

    /** 
    */
    TokenFormat SAML_2_0 = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/SAML_2_0")).build();

    /** 
    */
    TokenFormat SWT = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/SWT")).build();

    /** 
    */
    TokenFormat UNKNOWN = new TokenFormatBuilder(URI.create("https://w3id.org/idsa/code/UNKNOWN")).build();

}
