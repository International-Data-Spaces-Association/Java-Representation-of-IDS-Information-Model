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

public class EventOfferBuilder {

	private EventOfferImpl eventOfferImpl;

	public EventOfferBuilder() {
		eventOfferImpl = new EventOfferImpl();
	}

	public EventOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventOfferImpl.id = id;
	}



	final public EventOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.eventOfferImpl._permission = _permission_;
		return this;
	}


	final public EventOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.eventOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public EventOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.eventOfferImpl._obligation = _obligation_;
		return this;
	}


	final public EventOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.eventOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public EventOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.eventOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public EventOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.eventOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public EventOfferBuilder _provider_(URI _provider_) {
		this.eventOfferImpl._provider = _provider_;
		return this;
	}


	final public EventOfferBuilder _consumer_(URI _consumer_) {
		this.eventOfferImpl._consumer = _consumer_;
		return this;
	}


	final public EventOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.eventOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public EventOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.eventOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final EventOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventOfferImpl);
		return eventOfferImpl;
	}
}
