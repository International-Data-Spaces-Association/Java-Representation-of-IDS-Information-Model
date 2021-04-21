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

public class AppDeleteMessageBuilder {

	private AppDeleteMessageImpl appDeleteMessageImpl;

	public AppDeleteMessageBuilder() {
		appDeleteMessageImpl = new AppDeleteMessageImpl();
	}

	public AppDeleteMessageBuilder(URI id) {
		this();
		appDeleteMessageImpl.id = id;
	}



	/**
	* This function allows setting a value for _affectedResource
	* @param _affectedResource_ desired value to be set
	* @return Builder object with new value for _affectedResource
	*/
	final public AppDeleteMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.appDeleteMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	/**
	* This function allows setting a value for _modelVersion
	* @param _modelVersion_ desired value to be set
	* @return Builder object with new value for _modelVersion
	*/
	final public AppDeleteMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appDeleteMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _issued
	* @param _issued_ desired value to be set
	* @return Builder object with new value for _issued
	*/
	final public AppDeleteMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appDeleteMessageImpl._issued = _issued_;
		return this;
	}


	/**
	* This function allows setting a value for _issuerConnector
	* @param _issuerConnector_ desired value to be set
	* @return Builder object with new value for _issuerConnector
	*/
	final public AppDeleteMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appDeleteMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	/**
	* This function allows setting a value for _recipientConnector
	* @param _recipientConnector_ desired value to be set
	* @return Builder object with new value for _recipientConnector
	*/
	final public AppDeleteMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
		this.appDeleteMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	/**
	* This function allows setting a value for _securityToken
	* @param _securityToken_ desired value to be set
	* @return Builder object with new value for _securityToken
	*/
	final public AppDeleteMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appDeleteMessageImpl._securityToken = _securityToken_;
		return this;
	}


	/**
	* This function allows setting a value for _senderAgent
	* @param _senderAgent_ desired value to be set
	* @return Builder object with new value for _senderAgent
	*/
	final public AppDeleteMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appDeleteMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _recipientAgent
	* @param _recipientAgent_ desired value to be set
	* @return Builder object with new value for _recipientAgent
	*/
	final public AppDeleteMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
		this.appDeleteMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _correlationMessage
	* @param _correlationMessage_ desired value to be set
	* @return Builder object with new value for _correlationMessage
	*/
	final public AppDeleteMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appDeleteMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	/**
	* This function allows setting a value for _authorizationToken
	* @param _authorizationToken_ desired value to be set
	* @return Builder object with new value for _authorizationToken
	*/
	final public AppDeleteMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appDeleteMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	/**
	* This function allows setting a value for _transferContract
	* @param _transferContract_ desired value to be set
	* @return Builder object with new value for _transferContract
	*/
	final public AppDeleteMessageBuilder _transferContract_(URI _transferContract_) {
		this.appDeleteMessageImpl._transferContract = _transferContract_;
		return this;
	}


	/**
	* This function allows setting a value for _contentVersion
	* @param _contentVersion_ desired value to be set
	* @return Builder object with new value for _contentVersion
	*/
	final public AppDeleteMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appDeleteMessageImpl._contentVersion = _contentVersion_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AppDeleteMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appDeleteMessageImpl);
		return appDeleteMessageImpl;
	}
}
