package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * The class of Constraints that restrict a Rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ConstraintImpl.class)
})
public interface Constraint extends ModelClass, AbstractConstraint {

    // standard methods

    /**
     * This function retrieves the ID of the current object (can be set via the constructor of the
     * builder class)
     * 
     * @return ID of current object as URI
     */
    @JsonProperty("@id")
    @NotNull
    public URI getId();

    /**
     * This function retrieves a human readable label about the current class, as defined in the
     * ontology. This label could, for example, be used as a field heading in a user interface
     * 
     * @return Human readable label
     */
    public List<TypedLiteral> getLabel();

    /**
     * This function retrieves a human readable explanatory comment about the current class, as defined
     * in the ontology. This comment could, for example, be used as a tooltip in a user interface
     * 
     * @return Human readable explanatory comment
     */
    public List<TypedLiteral> getComment();

    public String toRdf();

    // getter and setter for generic property map
    public Map<String, Object> getProperties();

    public void setProperty(String property, Object value);

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The left operand in a constraint expression.
     *
     * More information under https://w3id.org/idsa/core/leftOperand
     *
     * @return Returns the LeftOperand for the property _leftOperand.
     */
    @NotNull
    @JsonProperty("ids:leftOperand")
    LeftOperand getLeftOperand();

    /**
     * The left operand in a constraint expression.
     *
     * More information under https://w3id.org/idsa/core/leftOperand
     *
     * @param _leftOperand_ desired value for the property _leftOperand.
     */
    void setLeftOperand(LeftOperand _leftOperand_);

    /**
     * The operator function applied to operands of a Constraint
     *
     * More information under https://w3id.org/idsa/core/operator
     *
     * @return Returns the BinaryOperator for the property _operator.
     */
    @NotNull
    @JsonProperty("ids:operator")
    BinaryOperator getOperator();

    /**
     * The operator function applied to operands of a Constraint
     *
     * More information under https://w3id.org/idsa/core/operator
     *
     * @param _operator_ desired value for the property _operator.
     */
    void setOperator(BinaryOperator _operator_);

    /**
     * The value of the right operand in a constraint expression. Value should be a rdfs:Resource or
     * literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an
     * ids:Constraint.
     *
     * More information under https://w3id.org/idsa/core/rightOperand
     *
     * @return Returns the RdfResource for the property _rightOperand.
     */
    @JsonProperty("ids:rightOperand")
    RdfResource getRightOperand();

    /**
     * The value of the right operand in a constraint expression. Value should be a rdfs:Resource or
     * literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an
     * ids:Constraint.
     *
     * More information under https://w3id.org/idsa/core/rightOperand
     *
     * @param _rightOperand_ desired value for the property _rightOperand.
     */
    void setRightOperand(RdfResource _rightOperand_);

    /**
     * The reference IRI of the right operand in a constraint expression. Has to be dereferenced in
     * order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be
     * used in an ids:Constraint.
     *
     * More information under https://w3id.org/idsa/core/rightOperandReference
     *
     * @return Returns the URI for the property _rightOperandReference.
     */
    @JsonProperty("ids:rightOperandReference")
    URI getRightOperandReference();

    /**
     * The reference IRI of the right operand in a constraint expression. Has to be dereferenced in
     * order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be
     * used in an ids:Constraint.
     *
     * More information under https://w3id.org/idsa/core/rightOperandReference
     *
     * @param _rightOperandReference_ desired value for the property _rightOperandReference.
     */
    void setRightOperandReference(URI _rightOperandReference_);

    /**
     * The unit of measurement of a Constraint.
     *
     * More information under https://w3id.org/idsa/core/unit
     *
     * @return Returns the URI for the property _unit.
     */
    @JsonProperty("ids:unit")
    URI getUnit();

    /**
     * The unit of measurement of a Constraint.
     *
     * More information under https://w3id.org/idsa/core/unit
     *
     * @param _unit_ desired value for the property _unit.
     */
    void setUnit(URI _unit_);

    /**
     * The reference to the endpoint which provides the current state of the feature of interest (as
     * referrenced by the leftOperand) can be retrieved.
     *
     * More information under https://w3id.org/idsa/core/pipEndpoint
     *
     * @return Returns the URI for the property _pipEndpoint.
     */
    @JsonProperty("ids:pipEndpoint")
    URI getPipEndpoint();

    /**
     * The reference to the endpoint which provides the current state of the feature of interest (as
     * referrenced by the leftOperand) can be retrieved.
     *
     * More information under https://w3id.org/idsa/core/pipEndpoint
     *
     * @param _pipEndpoint_ desired value for the property _pipEndpoint.
     */
    void setPipEndpoint(URI _pipEndpoint_);

}
