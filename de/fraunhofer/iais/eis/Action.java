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
 * A thing one might be permitted to do or prohibited from doing to something.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Action")
public enum Action implements ModelClass {

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the consumer side.
     */
    AGGREGATE_BY_CONSUMER("https://w3id.org/idsa/code/AGGREGATE_BY_CONSUMER",
        Arrays.asList(new TypedLiteral("aggregate by consumer", "en")),
        Arrays.asList(new TypedLiteral("Data will be part of another piece of data so that it is not distinguishable anymore.", "en"))),

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the provider side.
     */
    AGGREGATE_BY_PROVIDER("https://w3id.org/idsa/code/AGGREGATE_BY_PROVIDER",
        Arrays.asList(new TypedLiteral("aggregate by provider", "en")),
        Arrays.asList(new TypedLiteral("Data will be part of another piece of data so that it is not distinguishable anymore.", "en"))),

    /**
     * To anonymize all, parts or certain attributes of the resource. This action is always evaluated at
     * the provider side.
     */
    ANONYMIZE("https://w3id.org/idsa/code/ANONYMIZE", Arrays.asList(new TypedLiteral("anonymize", "en")),
        Arrays.asList(new TypedLiteral("To anonymize all, parts or certain attributes of the resource.", "en"))),

    /**
     * To pay a certain amount of money in order to use a resource. This action must be evaluated both
     * at the consumer and provider side. A compensation might be required before access is granted
     * (provider-side), or each time the usage action is performed (consumer-side).
     */
    COMPENSATE("https://w3id.org/idsa/code/COMPENSATE", Arrays.asList(new TypedLiteral("compensate", "en")),
        Arrays.asList(new TypedLiteral("To pay a certain amount of money in order to use a resource.", "en"))),

    /**
     * To remove a resource or inhibit any further access with reasonable measures. This action is
     * evaluated at the consumer side if used in a duty clause. A provider cannot be forced to delete
     * its data resources. If used in a permission clause, it is effecting the data provider as it
     * allows the consumer to delete the provider's resource remotely.
     */
    DELETE("https://w3id.org/idsa/code/DELETE", Arrays.asList(new TypedLiteral("delete", "en")),
        Arrays.asList(new TypedLiteral("To remove a resource or inhibit any further access with reasonable measures.", "en"))),

    /**
     * To forward or supply a resource to a third-party. This action is always evaluated at the consumer
     * side and allows it to become a data provider of this resource.
     */
    DISTRIBUTE("https://w3id.org/idsa/code/DISTRIBUTE", Arrays.asList(new TypedLiteral("distribute", "en")),
        Arrays.asList(new TypedLiteral("To forward or supply a resource to a third-party.", "en"))),

    /**
     * The data artifact or parts of it are encrypted and can not be read by neither the
     * ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a
     * constraint. This action is always evaluated at the provider side.
     */
    ENCRYPT("https://w3id.org/idsa/code/ENCRYPT", Arrays.asList(new TypedLiteral("encrypt", "en")), Arrays.asList(new TypedLiteral(
        "The data artifact or parts of it are encrypted and can not be read by neither the ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a constraint.",
        "en"))),

    /**
     * To grant use of a resource to another party. Does *not* imply any other usage rights. This action
     * is always evaluated at the consumer side, at the moment a third party intends to access the
     * resource as received by the original consumer.
     */
    GRANT_USE("https://w3id.org/idsa/code/GRANT_USE", Arrays.asList(new TypedLiteral("grant use", "en")),
        Arrays.asList(new TypedLiteral("To grant use of a resource to another party. Does *not* imply any other usage rights.", "en"))),

    /**
     * To log information or store information about incidents in a local file or database. Is not
     * necessarily available to external parties but can be used to create transparency on happened
     * events. This action is always evaluated at the consumer side.
     */
    LOG("https://w3id.org/idsa/code/LOG", Arrays.asList(new TypedLiteral("log", "en")), Arrays.asList(new TypedLiteral(
        "To log information or store information about incidents in a local file or database. Is not necessarily available to external parties but can be used to create transparency on happened events.",
        "en"))),

    /**
     * To change a resource locally. This action is always evaluated at the consumer side. It
     * corresponds to 'allow changes of the copied resource'.
     */
    MODIFY("https://w3id.org/idsa/code/MODIFY", Arrays.asList(new TypedLiteral("modify", "en")),
        Arrays.asList(new TypedLiteral("To change a resource locally.", "en"))),

    /**
     * To forward the resource under the same policy. Implies a permission to distribute. This action is
     * always evaluated at the consumer side.
     */
    NEXT_POLICY("https://w3id.org/idsa/code/NEXT_POLICY", Arrays.asList(new TypedLiteral("next policy", "en")),
        Arrays.asList(new TypedLiteral("To forward the resource under the same policy. Implies a permission to distribute.", "en"))),

    /**
     * To log information or notify an instance about incidents. Can be used to define Clearing House
     * interactions. This action can target the consumer and the data provider of the resource.
     */
    NOTIFY("https://w3id.org/idsa/code/NOTIFY", Arrays.asList(new TypedLiteral("notify", "en")), Arrays.asList(new TypedLiteral(
        "To log information or notify an instance about incidents. Can be used to define Clearing House interactions.", "en"))),

    /**
     * To obtain data from the resource. This action is always evaluated at the provider side. It
     * corresponds to 'give access to a resource'.
     */
    READ("https://w3id.org/idsa/code/READ", Arrays.asList(new TypedLiteral("read", "en")),
        Arrays.asList(new TypedLiteral("To obtain data from the resource.", "en"))),

    /**
     * To accept that the use of the Asset may be tracked. This action is always evaluated at the
     * consumer side.
     */
    TRACK_PROVENANCE("https://w3id.org/idsa/code/TRACK_PROVENANCE", Arrays.asList(new TypedLiteral("track provenance", "en")),
        Arrays.asList(new TypedLiteral("To accept that the use of the Asset may be tracked.", "en"))),

    /**
     * To use a resource in any possible way. Includes all other actions. This action is always
     * evaluated at the consumer side.
     */
    USE("https://w3id.org/idsa/code/USE", Arrays.asList(new TypedLiteral("use", "en")),
        Arrays.asList(new TypedLiteral("To use a resource in any possible way. Includes all other actions.", "en"))),

    /**
     * To change a remote resource. This action is always evaluated at the provider side. It corresponds
     * to 'allow changes of a resource' but *not* including its deletion.
     */
    WRITE("https://w3id.org/idsa/code/WRITE", Arrays.asList(new TypedLiteral("write", "en")),
        Arrays.asList(new TypedLiteral("To change a remote resource.", "en")));

    private static final Map<String, Action> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    Action(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
    public static Action deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

    @JsonIgnore

    @JsonProperty("ids:actionRefinement")
    final public List<Constraint> getActionRefinement() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:includedIn")
    final public Action getIncludedIn() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
