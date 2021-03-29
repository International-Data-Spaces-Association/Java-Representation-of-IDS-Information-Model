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

public class ResourceUpdateMessageBuilder {

	private ResourceUpdateMessageImpl resourceUpdateMessageImpl;

	public ResourceUpdateMessageBuilder() {
		resourceUpdateMessageImpl = new ResourceUpdateMessageImpl();
	}

	public ResourceUpdateMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		resourceUpdateMessageImpl.id = id;
	}


	final public ResourceUpdateMessageBuilder _affectedResource_(URI _affectedResource_) {
		this.resourceUpdateMessageImpl._affectedResource = _affectedResource_;
		return this;
	}



	final public ResourceUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
		this.resourceUpdateMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.resourceUpdateMessageImpl._issued = _issued_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.resourceUpdateMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.resourceUpdateMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.resourceUpdateMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.resourceUpdateMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.resourceUpdateMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.resourceUpdateMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.resourceUpdateMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _transferContract_(URI _transferContract_) {
		this.resourceUpdateMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ResourceUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
		this.resourceUpdateMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ResourceUpdateMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(resourceUpdateMessageImpl);
		return resourceUpdateMessageImpl;
	}
}
