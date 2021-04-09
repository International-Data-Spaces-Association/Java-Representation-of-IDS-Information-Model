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

public class ConnectorEndpointBuilder {

	private ConnectorEndpointImpl connectorEndpointImpl;

	public ConnectorEndpointBuilder() {
		connectorEndpointImpl = new ConnectorEndpointImpl();
	}

	public ConnectorEndpointBuilder(URI id) {
		this();
		connectorEndpointImpl.id = id;
	}

	/**
	* This function allows setting a value for endpointArtifact
	* @param _endpointArtifact_ desired value to be set
	* @return Builder object with new value for endpointArtifact
	*/
	final public ConnectorEndpointBuilder _endpointArtifact_(Artifact _endpointArtifact_) {
		this.connectorEndpointImpl._endpointArtifact = _endpointArtifact_;
		return this;
	}


	/**
	* This function allows setting a value for endpointInformation
	* @param _endpointInformation_ desired value to be set
	* @return Builder object with new value for endpointInformation
	*/
	final public ConnectorEndpointBuilder _endpointInformation_(ArrayList<? extends TypedLiteral> _endpointInformation_) {
		this.connectorEndpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	/**
	* This function allows setting a value for endpointDocumentation
	* @param _endpointDocumentation_ desired value to be set
	* @return Builder object with new value for endpointDocumentation
	*/
	final public ConnectorEndpointBuilder _endpointDocumentation_(ArrayList<? extends URI> _endpointDocumentation_) {
		this.connectorEndpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	/**
	* This function allows setting a value for accessURL
	* @param _accessURL_ desired value to be set
	* @return Builder object with new value for accessURL
	*/
	final public ConnectorEndpointBuilder _accessURL_(URI _accessURL_) {
		this.connectorEndpointImpl._accessURL = _accessURL_;
		return this;
	}


	/**
	* This function allows setting a value for path
	* @param _path_ desired value to be set
	* @return Builder object with new value for path
	*/
	final public ConnectorEndpointBuilder _path_(String _path_) {
		this.connectorEndpointImpl._path = _path_;
		return this;
	}


	/**
	* This function allows setting a value for inboundPath
	* @param _inboundPath_ desired value to be set
	* @return Builder object with new value for inboundPath
	*/
	final public ConnectorEndpointBuilder _inboundPath_(String _inboundPath_) {
		this.connectorEndpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	/**
	* This function allows setting a value for outboundPath
	* @param _outboundPath_ desired value to be set
	* @return Builder object with new value for outboundPath
	*/
	final public ConnectorEndpointBuilder _outboundPath_(String _outboundPath_) {
		this.connectorEndpointImpl._outboundPath = _outboundPath_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ConnectorEndpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorEndpointImpl);
		return connectorEndpointImpl;
	}
}
