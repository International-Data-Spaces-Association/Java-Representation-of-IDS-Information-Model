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

public class TrustedConnectorBuilder {

	private TrustedConnectorImpl trustedConnectorImpl;

	public TrustedConnectorBuilder() {
		trustedConnectorImpl = new TrustedConnectorImpl();
	}

	public TrustedConnectorBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		trustedConnectorImpl.id = id;
	}


	final public TrustedConnectorBuilder _hasEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.trustedConnectorImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	final public TrustedConnectorBuilder _hasAgent_(java.util.ArrayList<? extends URI> _hasAgent_) {
		this.trustedConnectorImpl._hasAgent = _hasAgent_;
		return this;
	}


	final public TrustedConnectorBuilder _resourceCatalog_(java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.trustedConnectorImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	final public TrustedConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.trustedConnectorImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	final public TrustedConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
		this.trustedConnectorImpl._authInfo = _authInfo_;
		return this;
	}


	final public TrustedConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.trustedConnectorImpl._securityProfile = _securityProfile_;
		return this;
	}


	final public TrustedConnectorBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.trustedConnectorImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public TrustedConnectorBuilder _maintainer_(URI _maintainer_) {
		this.trustedConnectorImpl._maintainer = _maintainer_;
		return this;
	}


	final public TrustedConnectorBuilder _curator_(URI _curator_) {
		this.trustedConnectorImpl._curator = _curator_;
		return this;
	}


	final public TrustedConnectorBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.trustedConnectorImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public TrustedConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.trustedConnectorImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public TrustedConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
		this.trustedConnectorImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public TrustedConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.trustedConnectorImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public TrustedConnectorBuilder _publicKey_(PublicKey _publicKey_) {
		this.trustedConnectorImpl._publicKey = _publicKey_;
		return this;
	}


	final public TrustedConnectorBuilder _version_(String _version_) {
		this.trustedConnectorImpl._version = _version_;
		return this;
	}


	final public TrustedConnectorBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.trustedConnectorImpl._title = _title_;
		return this;
	}


	final public TrustedConnectorBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.trustedConnectorImpl._description = _description_;
		return this;
	}

	public final TrustedConnector build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(trustedConnectorImpl);
		return trustedConnectorImpl;
	}
}
