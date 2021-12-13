package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.Arrays;
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
 * Various pricing modalities such as idsc:FREE, idsc:FIXED_PRICE and idsc:NEGOTIATION_BASIS can be
 * used as a pre-selection to annotate the terms of the contract. Depending on the requirements,
 * additional free text information can be attached.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:PaymentModality")
public enum PaymentModality implements ModelClass {

    /**
     * To express that the exchange of resource is with a fixed price
     */
    FIXED_PRICE("https://w3id.org/idsa/code/FIXED_PRICE", Arrays.asList(new TypedLiteral("fixed price", "en")),
        Arrays.asList(new TypedLiteral("To express that the exchange of resource is with a fixed price", "en"))),

    /**
     * To express that the exchange of resource is free
     */
    FREE("https://w3id.org/idsa/code/FREE", Arrays.asList(new TypedLiteral("free", "en")),
        Arrays.asList(new TypedLiteral("To express that the exchange of resource is free", "en"))),

    /**
     * To express that the exchange of resource is negotiation-based.
     */
    NEGOTIATION_BASIS("https://w3id.org/idsa/code/NEGOTIATION_BASIS", Arrays.asList(new TypedLiteral("negotiation basis", "en")),
        Arrays.asList(new TypedLiteral("To express that the exchange of resource is negotiation-based.", "en")));

    private static final Map<String, PaymentModality> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    PaymentModality(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
        try {
            this.id = new URI(id);
            this.label = label;
            this.comment = comment;
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
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
        return id;
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
        return label;
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
        return comment;
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return id;
    }

    @JsonCreator
    public static PaymentModality deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
