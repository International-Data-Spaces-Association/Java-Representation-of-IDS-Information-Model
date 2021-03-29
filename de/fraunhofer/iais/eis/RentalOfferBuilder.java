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

public class RentalOfferBuilder {

	private RentalOfferImpl rentalOfferImpl;

	public RentalOfferBuilder() {
		rentalOfferImpl = new RentalOfferImpl();
	}

	public RentalOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rentalOfferImpl.id = id;
	}



	final public RentalOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.rentalOfferImpl._permission = _permission_;
		return this;
	}


	final public RentalOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.rentalOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public RentalOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.rentalOfferImpl._obligation = _obligation_;
		return this;
	}


	final public RentalOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.rentalOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public RentalOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.rentalOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public RentalOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.rentalOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public RentalOfferBuilder _provider_(URI _provider_) {
		this.rentalOfferImpl._provider = _provider_;
		return this;
	}


	final public RentalOfferBuilder _consumer_(URI _consumer_) {
		this.rentalOfferImpl._consumer = _consumer_;
		return this;
	}


	final public RentalOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.rentalOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public RentalOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.rentalOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final RentalOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rentalOfferImpl);
		return rentalOfferImpl;
	}
}
