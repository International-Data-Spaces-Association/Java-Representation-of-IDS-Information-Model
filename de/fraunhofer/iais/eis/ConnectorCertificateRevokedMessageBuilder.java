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

public class ConnectorCertificateRevokedMessageBuilder {

	private ConnectorCertificateRevokedMessageImpl connectorCertificateRevokedMessageImpl;

	public ConnectorCertificateRevokedMessageBuilder() {
		connectorCertificateRevokedMessageImpl = new ConnectorCertificateRevokedMessageImpl();
	}

	public ConnectorCertificateRevokedMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorCertificateRevokedMessageImpl.id = id;
	}

	final public ConnectorCertificateRevokedMessageBuilder _revocationReason_(de.fraunhofer.iais.eis.util.TypedLiteral _revocationReason_) {
		this.connectorCertificateRevokedMessageImpl._revocationReason = _revocationReason_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _affectedConnector_(URI _affectedConnector_) {
		this.connectorCertificateRevokedMessageImpl._affectedConnector = _affectedConnector_;
		return this;
	}



	final public ConnectorCertificateRevokedMessageBuilder _modelVersion_(String _modelVersion_) {
		this.connectorCertificateRevokedMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.connectorCertificateRevokedMessageImpl._issued = _issued_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.connectorCertificateRevokedMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.connectorCertificateRevokedMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.connectorCertificateRevokedMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.connectorCertificateRevokedMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.connectorCertificateRevokedMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.connectorCertificateRevokedMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.connectorCertificateRevokedMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _transferContract_(URI _transferContract_) {
		this.connectorCertificateRevokedMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ConnectorCertificateRevokedMessageBuilder _contentVersion_(String _contentVersion_) {
		this.connectorCertificateRevokedMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ConnectorCertificateRevokedMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorCertificateRevokedMessageImpl);
		return connectorCertificateRevokedMessageImpl;
	}
}
