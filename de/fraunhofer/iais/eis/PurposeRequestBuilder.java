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

public class PurposeRequestBuilder {

	private PurposeRequestImpl purposeRequestImpl;

	public PurposeRequestBuilder() {
		purposeRequestImpl = new PurposeRequestImpl();
	}

	public PurposeRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		purposeRequestImpl.id = id;
	}



	final public PurposeRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.purposeRequestImpl._permission = _permission_;
		return this;
	}


	final public PurposeRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.purposeRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public PurposeRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.purposeRequestImpl._obligation = _obligation_;
		return this;
	}


	final public PurposeRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.purposeRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public PurposeRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.purposeRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public PurposeRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.purposeRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public PurposeRequestBuilder _provider_(URI _provider_) {
		this.purposeRequestImpl._provider = _provider_;
		return this;
	}


	final public PurposeRequestBuilder _consumer_(URI _consumer_) {
		this.purposeRequestImpl._consumer = _consumer_;
		return this;
	}


	final public PurposeRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.purposeRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public PurposeRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.purposeRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final PurposeRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(purposeRequestImpl);
		return purposeRequestImpl;
	}
}
