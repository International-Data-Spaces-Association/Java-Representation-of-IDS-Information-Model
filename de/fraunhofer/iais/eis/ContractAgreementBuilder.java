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

public class ContractAgreementBuilder {

	private ContractAgreementImpl contractAgreementImpl;

	public ContractAgreementBuilder() {
		contractAgreementImpl = new ContractAgreementImpl();
	}

	public ContractAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractAgreementImpl.id = id;
	}


	final public ContractAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.contractAgreementImpl._permission = _permission_;
		return this;
	}


	final public ContractAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.contractAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public ContractAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.contractAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public ContractAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.contractAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public ContractAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.contractAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ContractAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.contractAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public ContractAgreementBuilder _provider_(URI _provider_) {
		this.contractAgreementImpl._provider = _provider_;
		return this;
	}


	final public ContractAgreementBuilder _consumer_(URI _consumer_) {
		this.contractAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public ContractAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.contractAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ContractAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.contractAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ContractAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractAgreementImpl);
		return contractAgreementImpl;
	}
}
