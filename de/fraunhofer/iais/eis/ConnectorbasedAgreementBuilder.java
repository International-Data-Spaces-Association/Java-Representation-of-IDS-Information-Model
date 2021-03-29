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

public class ConnectorbasedAgreementBuilder {

	private ConnectorbasedAgreementImpl connectorbasedAgreementImpl;

	public ConnectorbasedAgreementBuilder() {
		connectorbasedAgreementImpl = new ConnectorbasedAgreementImpl();
	}

	public ConnectorbasedAgreementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorbasedAgreementImpl.id = id;
	}



	final public ConnectorbasedAgreementBuilder _permission_(java.util.ArrayList<? extends Permission> _permission_) {
		this.connectorbasedAgreementImpl._permission = _permission_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _prohibition_(java.util.ArrayList<? extends Prohibition> _prohibition_) {
		this.connectorbasedAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _obligation_(java.util.ArrayList<? extends Duty> _obligation_) {
		this.connectorbasedAgreementImpl._obligation = _obligation_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.connectorbasedAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.connectorbasedAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.connectorbasedAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _provider_(URI _provider_) {
		this.connectorbasedAgreementImpl._provider = _provider_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _consumer_(URI _consumer_) {
		this.connectorbasedAgreementImpl._consumer = _consumer_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.connectorbasedAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	final public ConnectorbasedAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.connectorbasedAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}



	public final ConnectorbasedAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorbasedAgreementImpl);
		return connectorbasedAgreementImpl;
	}
}
