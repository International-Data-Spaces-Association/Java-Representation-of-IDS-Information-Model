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

public class ConnectorUnavailableMessageBuilder {

	private ConnectorUnavailableMessageImpl connectorUnavailableMessageImpl;

	public ConnectorUnavailableMessageBuilder() {
		connectorUnavailableMessageImpl = new ConnectorUnavailableMessageImpl();
	}

	public ConnectorUnavailableMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorUnavailableMessageImpl.id = id;
	}


	final public ConnectorUnavailableMessageBuilder _affectedConnector_(URI _affectedConnector_) {
		this.connectorUnavailableMessageImpl._affectedConnector = _affectedConnector_;
		return this;
	}



	final public ConnectorUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.connectorUnavailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.connectorUnavailableMessageImpl._issued = _issued_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.connectorUnavailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.connectorUnavailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.connectorUnavailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.connectorUnavailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.connectorUnavailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.connectorUnavailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.connectorUnavailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.connectorUnavailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ConnectorUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.connectorUnavailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ConnectorUnavailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorUnavailableMessageImpl);
		return connectorUnavailableMessageImpl;
	}
}
