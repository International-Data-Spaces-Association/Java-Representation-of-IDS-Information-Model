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

public class SecurityAgreementBuilder {

	private SecurityAgreementImpl securityAgreementImpl;

	public SecurityAgreementBuilder() {
		securityAgreementImpl = new SecurityAgreementImpl();
	}

	public SecurityAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		securityAgreementImpl.id = id;
	}



	final public SecurityAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.securityAgreementImpl._permission = _permission_;
		return this;
	}


	final public SecurityAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.securityAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public SecurityAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.securityAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public SecurityAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.securityAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public SecurityAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.securityAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SecurityAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.securityAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public SecurityAgreementBuilder _provider_(URI _provider_) {
		this.securityAgreementImpl._provider = _provider_;
		return this;
	}


	final public SecurityAgreementBuilder _consumer_(URI _consumer_) {
		this.securityAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public SecurityAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.securityAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SecurityAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.securityAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SecurityAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(securityAgreementImpl);
		return securityAgreementImpl;
	}
}
