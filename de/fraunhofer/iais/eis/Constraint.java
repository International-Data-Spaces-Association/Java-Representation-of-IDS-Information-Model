package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
	"Constraint"@en

	"The class of Constraints that restrict a Rule."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ConstraintImpl.class),})
public interface Constraint extends AbstractConstraint {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"leftOperand"@en

	"The left operand in a constraint expression."@en
	*/
	
	@NotNull
	@JsonProperty("ids:leftOperand")
	LeftOperand getLeftOperand();
	/**
	"operator"@en

	"The operator function applied to operands of a Constraint"@en
	*/
	
	@NotNull
	@JsonProperty("ids:operator")
	BinaryOperator getOperator();
	/**
	"rightOperand"@en

	"The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	
	
	@JsonProperty("ids:rightOperand")
	de.fraunhofer.iais.eis.util.RdfResource getRightOperand();
	/**
	"rightOperandReference"@en

	"The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	
	
	@JsonProperty("ids:rightOperandReference")
	URI getRightOperandReference();
	/**
	"unit"@en

	"The unit of measurement of a Constraint."@en
	*/
	
	
	@JsonProperty("ids:unit")
	URI getUnit();
	/**
	"has PIP endpoint"@en

	"The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	*/
	
	
	@JsonProperty("ids:pipEndpoint")
	URI getPipEndpoint();
}
