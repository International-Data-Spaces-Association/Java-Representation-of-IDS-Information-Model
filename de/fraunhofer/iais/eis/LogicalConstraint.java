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
* "Logical Constraint"@en
* "The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of Constraints, related with each other through the ids:operand property."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = LogicalConstraintImpl.class)
})
public interface LogicalConstraint extends AbstractConstraint {

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
	* "The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the List of Constraints for the property _and.
	* More information under https://w3id.org/idsa/core/and
	*/
	@JsonProperty("ids:and")
	public List<Constraint> getAnd();

	/**
	* "The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the List of Constraints for the property _or.
	* More information under https://w3id.org/idsa/core/or
	*/
	@JsonProperty("ids:or")
	public List<Constraint> getOr();

	/**
	* "The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the List of Constraints for the property _xone.
	* More information under https://w3id.org/idsa/core/xone
	*/
	@JsonProperty("ids:xone")
	public List<Constraint> getXone();

}
