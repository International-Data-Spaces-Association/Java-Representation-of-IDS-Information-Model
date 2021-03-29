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

public class EventRequestBuilder {

	private EventRequestImpl eventRequestImpl;

	public EventRequestBuilder() {
		eventRequestImpl = new EventRequestImpl();
	}

	public EventRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventRequestImpl.id = id;
	}



	final public EventRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.eventRequestImpl._permission = _permission_;
		return this;
	}


	final public EventRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.eventRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public EventRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.eventRequestImpl._obligation = _obligation_;
		return this;
	}


	final public EventRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.eventRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public EventRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.eventRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public EventRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.eventRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public EventRequestBuilder _provider_(URI _provider_) {
		this.eventRequestImpl._provider = _provider_;
		return this;
	}


	final public EventRequestBuilder _consumer_(URI _consumer_) {
		this.eventRequestImpl._consumer = _consumer_;
		return this;
	}


	final public EventRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.eventRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public EventRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.eventRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final EventRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventRequestImpl);
		return eventRequestImpl;
	}
}
