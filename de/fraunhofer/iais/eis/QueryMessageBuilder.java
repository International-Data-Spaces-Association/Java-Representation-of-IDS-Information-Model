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

public class QueryMessageBuilder {

	private QueryMessageImpl queryMessageImpl;

	public QueryMessageBuilder() {
		queryMessageImpl = new QueryMessageImpl();
	}

	public QueryMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		queryMessageImpl.id = id;
	}

	final public QueryMessageBuilder _queryLanguage_(QueryLanguage _queryLanguage_) {
		this.queryMessageImpl._queryLanguage = _queryLanguage_;
		return this;
	}


	final public QueryMessageBuilder _queryScope_(QueryScope _queryScope_) {
		this.queryMessageImpl._queryScope = _queryScope_;
		return this;
	}


	final public QueryMessageBuilder _recipientScope_(QueryTarget _recipientScope_) {
		this.queryMessageImpl._recipientScope = _recipientScope_;
		return this;
	}



	final public QueryMessageBuilder _modelVersion_(String _modelVersion_) {
		this.queryMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public QueryMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.queryMessageImpl._issued = _issued_;
		return this;
	}


	final public QueryMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.queryMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public QueryMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.queryMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public QueryMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.queryMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public QueryMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.queryMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public QueryMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.queryMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public QueryMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.queryMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public QueryMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.queryMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public QueryMessageBuilder _transferContract_(URI _transferContract_) {
		this.queryMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public QueryMessageBuilder _contentVersion_(String _contentVersion_) {
		this.queryMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final QueryMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(queryMessageImpl);
		return queryMessageImpl;
	}
}
