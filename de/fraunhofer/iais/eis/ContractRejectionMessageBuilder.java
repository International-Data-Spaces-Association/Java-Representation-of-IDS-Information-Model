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

public class ContractRejectionMessageBuilder {

	private ContractRejectionMessageImpl contractRejectionMessageImpl;

	public ContractRejectionMessageBuilder() {
		contractRejectionMessageImpl = new ContractRejectionMessageImpl();
	}

	public ContractRejectionMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractRejectionMessageImpl.id = id;
	}

	final public ContractRejectionMessageBuilder _contractRejectionReason_(de.fraunhofer.iais.eis.util.TypedLiteral _contractRejectionReason_) {
		this.contractRejectionMessageImpl._contractRejectionReason = _contractRejectionReason_;
		return this;
	}


	final public ContractRejectionMessageBuilder _rejectionReason_(RejectionReason _rejectionReason_) {
		this.contractRejectionMessageImpl._rejectionReason = _rejectionReason_;
		return this;
	}



	final public ContractRejectionMessageBuilder _modelVersion_(String _modelVersion_) {
		this.contractRejectionMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ContractRejectionMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.contractRejectionMessageImpl._issued = _issued_;
		return this;
	}


	final public ContractRejectionMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.contractRejectionMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ContractRejectionMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.contractRejectionMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ContractRejectionMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.contractRejectionMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ContractRejectionMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.contractRejectionMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ContractRejectionMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.contractRejectionMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ContractRejectionMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.contractRejectionMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ContractRejectionMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.contractRejectionMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ContractRejectionMessageBuilder _transferContract_(URI _transferContract_) {
		this.contractRejectionMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ContractRejectionMessageBuilder _contentVersion_(String _contentVersion_) {
		this.contractRejectionMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ContractRejectionMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractRejectionMessageImpl);
		return contractRejectionMessageImpl;
	}
}
