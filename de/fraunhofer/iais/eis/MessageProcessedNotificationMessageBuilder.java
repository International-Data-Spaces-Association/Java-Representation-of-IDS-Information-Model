package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class MessageProcessedNotificationMessageBuilder {

	private MessageProcessedNotificationMessageImpl messageProcessedNotificationMessageImpl;

	public MessageProcessedNotificationMessageBuilder() {
		messageProcessedNotificationMessageImpl = new MessageProcessedNotificationMessageImpl();
	}

	public MessageProcessedNotificationMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		messageProcessedNotificationMessageImpl.id = id;
	}



	final public MessageProcessedNotificationMessageBuilder _modelVersion_(String _modelVersion_) {
		this.messageProcessedNotificationMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.messageProcessedNotificationMessageImpl._issued = _issued_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.messageProcessedNotificationMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.messageProcessedNotificationMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.messageProcessedNotificationMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.messageProcessedNotificationMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.messageProcessedNotificationMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.messageProcessedNotificationMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.messageProcessedNotificationMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _transferContract_(URI _transferContract_) {
		this.messageProcessedNotificationMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public MessageProcessedNotificationMessageBuilder _contentVersion_(String _contentVersion_) {
		this.messageProcessedNotificationMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final MessageProcessedNotificationMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(messageProcessedNotificationMessageImpl);
		return messageProcessedNotificationMessageImpl;
	}
}
