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

public class AppRegistrationResponseMessageBuilder {

	private AppRegistrationResponseMessageImpl appRegistrationResponseMessageImpl;

	public AppRegistrationResponseMessageBuilder() {
		appRegistrationResponseMessageImpl = new AppRegistrationResponseMessageImpl();
	}

	public AppRegistrationResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appRegistrationResponseMessageImpl.id = id;
	}



	final public AppRegistrationResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appRegistrationResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appRegistrationResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appRegistrationResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appRegistrationResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appRegistrationResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appRegistrationResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appRegistrationResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appRegistrationResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appRegistrationResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.appRegistrationResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppRegistrationResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appRegistrationResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppRegistrationResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRegistrationResponseMessageImpl);
		return appRegistrationResponseMessageImpl;
	}
}
