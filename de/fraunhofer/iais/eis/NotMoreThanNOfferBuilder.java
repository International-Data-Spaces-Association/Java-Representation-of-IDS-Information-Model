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

public class NotMoreThanNOfferBuilder {

	private NotMoreThanNOfferImpl notMoreThanNOfferImpl;

	public NotMoreThanNOfferBuilder() {
		notMoreThanNOfferImpl = new NotMoreThanNOfferImpl();
	}

	public NotMoreThanNOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notMoreThanNOfferImpl.id = id;
	}



	final public NotMoreThanNOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notMoreThanNOfferImpl._permission = _permission_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notMoreThanNOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notMoreThanNOfferImpl._obligation = _obligation_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notMoreThanNOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notMoreThanNOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notMoreThanNOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _provider_(URI _provider_) {
		this.notMoreThanNOfferImpl._provider = _provider_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _consumer_(URI _consumer_) {
		this.notMoreThanNOfferImpl._consumer = _consumer_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notMoreThanNOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotMoreThanNOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notMoreThanNOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotMoreThanNOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notMoreThanNOfferImpl);
		return notMoreThanNOfferImpl;
	}
}
