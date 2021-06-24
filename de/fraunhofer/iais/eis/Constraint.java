package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Constraint"@en
* "The class of Constraints that restrict a Rule."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConstraintImpl.class)
})
public interface Constraint extends AbstractConstraint {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from the IDS Information Model ontology


	/**
	* "The left operand in a constraint expression."@en
	* @return Returns the LeftOperand for the property _leftOperand.
	* More information under https://w3id.org/idsa/core/leftOperand
	*/
	@NotNull
	@JsonProperty("ids:leftOperand")
	public LeftOperand getLeftOperand();

	/**
	* "The operator function applied to operands of a Constraint"@en
	* @return Returns the BinaryOperator for the property _operator.
	* More information under https://w3id.org/idsa/core/operator
	*/
	@NotNull
	@JsonProperty("ids:operator")
	public BinaryOperator getOperator();

	/**
	* "The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @return Returns the RdfResource for the property _rightOperand.
	* More information under https://w3id.org/idsa/core/rightOperand
	*/
	@JsonProperty("ids:rightOperand")
	public RdfResource getRightOperand();

	/**
	* "The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @return Returns the URI for the property _rightOperandReference.
	* More information under https://w3id.org/idsa/core/rightOperandReference
	*/
	@JsonProperty("ids:rightOperandReference")
	public URI getRightOperandReference();

	/**
	* "The unit of measurement of a Constraint."@en
	* @return Returns the URI for the property _unit.
	* More information under https://w3id.org/idsa/core/unit
	*/
	@JsonProperty("ids:unit")
	public URI getUnit();

	/**
	* "The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	* @return Returns the URI for the property _pipEndpoint.
	* More information under https://w3id.org/idsa/core/pipEndpoint
	*/
	@JsonProperty("ids:pipEndpoint")
	public URI getPipEndpoint();

}
