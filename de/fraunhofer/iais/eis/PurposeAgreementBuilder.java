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

public class PurposeAgreementBuilder {

	private PurposeAgreementImpl purposeAgreementImpl;

	public PurposeAgreementBuilder() {
		purposeAgreementImpl = new PurposeAgreementImpl();
	}

	public PurposeAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		purposeAgreementImpl.id = id;
	}



	final public PurposeAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.purposeAgreementImpl._permission = _permission_;
		return this;
	}


	final public PurposeAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.purposeAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public PurposeAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.purposeAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public PurposeAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.purposeAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public PurposeAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.purposeAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public PurposeAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.purposeAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public PurposeAgreementBuilder _provider_(URI _provider_) {
		this.purposeAgreementImpl._provider = _provider_;
		return this;
	}


	final public PurposeAgreementBuilder _consumer_(URI _consumer_) {
		this.purposeAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public PurposeAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.purposeAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public PurposeAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.purposeAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final PurposeAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(purposeAgreementImpl);
		return purposeAgreementImpl;
	}
}
