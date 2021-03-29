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

	"The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of Constraints, related with each other through the ids:operand property."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:LogicalConstraint")
public class LogicalConstraintImpl implements Serializable, LogicalConstraint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Logical Constraint", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Logical Constraints that restrict a Rule. A Logical Constraints is a collection of Constraints, related with each other through the ids:operand property.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"and operand"@en

	"The \'and\' operand connects a rdf:List of Constraints with the Boolean operator \'AND\'. All Constraints of an \'and\' relation must be satisfied at the same time. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:and", "and"})
	 java.util.ArrayList<? extends Constraint> _and;

	/**
	"or operand"@en

	"The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:or", "or"})
	 java.util.ArrayList<? extends Constraint> _or;

	/**
	"exclusive or"@en

	"The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:xone", "xone"})
	 java.util.ArrayList<? extends Constraint> _xone;

	// no manual construction
	LogicalConstraintImpl() {
		id = VocabUtil.getInstance().createRandomUrl("logicalConstraint");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:and")
	java.util.ArrayList<? extends Constraint> getAnd() {
		return _and;
	}
	final public void setAnd (java.util.ArrayList<? extends Constraint> _and_) {
		this._and = _and_;
	}

	final public 
	
	
	@JsonProperty("ids:or")
	java.util.ArrayList<? extends Constraint> getOr() {
		return _or;
	}
	final public void setOr (java.util.ArrayList<? extends Constraint> _or_) {
		this._or = _or_;
	}

	final public 
	
	
	@JsonProperty("ids:xone")
	java.util.ArrayList<? extends Constraint> getXone() {
		return _xone;
	}
	final public void setXone (java.util.ArrayList<? extends Constraint> _xone_) {
		this._xone = _xone_;
	}



}
