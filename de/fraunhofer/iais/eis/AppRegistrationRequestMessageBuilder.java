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

public class AppRegistrationRequestMessageBuilder {

	private AppRegistrationRequestMessageImpl appRegistrationRequestMessageImpl;

	public AppRegistrationRequestMessageBuilder() {
		appRegistrationRequestMessageImpl = new AppRegistrationRequestMessageImpl();
	}

	public AppRegistrationRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appRegistrationRequestMessageImpl.id = id;
	}

	final public AppRegistrationRequestMessageBuilder _affectedDataApp_(URI _affectedDataApp_) {
		this.appRegistrationRequestMessageImpl._affectedDataApp = _affectedDataApp_;
		return this;
	}



	final public AppRegistrationRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appRegistrationRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appRegistrationRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appRegistrationRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appRegistrationRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appRegistrationRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appRegistrationRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appRegistrationRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appRegistrationRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appRegistrationRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.appRegistrationRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppRegistrationRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appRegistrationRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppRegistrationRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appRegistrationRequestMessageImpl);
		return appRegistrationRequestMessageImpl;
	}
}
