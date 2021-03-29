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

public class DeleteAfterIntervalOfferBuilder {

	private DeleteAfterIntervalOfferImpl deleteAfterIntervalOfferImpl;

	public DeleteAfterIntervalOfferBuilder() {
		deleteAfterIntervalOfferImpl = new DeleteAfterIntervalOfferImpl();
	}

	public DeleteAfterIntervalOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		deleteAfterIntervalOfferImpl.id = id;
	}



	final public DeleteAfterIntervalOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.deleteAfterIntervalOfferImpl._permission = _permission_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.deleteAfterIntervalOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.deleteAfterIntervalOfferImpl._obligation = _obligation_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.deleteAfterIntervalOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.deleteAfterIntervalOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.deleteAfterIntervalOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _provider_(URI _provider_) {
		this.deleteAfterIntervalOfferImpl._provider = _provider_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _consumer_(URI _consumer_) {
		this.deleteAfterIntervalOfferImpl._consumer = _consumer_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.deleteAfterIntervalOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DeleteAfterIntervalOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.deleteAfterIntervalOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DeleteAfterIntervalOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(deleteAfterIntervalOfferImpl);
		return deleteAfterIntervalOfferImpl;
	}
}
