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

public class ContractOfferBuilder {

	private ContractOfferImpl contractOfferImpl;

	public ContractOfferBuilder() {
		contractOfferImpl = new ContractOfferImpl();
	}

	public ContractOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractOfferImpl.id = id;
	}


	final public ContractOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.contractOfferImpl._permission = _permission_;
		return this;
	}


	final public ContractOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.contractOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public ContractOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.contractOfferImpl._obligation = _obligation_;
		return this;
	}


	final public ContractOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.contractOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public ContractOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.contractOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ContractOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.contractOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public ContractOfferBuilder _provider_(URI _provider_) {
		this.contractOfferImpl._provider = _provider_;
		return this;
	}


	final public ContractOfferBuilder _consumer_(URI _consumer_) {
		this.contractOfferImpl._consumer = _consumer_;
		return this;
	}


	final public ContractOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.contractOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ContractOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.contractOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ContractOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractOfferImpl);
		return contractOfferImpl;
	}
}
