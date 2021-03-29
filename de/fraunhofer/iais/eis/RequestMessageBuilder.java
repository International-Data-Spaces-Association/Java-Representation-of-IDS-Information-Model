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

public class RequestMessageBuilder {

	private RequestMessageImpl requestMessageImpl;

	public RequestMessageBuilder() {
		requestMessageImpl = new RequestMessageImpl();
	}

	public RequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		requestMessageImpl.id = id;
	}


	final public RequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.requestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public RequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.requestMessageImpl._issued = _issued_;
		return this;
	}


	final public RequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.requestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public RequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.requestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public RequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.requestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public RequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.requestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public RequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.requestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public RequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.requestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public RequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.requestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public RequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.requestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public RequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.requestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final RequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(requestMessageImpl);
		return requestMessageImpl;
	}
}
