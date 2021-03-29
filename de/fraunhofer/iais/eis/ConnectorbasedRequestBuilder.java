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

public class ConnectorbasedRequestBuilder {

	private ConnectorbasedRequestImpl connectorbasedRequestImpl;

	public ConnectorbasedRequestBuilder() {
		connectorbasedRequestImpl = new ConnectorbasedRequestImpl();
	}

	public ConnectorbasedRequestBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorbasedRequestImpl.id = id;
	}



	final public ConnectorbasedRequestBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.connectorbasedRequestImpl._permission = _permission_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.connectorbasedRequestImpl._prohibition = _prohibition_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.connectorbasedRequestImpl._obligation = _obligation_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.connectorbasedRequestImpl._contractStart = _contractStart_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.connectorbasedRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.connectorbasedRequestImpl._contractDate = _contractDate_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _provider_(URI _provider_) {
		this.connectorbasedRequestImpl._provider = _provider_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _consumer_(URI _consumer_) {
		this.connectorbasedRequestImpl._consumer = _consumer_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.connectorbasedRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ConnectorbasedRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.connectorbasedRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ConnectorbasedRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorbasedRequestImpl);
		return connectorbasedRequestImpl;
	}
}
