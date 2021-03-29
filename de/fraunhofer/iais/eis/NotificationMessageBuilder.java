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

public class NotificationMessageBuilder {

	private NotificationMessageImpl notificationMessageImpl;

	public NotificationMessageBuilder() {
		notificationMessageImpl = new NotificationMessageImpl();
	}

	public NotificationMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notificationMessageImpl.id = id;
	}


	final public NotificationMessageBuilder _modelVersion_(String _modelVersion_) {
		this.notificationMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public NotificationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.notificationMessageImpl._issued = _issued_;
		return this;
	}


	final public NotificationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.notificationMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public NotificationMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.notificationMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public NotificationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.notificationMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public NotificationMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.notificationMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public NotificationMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.notificationMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public NotificationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.notificationMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public NotificationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.notificationMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public NotificationMessageBuilder _transferContract_(URI _transferContract_) {
		this.notificationMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public NotificationMessageBuilder _contentVersion_(String _contentVersion_) {
		this.notificationMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final NotificationMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notificationMessageImpl);
		return notificationMessageImpl;
	}
}
