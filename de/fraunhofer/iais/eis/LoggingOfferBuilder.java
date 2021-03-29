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

public class LoggingOfferBuilder {

	private LoggingOfferImpl loggingOfferImpl;

	public LoggingOfferBuilder() {
		loggingOfferImpl = new LoggingOfferImpl();
	}

	public LoggingOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		loggingOfferImpl.id = id;
	}



	final public LoggingOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.loggingOfferImpl._permission = _permission_;
		return this;
	}


	final public LoggingOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.loggingOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public LoggingOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.loggingOfferImpl._obligation = _obligation_;
		return this;
	}


	final public LoggingOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.loggingOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public LoggingOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.loggingOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public LoggingOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.loggingOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public LoggingOfferBuilder _provider_(URI _provider_) {
		this.loggingOfferImpl._provider = _provider_;
		return this;
	}


	final public LoggingOfferBuilder _consumer_(URI _consumer_) {
		this.loggingOfferImpl._consumer = _consumer_;
		return this;
	}


	final public LoggingOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.loggingOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public LoggingOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.loggingOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final LoggingOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(loggingOfferImpl);
		return loggingOfferImpl;
	}
}
