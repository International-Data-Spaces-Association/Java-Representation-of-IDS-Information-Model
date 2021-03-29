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

public class SpatialOfferBuilder {

	private SpatialOfferImpl spatialOfferImpl;

	public SpatialOfferBuilder() {
		spatialOfferImpl = new SpatialOfferImpl();
	}

	public SpatialOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		spatialOfferImpl.id = id;
	}



	final public SpatialOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.spatialOfferImpl._permission = _permission_;
		return this;
	}


	final public SpatialOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.spatialOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public SpatialOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.spatialOfferImpl._obligation = _obligation_;
		return this;
	}


	final public SpatialOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.spatialOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public SpatialOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.spatialOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SpatialOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.spatialOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public SpatialOfferBuilder _provider_(URI _provider_) {
		this.spatialOfferImpl._provider = _provider_;
		return this;
	}


	final public SpatialOfferBuilder _consumer_(URI _consumer_) {
		this.spatialOfferImpl._consumer = _consumer_;
		return this;
	}


	final public SpatialOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.spatialOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SpatialOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.spatialOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SpatialOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(spatialOfferImpl);
		return spatialOfferImpl;
	}
}
