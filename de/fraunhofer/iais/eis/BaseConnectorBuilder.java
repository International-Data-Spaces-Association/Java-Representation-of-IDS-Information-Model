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

public class BaseConnectorBuilder {

	private BaseConnectorImpl baseConnectorImpl;

	public BaseConnectorBuilder() {
		baseConnectorImpl = new BaseConnectorImpl();
	}

	public BaseConnectorBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		baseConnectorImpl.id = id;
	}


	final public BaseConnectorBuilder _hasEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.baseConnectorImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	final public BaseConnectorBuilder _hasAgent_(java.util.ArrayList<? extends URI> _hasAgent_) {
		this.baseConnectorImpl._hasAgent = _hasAgent_;
		return this;
	}


	final public BaseConnectorBuilder _resourceCatalog_(java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.baseConnectorImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	final public BaseConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.baseConnectorImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	final public BaseConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
		this.baseConnectorImpl._authInfo = _authInfo_;
		return this;
	}


	final public BaseConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.baseConnectorImpl._securityProfile = _securityProfile_;
		return this;
	}


	final public BaseConnectorBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.baseConnectorImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public BaseConnectorBuilder _maintainer_(URI _maintainer_) {
		this.baseConnectorImpl._maintainer = _maintainer_;
		return this;
	}


	final public BaseConnectorBuilder _curator_(URI _curator_) {
		this.baseConnectorImpl._curator = _curator_;
		return this;
	}


	final public BaseConnectorBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.baseConnectorImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public BaseConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.baseConnectorImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public BaseConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
		this.baseConnectorImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public BaseConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.baseConnectorImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public BaseConnectorBuilder _publicKey_(PublicKey _publicKey_) {
		this.baseConnectorImpl._publicKey = _publicKey_;
		return this;
	}


	final public BaseConnectorBuilder _version_(String _version_) {
		this.baseConnectorImpl._version = _version_;
		return this;
	}


	final public BaseConnectorBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.baseConnectorImpl._title = _title_;
		return this;
	}


	final public BaseConnectorBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.baseConnectorImpl._description = _description_;
		return this;
	}

	public final BaseConnector build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(baseConnectorImpl);
		return baseConnectorImpl;
	}
}
