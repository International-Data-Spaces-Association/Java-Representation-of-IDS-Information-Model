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

public class LoggingAgreementBuilder {

	private LoggingAgreementImpl loggingAgreementImpl;

	public LoggingAgreementBuilder() {
		loggingAgreementImpl = new LoggingAgreementImpl();
	}

	public LoggingAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		loggingAgreementImpl.id = id;
	}



	final public LoggingAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.loggingAgreementImpl._permission = _permission_;
		return this;
	}


	final public LoggingAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.loggingAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public LoggingAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.loggingAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public LoggingAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.loggingAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public LoggingAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.loggingAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public LoggingAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.loggingAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public LoggingAgreementBuilder _provider_(URI _provider_) {
		this.loggingAgreementImpl._provider = _provider_;
		return this;
	}


	final public LoggingAgreementBuilder _consumer_(URI _consumer_) {
		this.loggingAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public LoggingAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.loggingAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public LoggingAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.loggingAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final LoggingAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(loggingAgreementImpl);
		return loggingAgreementImpl;
	}
}
