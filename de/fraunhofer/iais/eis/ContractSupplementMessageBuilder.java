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

public class ContractSupplementMessageBuilder {

	private ContractSupplementMessageImpl contractSupplementMessageImpl;

	public ContractSupplementMessageBuilder() {
		contractSupplementMessageImpl = new ContractSupplementMessageImpl();
	}

	public ContractSupplementMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractSupplementMessageImpl.id = id;
	}



	final public ContractSupplementMessageBuilder _modelVersion_(String _modelVersion_) {
		this.contractSupplementMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ContractSupplementMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.contractSupplementMessageImpl._issued = _issued_;
		return this;
	}


	final public ContractSupplementMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.contractSupplementMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ContractSupplementMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.contractSupplementMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ContractSupplementMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.contractSupplementMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ContractSupplementMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.contractSupplementMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ContractSupplementMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.contractSupplementMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ContractSupplementMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.contractSupplementMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ContractSupplementMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.contractSupplementMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ContractSupplementMessageBuilder _transferContract_(URI _transferContract_) {
		this.contractSupplementMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ContractSupplementMessageBuilder _contentVersion_(String _contentVersion_) {
		this.contractSupplementMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ContractSupplementMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractSupplementMessageImpl);
		return contractSupplementMessageImpl;
	}
}
