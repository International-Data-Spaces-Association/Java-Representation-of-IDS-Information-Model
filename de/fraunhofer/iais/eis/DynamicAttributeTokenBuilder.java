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

public class DynamicAttributeTokenBuilder {

	private DynamicAttributeTokenImpl dynamicAttributeTokenImpl;

	public DynamicAttributeTokenBuilder() {
		dynamicAttributeTokenImpl = new DynamicAttributeTokenImpl();
	}

	public DynamicAttributeTokenBuilder(URI id) {
		this();
		dynamicAttributeTokenImpl.id = id;
	}


	/**
	* This function allows setting a value for tokenValue
	* @param _tokenValue_ desired value to be set
	* @return Builder object with new value for tokenValue
	*/
	final public DynamicAttributeTokenBuilder _tokenValue_(String _tokenValue_) {
		this.dynamicAttributeTokenImpl._tokenValue = _tokenValue_;
		return this;
	}


	/**
	* This function allows setting a value for tokenFormat
	* @param _tokenFormat_ desired value to be set
	* @return Builder object with new value for tokenFormat
	*/
	final public DynamicAttributeTokenBuilder _tokenFormat_(TokenFormat _tokenFormat_) {
		this.dynamicAttributeTokenImpl._tokenFormat = _tokenFormat_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DynamicAttributeToken build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dynamicAttributeTokenImpl);
		return dynamicAttributeTokenImpl;
	}
}
