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

public class SecurityRequestBuilder {

	private SecurityRequestImpl securityRequestImpl;

	public SecurityRequestBuilder() {
		securityRequestImpl = new SecurityRequestImpl();
	}

	public SecurityRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		securityRequestImpl.id = id;
	}



	final public SecurityRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.securityRequestImpl._permission = _permission_;
		return this;
	}


	final public SecurityRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.securityRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public SecurityRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.securityRequestImpl._obligation = _obligation_;
		return this;
	}


	final public SecurityRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.securityRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public SecurityRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.securityRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SecurityRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.securityRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public SecurityRequestBuilder _provider_(URI _provider_) {
		this.securityRequestImpl._provider = _provider_;
		return this;
	}


	final public SecurityRequestBuilder _consumer_(URI _consumer_) {
		this.securityRequestImpl._consumer = _consumer_;
		return this;
	}


	final public SecurityRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.securityRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SecurityRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.securityRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SecurityRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(securityRequestImpl);
		return securityRequestImpl;
	}
}
