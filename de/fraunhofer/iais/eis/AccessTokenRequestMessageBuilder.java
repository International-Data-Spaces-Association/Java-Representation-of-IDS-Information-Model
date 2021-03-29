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

public class AccessTokenRequestMessageBuilder {

	private AccessTokenRequestMessageImpl accessTokenRequestMessageImpl;

	public AccessTokenRequestMessageBuilder() {
		accessTokenRequestMessageImpl = new AccessTokenRequestMessageImpl();
	}

	public AccessTokenRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		accessTokenRequestMessageImpl.id = id;
	}



	final public AccessTokenRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.accessTokenRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.accessTokenRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.accessTokenRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.accessTokenRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.accessTokenRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.accessTokenRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.accessTokenRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.accessTokenRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.accessTokenRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.accessTokenRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AccessTokenRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.accessTokenRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AccessTokenRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessTokenRequestMessageImpl);
		return accessTokenRequestMessageImpl;
	}
}
