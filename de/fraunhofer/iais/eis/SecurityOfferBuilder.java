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

public class SecurityOfferBuilder {

	private SecurityOfferImpl securityOfferImpl;

	public SecurityOfferBuilder() {
		securityOfferImpl = new SecurityOfferImpl();
	}

	public SecurityOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		securityOfferImpl.id = id;
	}



	final public SecurityOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.securityOfferImpl._permission = _permission_;
		return this;
	}


	final public SecurityOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.securityOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public SecurityOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.securityOfferImpl._obligation = _obligation_;
		return this;
	}


	final public SecurityOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.securityOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public SecurityOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.securityOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public SecurityOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.securityOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public SecurityOfferBuilder _provider_(URI _provider_) {
		this.securityOfferImpl._provider = _provider_;
		return this;
	}


	final public SecurityOfferBuilder _consumer_(URI _consumer_) {
		this.securityOfferImpl._consumer = _consumer_;
		return this;
	}


	final public SecurityOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.securityOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public SecurityOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.securityOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final SecurityOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(securityOfferImpl);
		return securityOfferImpl;
	}
}
