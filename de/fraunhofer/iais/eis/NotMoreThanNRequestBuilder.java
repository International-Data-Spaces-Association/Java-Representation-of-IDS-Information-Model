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

public class NotMoreThanNRequestBuilder {

	private NotMoreThanNRequestImpl notMoreThanNRequestImpl;

	public NotMoreThanNRequestBuilder() {
		notMoreThanNRequestImpl = new NotMoreThanNRequestImpl();
	}

	public NotMoreThanNRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notMoreThanNRequestImpl.id = id;
	}



	final public NotMoreThanNRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notMoreThanNRequestImpl._permission = _permission_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notMoreThanNRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notMoreThanNRequestImpl._obligation = _obligation_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notMoreThanNRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notMoreThanNRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notMoreThanNRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _provider_(URI _provider_) {
		this.notMoreThanNRequestImpl._provider = _provider_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _consumer_(URI _consumer_) {
		this.notMoreThanNRequestImpl._consumer = _consumer_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notMoreThanNRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotMoreThanNRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notMoreThanNRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotMoreThanNRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notMoreThanNRequestImpl);
		return notMoreThanNRequestImpl;
	}
}
