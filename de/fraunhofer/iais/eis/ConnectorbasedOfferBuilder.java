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

public class ConnectorbasedOfferBuilder {

	private ConnectorbasedOfferImpl connectorbasedOfferImpl;

	public ConnectorbasedOfferBuilder() {
		connectorbasedOfferImpl = new ConnectorbasedOfferImpl();
	}

	public ConnectorbasedOfferBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorbasedOfferImpl.id = id;
	}



	final public ConnectorbasedOfferBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.connectorbasedOfferImpl._permission = _permission_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.connectorbasedOfferImpl._prohibition = _prohibition_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.connectorbasedOfferImpl._obligation = _obligation_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.connectorbasedOfferImpl._contractStart = _contractStart_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.connectorbasedOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.connectorbasedOfferImpl._contractDate = _contractDate_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _provider_(URI _provider_) {
		this.connectorbasedOfferImpl._provider = _provider_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _consumer_(URI _consumer_) {
		this.connectorbasedOfferImpl._consumer = _consumer_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.connectorbasedOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ConnectorbasedOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.connectorbasedOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ConnectorbasedOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorbasedOfferImpl);
		return connectorbasedOfferImpl;
	}
}
