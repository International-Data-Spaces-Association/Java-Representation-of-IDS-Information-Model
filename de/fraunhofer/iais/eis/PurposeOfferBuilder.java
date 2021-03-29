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

public class PurposeOfferBuilder {

	private PurposeOfferImpl purposeOfferImpl;

	public PurposeOfferBuilder() {
		purposeOfferImpl = new PurposeOfferImpl();
	}

	public PurposeOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		purposeOfferImpl.id = id;
	}



	final public PurposeOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.purposeOfferImpl._permission = _permission_;
		return this;
	}


	final public PurposeOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.purposeOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public PurposeOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.purposeOfferImpl._obligation = _obligation_;
		return this;
	}


	final public PurposeOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.purposeOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public PurposeOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.purposeOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public PurposeOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.purposeOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public PurposeOfferBuilder _provider_(URI _provider_) {
		this.purposeOfferImpl._provider = _provider_;
		return this;
	}


	final public PurposeOfferBuilder _consumer_(URI _consumer_) {
		this.purposeOfferImpl._consumer = _consumer_;
		return this;
	}


	final public PurposeOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.purposeOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public PurposeOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.purposeOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final PurposeOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(purposeOfferImpl);
		return purposeOfferImpl;
	}
}
