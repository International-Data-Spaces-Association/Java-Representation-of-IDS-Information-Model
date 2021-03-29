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

public class DescriptionRequestMessageBuilder {

	private DescriptionRequestMessageImpl descriptionRequestMessageImpl;

	public DescriptionRequestMessageBuilder() {
		descriptionRequestMessageImpl = new DescriptionRequestMessageImpl();
	}

	public DescriptionRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		descriptionRequestMessageImpl.id = id;
	}

	final public DescriptionRequestMessageBuilder _requestedElement_(URI _requestedElement_) {
		this.descriptionRequestMessageImpl._requestedElement = _requestedElement_;
		return this;
	}



	final public DescriptionRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.descriptionRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.descriptionRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.descriptionRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.descriptionRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.descriptionRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.descriptionRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.descriptionRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.descriptionRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.descriptionRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.descriptionRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public DescriptionRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.descriptionRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final DescriptionRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(descriptionRequestMessageImpl);
		return descriptionRequestMessageImpl;
	}
}
