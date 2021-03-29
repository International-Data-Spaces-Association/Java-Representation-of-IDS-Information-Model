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

public class RejectionMessageBuilder {

	private RejectionMessageImpl rejectionMessageImpl;

	public RejectionMessageBuilder() {
		rejectionMessageImpl = new RejectionMessageImpl();
	}

	public RejectionMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rejectionMessageImpl.id = id;
	}

	final public RejectionMessageBuilder _rejectionReason_(RejectionReason _rejectionReason_) {
		this.rejectionMessageImpl._rejectionReason = _rejectionReason_;
		return this;
	}



	final public RejectionMessageBuilder _modelVersion_(String _modelVersion_) {
		this.rejectionMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public RejectionMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.rejectionMessageImpl._issued = _issued_;
		return this;
	}


	final public RejectionMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.rejectionMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public RejectionMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.rejectionMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public RejectionMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.rejectionMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public RejectionMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.rejectionMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public RejectionMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.rejectionMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public RejectionMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.rejectionMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public RejectionMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.rejectionMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public RejectionMessageBuilder _transferContract_(URI _transferContract_) {
		this.rejectionMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public RejectionMessageBuilder _contentVersion_(String _contentVersion_) {
		this.rejectionMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final RejectionMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rejectionMessageImpl);
		return rejectionMessageImpl;
	}
}
