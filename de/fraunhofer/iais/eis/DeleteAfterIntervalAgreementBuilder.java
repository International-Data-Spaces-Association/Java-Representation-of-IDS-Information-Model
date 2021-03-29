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

public class DeleteAfterIntervalAgreementBuilder {

	private DeleteAfterIntervalAgreementImpl deleteAfterIntervalAgreementImpl;

	public DeleteAfterIntervalAgreementBuilder() {
		deleteAfterIntervalAgreementImpl = new DeleteAfterIntervalAgreementImpl();
	}

	public DeleteAfterIntervalAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		deleteAfterIntervalAgreementImpl.id = id;
	}



	final public DeleteAfterIntervalAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.deleteAfterIntervalAgreementImpl._permission = _permission_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.deleteAfterIntervalAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.deleteAfterIntervalAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.deleteAfterIntervalAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.deleteAfterIntervalAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.deleteAfterIntervalAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _provider_(URI _provider_) {
		this.deleteAfterIntervalAgreementImpl._provider = _provider_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _consumer_(URI _consumer_) {
		this.deleteAfterIntervalAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.deleteAfterIntervalAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DeleteAfterIntervalAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.deleteAfterIntervalAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DeleteAfterIntervalAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(deleteAfterIntervalAgreementImpl);
		return deleteAfterIntervalAgreementImpl;
	}
}
