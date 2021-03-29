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

public class OperationResultMessageBuilder {

	private OperationResultMessageImpl operationResultMessageImpl;

	public OperationResultMessageBuilder() {
		operationResultMessageImpl = new OperationResultMessageImpl();
	}

	public OperationResultMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		operationResultMessageImpl.id = id;
	}



	final public OperationResultMessageBuilder _modelVersion_(String _modelVersion_) {
		this.operationResultMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public OperationResultMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.operationResultMessageImpl._issued = _issued_;
		return this;
	}


	final public OperationResultMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.operationResultMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public OperationResultMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.operationResultMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public OperationResultMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.operationResultMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public OperationResultMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.operationResultMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public OperationResultMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.operationResultMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public OperationResultMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.operationResultMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public OperationResultMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.operationResultMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public OperationResultMessageBuilder _transferContract_(URI _transferContract_) {
		this.operationResultMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public OperationResultMessageBuilder _contentVersion_(String _contentVersion_) {
		this.operationResultMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final OperationResultMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(operationResultMessageImpl);
		return operationResultMessageImpl;
	}
}
