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

public class EndpointBuilder {

	private EndpointImpl endpointImpl;

	public EndpointBuilder() {
		endpointImpl = new EndpointImpl();
	}

	public EndpointBuilder(URI id) {
		this();
		endpointImpl.id = id;
	}

	/**
	* This function allows setting a value for _accessURL
	* @param _accessURL_ desired value to be set
	* @return Builder object with new value for _accessURL
	*/
	final public EndpointBuilder _accessURL_(URI _accessURL_) {
		this.endpointImpl._accessURL = _accessURL_;
		return this;
	}


	/**
	* This function allows setting a value for _endpointInformation
	* @param _endpointInformation_ desired value to be set
	* @return Builder object with new value for _endpointInformation
	*/
	final public EndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
		this.endpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	/**
	* This function allows setting a value for _endpointDocumentation
	* @param _endpointDocumentation_ desired value to be set
	* @return Builder object with new value for _endpointDocumentation
	*/
	final public EndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
		this.endpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	/**
	* This function allows setting a value for _path
	* @param _path_ desired value to be set
	* @return Builder object with new value for _path
	*/
	final public EndpointBuilder _path_(String _path_) {
		this.endpointImpl._path = _path_;
		return this;
	}


	/**
	* This function allows setting a value for _inboundPath
	* @param _inboundPath_ desired value to be set
	* @return Builder object with new value for _inboundPath
	*/
	final public EndpointBuilder _inboundPath_(String _inboundPath_) {
		this.endpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	/**
	* This function allows setting a value for _outboundPath
	* @param _outboundPath_ desired value to be set
	* @return Builder object with new value for _outboundPath
	*/
	final public EndpointBuilder _outboundPath_(String _outboundPath_) {
		this.endpointImpl._outboundPath = _outboundPath_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Endpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(endpointImpl);
		return endpointImpl;
	}
}
