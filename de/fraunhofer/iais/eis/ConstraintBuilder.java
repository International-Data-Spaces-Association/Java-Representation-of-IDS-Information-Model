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

public class ConstraintBuilder {

	private ConstraintImpl constraintImpl;

	public ConstraintBuilder() {
		constraintImpl = new ConstraintImpl();
	}

	public ConstraintBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		constraintImpl.id = id;
	}

	final public ConstraintBuilder _leftOperand_(LeftOperand _leftOperand_) {
		this.constraintImpl._leftOperand = _leftOperand_;
		return this;
	}


	final public ConstraintBuilder _operator_(BinaryOperator _operator_) {
		this.constraintImpl._operator = _operator_;
		return this;
	}


	final public ConstraintBuilder _rightOperand_(de.fraunhofer.iais.eis.util.RdfResource _rightOperand_) {
		this.constraintImpl._rightOperand = _rightOperand_;
		return this;
	}


	final public ConstraintBuilder _rightOperandReference_(URI _rightOperandReference_) {
		this.constraintImpl._rightOperandReference = _rightOperandReference_;
		return this;
	}


	final public ConstraintBuilder _unit_(URI _unit_) {
		this.constraintImpl._unit = _unit_;
		return this;
	}


	final public ConstraintBuilder _pipEndpoint_(URI _pipEndpoint_) {
		this.constraintImpl._pipEndpoint = _pipEndpoint_;
		return this;
	}



	public final Constraint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(constraintImpl);
		return constraintImpl;
	}
}
