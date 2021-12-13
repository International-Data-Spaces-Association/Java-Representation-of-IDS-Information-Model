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
 * A thing one might be permitted to do or prohibited from doing to something.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:Action")
public enum DefaultAction implements Action {

    /**
     * This action modifies a number by adding a given value to it. This action modifies a number by
     * adding a given value to it. The field to be modified and the given value are specified in the
     * policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    ADD("https://w3id.org/idsa/code/ADD"),

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the consumer side.
     */
    AGGREGATE_BY_CONSUMER("https://w3id.org/idsa/code/AGGREGATE_BY_CONSUMER"),

    /**
     * Data will be part of another piece of data so that it is not distinguishable anymore. This action
     * is always evaluated at the provider side.
     */
    AGGREGATE_BY_PROVIDER("https://w3id.org/idsa/code/AGGREGATE_BY_PROVIDER"),

    /**
     * To anonymize all, parts or certain attributes of the resource. This action is always evaluated at
     * the provider side.
     */
    ANONYMIZE("https://w3id.org/idsa/code/ANONYMIZE"),

    /**
     * To pay a certain amount of money in order to use a resource. This action must be evaluated both
     * at the consumer and provider side. A compensation might be required before access is granted
     * (provider-side), or each time the usage action is performed (consumer-side).
     */
    COMPENSATE("https://w3id.org/idsa/code/COMPENSATE"),

    /**
     * To remove a resource or inhibit any further access with reasonable measures. This action is
     * evaluated at the consumer side if used in a duty clause. A provider cannot be forced to delete
     * its data resources. If used in a permission clause, it is effecting the data provider as it
     * allows the consumer to delete the provider's resource remotely.
     */
    DELETE("https://w3id.org/idsa/code/DELETE"),

    /**
     * To forward or supply a resource to a third-party. This action is always evaluated at the consumer
     * side and allows it to become a data provider of this resource.
     */
    DISTRIBUTE("https://w3id.org/idsa/code/DISTRIBUTE"),

    /**
     * This action modifies dividing something by something else. This action modifies dividing
     * something by something else. The field to be modified and the given value are specified in the
     * policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    DIVIDE("https://w3id.org/idsa/code/DIVIDE"),

    /**
     * The data artifact or parts of it are encrypted and can not be read by neither the
     * ids:DataConsumer nor any other third party. The encryption algorithm might be specified by a
     * constraint. This action is always evaluated at the provider side.
     */
    ENCRYPT("https://w3id.org/idsa/code/ENCRYPT"),

    /**
     * To grant use of a resource to another party. Does *not* imply any other usage rights. This action
     * is always evaluated at the consumer side, at the moment a third party intends to access the
     * resource as received by the original consumer.
     */
    GRANT_USE("https://w3id.org/idsa/code/GRANT_USE"),

    /**
     * This action modifies a value by replacing it with a hash of the value. This action modifies a
     * value by replacing it with a hash of the value. The field to be modified and the hash algorithm
     * are specified in the policy as idsc:JSONPATH/idsc:XPATH and idsc:HASH_ALGORITHM (eg. SHA256),
     * respectively.
     */
    HASH("https://w3id.org/idsa/code/HASH"),

    /**
     * An action to be used in the count usage policy where the idsc:COUNT left operand is used.
     */
    INCREMENT_COUNTER("https://w3id.org/idsa/code/INCREMENT_COUNTER"),

    /**
     * To log information or store information about incidents in a local file or database. Is not
     * necessarily available to external parties but can be used to create transparency on happened
     * events. This action is always evaluated at the consumer side.
     */
    LOG("https://w3id.org/idsa/code/LOG"),

    /**
     * To change a resource locally. This action is always evaluated at the consumer side. It
     * corresponds to 'allow changes of the copied resource'.
     */
    MODIFY("https://w3id.org/idsa/code/MODIFY"),

    /**
     * This action modifies a number by multiplying it to a given value. This action modifies a number
     * by multiplying it to a given value. The field to be modified and the given value are specified in
     * the policy as idsc:JSONPATH/idsc:XPATH and idsc:OPERAND, respectively.
     */
    MULTIPLY("https://w3id.org/idsa/code/MULTIPLY"),

    /**
     * To forward the resource under the same policy. Implies a permission to distribute. This action is
     * always evaluated at the consumer side.
     */
    NEXT_POLICY("https://w3id.org/idsa/code/NEXT_POLICY"),

    /**
     * To log information or notify an instance about incidents. Can be used to define Clearing House
     * interactions. This action can target the consumer and the data provider of the resource.
     */
    NOTIFY("https://w3id.org/idsa/code/NOTIFY"),

    /**
     * To obtain data from the resource. This action is always evaluated at the provider side. It
     * corresponds to 'give access to a resource'.
     */
    READ("https://w3id.org/idsa/code/READ"),

    /**
     * To replace some value. This action modifies a value by replacing it with a given value. The field
     * to be modified and the given value are specified in the policy as idsc:JSONPATH/idsc:XPATH and
     * idsc:REPLACE_WITH, respectively.
     */
    REPLACE("https://w3id.org/idsa/code/REPLACE"),

    /**
     * This action modifies a value by replacing it with an anagram of the value. This action modifies a
     * value by replacing it with an anagram of the value. The field to be modified is specified in the
     * policy as idsc:JSONPATH/idsc:XPATH.
     */
    SHUFFLE("https://w3id.org/idsa/code/SHUFFLE"),

    /**
     * To accept that the use of the Asset may be tracked. This action is always evaluated at the
     * consumer side.
     */
    TRACK_PROVENANCE("https://w3id.org/idsa/code/TRACK_PROVENANCE"),

    /**
     * To use a resource in any possible way. Includes all other actions. This action is always
     * evaluated at the consumer side.
     */
    USE("https://w3id.org/idsa/code/USE"),

    /**
     * To change a remote resource. This action is always evaluated at the provider side. It corresponds
     * to 'allow changes of a resource' but *not* including its deletion.
     */
    WRITE("https://w3id.org/idsa/code/WRITE"),;

    private static final Map<String, DefaultAction> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private Action action;

    DefaultAction(String id) {
        this.action = new ActionBuilder(URI.create(id)).build();
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
        return this.action.getId();
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
        return this.action.getLabel();
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
        return this.action.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.action.getId();
    }

    @JsonCreator
    public static DefaultAction deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.action.getId().toString();
    }

    @Override
    public Action deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:actionRefinement")
    final public List<Constraint> getActionRefinement() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @Override
    public void setActionRefinement(List<Constraint> _actionRefinement_) {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:includedIn")
    final public Action getIncludedIn() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @Override
    public void setIncludedIn(Action _includedIn_) {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @JsonProperty("ids:pxpEndpoint")
    final public PXP getPxpEndpoint() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

    @JsonIgnore

    @Override
    public void setPxpEndpoint(PXP _pxpEndpoint_) {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
