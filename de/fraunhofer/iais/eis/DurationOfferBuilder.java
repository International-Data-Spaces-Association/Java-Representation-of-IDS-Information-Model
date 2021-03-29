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

public class DurationOfferBuilder {

	private DurationOfferImpl durationOfferImpl;

	public DurationOfferBuilder() {
		durationOfferImpl = new DurationOfferImpl();
	}

	public DurationOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		durationOfferImpl.id = id;
	}



	final public DurationOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.durationOfferImpl._permission = _permission_;
		return this;
	}


	final public DurationOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.durationOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public DurationOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.durationOfferImpl._obligation = _obligation_;
		return this;
	}


	final public DurationOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.durationOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public DurationOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.durationOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DurationOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.durationOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public DurationOfferBuilder _provider_(URI _provider_) {
		this.durationOfferImpl._provider = _provider_;
		return this;
	}


	final public DurationOfferBuilder _consumer_(URI _consumer_) {
		this.durationOfferImpl._consumer = _consumer_;
		return this;
	}


	final public DurationOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.durationOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DurationOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.durationOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DurationOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(durationOfferImpl);
		return durationOfferImpl;
	}
}
