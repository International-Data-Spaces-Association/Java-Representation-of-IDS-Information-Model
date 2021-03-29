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

	"The class of Constraints that restrict a Rule."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Constraint")
public class ConstraintImpl implements Serializable, Constraint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Constraint", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Constraints that restrict a Rule.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"leftOperand"@en

	"The left operand in a constraint expression."@en
	*/
	@NotNull@JsonAlias({"ids:leftOperand", "leftOperand"})
	 LeftOperand _leftOperand;

	/**
	"operator"@en

	"The operator function applied to operands of a Constraint"@en
	*/
	@NotNull@JsonAlias({"ids:operator", "operator"})
	 BinaryOperator _operator;

	/**
	"has PIP endpoint"@en

	"The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	*/
	@JsonAlias({"ids:pipEndpoint", "pipEndpoint"})
	 URI _pipEndpoint;

	/**
	"rightOperand"@en

	"The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	@JsonAlias({"ids:rightOperand", "rightOperand"})
	 de.fraunhofer.iais.eis.util.RdfResource _rightOperand;

	/**
	"rightOperandReference"@en

	"The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	@JsonAlias({"ids:rightOperandReference", "rightOperandReference"})
	 URI _rightOperandReference;

	/**
	"unit"@en

	"The unit of measurement of a Constraint."@en
	*/
	@JsonAlias({"ids:unit", "unit"})
	 URI _unit;

	// no manual construction
	ConstraintImpl() {
		id = VocabUtil.getInstance().createRandomUrl("constraint");
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
	
	@NotNull
	@JsonProperty("ids:leftOperand")
	LeftOperand getLeftOperand() {
		return _leftOperand;
	}
	final public void setLeftOperand (LeftOperand _leftOperand_) {
		this._leftOperand = _leftOperand_;
	}

	final public 
	
	@NotNull
	@JsonProperty("ids:operator")
	BinaryOperator getOperator() {
		return _operator;
	}
	final public void setOperator (BinaryOperator _operator_) {
		this._operator = _operator_;
	}

	final public 
	
	
	@JsonProperty("ids:rightOperand")
	de.fraunhofer.iais.eis.util.RdfResource getRightOperand() {
		return _rightOperand;
	}
	final public void setRightOperand (de.fraunhofer.iais.eis.util.RdfResource _rightOperand_) {
		this._rightOperand = _rightOperand_;
	}

	final public 
	
	
	@JsonProperty("ids:rightOperandReference")
	URI getRightOperandReference() {
		return _rightOperandReference;
	}
	final public void setRightOperandReference (URI _rightOperandReference_) {
		this._rightOperandReference = _rightOperandReference_;
	}

	final public 
	
	
	@JsonProperty("ids:unit")
	URI getUnit() {
		return _unit;
	}
	final public void setUnit (URI _unit_) {
		this._unit = _unit_;
	}

	final public 
	
	
	@JsonProperty("ids:pipEndpoint")
	URI getPipEndpoint() {
		return _pipEndpoint;
	}
	final public void setPipEndpoint (URI _pipEndpoint_) {
		this._pipEndpoint = _pipEndpoint_;
	}


}
