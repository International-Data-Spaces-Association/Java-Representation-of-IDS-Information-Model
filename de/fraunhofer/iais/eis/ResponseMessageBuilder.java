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

public class ResponseMessageBuilder {

	private ResponseMessageImpl responseMessageImpl;

	public ResponseMessageBuilder() {
		responseMessageImpl = new ResponseMessageImpl();
	}

	public ResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		responseMessageImpl.id = id;
	}


	final public ResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.responseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.responseMessageImpl._issued = _issued_;
		return this;
	}


	final public ResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.responseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.responseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.responseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.responseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.responseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.responseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.responseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.responseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.responseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(responseMessageImpl);
		return responseMessageImpl;
	}
}
