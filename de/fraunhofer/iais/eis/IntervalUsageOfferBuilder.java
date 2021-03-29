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

public class IntervalUsageOfferBuilder {

	private IntervalUsageOfferImpl intervalUsageOfferImpl;

	public IntervalUsageOfferBuilder() {
		intervalUsageOfferImpl = new IntervalUsageOfferImpl();
	}

	public IntervalUsageOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		intervalUsageOfferImpl.id = id;
	}



	final public IntervalUsageOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.intervalUsageOfferImpl._permission = _permission_;
		return this;
	}


	final public IntervalUsageOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.intervalUsageOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public IntervalUsageOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.intervalUsageOfferImpl._obligation = _obligation_;
		return this;
	}


	final public IntervalUsageOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.intervalUsageOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public IntervalUsageOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.intervalUsageOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public IntervalUsageOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.intervalUsageOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public IntervalUsageOfferBuilder _provider_(URI _provider_) {
		this.intervalUsageOfferImpl._provider = _provider_;
		return this;
	}


	final public IntervalUsageOfferBuilder _consumer_(URI _consumer_) {
		this.intervalUsageOfferImpl._consumer = _consumer_;
		return this;
	}


	final public IntervalUsageOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.intervalUsageOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public IntervalUsageOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.intervalUsageOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final IntervalUsageOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(intervalUsageOfferImpl);
		return intervalUsageOfferImpl;
	}
}
