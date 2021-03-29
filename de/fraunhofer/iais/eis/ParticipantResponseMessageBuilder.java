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

public class ParticipantResponseMessageBuilder {

	private ParticipantResponseMessageImpl participantResponseMessageImpl;

	public ParticipantResponseMessageBuilder() {
		participantResponseMessageImpl = new ParticipantResponseMessageImpl();
	}

	public ParticipantResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantResponseMessageImpl.id = id;
	}



	final public ParticipantResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantResponseMessageImpl);
		return participantResponseMessageImpl;
	}
}
