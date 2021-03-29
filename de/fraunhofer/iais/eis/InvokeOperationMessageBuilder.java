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

public class InvokeOperationMessageBuilder {

	private InvokeOperationMessageImpl invokeOperationMessageImpl;

	public InvokeOperationMessageBuilder() {
		invokeOperationMessageImpl = new InvokeOperationMessageImpl();
	}

	public InvokeOperationMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		invokeOperationMessageImpl.id = id;
	}

	final public InvokeOperationMessageBuilder _operationReference_(URI _operationReference_) {
		this.invokeOperationMessageImpl._operationReference = _operationReference_;
		return this;
	}



	final public InvokeOperationMessageBuilder _modelVersion_(String _modelVersion_) {
		this.invokeOperationMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public InvokeOperationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.invokeOperationMessageImpl._issued = _issued_;
		return this;
	}


	final public InvokeOperationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.invokeOperationMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public InvokeOperationMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.invokeOperationMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public InvokeOperationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.invokeOperationMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public InvokeOperationMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.invokeOperationMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public InvokeOperationMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.invokeOperationMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public InvokeOperationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.invokeOperationMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public InvokeOperationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.invokeOperationMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public InvokeOperationMessageBuilder _transferContract_(URI _transferContract_) {
		this.invokeOperationMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public InvokeOperationMessageBuilder _contentVersion_(String _contentVersion_) {
		this.invokeOperationMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final InvokeOperationMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(invokeOperationMessageImpl);
		return invokeOperationMessageImpl;
	}
}
