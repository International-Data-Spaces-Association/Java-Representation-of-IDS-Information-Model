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
* "Constraint"@en
* "The class of Constraints that restrict a Rule."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Constraint")
public class ConstraintImpl implements Serializable, Constraint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Constraint", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("The class of Constraints that restrict a Rule.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "leftOperand"@en
	* "The left operand in a constraint expression."@en
	*/
	@NotNull
	@JsonAlias({"ids:leftOperand", "leftOperand"})
	protected LeftOperand _leftOperand;


	/**
	* "operator"@en
	* "The operator function applied to operands of a Constraint"@en
	*/
	@NotNull
	@JsonAlias({"ids:operator", "operator"})
	protected BinaryOperator _operator;


	/**
	* "has PIP endpoint"@en
	* "The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	*/
	@JsonAlias({"ids:pipEndpoint", "pipEndpoint"})
	protected URI _pipEndpoint;


	/**
	* "rightOperand"@en
	* "The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	@JsonAlias({"ids:rightOperand", "rightOperand"})
	protected RdfResource _rightOperand;


	/**
	* "rightOperandReference"@en
	* "The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	*/
	@JsonAlias({"ids:rightOperandReference", "rightOperandReference"})
	protected URI _rightOperandReference;


	/**
	* "unit"@en
	* "The unit of measurement of a Constraint."@en
	*/
	@JsonAlias({"ids:unit", "unit"})
	protected URI _unit;


	// no manual construction
	protected ConstraintImpl() {
		id = VocabUtil.getInstance().createRandomUrl("constraint");
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
	* "The left operand in a constraint expression."@en
	* @return Returns the LeftOperand for the property leftOperand.
	* More information under https://w3id.org/idsa/core/leftOperand
	*/
	@NotNull
	@JsonProperty("ids:leftOperand")
	final public LeftOperand getLeftOperand() {
		return _leftOperand;
	}

	
	/**
	* "The left operand in a constraint expression."@en
	* @param _leftOperand_ desired value for the property leftOperand.
	* More information under https://w3id.org/idsa/core/leftOperand
	*/
	final public void setLeftOperand (LeftOperand _leftOperand_) {
		this._leftOperand = _leftOperand_;
	}

	/**
	* "The operator function applied to operands of a Constraint"@en
	* @return Returns the BinaryOperator for the property operator.
	* More information under https://w3id.org/idsa/core/operator
	*/
	@NotNull
	@JsonProperty("ids:operator")
	final public BinaryOperator getOperator() {
		return _operator;
	}

	
	/**
	* "The operator function applied to operands of a Constraint"@en
	* @param _operator_ desired value for the property operator.
	* More information under https://w3id.org/idsa/core/operator
	*/
	final public void setOperator (BinaryOperator _operator_) {
		this._operator = _operator_;
	}

	/**
	* "The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @return Returns the RdfResource for the property rightOperand.
	* More information under https://w3id.org/idsa/core/rightOperand
	*/
	@JsonProperty("ids:rightOperand")
	final public RdfResource getRightOperand() {
		return _rightOperand;
	}

	
	/**
	* "The value of the right operand in a constraint expression. Value should be a rdfs:Resource or literal values. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @param _rightOperand_ desired value for the property rightOperand.
	* More information under https://w3id.org/idsa/core/rightOperand
	*/
	final public void setRightOperand (RdfResource _rightOperand_) {
		this._rightOperand = _rightOperand_;
	}

	/**
	* "The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @return Returns the URI for the property rightOperandReference.
	* More information under https://w3id.org/idsa/core/rightOperandReference
	*/
	@JsonProperty("ids:rightOperandReference")
	final public URI getRightOperandReference() {
		return _rightOperandReference;
	}

	
	/**
	* "The reference IRI of the right operand in a constraint expression. Has to be dereferenced in order to receive the actual value. Either ids:rightOperand or ids:rightOperandReference should be used in an ids:Constraint."@en
	* @param _rightOperandReference_ desired value for the property rightOperandReference.
	* More information under https://w3id.org/idsa/core/rightOperandReference
	*/
	final public void setRightOperandReference (URI _rightOperandReference_) {
		this._rightOperandReference = _rightOperandReference_;
	}

	/**
	* "The unit of measurement of a Constraint."@en
	* @return Returns the URI for the property unit.
	* More information under https://w3id.org/idsa/core/unit
	*/
	@JsonProperty("ids:unit")
	final public URI getUnit() {
		return _unit;
	}

	
	/**
	* "The unit of measurement of a Constraint."@en
	* @param _unit_ desired value for the property unit.
	* More information under https://w3id.org/idsa/core/unit
	*/
	final public void setUnit (URI _unit_) {
		this._unit = _unit_;
	}

	/**
	* "The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	* @return Returns the URI for the property pipEndpoint.
	* More information under https://w3id.org/idsa/core/pipEndpoint
	*/
	@JsonProperty("ids:pipEndpoint")
	final public URI getPipEndpoint() {
		return _pipEndpoint;
	}

	
	/**
	* "The reference to the endpoint which provides the current state of the feature of interest (as referrenced by the leftOperand) can be retrieved."@en
	* @param _pipEndpoint_ desired value for the property pipEndpoint.
	* More information under https://w3id.org/idsa/core/pipEndpoint
	*/
	final public void setPipEndpoint (URI _pipEndpoint_) {
		this._pipEndpoint = _pipEndpoint_;
	}


}
