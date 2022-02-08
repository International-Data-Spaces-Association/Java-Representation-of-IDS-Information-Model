package de.fraunhofer.iais.eis;

import java.net.URI;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The state which an ids:Artifact may have or not.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArtifactStateImpl.class)
})
public interface ArtifactState extends ModelClass {

    // standard methods

    @Beta
    public ArtifactState deepCopy();

    // Default instances of this class as defined in the ontology

    /**
     * The artifact is anonymized so the data source can not be recognized by any further user.
     */
    ArtifactState ANONYMIZED = new ArtifactStateBuilder(URI.create("https://w3id.org/idsa/code/ANONYMIZED")).build();

    /**
     * The artifact is a collection of smaller artifacts and can be split into parts when necessary.
     */
    ArtifactState COMBINED = new ArtifactStateBuilder(URI.create("https://w3id.org/idsa/code/COMBINED")).build();

    /**
     * The artifact is encrypted so the data itself cannot be read by any user without having the
     * corresponding key.
     */
    ArtifactState ENCRYPTED = new ArtifactStateBuilder(URI.create("https://w3id.org/idsa/code/ENCRYPTED")).build();

    /**
     * The artifact is pseudo pseudonymized.
     */
    ArtifactState PSEUDONYMIZED = new ArtifactStateBuilder(URI.create("https://w3id.org/idsa/code/PSEUDONYMIZED")).build();

}
