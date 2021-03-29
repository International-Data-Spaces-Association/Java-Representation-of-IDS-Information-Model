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

public class DurationRequestBuilder {

	private DurationRequestImpl durationRequestImpl;

	public DurationRequestBuilder() {
		durationRequestImpl = new DurationRequestImpl();
	}

	public DurationRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		durationRequestImpl.id = id;
	}



	final public DurationRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.durationRequestImpl._permission = _permission_;
		return this;
	}


	final public DurationRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.durationRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public DurationRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.durationRequestImpl._obligation = _obligation_;
		return this;
	}


	final public DurationRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.durationRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public DurationRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.durationRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DurationRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.durationRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public DurationRequestBuilder _provider_(URI _provider_) {
		this.durationRequestImpl._provider = _provider_;
		return this;
	}


	final public DurationRequestBuilder _consumer_(URI _consumer_) {
		this.durationRequestImpl._consumer = _consumer_;
		return this;
	}


	final public DurationRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.durationRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DurationRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.durationRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DurationRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(durationRequestImpl);
		return durationRequestImpl;
	}
}
