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

public class DistributeEcryptedOfferBuilder {

	private DistributeEcryptedOfferImpl distributeEcryptedOfferImpl;

	public DistributeEcryptedOfferBuilder() {
		distributeEcryptedOfferImpl = new DistributeEcryptedOfferImpl();
	}

	public DistributeEcryptedOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		distributeEcryptedOfferImpl.id = id;
	}



	final public DistributeEcryptedOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.distributeEcryptedOfferImpl._permission = _permission_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.distributeEcryptedOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.distributeEcryptedOfferImpl._obligation = _obligation_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.distributeEcryptedOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.distributeEcryptedOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.distributeEcryptedOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _provider_(URI _provider_) {
		this.distributeEcryptedOfferImpl._provider = _provider_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _consumer_(URI _consumer_) {
		this.distributeEcryptedOfferImpl._consumer = _consumer_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.distributeEcryptedOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DistributeEcryptedOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.distributeEcryptedOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DistributeEcryptedOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(distributeEcryptedOfferImpl);
		return distributeEcryptedOfferImpl;
	}
}
