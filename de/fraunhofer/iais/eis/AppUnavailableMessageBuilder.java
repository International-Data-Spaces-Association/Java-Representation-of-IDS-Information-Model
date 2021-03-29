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

public class AppUnavailableMessageBuilder {

	private AppUnavailableMessageImpl appUnavailableMessageImpl;

	public AppUnavailableMessageBuilder() {
		appUnavailableMessageImpl = new AppUnavailableMessageImpl();
	}

	public AppUnavailableMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appUnavailableMessageImpl.id = id;
	}



	final public AppUnavailableMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.appUnavailableMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	final public AppUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appUnavailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appUnavailableMessageImpl._issued = _issued_;
		return this;
	}


	final public AppUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appUnavailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppUnavailableMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appUnavailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appUnavailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appUnavailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppUnavailableMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appUnavailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appUnavailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appUnavailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.appUnavailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appUnavailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppUnavailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appUnavailableMessageImpl);
		return appUnavailableMessageImpl;
	}
}
