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

public class LoggingRequestBuilder {

	private LoggingRequestImpl loggingRequestImpl;

	public LoggingRequestBuilder() {
		loggingRequestImpl = new LoggingRequestImpl();
	}

	public LoggingRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		loggingRequestImpl.id = id;
	}



	final public LoggingRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.loggingRequestImpl._permission = _permission_;
		return this;
	}


	final public LoggingRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.loggingRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public LoggingRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.loggingRequestImpl._obligation = _obligation_;
		return this;
	}


	final public LoggingRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.loggingRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public LoggingRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.loggingRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public LoggingRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.loggingRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public LoggingRequestBuilder _provider_(URI _provider_) {
		this.loggingRequestImpl._provider = _provider_;
		return this;
	}


	final public LoggingRequestBuilder _consumer_(URI _consumer_) {
		this.loggingRequestImpl._consumer = _consumer_;
		return this;
	}


	final public LoggingRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.loggingRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public LoggingRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.loggingRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final LoggingRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(loggingRequestImpl);
		return loggingRequestImpl;
	}
}
