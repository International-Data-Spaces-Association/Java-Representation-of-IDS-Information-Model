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

public class AppDeleteMessageBuilder {

	private AppDeleteMessageImpl appDeleteMessageImpl;

	public AppDeleteMessageBuilder() {
		appDeleteMessageImpl = new AppDeleteMessageImpl();
	}

	public AppDeleteMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appDeleteMessageImpl.id = id;
	}



	final public AppDeleteMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.appDeleteMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	final public AppDeleteMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appDeleteMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppDeleteMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appDeleteMessageImpl._issued = _issued_;
		return this;
	}


	final public AppDeleteMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appDeleteMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppDeleteMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appDeleteMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppDeleteMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appDeleteMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppDeleteMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appDeleteMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppDeleteMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appDeleteMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppDeleteMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appDeleteMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppDeleteMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appDeleteMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppDeleteMessageBuilder _transferContract_(URI _transferContract_) {
		this.appDeleteMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppDeleteMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appDeleteMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppDeleteMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appDeleteMessageImpl);
		return appDeleteMessageImpl;
	}
}
