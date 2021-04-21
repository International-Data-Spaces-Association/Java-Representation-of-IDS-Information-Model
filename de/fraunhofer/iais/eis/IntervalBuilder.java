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

public class IntervalBuilder {

	private IntervalImpl intervalImpl;

	public IntervalBuilder() {
		intervalImpl = new IntervalImpl();
	}

	public IntervalBuilder(URI id) {
		this();
		intervalImpl.id = id;
	}

	/**
	* This function allows setting a value for _begin
	* @param _begin_ desired value to be set
	* @return Builder object with new value for _begin
	*/
	final public IntervalBuilder _begin_(Instant _begin_) {
		this.intervalImpl._begin = _begin_;
		return this;
	}


	/**
	* This function allows setting a value for _end
	* @param _end_ desired value to be set
	* @return Builder object with new value for _end
	*/
	final public IntervalBuilder _end_(Instant _end_) {
		this.intervalImpl._end = _end_;
		return this;
	}


	/**
	* This function allows setting a value for _hasDuration
	* @param _hasDuration_ desired value to be set
	* @return Builder object with new value for _hasDuration
	*/
	final public IntervalBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
		this.intervalImpl._hasDuration = _hasDuration_;
		return this;
	}



	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Interval build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(intervalImpl);
		return intervalImpl;
	}
}
