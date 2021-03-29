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

public class ContractRequestBuilder {

	private ContractRequestImpl contractRequestImpl;

	public ContractRequestBuilder() {
		contractRequestImpl = new ContractRequestImpl();
	}

	public ContractRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		contractRequestImpl.id = id;
	}


	final public ContractRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.contractRequestImpl._permission = _permission_;
		return this;
	}


	final public ContractRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.contractRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public ContractRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.contractRequestImpl._obligation = _obligation_;
		return this;
	}


	final public ContractRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.contractRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public ContractRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.contractRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ContractRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.contractRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public ContractRequestBuilder _provider_(URI _provider_) {
		this.contractRequestImpl._provider = _provider_;
		return this;
	}


	final public ContractRequestBuilder _consumer_(URI _consumer_) {
		this.contractRequestImpl._consumer = _consumer_;
		return this;
	}


	final public ContractRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.contractRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ContractRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.contractRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ContractRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(contractRequestImpl);
		return contractRequestImpl;
	}
}
