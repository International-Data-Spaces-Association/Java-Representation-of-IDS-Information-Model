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

public class ParticipantCertificationBuilder {

	private ParticipantCertificationImpl participantCertificationImpl;

	public ParticipantCertificationBuilder() {
		participantCertificationImpl = new ParticipantCertificationImpl();
	}

	public ParticipantCertificationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantCertificationImpl.id = id;
	}

	final public ParticipantCertificationBuilder _membershipEnd_(XMLGregorianCalendar _membershipEnd_) {
		this.participantCertificationImpl._membershipEnd = _membershipEnd_;
		return this;
	}


	final public ParticipantCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
		this.participantCertificationImpl._certificationLevel = _certificationLevel_;
		return this;
	}


	final public ParticipantCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
		this.participantCertificationImpl._lastValidDate = _lastValidDate_;
		return this;
	}


	final public ParticipantCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
		this.participantCertificationImpl._evaluationFacility = _evaluationFacility_;
		return this;
	}


	final public ParticipantCertificationBuilder _version_(String _version_) {
		this.participantCertificationImpl._version = _version_;
		return this;
	}


	final public ParticipantCertificationBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.participantCertificationImpl._title = _title_;
		return this;
	}


	final public ParticipantCertificationBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.participantCertificationImpl._description = _description_;
		return this;
	}


	public final ParticipantCertification build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantCertificationImpl);
		return participantCertificationImpl;
	}
}
