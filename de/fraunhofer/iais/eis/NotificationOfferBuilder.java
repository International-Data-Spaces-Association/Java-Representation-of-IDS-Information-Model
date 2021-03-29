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

public class NotificationOfferBuilder {

	private NotificationOfferImpl notificationOfferImpl;

	public NotificationOfferBuilder() {
		notificationOfferImpl = new NotificationOfferImpl();
	}

	public NotificationOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		notificationOfferImpl.id = id;
	}



	final public NotificationOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.notificationOfferImpl._permission = _permission_;
		return this;
	}


	final public NotificationOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.notificationOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public NotificationOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.notificationOfferImpl._obligation = _obligation_;
		return this;
	}


	final public NotificationOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notificationOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public NotificationOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notificationOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public NotificationOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notificationOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public NotificationOfferBuilder _provider_(URI _provider_) {
		this.notificationOfferImpl._provider = _provider_;
		return this;
	}


	final public NotificationOfferBuilder _consumer_(URI _consumer_) {
		this.notificationOfferImpl._consumer = _consumer_;
		return this;
	}


	final public NotificationOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notificationOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public NotificationOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notificationOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final NotificationOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notificationOfferImpl);
		return notificationOfferImpl;
	}
}
