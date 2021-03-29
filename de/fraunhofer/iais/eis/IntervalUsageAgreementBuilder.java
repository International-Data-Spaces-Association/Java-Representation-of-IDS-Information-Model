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

public class IntervalUsageAgreementBuilder {

	private IntervalUsageAgreementImpl intervalUsageAgreementImpl;

	public IntervalUsageAgreementBuilder() {
		intervalUsageAgreementImpl = new IntervalUsageAgreementImpl();
	}

	public IntervalUsageAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		intervalUsageAgreementImpl.id = id;
	}



	final public IntervalUsageAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.intervalUsageAgreementImpl._permission = _permission_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.intervalUsageAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.intervalUsageAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.intervalUsageAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.intervalUsageAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.intervalUsageAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _provider_(URI _provider_) {
		this.intervalUsageAgreementImpl._provider = _provider_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _consumer_(URI _consumer_) {
		this.intervalUsageAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.intervalUsageAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public IntervalUsageAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.intervalUsageAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final IntervalUsageAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(intervalUsageAgreementImpl);
		return intervalUsageAgreementImpl;
	}
}
