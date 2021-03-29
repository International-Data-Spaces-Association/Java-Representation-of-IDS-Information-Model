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

public class NotificationRequestBuilder {

	private NotificationRequestImpl notificationRequestImpl;

	public NotificationRequestBuilder() {
		notificationRequestImpl = new NotificationRequestImpl();
	}

	public NotificationRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notificationRequestImpl.id = id;
	}



	final public NotificationRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notificationRequestImpl._permission = _permission_;
		return this;
	}


	final public NotificationRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notificationRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotificationRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notificationRequestImpl._obligation = _obligation_;
		return this;
	}


	final public NotificationRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notificationRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotificationRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notificationRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotificationRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notificationRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotificationRequestBuilder _provider_(URI _provider_) {
		this.notificationRequestImpl._provider = _provider_;
		return this;
	}


	final public NotificationRequestBuilder _consumer_(URI _consumer_) {
		this.notificationRequestImpl._consumer = _consumer_;
		return this;
	}


	final public NotificationRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notificationRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotificationRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notificationRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotificationRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notificationRequestImpl);
		return notificationRequestImpl;
	}
}
