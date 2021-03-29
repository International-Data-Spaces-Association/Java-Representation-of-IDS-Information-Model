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

public class RentalRequestBuilder {

	private RentalRequestImpl rentalRequestImpl;

	public RentalRequestBuilder() {
		rentalRequestImpl = new RentalRequestImpl();
	}

	public RentalRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rentalRequestImpl.id = id;
	}



	final public RentalRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.rentalRequestImpl._permission = _permission_;
		return this;
	}


	final public RentalRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.rentalRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public RentalRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.rentalRequestImpl._obligation = _obligation_;
		return this;
	}


	final public RentalRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.rentalRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public RentalRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.rentalRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public RentalRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.rentalRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public RentalRequestBuilder _provider_(URI _provider_) {
		this.rentalRequestImpl._provider = _provider_;
		return this;
	}


	final public RentalRequestBuilder _consumer_(URI _consumer_) {
		this.rentalRequestImpl._consumer = _consumer_;
		return this;
	}


	final public RentalRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.rentalRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public RentalRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.rentalRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final RentalRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rentalRequestImpl);
		return rentalRequestImpl;
	}
}
