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

public class DistributeEcryptedAgreementBuilder {

	private DistributeEcryptedAgreementImpl distributeEcryptedAgreementImpl;

	public DistributeEcryptedAgreementBuilder() {
		distributeEcryptedAgreementImpl = new DistributeEcryptedAgreementImpl();
	}

	public DistributeEcryptedAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		distributeEcryptedAgreementImpl.id = id;
	}



	final public DistributeEcryptedAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.distributeEcryptedAgreementImpl._permission = _permission_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.distributeEcryptedAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.distributeEcryptedAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.distributeEcryptedAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.distributeEcryptedAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.distributeEcryptedAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _provider_(URI _provider_) {
		this.distributeEcryptedAgreementImpl._provider = _provider_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _consumer_(URI _consumer_) {
		this.distributeEcryptedAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.distributeEcryptedAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DistributeEcryptedAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.distributeEcryptedAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DistributeEcryptedAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(distributeEcryptedAgreementImpl);
		return distributeEcryptedAgreementImpl;
	}
}
