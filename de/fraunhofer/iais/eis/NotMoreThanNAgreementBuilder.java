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

public class NotMoreThanNAgreementBuilder {

	private NotMoreThanNAgreementImpl notMoreThanNAgreementImpl;

	public NotMoreThanNAgreementBuilder() {
		notMoreThanNAgreementImpl = new NotMoreThanNAgreementImpl();
	}

	public NotMoreThanNAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notMoreThanNAgreementImpl.id = id;
	}



	final public NotMoreThanNAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notMoreThanNAgreementImpl._permission = _permission_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notMoreThanNAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notMoreThanNAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notMoreThanNAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notMoreThanNAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notMoreThanNAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _provider_(URI _provider_) {
		this.notMoreThanNAgreementImpl._provider = _provider_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _consumer_(URI _consumer_) {
		this.notMoreThanNAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notMoreThanNAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotMoreThanNAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notMoreThanNAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotMoreThanNAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notMoreThanNAgreementImpl);
		return notMoreThanNAgreementImpl;
	}
}
