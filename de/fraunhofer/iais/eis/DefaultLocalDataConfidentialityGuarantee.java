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
 * Means by which local data is protected.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:LocalDataConfidentialityGuarantee")
public enum DefaultLocalDataConfidentialityGuarantee implements LocalDataConfidentialityGuarantee {

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_FULL_ENCRYPTION"),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_NONE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_NONE"),

    /** 
    */
    LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE("https://w3id.org/idsa/code/LOCAL_DATA_CONFIDENTIALITY_SECURE_ERASURE"),;

    private static final Map<String, DefaultLocalDataConfidentialityGuarantee> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private LocalDataConfidentialityGuarantee localDataConfidentialityGuarantee;

    DefaultLocalDataConfidentialityGuarantee(String id) {
        this.localDataConfidentialityGuarantee = new LocalDataConfidentialityGuaranteeBuilder(URI.create(id)).build();
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
        return this.localDataConfidentialityGuarantee.getId();
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
        return this.localDataConfidentialityGuarantee.getLabel();
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
        return this.localDataConfidentialityGuarantee.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.localDataConfidentialityGuarantee.getId();
    }

    @JsonCreator
    public static DefaultLocalDataConfidentialityGuarantee deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.localDataConfidentialityGuarantee.getId().toString();
    }

    @Override
    public LocalDataConfidentialityGuarantee deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
