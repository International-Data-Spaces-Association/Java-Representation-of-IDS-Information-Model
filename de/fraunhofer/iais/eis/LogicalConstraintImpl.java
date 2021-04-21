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
	protected List<Constraint> _and;


	/**
	* "or operand"@en
	* "The \'or\' operand connects a rdf:List of Constraints with the Boolean operator \'OR\'. At least one Constraint of an \'or\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:or", "or"})
	protected List<Constraint> _or;


	/**
	* "exclusive or"@en
	* "The \'xone\' operand connects a rdf:List of Constraints. Only one Constraint, not more, of an \'xone\' relation must be satisfied. Only one of ids:and, ids:or, or ids:xone can be used for a specific ids:LogicalConstraint!"@en
	*/
	@JsonAlias({"ids:xone", "xone"})
	protected List<Constraint> _xone;


	// no manual construction
	protected LogicalConstraintImpl() {
		id = VocabUtil.getInstance().createRandomUrl("logicalConstraint");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	public int hashCode() {
		return Objects.hash(new Object[]{this._and,
			this._or,
			this._xone});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			LogicalConstraintImpl other = (LogicalConstraintImpl) obj;
			return Objects.equals(this._and, other._and) &&
				Objects.equals(this._or, other._or) &&
				Objects.equals(this._xone, other._xone);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@JsonProperty("ids:and")
	final public List<Constraint> getAnd() {
		return _and;
	}
	
	final public void setAnd (List<Constraint> _and_) {
		this._and = _and_;
	}

	@JsonProperty("ids:or")
	final public List<Constraint> getOr() {
		return _or;
	}
	
	final public void setOr (List<Constraint> _or_) {
		this._or = _or_;
	}

	@JsonProperty("ids:xone")
	final public List<Constraint> getXone() {
		return _xone;
	}
	
	final public void setXone (List<Constraint> _xone_) {
		this._xone = _xone_;
	}



}
