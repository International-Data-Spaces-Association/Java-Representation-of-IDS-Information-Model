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

public class DistributeEcryptedRequestBuilder {

	private DistributeEcryptedRequestImpl distributeEcryptedRequestImpl;

	public DistributeEcryptedRequestBuilder() {
		distributeEcryptedRequestImpl = new DistributeEcryptedRequestImpl();
	}

	public DistributeEcryptedRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		distributeEcryptedRequestImpl.id = id;
	}



	final public DistributeEcryptedRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.distributeEcryptedRequestImpl._permission = _permission_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.distributeEcryptedRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.distributeEcryptedRequestImpl._obligation = _obligation_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.distributeEcryptedRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.distributeEcryptedRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.distributeEcryptedRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _provider_(URI _provider_) {
		this.distributeEcryptedRequestImpl._provider = _provider_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _consumer_(URI _consumer_) {
		this.distributeEcryptedRequestImpl._consumer = _consumer_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.distributeEcryptedRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DistributeEcryptedRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.distributeEcryptedRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DistributeEcryptedRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(distributeEcryptedRequestImpl);
		return distributeEcryptedRequestImpl;
	}
}
