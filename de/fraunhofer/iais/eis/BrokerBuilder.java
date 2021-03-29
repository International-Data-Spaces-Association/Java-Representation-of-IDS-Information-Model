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

public class BrokerBuilder {

	private BrokerImpl brokerImpl;

	public BrokerBuilder() {
		brokerImpl = new BrokerImpl();
	}

	public BrokerBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		brokerImpl.id = id;
	}

	final public BrokerBuilder _connectorCatalog_(java.util.ArrayList<? extends ConnectorCatalog> _connectorCatalog_) {
		this.brokerImpl._connectorCatalog = _connectorCatalog_;
		return this;
	}


	final public BrokerBuilder _hasEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.brokerImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	final public BrokerBuilder _hasAgent_(java.util.ArrayList<? extends URI> _hasAgent_) {
		this.brokerImpl._hasAgent = _hasAgent_;
		return this;
	}


	final public BrokerBuilder _resourceCatalog_(java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.brokerImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	final public BrokerBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.brokerImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	final public BrokerBuilder _authInfo_(AuthInfo _authInfo_) {
		this.brokerImpl._authInfo = _authInfo_;
		return this;
	}


	final public BrokerBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.brokerImpl._securityProfile = _securityProfile_;
		return this;
	}


	final public BrokerBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.brokerImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public BrokerBuilder _maintainer_(URI _maintainer_) {
		this.brokerImpl._maintainer = _maintainer_;
		return this;
	}


	final public BrokerBuilder _curator_(URI _curator_) {
		this.brokerImpl._curator = _curator_;
		return this;
	}


	final public BrokerBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.brokerImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public BrokerBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.brokerImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public BrokerBuilder _physicalLocation_(Location _physicalLocation_) {
		this.brokerImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public BrokerBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.brokerImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public BrokerBuilder _publicKey_(PublicKey _publicKey_) {
		this.brokerImpl._publicKey = _publicKey_;
		return this;
	}


	final public BrokerBuilder _version_(String _version_) {
		this.brokerImpl._version = _version_;
		return this;
	}


	final public BrokerBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.brokerImpl._title = _title_;
		return this;
	}


	final public BrokerBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.brokerImpl._description = _description_;
		return this;
	}

	public final Broker build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(brokerImpl);
		return brokerImpl;
	}
}
