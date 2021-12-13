package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JsonNode;

import de.fraunhofer.iais.eis.util.*;

/**
 * The state which an ids:Artifact may have or not.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:ArtifactState")
public enum DefaultArtifactState implements ArtifactState {

    /**
     * The artifact is anonymized so the data source can not be recognized by any further user.
     */
    ANONYMIZED("https://w3id.org/idsa/code/ANONYMIZED"),

    /**
     * The artifact is a collection of smaller artifacts and can be split into parts when necessary.
     */
    COMBINED("https://w3id.org/idsa/code/COMBINED"),

    /**
     * The artifact is encrypted so the data itself cannot be read by any user without having the
     * corresponding key.
     */
    ENCRYPTED("https://w3id.org/idsa/code/ENCRYPTED"),

    /**
     * The artifact is pseudo pseudonymized.
     */
    PSEUDONYMIZED("https://w3id.org/idsa/code/PSEUDONYMIZED"),;

    private static final Map<String, DefaultArtifactState> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private ArtifactState artifactState;

    DefaultArtifactState(String id) {
        this.artifactState = new ArtifactStateBuilder(URI.create(id)).build();
    }

    // TODO dummy method for generic properties, should be deleted in future versions
    public Map<String, Object> getProperties() {
        return null;
    }

    public void setProperty(String property, Object value) {
        // do nothing
    }

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */

    @JsonIgnore
    @Override
    final public URI getId() {
        return this.artifactState.getId();
    }

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getLabel() {
        return this.artifactState.getLabel();
    }

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    @JsonIgnore
    @Override
    final public List<TypedLiteral> getComment() {
        return this.artifactState.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.artifactState.getId();
    }

    @JsonCreator
    public static DefaultArtifactState deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.artifactState.getId().toString();
    }

    @Override
    public ArtifactState deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
