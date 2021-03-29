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

public class SwapOfferBuilder {

	private SwapOfferImpl swapOfferImpl;

	public SwapOfferBuilder() {
		swapOfferImpl = new SwapOfferImpl();
	}

	public SwapOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		swapOfferImpl.id = id;
	}



	final public SwapOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.swapOfferImpl._permission = _permission_;
		return this;
	}


	final public SwapOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.swapOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public SwapOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.swapOfferImpl._obligation = _obligation_;
		return this;
	}


	final public SwapOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.swapOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public SwapOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.swapOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SwapOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.swapOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public SwapOfferBuilder _provider_(URI _provider_) {
		this.swapOfferImpl._provider = _provider_;
		return this;
	}


	final public SwapOfferBuilder _consumer_(URI _consumer_) {
		this.swapOfferImpl._consumer = _consumer_;
		return this;
	}


	final public SwapOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.swapOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SwapOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.swapOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SwapOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(swapOfferImpl);
		return swapOfferImpl;
	}
}
