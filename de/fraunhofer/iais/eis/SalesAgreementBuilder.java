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

public class SalesAgreementBuilder {

	private SalesAgreementImpl salesAgreementImpl;

	public SalesAgreementBuilder() {
		salesAgreementImpl = new SalesAgreementImpl();
	}

	public SalesAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		salesAgreementImpl.id = id;
	}



	final public SalesAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.salesAgreementImpl._permission = _permission_;
		return this;
	}


	final public SalesAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.salesAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public SalesAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.salesAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public SalesAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.salesAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public SalesAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.salesAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SalesAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.salesAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public SalesAgreementBuilder _provider_(URI _provider_) {
		this.salesAgreementImpl._provider = _provider_;
		return this;
	}


	final public SalesAgreementBuilder _consumer_(URI _consumer_) {
		this.salesAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public SalesAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.salesAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SalesAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.salesAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SalesAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(salesAgreementImpl);
		return salesAgreementImpl;
	}
}
