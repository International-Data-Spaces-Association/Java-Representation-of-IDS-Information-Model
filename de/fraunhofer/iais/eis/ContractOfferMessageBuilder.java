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

public class ContractOfferMessageBuilder {

	private ContractOfferMessageImpl contractOfferMessageImpl;

	public ContractOfferMessageBuilder() {
		contractOfferMessageImpl = new ContractOfferMessageImpl();
	}

	public ContractOfferMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractOfferMessageImpl.id = id;
	}



	final public ContractOfferMessageBuilder _modelVersion_(String _modelVersion_) {
		this.contractOfferMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ContractOfferMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.contractOfferMessageImpl._issued = _issued_;
		return this;
	}


	final public ContractOfferMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.contractOfferMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ContractOfferMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.contractOfferMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ContractOfferMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.contractOfferMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ContractOfferMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.contractOfferMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ContractOfferMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.contractOfferMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ContractOfferMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.contractOfferMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ContractOfferMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.contractOfferMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ContractOfferMessageBuilder _transferContract_(URI _transferContract_) {
		this.contractOfferMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ContractOfferMessageBuilder _contentVersion_(String _contentVersion_) {
		this.contractOfferMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ContractOfferMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractOfferMessageImpl);
		return contractOfferMessageImpl;
	}
}
