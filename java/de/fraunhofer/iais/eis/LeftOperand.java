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
 * Instances of the LeftOperand class are used as the leftOperand of a Constraint.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("ids:LeftOperand")
public enum LeftOperand implements ModelClass {

    /**
     * The current geospatial position of the *consuming connector*. In case the connector only appears
     * as a virtual entity, the physical location of the hosting server is referenced. Allowed operators
     * are idsc:in. No other spatial operators (close to, north of, etc.) are currently allowed.
     */
    ABSOLUTE_SPATIAL_POSITION("https://w3id.org/idsa/code/ABSOLUTE_SPATIAL_POSITION",
        Arrays.asList(new TypedLiteral("Absolute geo-spatial position", "en")),
        Arrays.asList(new TypedLiteral(
            "The current geospatial position of the *consuming connector*. In case the connector only appears as a virtual entity, the physical location of the hosting server is referenced. Allowed operators are idsc:in. No other spatial operators (close to, north of, etc.) are currently allowed.",
            "en"))),

    /**
     * Numeric count of executions of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT,
     * idsc:GTEQ. Datatype is xsd:double.
     */
    COUNT("https://w3id.org/idsa/code/COUNT", Arrays.asList(new TypedLiteral("count", "en")), Arrays.asList(new TypedLiteral(
        "Numeric count of executions of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.",
        "en"))),

    /**
     * Delay the action. Use idsc:DURATION_EQ, idsc:LONGER, idsc:LONGER_EQ, idsc:SHORTER_EQ, or
     * idsc:SHORTER with datatype xsd:duration.
     */
    DELAY("https://w3id.org/idsa/code/DELAY", Arrays.asList(new TypedLiteral("delay", "en")), Arrays.asList(new TypedLiteral(
        "Delay the action. Use idsc:DURATION_EQ, idsc:LONGER, idsc:LONGER_EQ, idsc:SHORTER_EQ, or idsc:SHORTER with datatype xsd:duration.",
        "en"))),

    /**
     * A continuous elapsed time period which may be used for exercising of the action of the Rule.
     * Allowed operators are idsc:SHORTER, idsc:SHORTER_EQ, idsc:LONGER, idsc:LONGER_EQ, and
     * idsc:DURATION_EQ with datatype xsd:duration.
     */
    ELAPSED_TIME("https://w3id.org/idsa/code/ELAPSED_TIME", Arrays.asList(new TypedLiteral("elapsed time", "en")),
        Arrays.asList(new TypedLiteral(
            "A continuous elapsed time period which may be used for exercising of the action of the Rule. Allowed operators are idsc:SHORTER, idsc:SHORTER_EQ, idsc:LONGER, idsc:LONGER_EQ, and idsc:DURATION_EQ with datatype xsd:duration.",
            "en"))),

    /**
     * Remote target for an action or information provider (PIP). Must be used together with idsc:IS or
     * idsc:IN operators. RightOperand must be a xsd:anyURI or an URL which should point to an actually
     * deployed endpoint. An example is a refinment of idsc:NOTIFY where idsc:REMOTE points to a
     * Clearing House.
     */
    ENDPOINT("https://w3id.org/idsa/code/ENDPOINT", Arrays.asList(new TypedLiteral("endpoint", "")), Arrays.asList(new TypedLiteral(
        "Remote target for an action or information provider (PIP). Must be used together with idsc:IS or idsc:IN operators. RightOperand must be a xsd:anyURI or an URL which should point to an actually deployed endpoint. An example is a refinment of idsc:NOTIFY where idsc:REMOTE points to a Clearing House.",
        "en"))),

    /**
     * The feature dimension regarding whether current events are happening. Does NOT refer 'events' as
     * in real-time data, sensor observations, or Complex Event Processing but rather as 'World Cup
     * 2018' or 'Hannover Trade Fair'.
     */
    EVENT("https://w3id.org/idsa/code/EVENT", Arrays.asList(new TypedLiteral("current event", "en")), Arrays.asList(new TypedLiteral(
        "The feature dimension regarding whether current events are happening. Does NOT refer 'events' as in real-time data, sensor observations, or Complex Event Processing but rather as 'World Cup 2018' or 'Hannover Trade Fair'.",
        "en"))),

    /**
     * Path to specific attribute (default JsonPath). Must be used together with idsc:STRING_EQ,
     * idsc:STRING_CONTAINS, idsc:STRING_IS_CONTAINED, or idsc:MATCHES operators. RightOperand must be a
     * xsd:string.
     */
    PATH("https://w3id.org/idsa/code/PATH", Arrays.asList(new TypedLiteral("path to attribute", "")), Arrays.asList(new TypedLiteral(
        "Path to specific attribute (default JsonPath). Must be used together with idsc:STRING_EQ, idsc:STRING_CONTAINS, idsc:STRING_IS_CONTAINED, or idsc:MATCHES operators. RightOperand must be a xsd:string.",
        "en"))),

    /**
     * Monetary payment, without any further sepcification on the type, amount or purpose.
     */
    PAYMENT("https://w3id.org/idsa/code/PAYMENT", Arrays.asList(new TypedLiteral("payment", "en")),
        Arrays.asList(new TypedLiteral("Monetary payment, without any further sepcification on the type, amount or purpose.", "en"))),

    /**
     * Monetary amount to pay, usually used with idsc:EQ. Datatype is double. Currency required.
     */
    PAY_AMOUNT("https://w3id.org/idsa/code/PAY_AMOUNT", Arrays.asList(new TypedLiteral("payAmount", "en")),
        Arrays.asList(new TypedLiteral("Monetary amount to pay, usually used with idsc:EQ. Datatype is double. Currency required.", "en"))),

    /**
     * The current system time (as UTC xsd:dateTimeStamp) for evaluating a time-related constraint.
     * Allowed operators are idsc:AFTER, idsc:BEFORE, idsc:CONTAINS, idsc:TEMPORAL_DISJOINT,
     * idsc:DURING, idsc:TEMPORAL_EQUALS, idsc:FINISHED_BY, idsc:FINISHES, idsc:MEETS, idsc:MET_BY,
     * idsc:OVERLAPS, idsc:OVERLAPPED_BY, idsc:STARTS, idsc:STARTED_BY and idsc:DURATION_EQ with
     * RightOperand ids:TemporalEntity.
     */
    POLICY_EVALUATION_TIME("https://w3id.org/idsa/code/POLICY_EVALUATION_TIME",
        Arrays.asList(new TypedLiteral("policy evaluation time", "en")),
        Arrays.asList(new TypedLiteral(
            "The current system time (as UTC xsd:dateTimeStamp) for evaluating a time-related constraint. Allowed operators are idsc:AFTER, idsc:BEFORE, idsc:CONTAINS, idsc:TEMPORAL_DISJOINT, idsc:DURING, idsc:TEMPORAL_EQUALS, idsc:FINISHED_BY, idsc:FINISHES, idsc:MEETS, idsc:MET_BY, idsc:OVERLAPS, idsc:OVERLAPPED_BY, idsc:STARTS, idsc:STARTED_BY and idsc:DURATION_EQ with RightOperand ids:TemporalEntity.",
            "en"))),

    /**
     * A defined purpose for exercising the action of the Rule. Use with idsc:IN or idsc:SAME_AS and RDF
     * Resources.
     */
    PURPOSE("https://w3id.org/idsa/code/PURPOSE", Arrays.asList(new TypedLiteral("purpose", "en")), Arrays.asList(new TypedLiteral(
        "A defined purpose for exercising the action of the Rule. Use with idsc:IN or idsc:SAME_AS and RDF Resources.", "en"))),

    /**
     * Quantity limitation for exercising the action of the Rule. Operators can be idsc:LT, idsc:LTEQ,
     * idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.
     */
    QUANTITY("https://w3id.org/idsa/code/QUANTITY", Arrays.asList(new TypedLiteral("quantity", "")), Arrays.asList(new TypedLiteral(
        "Quantity limitation for exercising the action of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.",
        ""))),

    /**
     * The limit how often exercising the action of the Rule may be possible. Operators can be idsc:LT,
     * idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.
     */
    RECURRENCE_RATE("https://w3id.org/idsa/code/RECURRENCE_RATE", Arrays.asList(new TypedLiteral("recurrence rate", "")),
        Arrays.asList(new TypedLiteral(
            "The limit how often exercising the action of the Rule may be possible. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.",
            ""))),

    /**
     * The security level the consuming connector must have. Use together with idsc:SAME_AS or idsc:IN.
     * The value decides which attribute dimension is regarded.
     */
    SECURITY_LEVEL("https://w3id.org/idsa/code/SECURITY_LEVEL", Arrays.asList(new TypedLiteral("security level", "")),
        Arrays.asList(new TypedLiteral(
            "The security level the consuming connector must have. Use together with idsc:SAME_AS or idsc:IN. The value decides which attribute dimension is regarded.",
            "en"))),

    /**
     * Specifies whether an (external) resource is true/false, active/inactive, has happened/not
     * happened, etc. Operator must be idsc:EQUALS with RightOperands of datatype xsd:anyURI. The
     * referenced URI should point to a (remote) resource which returns a xsd:boolean value.
     */
    STATE("https://w3id.org/idsa/code/STATE", Arrays.asList(new TypedLiteral("state", "en")), Arrays.asList(new TypedLiteral(
        "Specifies whether an (external) resource is true/false, active/inactive, has happened/not happened, etc. Operator must be idsc:EQUALS with RightOperands of datatype xsd:anyURI. The referenced URI should point to a (remote) resource which returns a xsd:boolean value.",
        "en"))),

    /**
     * Execution system or execution environment that is used to access the asset under consideration,
     * usually an IDS Connector. The regarded data object should correspond to the IDS Connector class
     * and its attributes. Must be used together with idsc:SAME_AS, idsc:NOT, idsc:HAS_STATE, idsc:IN,
     * idsc:COVERED_BY idsc:INSIDE, idsc:SPATIAL_EQUALS, idsc:DISJOINT, or idsc:INSIDE_NETWORK
     * operators. RightOperandReference must be a URI identifying the target system(s).
     */
    SYSTEM("https://w3id.org/idsa/code/SYSTEM", Arrays.asList(new TypedLiteral("execution system", "")), Arrays.asList(new TypedLiteral(
        "Execution system or execution environment that is used to access the asset under consideration, usually an IDS Connector. The regarded data object should correspond to the IDS Connector class and its attributes. Must be used together with idsc:SAME_AS, idsc:NOT, idsc:HAS_STATE, idsc:IN, idsc:COVERED_BY idsc:INSIDE, idsc:SPATIAL_EQUALS, idsc:DISJOINT, or idsc:INSIDE_NETWORK operators. RightOperandReference must be a URI identifying the target system(s).",
        "en"))),

    /**
     * The user of a system at the *consuming connector* requesting access to a resource. Recommended
     * usage for checking whether the user's role is sufficient for his/her desired action. Allowed
     * operators are idsc:MEMBER_OF, idsc:HAS_MEMBERSHIP, idsc:HAS_SITE with a RightOperand referencing
     * a (set of) acceptable organisations (ids:Participant),memberships, sites. Preferred behaviour is
     * that the RightOperand dereferences to an endpoint hosting the required role information.
     */
    USER("https://w3id.org/idsa/code/USER", Arrays.asList(new TypedLiteral("user", "en")), Arrays.asList(new TypedLiteral(
        "The user of a system at the *consuming connector* requesting access to a resource. Recommended usage for checking whether the user's role is sufficient for his/her desired action. Allowed operators are idsc:MEMBER_OF, idsc:HAS_MEMBERSHIP, idsc:HAS_SITE with a RightOperand referencing a (set of) acceptable organisations (ids:Participant),memberships, sites. Preferred behaviour is that the RightOperand dereferences to an endpoint hosting the required role information.",
        "en")));

    private static final Map<String, LeftOperand> uriInstanceMapping;
    static {
        uriInstanceMapping = new HashMap<>();
        uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
        uriInstanceMapping
            .putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
    }

    private URI id;
    private List<TypedLiteral> label;
    private List<TypedLiteral> comment;

    LeftOperand(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
    public static LeftOperand deserialize(JsonNode node) {
        return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
    }

    @Override
    public String toString() {
        return id.toString();
    }

    @JsonIgnore

    @JsonProperty("ids:broader")
    final public LeftOperand getBroader() {
        // not implemented for enums
        throw new UnsupportedOperationException();
    }

}
