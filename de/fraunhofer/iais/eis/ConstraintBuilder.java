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

public class ConstraintBuilder {

	private ConstraintImpl constraintImpl;

	public ConstraintBuilder() {
		constraintImpl = new ConstraintImpl();
	}

	public ConstraintBuilder(URI id) {
		this();
		constraintImpl.id = id;
	}

	/**
	* This function allows setting a value for _leftOperand
	* @param _leftOperand_ desired value to be set
	* @return Builder object with new value for _leftOperand
	*/
	final public ConstraintBuilder _leftOperand_(LeftOperand _leftOperand_) {
		this.constraintImpl._leftOperand = _leftOperand_;
		return this;
	}


	/**
	* This function allows setting a value for _operator
	* @param _operator_ desired value to be set
	* @return Builder object with new value for _operator
	*/
	final public ConstraintBuilder _operator_(BinaryOperator _operator_) {
		this.constraintImpl._operator = _operator_;
		return this;
	}


	/**
	* This function allows setting a value for _rightOperand
	* @param _rightOperand_ desired value to be set
	* @return Builder object with new value for _rightOperand
	*/
	final public ConstraintBuilder _rightOperand_(RdfResource _rightOperand_) {
		this.constraintImpl._rightOperand = _rightOperand_;
		return this;
	}


	/**
	* This function allows setting a value for _rightOperandReference
	* @param _rightOperandReference_ desired value to be set
	* @return Builder object with new value for _rightOperandReference
	*/
	final public ConstraintBuilder _rightOperandReference_(URI _rightOperandReference_) {
		this.constraintImpl._rightOperandReference = _rightOperandReference_;
		return this;
	}


	/**
	* This function allows setting a value for _unit
	* @param _unit_ desired value to be set
	* @return Builder object with new value for _unit
	*/
	final public ConstraintBuilder _unit_(URI _unit_) {
		this.constraintImpl._unit = _unit_;
		return this;
	}


	/**
	* This function allows setting a value for _pipEndpoint
	* @param _pipEndpoint_ desired value to be set
	* @return Builder object with new value for _pipEndpoint
	*/
	final public ConstraintBuilder _pipEndpoint_(URI _pipEndpoint_) {
		this.constraintImpl._pipEndpoint = _pipEndpoint_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Constraint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(constraintImpl);
		return constraintImpl;
	}
}
