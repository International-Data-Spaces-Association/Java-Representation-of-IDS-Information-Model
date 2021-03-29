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

public class SalesRequestBuilder {

	private SalesRequestImpl salesRequestImpl;

	public SalesRequestBuilder() {
		salesRequestImpl = new SalesRequestImpl();
	}

	public SalesRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		salesRequestImpl.id = id;
	}



	final public SalesRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.salesRequestImpl._permission = _permission_;
		return this;
	}


	final public SalesRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.salesRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public SalesRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.salesRequestImpl._obligation = _obligation_;
		return this;
	}


	final public SalesRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.salesRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public SalesRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.salesRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SalesRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.salesRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public SalesRequestBuilder _provider_(URI _provider_) {
		this.salesRequestImpl._provider = _provider_;
		return this;
	}


	final public SalesRequestBuilder _consumer_(URI _consumer_) {
		this.salesRequestImpl._consumer = _consumer_;
		return this;
	}


	final public SalesRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.salesRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SalesRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.salesRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SalesRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(salesRequestImpl);
		return salesRequestImpl;
	}
}
