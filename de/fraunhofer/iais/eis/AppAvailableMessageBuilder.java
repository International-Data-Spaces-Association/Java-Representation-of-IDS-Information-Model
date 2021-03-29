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

public class AppAvailableMessageBuilder {

	private AppAvailableMessageImpl appAvailableMessageImpl;

	public AppAvailableMessageBuilder() {
		appAvailableMessageImpl = new AppAvailableMessageImpl();
	}

	public AppAvailableMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appAvailableMessageImpl.id = id;
	}



	final public AppAvailableMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.appAvailableMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	final public AppAvailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appAvailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppAvailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appAvailableMessageImpl._issued = _issued_;
		return this;
	}


	final public AppAvailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appAvailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppAvailableMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appAvailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppAvailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appAvailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppAvailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appAvailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppAvailableMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appAvailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppAvailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appAvailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppAvailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appAvailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppAvailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.appAvailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppAvailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appAvailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppAvailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appAvailableMessageImpl);
		return appAvailableMessageImpl;
	}
}
