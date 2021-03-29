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

public class SwapAgreementBuilder {

	private SwapAgreementImpl swapAgreementImpl;

	public SwapAgreementBuilder() {
		swapAgreementImpl = new SwapAgreementImpl();
	}

	public SwapAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		swapAgreementImpl.id = id;
	}



	final public SwapAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.swapAgreementImpl._permission = _permission_;
		return this;
	}


	final public SwapAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.swapAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public SwapAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.swapAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public SwapAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.swapAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public SwapAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.swapAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SwapAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.swapAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public SwapAgreementBuilder _provider_(URI _provider_) {
		this.swapAgreementImpl._provider = _provider_;
		return this;
	}


	final public SwapAgreementBuilder _consumer_(URI _consumer_) {
		this.swapAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public SwapAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.swapAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SwapAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.swapAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SwapAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(swapAgreementImpl);
		return swapAgreementImpl;
	}
}
