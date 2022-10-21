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
 * Class of reasons that might lead to issuing a Rejection message.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:RejectionReason")
public enum RejectionReason implements ModelClass {

    /**
     * At least one query or operation parameter is not acceptable for the sender of this rejection
     * message.
     */
    BAD_PARAMETERS("https://w3id.org/idsa/code/BAD_PARAMETERS", Arrays.asList(new TypedLiteral("BAD_PARAMETERS", "")), Arrays.asList(
        new TypedLiteral("At least one query or operation parameter is not acceptable for the sender of this rejection message.", ""))),

    /**
     * The message recipient encountered an internal error while processing the message (e.g., storage
     * capacity exceeded).
     */
    INTERNAL_RECIPIENT_ERROR("https://w3id.org/idsa/code/INTERNAL_RECIPIENT_ERROR",
        Arrays.asList(new TypedLiteral("INTERNAL_RECIPIENT_ERROR", "")), Arrays.asList(new TypedLiteral(
            "The message recipient encountered an internal error while processing the message (e.g., storage capacity exceeded).", ""))),

    /**
     * The originating message is malformed or missing information.
     */
    MALFORMED_MESSAGE("https://w3id.org/idsa/code/MALFORMED_MESSAGE", Arrays.asList(new TypedLiteral("MALFORMED_MESSAGE", "")),
        Arrays.asList(new TypedLiteral("The originating message is malformed or missing information.", ""))),

    /**
     * The sender of the rejection does not support the incoming message type (e.g., ids:QueryMessage).
     */
    MESSAGE_TYPE_NOT_SUPPORTED("https://w3id.org/idsa/code/MESSAGE_TYPE_NOT_SUPPORTED",
        Arrays.asList(new TypedLiteral("MESSAGE_TYPE_NOT_SUPPORTED", "")), Arrays.asList(
            new TypedLiteral("The sender of the rejection does not support the incoming message type (e.g., ids:QueryMessage).", ""))),

    /**
     * The sender of the rejection does not implement a certain functionality stated in the message
     * (e.g., query language).
     */
    METHOD_NOT_SUPPORTED("https://w3id.org/idsa/code/METHOD_NOT_SUPPORTED", Arrays.asList(new TypedLiteral("METHOD_NOT_SUPPORTED", "")),
        Arrays.asList(new TypedLiteral(
            "The sender of the rejection does not implement a certain functionality stated in the message (e.g., query language).", ""))),

    /**
     * Authenticity of a message sender has failed or is not verifiable.
     */
    NOT_AUTHENTICATED("https://w3id.org/idsa/code/NOT_AUTHENTICATED", Arrays.asList(new TypedLiteral("NOT_AUTHENTICATED", "")),
        Arrays.asList(new TypedLiteral("Authenticity of a message sender has failed or is not verifiable.", ""))),

    /**
     * Sender is not authorized to initiate the command.
     */
    NOT_AUTHORIZED("https://w3id.org/idsa/code/NOT_AUTHORIZED", Arrays.asList(new TypedLiteral("NOT_AUTHORIZED", "")),
        Arrays.asList(new TypedLiteral("Sender is not authorized to initiate the command.", ""))),

    /**
     * Requested Resource was not found.
     */
    NOT_FOUND("https://w3id.org/idsa/code/NOT_FOUND", Arrays.asList(new TypedLiteral("NOT_FOUND", "")),
        Arrays.asList(new TypedLiteral("Requested Resource was not found.", ""))),

    /**
     * The requested resource, representation or artifact is temporarily not available but might be back
     * later.
     */
    TEMPORARILY_NOT_AVAILABLE("https://w3id.org/idsa/code/TEMPORARILY_NOT_AVAILABLE",
        Arrays.asList(new TypedLiteral("TEMPORARILY_NOT_AVAILABLE", "")), Arrays.asList(new TypedLiteral(
            "The requested resource, representation or artifact is temporarily not available but might be back later.", ""))),

    /**
     * Processing of the command would lead to too many results (computational or bandwidth limitations)
     */
    TOO_MANY_RESULTS("https://w3id.org/idsa/code/TOO_MANY_RESULTS", Arrays.asList(new TypedLiteral("TOO_MANY_RESULTS", "")), Arrays
        .asList(new TypedLiteral("Processing of the command would lead to too many results (computational or bandwidth limitations)", ""))),

    /**
     * The version of the information model against which the referenced message should be interpreted,
     * is not supported by the recipient.
     */
    VERSION_NOT_SUPPORTED("https://w3id.org/idsa/code/VERSION_NOT_SUPPORTED", Arrays.asList(new TypedLiteral("VERSION_NOT_SUPPORTED", "")),
        Arrays.asList(new TypedLiteral(
            "The version of the information model against which the referenced message should be interpreted, is not supported by the recipient.",
            "")));

    private static final Map<String, RejectionReason> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    RejectionReason(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
    public static RejectionReason deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

}
