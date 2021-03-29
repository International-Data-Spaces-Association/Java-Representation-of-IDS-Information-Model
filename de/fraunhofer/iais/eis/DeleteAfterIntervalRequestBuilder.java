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

public class DeleteAfterIntervalRequestBuilder {

	private DeleteAfterIntervalRequestImpl deleteAfterIntervalRequestImpl;

	public DeleteAfterIntervalRequestBuilder() {
		deleteAfterIntervalRequestImpl = new DeleteAfterIntervalRequestImpl();
	}

	public DeleteAfterIntervalRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		deleteAfterIntervalRequestImpl.id = id;
	}



	final public DeleteAfterIntervalRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.deleteAfterIntervalRequestImpl._permission = _permission_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.deleteAfterIntervalRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.deleteAfterIntervalRequestImpl._obligation = _obligation_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.deleteAfterIntervalRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.deleteAfterIntervalRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.deleteAfterIntervalRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _provider_(URI _provider_) {
		this.deleteAfterIntervalRequestImpl._provider = _provider_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _consumer_(URI _consumer_) {
		this.deleteAfterIntervalRequestImpl._consumer = _consumer_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.deleteAfterIntervalRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public DeleteAfterIntervalRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.deleteAfterIntervalRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final DeleteAfterIntervalRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(deleteAfterIntervalRequestImpl);
		return deleteAfterIntervalRequestImpl;
	}
}
