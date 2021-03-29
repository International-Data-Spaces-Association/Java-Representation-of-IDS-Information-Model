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

public class ParticipantCertificateRevokedMessageBuilder {

	private ParticipantCertificateRevokedMessageImpl participantCertificateRevokedMessageImpl;

	public ParticipantCertificateRevokedMessageBuilder() {
		participantCertificateRevokedMessageImpl = new ParticipantCertificateRevokedMessageImpl();
	}

	public ParticipantCertificateRevokedMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantCertificateRevokedMessageImpl.id = id;
	}

	final public ParticipantCertificateRevokedMessageBuilder _revocationReason_(de.fraunhofer.iais.eis.util.TypedLiteral _revocationReason_) {
		this.participantCertificateRevokedMessageImpl._revocationReason = _revocationReason_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
		this.participantCertificateRevokedMessageImpl._affectedParticipant = _affectedParticipant_;
		return this;
	}



	final public ParticipantCertificateRevokedMessageBuilder _modelVersion_(String _modelVersion_) {
		this.participantCertificateRevokedMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.participantCertificateRevokedMessageImpl._issued = _issued_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.participantCertificateRevokedMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.participantCertificateRevokedMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.participantCertificateRevokedMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.participantCertificateRevokedMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.participantCertificateRevokedMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.participantCertificateRevokedMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.participantCertificateRevokedMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _transferContract_(URI _transferContract_) {
		this.participantCertificateRevokedMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ParticipantCertificateRevokedMessageBuilder _contentVersion_(String _contentVersion_) {
		this.participantCertificateRevokedMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ParticipantCertificateRevokedMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantCertificateRevokedMessageImpl);
		return participantCertificateRevokedMessageImpl;
	}
}
