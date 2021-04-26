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

public class AppEndpointBuilder {

	private AppEndpointImpl appEndpointImpl;

	public AppEndpointBuilder() {
		appEndpointImpl = new AppEndpointImpl();
	}

	public AppEndpointBuilder(URI id) {
		this();
		appEndpointImpl.id = id;
	}

	/**
	* This function allows setting a value for _appEndpointType
	* @param _appEndpointType_ desired value to be set
	* @return Builder object with new value for _appEndpointType
	*/
	final public AppEndpointBuilder _appEndpointType_(AppEndpointType _appEndpointType_) {
		this.appEndpointImpl._appEndpointType = _appEndpointType_;
		return this;
	}


	/**
	* This function allows setting a value for _appEndpointPort
	* @param _appEndpointPort_ desired value to be set
	* @return Builder object with new value for _appEndpointPort
	*/
	final public AppEndpointBuilder _appEndpointPort_(BigInteger _appEndpointPort_) {
		this.appEndpointImpl._appEndpointPort = _appEndpointPort_;
		return this;
	}


	/**
	* This function allows setting a value for _appEndpointMediaType
	* @param _appEndpointMediaType_ desired value to be set
	* @return Builder object with new value for _appEndpointMediaType
	*/
	final public AppEndpointBuilder _appEndpointMediaType_(MediaType _appEndpointMediaType_) {
		this.appEndpointImpl._appEndpointMediaType = _appEndpointMediaType_;
		return this;
	}


	/**
	* This function allows setting a value for _appEndpointProtocol
	* @param _appEndpointProtocol_ desired value to be set
	* @return Builder object with new value for _appEndpointProtocol
	*/
	final public AppEndpointBuilder _appEndpointProtocol_(String _appEndpointProtocol_) {
		this.appEndpointImpl._appEndpointProtocol = _appEndpointProtocol_;
		return this;
	}


	/**
	* This function allows setting a value for _language
	* @param _language_ desired value to be set
	* @return Builder object with new value for _language
	*/
	final public AppEndpointBuilder _language_(Language _language_) {
		this.appEndpointImpl._language = _language_;
		return this;
	}


	/**
	* This function allows setting a value for _accessURL
	* @param _accessURL_ desired value to be set
	* @return Builder object with new value for _accessURL
	*/
	final public AppEndpointBuilder _accessURL_(URI _accessURL_) {
		this.appEndpointImpl._accessURL = _accessURL_;
		return this;
	}


	/**
	* This function allows setting a value for _endpointInformation
	* @param _endpointInformation_ desired value to be set
	* @return Builder object with new value for _endpointInformation
	*/
	final public AppEndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
		this.appEndpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	/**
	* This function allows setting a value for _endpointDocumentation
	* @param _endpointDocumentation_ desired value to be set
	* @return Builder object with new value for _endpointDocumentation
	*/
	final public AppEndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
		this.appEndpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	/**
	* This function allows setting a value for _path
	* @param _path_ desired value to be set
	* @return Builder object with new value for _path
	*/
	final public AppEndpointBuilder _path_(String _path_) {
		this.appEndpointImpl._path = _path_;
		return this;
	}


	/**
	* This function allows setting a value for _inboundPath
	* @param _inboundPath_ desired value to be set
	* @return Builder object with new value for _inboundPath
	*/
	final public AppEndpointBuilder _inboundPath_(String _inboundPath_) {
		this.appEndpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	/**
	* This function allows setting a value for _outboundPath
	* @param _outboundPath_ desired value to be set
	* @return Builder object with new value for _outboundPath
	*/
	final public AppEndpointBuilder _outboundPath_(String _outboundPath_) {
		this.appEndpointImpl._outboundPath = _outboundPath_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AppEndpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appEndpointImpl);
		return appEndpointImpl;
	}
}
