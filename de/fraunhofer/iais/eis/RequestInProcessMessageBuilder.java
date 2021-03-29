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

public class RequestInProcessMessageBuilder {

	private RequestInProcessMessageImpl requestInProcessMessageImpl;

	public RequestInProcessMessageBuilder() {
		requestInProcessMessageImpl = new RequestInProcessMessageImpl();
	}

	public RequestInProcessMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		requestInProcessMessageImpl.id = id;
	}



	final public RequestInProcessMessageBuilder _modelVersion_(String _modelVersion_) {
		this.requestInProcessMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public RequestInProcessMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.requestInProcessMessageImpl._issued = _issued_;
		return this;
	}


	final public RequestInProcessMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.requestInProcessMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public RequestInProcessMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.requestInProcessMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public RequestInProcessMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.requestInProcessMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public RequestInProcessMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.requestInProcessMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public RequestInProcessMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.requestInProcessMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public RequestInProcessMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.requestInProcessMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public RequestInProcessMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.requestInProcessMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public RequestInProcessMessageBuilder _transferContract_(URI _transferContract_) {
		this.requestInProcessMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public RequestInProcessMessageBuilder _contentVersion_(String _contentVersion_) {
		this.requestInProcessMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final RequestInProcessMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(requestInProcessMessageImpl);
		return requestInProcessMessageImpl;
	}
}
