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

public class SwapRequestBuilder {

	private SwapRequestImpl swapRequestImpl;

	public SwapRequestBuilder() {
		swapRequestImpl = new SwapRequestImpl();
	}

	public SwapRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		swapRequestImpl.id = id;
	}



	final public SwapRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.swapRequestImpl._permission = _permission_;
		return this;
	}


	final public SwapRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.swapRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public SwapRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.swapRequestImpl._obligation = _obligation_;
		return this;
	}


	final public SwapRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.swapRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public SwapRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.swapRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SwapRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.swapRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public SwapRequestBuilder _provider_(URI _provider_) {
		this.swapRequestImpl._provider = _provider_;
		return this;
	}


	final public SwapRequestBuilder _consumer_(URI _consumer_) {
		this.swapRequestImpl._consumer = _consumer_;
		return this;
	}


	final public SwapRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.swapRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SwapRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.swapRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SwapRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(swapRequestImpl);
		return swapRequestImpl;
	}
}
