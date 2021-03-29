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

public class LogMessageBuilder {

	private LogMessageImpl logMessageImpl;

	public LogMessageBuilder() {
		logMessageImpl = new LogMessageImpl();
	}

	public LogMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		logMessageImpl.id = id;
	}



	final public LogMessageBuilder _modelVersion_(String _modelVersion_) {
		this.logMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public LogMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.logMessageImpl._issued = _issued_;
		return this;
	}


	final public LogMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.logMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public LogMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.logMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public LogMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.logMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public LogMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.logMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public LogMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.logMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public LogMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.logMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public LogMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.logMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public LogMessageBuilder _transferContract_(URI _transferContract_) {
		this.logMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public LogMessageBuilder _contentVersion_(String _contentVersion_) {
		this.logMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final LogMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(logMessageImpl);
		return logMessageImpl;
	}
}
