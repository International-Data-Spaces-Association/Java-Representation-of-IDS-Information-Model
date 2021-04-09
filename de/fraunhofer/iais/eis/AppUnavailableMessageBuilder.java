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

public class AppUnavailableMessageBuilder {

	private AppUnavailableMessageImpl appUnavailableMessageImpl;

	public AppUnavailableMessageBuilder() {
		appUnavailableMessageImpl = new AppUnavailableMessageImpl();
	}

	public AppUnavailableMessageBuilder(URI id) {
		this();
		appUnavailableMessageImpl.id = id;
	}



	/**
	* This function allows setting a value for affectedResource
	* @param _affectedResource_ desired value to be set
	* @return Builder object with new value for affectedResource
	*/
	final public AppUnavailableMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.appUnavailableMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	/**
	* This function allows setting a value for modelVersion
	* @param _modelVersion_ desired value to be set
	* @return Builder object with new value for modelVersion
	*/
	final public AppUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appUnavailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for issued
	* @param _issued_ desired value to be set
	* @return Builder object with new value for issued
	*/
	final public AppUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appUnavailableMessageImpl._issued = _issued_;
		return this;
	}


	/**
	* This function allows setting a value for issuerConnector
	* @param _issuerConnector_ desired value to be set
	* @return Builder object with new value for issuerConnector
	*/
	final public AppUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appUnavailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	/**
	* This function allows setting a value for recipientConnector
	* @param _recipientConnector_ desired value to be set
	* @return Builder object with new value for recipientConnector
	*/
	final public AppUnavailableMessageBuilder _recipientConnector_(ArrayList<? extends URI> _recipientConnector_) {
		this.appUnavailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	/**
	* This function allows setting a value for securityToken
	* @param _securityToken_ desired value to be set
	* @return Builder object with new value for securityToken
	*/
	final public AppUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appUnavailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	/**
	* This function allows setting a value for senderAgent
	* @param _senderAgent_ desired value to be set
	* @return Builder object with new value for senderAgent
	*/
	final public AppUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appUnavailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	/**
	* This function allows setting a value for recipientAgent
	* @param _recipientAgent_ desired value to be set
	* @return Builder object with new value for recipientAgent
	*/
	final public AppUnavailableMessageBuilder _recipientAgent_(ArrayList<? extends URI> _recipientAgent_) {
		this.appUnavailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	/**
	* This function allows setting a value for correlationMessage
	* @param _correlationMessage_ desired value to be set
	* @return Builder object with new value for correlationMessage
	*/
	final public AppUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appUnavailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	/**
	* This function allows setting a value for authorizationToken
	* @param _authorizationToken_ desired value to be set
	* @return Builder object with new value for authorizationToken
	*/
	final public AppUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appUnavailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	/**
	* This function allows setting a value for transferContract
	* @param _transferContract_ desired value to be set
	* @return Builder object with new value for transferContract
	*/
	final public AppUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.appUnavailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	/**
	* This function allows setting a value for contentVersion
	* @param _contentVersion_ desired value to be set
	* @return Builder object with new value for contentVersion
	*/
	final public AppUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appUnavailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AppUnavailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appUnavailableMessageImpl);
		return appUnavailableMessageImpl;
	}
}
