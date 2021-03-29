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

public class UploadResponseMessageBuilder {

	private UploadResponseMessageImpl uploadResponseMessageImpl;

	public UploadResponseMessageBuilder() {
		uploadResponseMessageImpl = new UploadResponseMessageImpl();
	}

	public UploadResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		uploadResponseMessageImpl.id = id;
	}



	final public UploadResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.uploadResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public UploadResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.uploadResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public UploadResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.uploadResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public UploadResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.uploadResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public UploadResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.uploadResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public UploadResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.uploadResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public UploadResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.uploadResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public UploadResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.uploadResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public UploadResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.uploadResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public UploadResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.uploadResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public UploadResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.uploadResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final UploadResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(uploadResponseMessageImpl);
		return uploadResponseMessageImpl;
	}
}
