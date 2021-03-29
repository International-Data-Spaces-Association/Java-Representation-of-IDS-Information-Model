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

public class DescriptionResponseMessageBuilder {

	private DescriptionResponseMessageImpl descriptionResponseMessageImpl;

	public DescriptionResponseMessageBuilder() {
		descriptionResponseMessageImpl = new DescriptionResponseMessageImpl();
	}

	public DescriptionResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		descriptionResponseMessageImpl.id = id;
	}



	final public DescriptionResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.descriptionResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.descriptionResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.descriptionResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.descriptionResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.descriptionResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.descriptionResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.descriptionResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.descriptionResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.descriptionResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.descriptionResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public DescriptionResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.descriptionResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final DescriptionResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(descriptionResponseMessageImpl);
		return descriptionResponseMessageImpl;
	}
}
