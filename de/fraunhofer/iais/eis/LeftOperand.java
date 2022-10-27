package de.fraunhofer.iais.eis;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.fraunhofer.iais.eis.util.*;

/**
 * Instances of the LeftOperand class are used as the leftOperand of a Constraint.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = LeftOperandImpl.class)
})
public interface LeftOperand extends ModelClass {

    // standard methods

    @Beta
    public LeftOperand deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * This LeftOperand is transitively included in the object LeftOperand.
     *
     * More information under https://w3id.org/idsa/core/broader
     *
     * @return Returns the LeftOperand for the property _broader.
     */
    @JsonAlias({"https://w3id.org/idsa/core/broader", "ids:broader", "broader"})
    LeftOperand getBroader();

    /**
     * This LeftOperand is transitively included in the object LeftOperand.
     *
     * More information under https://w3id.org/idsa/core/broader
     *
     * @param _broader_ desired value for the property _broader.
     */
    void setBroader(LeftOperand _broader_);

    // Default instances of this class as defined in the ontology

    /**
     * The current geospatial position of the *consuming connector*. In case the connector only appears
     * as a virtual entity, the physical location of the hosting server is referenced. Allowed operators
     * are idsc:in. No other spatial operators (close to, north of, etc.) are currently allowed.
     */
    LeftOperand ABSOLUTE_SPATIAL_POSITION =
        new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/ABSOLUTE_SPATIAL_POSITION")).build();

    /**
     * An application is a program or piece of software designed to fulfill a particular purpose. For
     * example, a certified IDS App.
     */
    LeftOperand APPLICATION = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/APPLICATION")).build();

    /**
     * Suggested values exist in the Information Model : idsc:ANONYMIZED, idsc:PSEUDONYMIZED,
     * idsc:ENCRYPTED, idsc:COMBINED.
     */
    LeftOperand ARTIFACT_STATE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/ARTIFACT_STATE")).build();

    /**
     * Accepts an IDS connector URI.
     */
    LeftOperand CONNECTOR = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/CONNECTOR")).build();

    /**
     * Numeric count of executions of the Rule. Operators can be idsc:LT, idsc:LTEQ, idsc:EQ, idsc:GT,
     * idsc:GTEQ. Datatype is xsd:double.
     */
    LeftOperand COUNT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/COUNT")).build();

    /**
     * The date and time of exercising the action of the Rule. Right operand value must be an
     * xsd:dateTimeStamp.
     */
    LeftOperand DATE_TIME = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/DATE_TIME")).build();

    /**
     * Delay the action. Use idsc:DURATION_EQ, idsc:LONGER, idsc:LONGER_EQ, idsc:SHORTER_EQ, or
     * idsc:SHORTER with datatype xsd:duration.
     */
    LeftOperand DELAY = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/DELAY")).build();

    /**
     * A continuous elapsed time period which may be used for exercising of the action of the Rule.
     * Allowed operators are idsc:SHORTER, idsc:SHORTER_EQ, idsc:LONGER, idsc:LONGER_EQ, and
     * idsc:DURATION_EQ with datatype xsd:duration.
     */
    LeftOperand ELAPSED_TIME = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/ELAPSED_TIME")).build();

    /**
     * Remote target for an action or information provider (PIP). Must be used together with idsc:IS or
     * idsc:IN operators. RightOperand must be a xsd:anyURI or an URL which should point to an actually
     * deployed endpoint. An example is a refinement of idsc:NOTIFY where idsc:REMOTE points to a
     * Clearing House.
     */
    LeftOperand ENDPOINT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/ENDPOINT")).build();

    /**
     * The feature dimension regarding whether current events are happening. Does NOT refer 'events' as
     * in real-time data, sensor observations, or Complex Event Processing but rather as 'World Cup
     * 2018' or 'Hannover Trade Fair'.
     */
    LeftOperand EVENT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/EVENT")).build();

    /**
     * Indicate the hash value to be used, eg.SHA256.
     */
    LeftOperand HASH_ALGORITHM = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/HASH_ALGORITHM")).build();

    /**
     * An expression that refers to a part of a JSON structured data.
     */
    LeftOperand JSON_PATH = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/JSON_PATH")).build();

    /**
     * Accepted values: ON_DENY, ON_ALLOW, ON_DUTY_EXERCISED, ON_ACTION_OPERATED.
     */
    LeftOperand LOG_LEVEL = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/LOG_LEVEL")).build();

    /**
     * Similar to the idsc:LOG_LEVEL.
     */
    LeftOperand NOTIFICATION_LEVEL = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/NOTIFICATION_LEVEL")).build();

    /**
     * To indicate the second operand value for the Actions idsc:ADD, idsc:MULTIPLY and idsc:DIVIDE.
     */
    LeftOperand OPERAND = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/OPERAND")).build();

    /**
     * Path to specific attribute (default JsonPath). Must be used together with idsc:STRING_EQ,
     * idsc:STRING_CONTAINS, idsc:STRING_IS_CONTAINED, or idsc:MATCHES operators. RightOperand must be a
     * xsd:string.
     */
    LeftOperand PATH = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/PATH")).build();

    /**
     * Monetary payment, without any further sepcification on the type, amount or purpose.
     */
    LeftOperand PAYMENT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/PAYMENT")).build();

    /**
     * Monetary amount to pay, usually used with idsc:EQ. Datatype is double. Currency required.
     */
    LeftOperand PAY_AMOUNT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/PAY_AMOUNT")).build();

    /**
     * The current system time (as UTC xsd:dateTimeStamp) for evaluating a time-related constraint.
     * Allowed operators are idsc:AFTER, idsc:BEFORE, idsc:CONTAINS, idsc:TEMPORAL_DISJOINT,
     * idsc:DURING, idsc:TEMPORAL_EQUALS, idsc:FINISHED_BY, idsc:FINISHES, idsc:MEETS, idsc:MET_BY,
     * idsc:OVERLAPS, idsc:OVERLAPPED_BY, idsc:STARTS, idsc:STARTED_BY and idsc:DURATION_EQ with
     * RightOperand ids:TemporalEntity.
     */
    LeftOperand POLICY_EVALUATION_TIME = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/POLICY_EVALUATION_TIME")).build();

    /**
     * A defined purpose for exercising the action of the Rule. Use with idsc:IN or idsc:SAME_AS and RDF
     * Resources.
     */
    LeftOperand PURPOSE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/PURPOSE")).build();

    /**
     * Quantity limitation for exercising the action of the Rule. Operators can be idsc:LT, idsc:LTEQ,
     * idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.
     */
    LeftOperand QUANTITY = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/QUANTITY")).build();

    /**
     * For example, the recipient of the notify/inform action.
     */
    LeftOperand RECIPIENT = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/RECIPIENT")).build();

    /**
     * The limit how often exercising the action of the Rule may be possible. Operators can be idsc:LT,
     * idsc:LTEQ, idsc:EQ, idsc:GT, idsc:GTEQ. Datatype is xsd:double.
     */
    LeftOperand RECURRENCE_RATE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/RECURRENCE_RATE")).build();

    /**
     * Specifies a new value for a specific field. The action must be idsc:REPLACE and the operator must
     * be idsc:EQUALS.
     */
    LeftOperand REPLACE_WITH = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/REPLACE_WITH")).build();

    /**
     * As end user role, not the IDS participant type.
     */
    LeftOperand ROLE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/ROLE")).build();

    /**
     * The security level the consuming connector must have. Use together with idsc:SAME_AS or idsc:IN.
     * The value decides which attribute dimension is regarded.
     */
    LeftOperand SECURITY_LEVEL = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/SECURITY_LEVEL")).build();

    /**
     * Specifies whether an (external) resource is true/false, active/inactive, has happened/not
     * happened, etc. Operator must be idsc:EQUALS with RightOperands of datatype xsd:anyURI. The
     * referenced URI should point to a (remote) resource which returns a xsd:boolean value.
     */
    LeftOperand STATE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/STATE")).build();

    /**
     * Execution system or execution environment that is used to access the asset under consideration,
     * usually an IDS Connector. The regarded data object should correspond to the IDS Connector class
     * and its attributes. Must be used together with idsc:SAME_AS, idsc:NOT, idsc:HAS_STATE, idsc:IN,
     * idsc:COVERED_BY idsc:INSIDE, idsc:SPATIAL_EQUALS, idsc:DISJOINT, or idsc:INSIDE_NETWORK
     * operators. RightOperandReference must be a URI identifying the target system(s).
     */
    LeftOperand SYSTEM = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/SYSTEM")).build();

    /**
     * The ODRL definitions is “An identified computing system or computing device used for exercising
     * the action of the Rule.�?
     */
    LeftOperand SYSTEM_DEVICE = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/SYSTEM_DEVICE")).build();

    /**
     * In order to attach/address a policy to a contract.
     */
    LeftOperand TARGET_POLICY = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/TARGET_POLICY")).build();

    /**
     * The user of a system at the *consuming connector* requesting access to a resource. Recommended
     * usage for checking whether the user's role is sufficient for his/her desired action. Allowed
     * operators are idsc:MEMBER_OF, idsc:HAS_MEMBERSHIP, idsc:HAS_SITE with a RightOperand referencing
     * a (set of) acceptable organisations (ids:Participant),memberships, sites. Preferred behaviour is
     * that the RightOperand dereferences to an endpoint hosting the required role information.
     */
    LeftOperand USER = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/USER")).build();

    /**
     * An expression that refers to specific elements of an XML document.
     */
    LeftOperand XPATH = new LeftOperandBuilder(URI.create("https://w3id.org/idsa/code/XPATH")).build();

}
