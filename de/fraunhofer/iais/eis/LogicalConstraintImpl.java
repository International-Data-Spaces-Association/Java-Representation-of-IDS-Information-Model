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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:LogicalConstraint")
public class LogicalConstraintImpl implements Serializable, LogicalConstraint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Logical Constraint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of Constraints, related with each other through the ids:operand property.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "and operand"@en
	* "The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:and", "and"})
	protected ArrayList<? extends Constraint> _and;


	/**
	* "or operand"@en
	* "The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:or", "or"})
	protected ArrayList<? extends Constraint> _or;


	/**
	* "exclusive or"@en
	* "The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:xone", "xone"})
	protected ArrayList<? extends Constraint> _xone;


	// no manual construction
	protected LogicalConstraintImpl() {
		id = VocabUtil.getInstance().createRandomUrl("logicalConstraint");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the ArrayList of Constraint for the property and.
	* More information under https://w3id.org/idsa/core/and
	*/
	@JsonProperty("ids:and")
	final public ArrayList<? extends Constraint> getAnd() {
		return _and;
	}

	
	/**
	* "The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @param _and_ desired value for the property and.
	* More information under https://w3id.org/idsa/core/and
	*/
	final public void setAnd (ArrayList<? extends Constraint> _and_) {
		this._and = _and_;
	}

	/**
	* "The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the ArrayList of Constraint for the property or.
	* More information under https://w3id.org/idsa/core/or
	*/
	@JsonProperty("ids:or")
	final public ArrayList<? extends Constraint> getOr() {
		return _or;
	}

	
	/**
	* "The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @param _or_ desired value for the property or.
	* More information under https://w3id.org/idsa/core/or
	*/
	final public void setOr (ArrayList<? extends Constraint> _or_) {
		this._or = _or_;
	}

	/**
	* "The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @return Returns the ArrayList of Constraint for the property xone.
	* More information under https://w3id.org/idsa/core/xone
	*/
	@JsonProperty("ids:xone")
	final public ArrayList<? extends Constraint> getXone() {
		return _xone;
	}

	
	/**
	* "The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	* @param _xone_ desired value for the property xone.
	* More information under https://w3id.org/idsa/core/xone
	*/
	final public void setXone (ArrayList<? extends Constraint> _xone_) {
		this._xone = _xone_;
	}



}
