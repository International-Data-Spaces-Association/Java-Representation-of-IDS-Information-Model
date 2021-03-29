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

public class ParticipantUnavailableMessageBuilder {

	private ParticipantUnavailableMessageImpl participantUnavailableMessageImpl;

	public ParticipantUnavailableMessageBuilder() {
		participantUnavailableMessageImpl = new ParticipantUnavailableMessageImpl();
	}

	public ParticipantUnavailableMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantUnavailableMessageImpl.id = id;
	}


	final public ParticipantUnavailableMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
		this.participantUnavailableMessageImpl._affectedParticipant = _affectedParticipant_;
		return this;
	}



	final public ParticipantUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantUnavailableMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantUnavailableMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantUnavailableMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantUnavailableMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantUnavailableMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantUnavailableMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantUnavailableMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantUnavailableMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantUnavailableMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantUnavailableMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantUnavailableMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantUnavailableMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantUnavailableMessageImpl);
		return participantUnavailableMessageImpl;
	}
}
