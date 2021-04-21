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

public class LogicalConstraintBuilder {

	private LogicalConstraintImpl logicalConstraintImpl;

	public LogicalConstraintBuilder() {
		logicalConstraintImpl = new LogicalConstraintImpl();
	}

	public LogicalConstraintBuilder(URI id) {
		this();
		logicalConstraintImpl.id = id;
	}

	/**
	* This function allows setting a value for _and
	* @param _and_ desired value to be set
	* @return Builder object with new value for _and
	*/
	final public LogicalConstraintBuilder _and_(List<Constraint> _and_) {
		this.logicalConstraintImpl._and = _and_;
		return this;
	}


	/**
	* This function allows setting a value for _or
	* @param _or_ desired value to be set
	* @return Builder object with new value for _or
	*/
	final public LogicalConstraintBuilder _or_(List<Constraint> _or_) {
		this.logicalConstraintImpl._or = _or_;
		return this;
	}


	/**
	* This function allows setting a value for _xone
	* @param _xone_ desired value to be set
	* @return Builder object with new value for _xone
	*/
	final public LogicalConstraintBuilder _xone_(List<Constraint> _xone_) {
		this.logicalConstraintImpl._xone = _xone_;
		return this;
	}



	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public LogicalConstraint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(logicalConstraintImpl);
		return logicalConstraintImpl;
	}
}
