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

public class ConnectorCertificateGrantedMessageBuilder {

	private ConnectorCertificateGrantedMessageImpl connectorCertificateGrantedMessageImpl;

	public ConnectorCertificateGrantedMessageBuilder() {
		connectorCertificateGrantedMessageImpl = new ConnectorCertificateGrantedMessageImpl();
	}

	public ConnectorCertificateGrantedMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorCertificateGrantedMessageImpl.id = id;
	}


	final public ConnectorCertificateGrantedMessageBuilder _affectedConnector_(URI _affectedConnector_) {
		this.connectorCertificateGrantedMessageImpl._affectedConnector = _affectedConnector_;
		return this;
	}



	final public ConnectorCertificateGrantedMessageBuilder _modelVersion_(String _modelVersion_) {
		this.connectorCertificateGrantedMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.connectorCertificateGrantedMessageImpl._issued = _issued_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.connectorCertificateGrantedMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.connectorCertificateGrantedMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.connectorCertificateGrantedMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.connectorCertificateGrantedMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.connectorCertificateGrantedMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.connectorCertificateGrantedMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.connectorCertificateGrantedMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _transferContract_(URI _transferContract_) {
		this.connectorCertificateGrantedMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ConnectorCertificateGrantedMessageBuilder _contentVersion_(String _contentVersion_) {
		this.connectorCertificateGrantedMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ConnectorCertificateGrantedMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorCertificateGrantedMessageImpl);
		return connectorCertificateGrantedMessageImpl;
	}
}
