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

public class UploadMessageBuilder {

	private UploadMessageImpl uploadMessageImpl;

	public UploadMessageBuilder() {
		uploadMessageImpl = new UploadMessageImpl();
	}

	public UploadMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		uploadMessageImpl.id = id;
	}



	final public UploadMessageBuilder _modelVersion_(String _modelVersion_) {
		this.uploadMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public UploadMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.uploadMessageImpl._issued = _issued_;
		return this;
	}


	final public UploadMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.uploadMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public UploadMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.uploadMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public UploadMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.uploadMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public UploadMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.uploadMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public UploadMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.uploadMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public UploadMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.uploadMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public UploadMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.uploadMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public UploadMessageBuilder _transferContract_(URI _transferContract_) {
		this.uploadMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public UploadMessageBuilder _contentVersion_(String _contentVersion_) {
		this.uploadMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final UploadMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(uploadMessageImpl);
		return uploadMessageImpl;
	}
}
