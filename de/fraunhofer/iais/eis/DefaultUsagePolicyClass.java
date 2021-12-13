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
 * Defined usage policy classes in the IDS.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:UsagePolicyClass")
public enum DefaultUsagePolicyClass implements UsagePolicyClass {

    /**
     * This policy restricts the usage of the data to a specific Data Consumer, regardless of how many
     * connectors they have and without any further usage restriction.
     */
    ALLOW_DATA_USAGE("https://w3id.org/idsa/code/ALLOW_DATA_USAGE"),

    /**
     * This policy restricts the usage of the data to a specific system or application inside an IDS
     * Connector.
     */
    APPLICATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/APPLICATION_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets with the obligation to notify a specific party
     * about the data usage.
     */
    ATTACH_POLICY_FOR_THIRD_PARTY("https://w3id.org/idsa/code/ATTACH_POLICY_FOR_THIRD_PARTY"),

    /**
     * This policy restrict the usage of the data to a specific IDS connector.
     */
    CONNECTOR_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/CONNECTOR_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts transfer of data in return for a monthly fee. The ending is not specified.
     * Nevertheless, the policy ends when a notice of termination has been made by any of the policy
     * partners.
     */
    DATA_RENTAL("https://w3id.org/idsa/code/DATA_RENTAL"),

    /**
     * This policy restricts the usage of data assets with the obligation to encrypt the data asset
     * before distribution.
     */
    DISTRIBUTE_ONLY_IF_ENCRYPTED("https://w3id.org/idsa/code/DISTRIBUTE_ONLY_IF_ENCRYPTED"),

    /**
     * This policy restricts the usage of the data to a specific duration.
     */
    DURATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/DURATION_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets limited to specific events. The ODRL language
     * defines an identified event as a context for exercising the action of the Rule. Events are
     * temporal periods of time. A Data Provider may want to restrict the usage of the data to a
     * specific event when the exact time and date of the event is not clear in advance. Therefore, the
     * event condition can be specified in a policy.
     */
    EVENT_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/EVENT_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of the data to a specific (time) interval.
     */
    INTERVAL_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/INTERVAL_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets with the obligation to log prior specified
     * processes, such as the data access.
     */
    LOCAL_LOGGING("https://w3id.org/idsa/code/LOCAL_LOGGING"),

    /**
     * This policy restricts the usage of the data to a specific location, e.g., expressed via location
     * areas, geographic points or geographic bounding polygons.
     */
    LOCATION_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/LOCATION_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets with the obligation to anonymize the data before
     * permission to use the data is granted. In contrast to the idsc:MODIFY_DATA_IN_TRANSIT policy
     * class, it demands the modifications to be done when data is stored.
     */
    MODIFY_DATA_IN_REST("https://w3id.org/idsa/code/MODIFY_DATA_IN_REST"),

    /**
     * This policy restricts the usage of data assets with the obligation to anonymize the data when it
     * is leaving the Data Provider connector or when it is entering the Data Consumer connector
     */
    MODIFY_DATA_IN_TRANSIT("https://w3id.org/idsa/code/MODIFY_DATA_IN_TRANSIT"),

    /**
     * This policy restricts the transfer of a Data Asset against a one-off payment in a given currency.
     */
    PREPATUAL_DATA_SALE("https://w3id.org/idsa/code/PREPATUAL_DATA_SALE"),

    /**
     * This policy restricts the usage of data assets limited to specific purposes.
     */
    PURPOSE_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/PURPOSE_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets with the obligation to notify a specific party
     * about the data usage.
     */
    REMOTE_NOTIFICATION("https://w3id.org/idsa/code/REMOTE_NOTIFICATION"),

    /**
     * This policy restricts the usage of data assets limited to numeric count of executions of actions.
     * A mechanism is needed that counts the usage of data in order to enforce the policy.
     */
    RESTRICTED_NUMBER_OF_USAGES("https://w3id.org/idsa/code/RESTRICTED_NUMBER_OF_USAGES"),

    /**
     * This policy restricts the usage of the data to a specific role. For example, you can instantiate
     * a policy of this class that allows only the members of the engineering department to use your
     * data. This policy class faces few limitations, i.e., in order to evaluate the conditions, it
     * requires that the user roles are available and follow a common vocabulary
     */
    ROLE_RESTRICTED_DATA_USAGE("https://w3id.org/idsa/code/ROLE_RESTRICTED_DATA_USAGE"),

    /**
     * This policy restricts the usage of data assets limited to a security level the consumer must
     * conform to.
     */
    SECURITY_LEVEL_RESTRICTED_POLICY("https://w3id.org/idsa/code/SECURITY_LEVEL_RESTRICTED_POLICY"),

    /**
     * This policy restricts the usage of data assets limited to specific states. Possible states
     * include, for example, that the contract for the given data asset has not yet expired.
     */
    STATE_RESTRICTED_POLICY("https://w3id.org/idsa/code/STATE_RESTRICTED_POLICY"),

    /**
     * This policy restricts the usage of data assets with the obligation to delete the asset after
     * usage.
     */
    USE_DATA_AND_DELETE_AFTER("https://w3id.org/idsa/code/USE_DATA_AND_DELETE_AFTER"),;

    private static final Map<String, DefaultUsagePolicyClass> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private UsagePolicyClass usagePolicyClass;

    DefaultUsagePolicyClass(String id) {
        this.usagePolicyClass = new UsagePolicyClassBuilder(URI.create(id)).build();
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
        return this.usagePolicyClass.getId();
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
        return this.usagePolicyClass.getLabel();
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
        return this.usagePolicyClass.getComment();
    }

    public String toRdf() {
        return VocabUtil.getInstance().toRdf(this);
    }

    @JsonProperty("@id")
    final public URI getSerializedId() {
        return this.usagePolicyClass.getId();
    }

    @JsonCreator
    public static DefaultUsagePolicyClass deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return this.usagePolicyClass.getId().toString();
    }

    @Override
    public UsagePolicyClass deepCopy() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
