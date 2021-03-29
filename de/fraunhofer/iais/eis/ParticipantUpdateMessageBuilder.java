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

public class ParticipantUpdateMessageBuilder {

	private ParticipantUpdateMessageImpl participantUpdateMessageImpl;

	public ParticipantUpdateMessageBuilder() {
		participantUpdateMessageImpl = new ParticipantUpdateMessageImpl();
	}

	public ParticipantUpdateMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantUpdateMessageImpl.id = id;
	}


	final public ParticipantUpdateMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
		this.participantUpdateMessageImpl._affectedParticipant = _affectedParticipant_;
		return this;
	}



	final public ParticipantUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantUpdateMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantUpdateMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantUpdateMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantUpdateMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantUpdateMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantUpdateMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantUpdateMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantUpdateMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantUpdateMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantUpdateMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantUpdateMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantUpdateMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantUpdateMessageImpl);
		return participantUpdateMessageImpl;
	}
}
