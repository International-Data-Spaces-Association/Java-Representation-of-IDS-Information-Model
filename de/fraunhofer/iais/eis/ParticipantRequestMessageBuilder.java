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

public class ParticipantRequestMessageBuilder {

	private ParticipantRequestMessageImpl participantRequestMessageImpl;

	public ParticipantRequestMessageBuilder() {
		participantRequestMessageImpl = new ParticipantRequestMessageImpl();
	}

	public ParticipantRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantRequestMessageImpl.id = id;
	}

	final public ParticipantRequestMessageBuilder _requestedParticipant_(URI _requestedParticipant_) {
		this.participantRequestMessageImpl._requestedParticipant = _requestedParticipant_;
		return this;
	}



	final public ParticipantRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantRequestMessageImpl);
		return participantRequestMessageImpl;
	}
}
