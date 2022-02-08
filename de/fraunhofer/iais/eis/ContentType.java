package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Enumerated types of content expanding upon the Digital Content hierarchy. Instances of Content
 * Type are used to more precisely specify the type, genre or interpretation of a Digital Content.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentTypeImpl.class)
})
public interface ContentType extends ModelClass {

    // standard methods

    @Beta
    public ContentType deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * Formal, machine-interpretable definition of a protocol-specific API, e.g., OpenAPI, GraphQL, API
     * Blueprint, WSDL.
     */
    ContentType INTERFACE_DEFINITION = new ContentTypeBuilder(URI.create("https://w3id.org/idsa/code/INTERFACE_DEFINITION")).build();

    /**
     * Formal, machine-interpretable definition of a data schema, e.g., XMLSchema, JSONSchema
     */
    ContentType SCHEMA_DEFINITION = new ContentTypeBuilder(URI.create("https://w3id.org/idsa/code/SCHEMA_DEFINITION")).build();

}
