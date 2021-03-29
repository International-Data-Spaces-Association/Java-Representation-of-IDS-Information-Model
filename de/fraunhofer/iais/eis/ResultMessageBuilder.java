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

public class ResultMessageBuilder {

	private ResultMessageImpl resultMessageImpl;

	public ResultMessageBuilder() {
		resultMessageImpl = new ResultMessageImpl();
	}

	public ResultMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		resultMessageImpl.id = id;
	}



	final public ResultMessageBuilder _modelVersion_(String _modelVersion_) {
		this.resultMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ResultMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.resultMessageImpl._issued = _issued_;
		return this;
	}


	final public ResultMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.resultMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ResultMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.resultMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ResultMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.resultMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ResultMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.resultMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ResultMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.resultMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ResultMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.resultMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ResultMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.resultMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ResultMessageBuilder _transferContract_(URI _transferContract_) {
		this.resultMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ResultMessageBuilder _contentVersion_(String _contentVersion_) {
		this.resultMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ResultMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(resultMessageImpl);
		return resultMessageImpl;
	}
}
