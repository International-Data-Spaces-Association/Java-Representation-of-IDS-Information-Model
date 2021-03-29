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

public class ContractAgreementMessageBuilder {

	private ContractAgreementMessageImpl contractAgreementMessageImpl;

	public ContractAgreementMessageBuilder() {
		contractAgreementMessageImpl = new ContractAgreementMessageImpl();
	}

	public ContractAgreementMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractAgreementMessageImpl.id = id;
	}



	final public ContractAgreementMessageBuilder _modelVersion_(String _modelVersion_) {
		this.contractAgreementMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ContractAgreementMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.contractAgreementMessageImpl._issued = _issued_;
		return this;
	}


	final public ContractAgreementMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.contractAgreementMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ContractAgreementMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.contractAgreementMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ContractAgreementMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.contractAgreementMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ContractAgreementMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.contractAgreementMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ContractAgreementMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.contractAgreementMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ContractAgreementMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.contractAgreementMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ContractAgreementMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.contractAgreementMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ContractAgreementMessageBuilder _transferContract_(URI _transferContract_) {
		this.contractAgreementMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ContractAgreementMessageBuilder _contentVersion_(String _contentVersion_) {
		this.contractAgreementMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ContractAgreementMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractAgreementMessageImpl);
		return contractAgreementMessageImpl;
	}
}
