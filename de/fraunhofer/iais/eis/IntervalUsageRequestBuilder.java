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

public class IntervalUsageRequestBuilder {

	private IntervalUsageRequestImpl intervalUsageRequestImpl;

	public IntervalUsageRequestBuilder() {
		intervalUsageRequestImpl = new IntervalUsageRequestImpl();
	}

	public IntervalUsageRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		intervalUsageRequestImpl.id = id;
	}



	final public IntervalUsageRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.intervalUsageRequestImpl._permission = _permission_;
		return this;
	}


	final public IntervalUsageRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.intervalUsageRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public IntervalUsageRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.intervalUsageRequestImpl._obligation = _obligation_;
		return this;
	}


	final public IntervalUsageRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.intervalUsageRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public IntervalUsageRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.intervalUsageRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public IntervalUsageRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.intervalUsageRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public IntervalUsageRequestBuilder _provider_(URI _provider_) {
		this.intervalUsageRequestImpl._provider = _provider_;
		return this;
	}


	final public IntervalUsageRequestBuilder _consumer_(URI _consumer_) {
		this.intervalUsageRequestImpl._consumer = _consumer_;
		return this;
	}


	final public IntervalUsageRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.intervalUsageRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public IntervalUsageRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.intervalUsageRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final IntervalUsageRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(intervalUsageRequestImpl);
		return intervalUsageRequestImpl;
	}
}
