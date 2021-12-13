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
 * Class of endpoint types a data app offers.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:AppEndpointType")
public enum AppEndpointType implements ModelClass {

    /**
     * Endpoint is used for runtime-related app configurations and app parameters.
     */
    CONFIG_ENDPOINT("https://w3id.org/idsa/code/CONFIG_ENDPOINT", Arrays.asList(new TypedLiteral("Config endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used for runtime-related app configurations and app parameters.", "en"))),

    /**
     * Endpoint is used for data input.
     */
    INPUT_ENDPOINT("https://w3id.org/idsa/code/INPUT_ENDPOINT", Arrays.asList(new TypedLiteral("Input endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used for data input.", "en"))),

    /**
     * Endpoint is used for data output.
     */
    OUTPUT_ENDPOINT("https://w3id.org/idsa/code/OUTPUT_ENDPOINT", Arrays.asList(new TypedLiteral("Output endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used for data output.", "en"))),

    /**
     * Endpoint is used to start (or control) app processing.
     */
    PROCESS_ENDPOINT("https://w3id.org/idsa/code/PROCESS_ENDPOINT", Arrays.asList(new TypedLiteral("Process endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used to start (or control) app processing.", "en"))),

    /**
     * Pre-defined endpoint used to return the corresponding self-description of the data app.
     */
    SELF_DESCRIPTION_ENDPOINT("https://w3id.org/idsa/code/SELF_DESCRIPTION_ENDPOINT",
        Arrays.asList(new TypedLiteral("Self-description endpoint", "en")),
        Arrays.asList(new TypedLiteral("Pre-defined endpoint used to return the corresponding self-description of the data app.", "en"))),

    /**
     * Endpoint is used to get app health / lifecycle status.
     */
    STATUS_ENDPOINT("https://w3id.org/idsa/code/STATUS_ENDPOINT", Arrays.asList(new TypedLiteral("Status endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used to get app health / lifecycle status.", "en"))),

    /**
     * Endpoint is used for usage policy / usage control related scenarios.
     */
    USAGE_POLICY_ENDPOINT("https://w3id.org/idsa/code/USAGE_POLICY_ENDPOINT",
        Arrays.asList(new TypedLiteral("Usage policy endpoint", "en")),
        Arrays.asList(new TypedLiteral("Endpoint is used for usage policy / usage control related scenarios.", "en")));

    private static final Map<String, AppEndpointType> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    AppEndpointType(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
    public static AppEndpointType deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
