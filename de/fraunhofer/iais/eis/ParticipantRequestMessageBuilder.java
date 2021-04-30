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

public class ParticipantRequestMessageBuilder {

	private ParticipantRequestMessageImpl participantRequestMessageImpl;

	public ParticipantRequestMessageBuilder() {
		participantRequestMessageImpl = new ParticipantRequestMessageImpl();
	}

	public ParticipantRequestMessageBuilder(URI id) {
		this();
		participantRequestMessageImpl.id = id;
	}

	/**
	* This function allows setting a value for _requestedParticipant
	* @param _requestedParticipant_ desired value to be set
	* @return Builder object with new value for _requestedParticipant
	*/
	final public ParticipantRequestMessageBuilder _requestedParticipant_(URI _requestedParticipant_) {
		this.participantRequestMessageImpl._requestedParticipant = _requestedParticipant_;
		return this;
	}



	/**
	* This function allows setting a value for _modelVersion
	* @param _modelVersion_ desired value to be set
	* @return Builder object with new value for _modelVersion
	*/
	final public ParticipantRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _issued
	* @param _issued_ desired value to be set
	* @return Builder object with new value for _issued
	*/
	final public ParticipantRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantRequestMessageImpl._issued = _issued_;
		return this;
	}


	/**
	* This function allows setting a value for _correlationMessage
	* @param _correlationMessage_ desired value to be set
	* @return Builder object with new value for _correlationMessage
	*/
	final public ParticipantRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	/**
	* This function allows setting a value for _issuerConnector
	* @param _issuerConnector_ desired value to be set
	* @return Builder object with new value for _issuerConnector
	*/
	final public ParticipantRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	/**
	* This function allows setting a value for _recipientConnector
	* @param _recipientConnector_ desired value to be set
	* @return Builder object with new value for _recipientConnector
	*/
	final public ParticipantRequestMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
		this.participantRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	/**
	* This function allows setting a value for _senderAgent
	* @param _senderAgent_ desired value to be set
	* @return Builder object with new value for _senderAgent
	*/
	final public ParticipantRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _recipientAgent
	* @param _recipientAgent_ desired value to be set
	* @return Builder object with new value for _recipientAgent
	*/
	final public ParticipantRequestMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
		this.participantRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _securityToken
	* @param _securityToken_ desired value to be set
	* @return Builder object with new value for _securityToken
	*/
	final public ParticipantRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	/**
	* This function allows setting a value for _authorizationToken
	* @param _authorizationToken_ desired value to be set
	* @return Builder object with new value for _authorizationToken
	*/
	final public ParticipantRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	/**
	* This function allows setting a value for _transferContract
	* @param _transferContract_ desired value to be set
	* @return Builder object with new value for _transferContract
	*/
	final public ParticipantRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	/**
	* This function allows setting a value for _contentVersion
	* @param _contentVersion_ desired value to be set
	* @return Builder object with new value for _contentVersion
	*/
	final public ParticipantRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ParticipantRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantRequestMessageImpl);
		return participantRequestMessageImpl;
	}
}
