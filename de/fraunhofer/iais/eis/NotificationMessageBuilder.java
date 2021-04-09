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

public class NotificationMessageBuilder {

	private NotificationMessageImpl notificationMessageImpl;

	public NotificationMessageBuilder() {
		notificationMessageImpl = new NotificationMessageImpl();
	}

	public NotificationMessageBuilder(URI id) {
		this();
		notificationMessageImpl.id = id;
	}


	/**
	* This function allows setting a value for modelVersion
	* @param _modelVersion_ desired value to be set
	* @return Builder object with new value for modelVersion
	*/
	final public NotificationMessageBuilder _modelVersion_(String _modelVersion_) {
		this.notificationMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for issued
	* @param _issued_ desired value to be set
	* @return Builder object with new value for issued
	*/
	final public NotificationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.notificationMessageImpl._issued = _issued_;
		return this;
	}


	/**
	* This function allows setting a value for issuerConnector
	* @param _issuerConnector_ desired value to be set
	* @return Builder object with new value for issuerConnector
	*/
	final public NotificationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.notificationMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	/**
	* This function allows setting a value for recipientConnector
	* @param _recipientConnector_ desired value to be set
	* @return Builder object with new value for recipientConnector
	*/
	final public NotificationMessageBuilder _recipientConnector_(ArrayList<? extends URI> _recipientConnector_) {
		this.notificationMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	/**
	* This function allows setting a value for securityToken
	* @param _securityToken_ desired value to be set
	* @return Builder object with new value for securityToken
	*/
	final public NotificationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.notificationMessageImpl._securityToken = _securityToken_;
		return this;
	}


	/**
	* This function allows setting a value for senderAgent
	* @param _senderAgent_ desired value to be set
	* @return Builder object with new value for senderAgent
	*/
	final public NotificationMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.notificationMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	/**
	* This function allows setting a value for recipientAgent
	* @param _recipientAgent_ desired value to be set
	* @return Builder object with new value for recipientAgent
	*/
	final public NotificationMessageBuilder _recipientAgent_(ArrayList<? extends URI> _recipientAgent_) {
		this.notificationMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	/**
	* This function allows setting a value for correlationMessage
	* @param _correlationMessage_ desired value to be set
	* @return Builder object with new value for correlationMessage
	*/
	final public NotificationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.notificationMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	/**
	* This function allows setting a value for authorizationToken
	* @param _authorizationToken_ desired value to be set
	* @return Builder object with new value for authorizationToken
	*/
	final public NotificationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.notificationMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	/**
	* This function allows setting a value for transferContract
	* @param _transferContract_ desired value to be set
	* @return Builder object with new value for transferContract
	*/
	final public NotificationMessageBuilder _transferContract_(URI _transferContract_) {
		this.notificationMessageImpl._transferContract = _transferContract_;
		return this;
	}


	/**
	* This function allows setting a value for contentVersion
	* @param _contentVersion_ desired value to be set
	* @return Builder object with new value for contentVersion
	*/
	final public NotificationMessageBuilder _contentVersion_(String _contentVersion_) {
		this.notificationMessageImpl._contentVersion = _contentVersion_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public NotificationMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notificationMessageImpl);
		return notificationMessageImpl;
	}
}
