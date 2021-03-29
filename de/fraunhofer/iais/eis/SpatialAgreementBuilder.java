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

public class SpatialAgreementBuilder {

	private SpatialAgreementImpl spatialAgreementImpl;

	public SpatialAgreementBuilder() {
		spatialAgreementImpl = new SpatialAgreementImpl();
	}

	public SpatialAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		spatialAgreementImpl.id = id;
	}



	final public SpatialAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.spatialAgreementImpl._permission = _permission_;
		return this;
	}


	final public SpatialAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.spatialAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public SpatialAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.spatialAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public SpatialAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.spatialAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public SpatialAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.spatialAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SpatialAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.spatialAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public SpatialAgreementBuilder _provider_(URI _provider_) {
		this.spatialAgreementImpl._provider = _provider_;
		return this;
	}


	final public SpatialAgreementBuilder _consumer_(URI _consumer_) {
		this.spatialAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public SpatialAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.spatialAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SpatialAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.spatialAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SpatialAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(spatialAgreementImpl);
		return spatialAgreementImpl;
	}
}
