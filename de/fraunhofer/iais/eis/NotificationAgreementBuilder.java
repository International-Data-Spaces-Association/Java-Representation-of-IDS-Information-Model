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

public class NotificationAgreementBuilder {

	private NotificationAgreementImpl notificationAgreementImpl;

	public NotificationAgreementBuilder() {
		notificationAgreementImpl = new NotificationAgreementImpl();
	}

	public NotificationAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notificationAgreementImpl.id = id;
	}



	final public NotificationAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notificationAgreementImpl._permission = _permission_;
		return this;
	}


	final public NotificationAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notificationAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotificationAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notificationAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public NotificationAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notificationAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotificationAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notificationAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotificationAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notificationAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotificationAgreementBuilder _provider_(URI _provider_) {
		this.notificationAgreementImpl._provider = _provider_;
		return this;
	}


	final public NotificationAgreementBuilder _consumer_(URI _consumer_) {
		this.notificationAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public NotificationAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notificationAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotificationAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notificationAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotificationAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notificationAgreementImpl);
		return notificationAgreementImpl;
	}
}
