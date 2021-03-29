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

public class ContractRequestMessageBuilder {

	private ContractRequestMessageImpl contractRequestMessageImpl;

	public ContractRequestMessageBuilder() {
		contractRequestMessageImpl = new ContractRequestMessageImpl();
	}

	public ContractRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractRequestMessageImpl.id = id;
	}



	final public ContractRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.contractRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ContractRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.contractRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public ContractRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.contractRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ContractRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.contractRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ContractRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.contractRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ContractRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.contractRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ContractRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.contractRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ContractRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.contractRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ContractRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.contractRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ContractRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.contractRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ContractRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.contractRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ContractRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractRequestMessageImpl);
		return contractRequestMessageImpl;
	}
}
