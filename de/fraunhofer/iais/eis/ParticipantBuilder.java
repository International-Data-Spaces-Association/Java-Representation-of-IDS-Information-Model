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

public class ParticipantBuilder {

	private ParticipantImpl participantImpl;

	public ParticipantBuilder() {
		participantImpl = new ParticipantImpl();
	}

	public ParticipantBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantImpl.id = id;
	}

	final public ParticipantBuilder _memberPerson_(java.util.ArrayList<? extends Person> _memberPerson_) {
		this.participantImpl._memberPerson = _memberPerson_;
		return this;
	}


	final public ParticipantBuilder _memberParticipant_(java.util.ArrayList<? extends Participant> _memberParticipant_) {
		this.participantImpl._memberParticipant = _memberParticipant_;
		return this;
	}


	final public ParticipantBuilder _corporateEmailAddress_(java.util.ArrayList<? extends String> _corporateEmailAddress_) {
		this.participantImpl._corporateEmailAddress = _corporateEmailAddress_;
		return this;
	}


	final public ParticipantBuilder _primarySite_(Site _primarySite_) {
		this.participantImpl._primarySite = _primarySite_;
		return this;
	}


	final public ParticipantBuilder _corporateHomepage_(URI _corporateHomepage_) {
		this.participantImpl._corporateHomepage = _corporateHomepage_;
		return this;
	}


	final public ParticipantBuilder _participantCertification_(ParticipantCertification _participantCertification_) {
		this.participantImpl._participantCertification = _participantCertification_;
		return this;
	}


	final public ParticipantBuilder _participantRefinement_(AbstractConstraint _participantRefinement_) {
		this.participantImpl._participantRefinement = _participantRefinement_;
		return this;
	}



	final public ParticipantBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.participantImpl._title = _title_;
		return this;
	}


	final public ParticipantBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.participantImpl._description = _description_;
		return this;
	}




	final public ParticipantBuilder _version_(String _version_) {
		this.participantImpl._version = _version_;
		return this;
	}


	public final Participant build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantImpl);
		return participantImpl;
	}
}
