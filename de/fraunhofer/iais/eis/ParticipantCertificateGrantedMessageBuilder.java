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

public class ParticipantCertificateGrantedMessageBuilder {

	private ParticipantCertificateGrantedMessageImpl participantCertificateGrantedMessageImpl;

	public ParticipantCertificateGrantedMessageBuilder() {
		participantCertificateGrantedMessageImpl = new ParticipantCertificateGrantedMessageImpl();
	}

	public ParticipantCertificateGrantedMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantCertificateGrantedMessageImpl.id = id;
	}


	final public ParticipantCertificateGrantedMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
		this.participantCertificateGrantedMessageImpl._affectedParticipant = _affectedParticipant_;
		return this;
	}



	final public ParticipantCertificateGrantedMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantCertificateGrantedMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantCertificateGrantedMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantCertificateGrantedMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantCertificateGrantedMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantCertificateGrantedMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantCertificateGrantedMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantCertificateGrantedMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantCertificateGrantedMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantCertificateGrantedMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantCertificateGrantedMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantCertificateGrantedMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantCertificateGrantedMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantCertificateGrantedMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantCertificateGrantedMessageImpl);
		return participantCertificateGrantedMessageImpl;
	}
}
