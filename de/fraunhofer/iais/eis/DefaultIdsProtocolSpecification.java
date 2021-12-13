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
 * List of all defined Protocol Specifications, for instance IDS-CP or IDS over Multipart.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:IdsProtocolSpecification")
public enum DefaultIdsProtocolSpecification implements IdsProtocolSpecification {

    /**
     * The IDS-CP specification of the IDS interactions.
     */
    IDS_CP("https://w3id.org/idsa/code/IDS-CP"),

    /**
     * The REST specification of the IDS interactions.
     */
    IDS_REST("https://w3id.org/idsa/code/IDS-REST"),

    /**
     * The Multipart Messages implementation of the IDS interactions.
     */
    MULTIPART("https://w3id.org/idsa/code/MULTIPART"),

    /**
     * Queries conforming to IDS specifications.
     */
    QUERY("https://w3id.org/idsa/code/QUERY"),;

    private static final Map<String, DefaultIdsProtocolSpecification> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private IdsProtocolSpecification idsProtocolSpecification;

    DefaultIdsProtocolSpecification(String id) {
        this.idsProtocolSpecification = new IdsProtocolSpecificationBuilder(URI.create(id)).build();
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
        return this.idsProtocolSpecification.getId();
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
        return this.idsProtocolSpecification.getLabel();
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
        return this.idsProtocolSpecification.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.idsProtocolSpecification.getId();
    }

    @JsonCreator
    public static DefaultIdsProtocolSpecification deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.idsProtocolSpecification.getId().toString();
    }

    @Override
    public IdsProtocolSpecification deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
