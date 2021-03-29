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

public class ParISBuilder {

	private ParISImpl parISImpl;

	public ParISBuilder() {
		parISImpl = new ParISImpl();
	}

	public ParISBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		parISImpl.id = id;
	}

	final public ParISBuilder _participantCatalog_(java.util.ArrayList<? extends ParticipantCatalog> _participantCatalog_) {
		this.parISImpl._participantCatalog = _participantCatalog_;
		return this;
	}


	final public ParISBuilder _hasEndpoint_(java.util.ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.parISImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	final public ParISBuilder _hasAgent_(java.util.ArrayList<? extends URI> _hasAgent_) {
		this.parISImpl._hasAgent = _hasAgent_;
		return this;
	}


	final public ParISBuilder _resourceCatalog_(java.util.ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.parISImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	final public ParISBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.parISImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	final public ParISBuilder _authInfo_(AuthInfo _authInfo_) {
		this.parISImpl._authInfo = _authInfo_;
		return this;
	}


	final public ParISBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.parISImpl._securityProfile = _securityProfile_;
		return this;
	}


	final public ParISBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.parISImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public ParISBuilder _maintainer_(URI _maintainer_) {
		this.parISImpl._maintainer = _maintainer_;
		return this;
	}


	final public ParISBuilder _curator_(URI _curator_) {
		this.parISImpl._curator = _curator_;
		return this;
	}


	final public ParISBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.parISImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public ParISBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.parISImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public ParISBuilder _physicalLocation_(Location _physicalLocation_) {
		this.parISImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public ParISBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.parISImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public ParISBuilder _publicKey_(PublicKey _publicKey_) {
		this.parISImpl._publicKey = _publicKey_;
		return this;
	}


	final public ParISBuilder _version_(String _version_) {
		this.parISImpl._version = _version_;
		return this;
	}


	final public ParISBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.parISImpl._title = _title_;
		return this;
	}


	final public ParISBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.parISImpl._description = _description_;
		return this;
	}

	public final ParIS build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(parISImpl);
		return parISImpl;
	}
}
