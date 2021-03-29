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

public class ConnectorUpdateMessageBuilder {

	private ConnectorUpdateMessageImpl connectorUpdateMessageImpl;

	public ConnectorUpdateMessageBuilder() {
		connectorUpdateMessageImpl = new ConnectorUpdateMessageImpl();
	}

	public ConnectorUpdateMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorUpdateMessageImpl.id = id;
	}


	final public ConnectorUpdateMessageBuilder _affectedConnector_(URI _affectedConnector_) {
		this.connectorUpdateMessageImpl._affectedConnector = _affectedConnector_;
		return this;
	}



	final public ConnectorUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
		this.connectorUpdateMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.connectorUpdateMessageImpl._issued = _issued_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.connectorUpdateMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.connectorUpdateMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.connectorUpdateMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.connectorUpdateMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.connectorUpdateMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.connectorUpdateMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.connectorUpdateMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _transferContract_(URI _transferContract_) {
		this.connectorUpdateMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ConnectorUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
		this.connectorUpdateMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ConnectorUpdateMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorUpdateMessageImpl);
		return connectorUpdateMessageImpl;
	}
}
