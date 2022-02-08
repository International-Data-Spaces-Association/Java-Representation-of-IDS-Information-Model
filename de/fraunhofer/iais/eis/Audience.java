package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of audiences (recipients) used in the JWT.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AudienceImpl.class)
})
public interface Audience extends ModelClass {

    // standard methods

    @Beta
    public Audience deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * Every IDS Connector is in the intended audience for the DAT with this 'scope' property.
     */
    Audience IDS_CONNECTOR_ATTRIBUTES_ALL =
        new AudienceBuilder(URI.create("https://w3id.org/idsa/code/IDS_CONNECTOR_ATTRIBUTES_ALL")).build();

}
