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
	"Logical Constraint"@en

	"The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of Constraints, related with each other through the ids:operand property."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = LogicalConstraintImpl.class),})
public interface LogicalConstraint extends AbstractConstraint {

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
	"and operand"@en

	"The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	
	
	@JsonProperty("ids:and")
	java.util.ArrayList<? extends Constraint> getAnd();
	/**
	"or operand"@en

	"The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	
	
	@JsonProperty("ids:or")
	java.util.ArrayList<? extends Constraint> getOr();
	/**
	"exclusive or"@en

	"The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	
	
	@JsonProperty("ids:xone")
	java.util.ArrayList<? extends Constraint> getXone();
}
