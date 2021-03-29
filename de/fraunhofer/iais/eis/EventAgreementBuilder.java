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

public class EventAgreementBuilder {

	private EventAgreementImpl eventAgreementImpl;

	public EventAgreementBuilder() {
		eventAgreementImpl = new EventAgreementImpl();
	}

	public EventAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventAgreementImpl.id = id;
	}



	final public EventAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.eventAgreementImpl._permission = _permission_;
		return this;
	}


	final public EventAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.eventAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public EventAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.eventAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public EventAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.eventAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public EventAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.eventAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public EventAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.eventAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public EventAgreementBuilder _provider_(URI _provider_) {
		this.eventAgreementImpl._provider = _provider_;
		return this;
	}


	final public EventAgreementBuilder _consumer_(URI _consumer_) {
		this.eventAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public EventAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.eventAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public EventAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.eventAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final EventAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventAgreementImpl);
		return eventAgreementImpl;
	}
}
