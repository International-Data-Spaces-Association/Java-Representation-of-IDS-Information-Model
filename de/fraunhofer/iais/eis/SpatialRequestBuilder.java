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

public class SpatialRequestBuilder {

	private SpatialRequestImpl spatialRequestImpl;

	public SpatialRequestBuilder() {
		spatialRequestImpl = new SpatialRequestImpl();
	}

	public SpatialRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		spatialRequestImpl.id = id;
	}



	final public SpatialRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.spatialRequestImpl._permission = _permission_;
		return this;
	}


	final public SpatialRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.spatialRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public SpatialRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.spatialRequestImpl._obligation = _obligation_;
		return this;
	}


	final public SpatialRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.spatialRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public SpatialRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.spatialRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SpatialRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.spatialRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public SpatialRequestBuilder _provider_(URI _provider_) {
		this.spatialRequestImpl._provider = _provider_;
		return this;
	}


	final public SpatialRequestBuilder _consumer_(URI _consumer_) {
		this.spatialRequestImpl._consumer = _consumer_;
		return this;
	}


	final public SpatialRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.spatialRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SpatialRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.spatialRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SpatialRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(spatialRequestImpl);
		return spatialRequestImpl;
	}
}
