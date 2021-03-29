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

public class AppStoreBuilder {

	private AppStoreImpl appStoreImpl;

	public AppStoreBuilder() {
		appStoreImpl = new AppStoreImpl();
	}

	public AppStoreBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appStoreImpl.id = id;
	}


	final public AppStoreBuilder _hasEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.appStoreImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	final public AppStoreBuilder _hasAgent_(java.util.ArrayList<? extends URI> _hasAgent_) {
		this.appStoreImpl._hasAgent = _hasAgent_;
		return this;
	}


	final public AppStoreBuilder _resourceCatalog_(java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.appStoreImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	final public AppStoreBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.appStoreImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	final public AppStoreBuilder _authInfo_(AuthInfo _authInfo_) {
		this.appStoreImpl._authInfo = _authInfo_;
		return this;
	}


	final public AppStoreBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.appStoreImpl._securityProfile = _securityProfile_;
		return this;
	}


	final public AppStoreBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.appStoreImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public AppStoreBuilder _maintainer_(URI _maintainer_) {
		this.appStoreImpl._maintainer = _maintainer_;
		return this;
	}


	final public AppStoreBuilder _curator_(URI _curator_) {
		this.appStoreImpl._curator = _curator_;
		return this;
	}


	final public AppStoreBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.appStoreImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public AppStoreBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.appStoreImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public AppStoreBuilder _physicalLocation_(Location _physicalLocation_) {
		this.appStoreImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public AppStoreBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.appStoreImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public AppStoreBuilder _publicKey_(PublicKey _publicKey_) {
		this.appStoreImpl._publicKey = _publicKey_;
		return this;
	}


	final public AppStoreBuilder _version_(String _version_) {
		this.appStoreImpl._version = _version_;
		return this;
	}


	final public AppStoreBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.appStoreImpl._title = _title_;
		return this;
	}


	final public AppStoreBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.appStoreImpl._description = _description_;
		return this;
	}

	public final AppStore build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appStoreImpl);
		return appStoreImpl;
	}
}
