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

public class IdentityProviderBuilder {

	private IdentityProviderImpl identityProviderImpl;

	public IdentityProviderBuilder() {
		identityProviderImpl = new IdentityProviderImpl();
	}

	public IdentityProviderBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		identityProviderImpl.id = id;
	}


	final public IdentityProviderBuilder _maintainer_(URI _maintainer_) {
		this.identityProviderImpl._maintainer = _maintainer_;
		return this;
	}


	final public IdentityProviderBuilder _curator_(URI _curator_) {
		this.identityProviderImpl._curator = _curator_;
		return this;
	}


	final public IdentityProviderBuilder _inboundModelVersion_(java.util.ArrayList<? extends String> _inboundModelVersion_) {
		this.identityProviderImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	final public IdentityProviderBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.identityProviderImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	final public IdentityProviderBuilder _physicalLocation_(Location _physicalLocation_) {
		this.identityProviderImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	final public IdentityProviderBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.identityProviderImpl._componentCertification = _componentCertification_;
		return this;
	}


	final public IdentityProviderBuilder _publicKey_(PublicKey _publicKey_) {
		this.identityProviderImpl._publicKey = _publicKey_;
		return this;
	}


	final public IdentityProviderBuilder _version_(String _version_) {
		this.identityProviderImpl._version = _version_;
		return this;
	}


	final public IdentityProviderBuilder _title_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this.identityProviderImpl._title = _title_;
		return this;
	}


	final public IdentityProviderBuilder _description_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this.identityProviderImpl._description = _description_;
		return this;
	}

	public final IdentityProvider build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identityProviderImpl);
		return identityProviderImpl;
	}
}
