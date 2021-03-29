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

public class ParticipantCatalogBuilder {

	private ParticipantCatalogImpl participantCatalogImpl;

	public ParticipantCatalogBuilder() {
		participantCatalogImpl = new ParticipantCatalogImpl();
	}

	public ParticipantCatalogBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		participantCatalogImpl.id = id;
	}

	final public ParticipantCatalogBuilder _member_(java.util.ArrayList<? extends Participant> _member_) {
		this.participantCatalogImpl._member = _member_;
		return this;
	}



	public final ParticipantCatalog build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantCatalogImpl);
		return participantCatalogImpl;
	}
}
