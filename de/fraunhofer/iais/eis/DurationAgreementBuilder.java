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

public class DurationAgreementBuilder {

	private DurationAgreementImpl durationAgreementImpl;

	public DurationAgreementBuilder() {
		durationAgreementImpl = new DurationAgreementImpl();
	}

	public DurationAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		durationAgreementImpl.id = id;
	}



	final public DurationAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.durationAgreementImpl._permission = _permission_;
		return this;
	}


	final public DurationAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.durationAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public DurationAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.durationAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public DurationAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.durationAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public DurationAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.durationAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DurationAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.durationAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public DurationAgreementBuilder _provider_(URI _provider_) {
		this.durationAgreementImpl._provider = _provider_;
		return this;
	}


	final public DurationAgreementBuilder _consumer_(URI _consumer_) {
		this.durationAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public DurationAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.durationAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DurationAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.durationAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DurationAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(durationAgreementImpl);
		return durationAgreementImpl;
	}
}
