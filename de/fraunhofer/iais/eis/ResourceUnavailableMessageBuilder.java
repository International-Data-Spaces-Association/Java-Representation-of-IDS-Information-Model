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

public class ResourceUnavailableMessageBuilder {

	private ResourceUnavailableMessageImpl resourceUnavailableMessageImpl;

	public ResourceUnavailableMessageBuilder() {
		resourceUnavailableMessageImpl = new ResourceUnavailableMessageImpl();
	}

	public ResourceUnavailableMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		resourceUnavailableMessageImpl.id = id;
	}


	final public ResourceUnavailableMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.resourceUnavailableMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	final public ResourceUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.resourceUnavailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.resourceUnavailableMessageImpl._issued = _issued_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.resourceUnavailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.resourceUnavailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.resourceUnavailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.resourceUnavailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.resourceUnavailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.resourceUnavailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.resourceUnavailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.resourceUnavailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ResourceUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.resourceUnavailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ResourceUnavailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(resourceUnavailableMessageImpl);
		return resourceUnavailableMessageImpl;
	}
}
