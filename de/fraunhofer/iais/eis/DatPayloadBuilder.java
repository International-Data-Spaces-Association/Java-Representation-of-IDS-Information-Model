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

public class DatPayloadBuilder {

	private DatPayloadImpl datPayloadImpl;

	public DatPayloadBuilder() {
		datPayloadImpl = new DatPayloadImpl();
	}

	public DatPayloadBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		datPayloadImpl.id = id;
	}

	final public DatPayloadBuilder _extendedGuarantee_(java.util.ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.datPayloadImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	final public DatPayloadBuilder _aud_(Audience _aud_) {
		this.datPayloadImpl._aud = _aud_;
		return this;
	}


	final public DatPayloadBuilder _sub_(String _sub_) {
		this.datPayloadImpl._sub = _sub_;
		return this;
	}


	final public DatPayloadBuilder _nbf_(BigInteger _nbf_) {
		this.datPayloadImpl._nbf = _nbf_;
		return this;
	}


	final public DatPayloadBuilder _exp_(BigInteger _exp_) {
		this.datPayloadImpl._exp = _exp_;
		return this;
	}


	final public DatPayloadBuilder _iat_(BigInteger _iat_) {
		this.datPayloadImpl._iat = _iat_;
		return this;
	}


	final public DatPayloadBuilder _scope_(String _scope_) {
		this.datPayloadImpl._scope = _scope_;
		return this;
	}


	final public DatPayloadBuilder _transportCertsSha256_(java.util.ArrayList<? extends String> _transportCertsSha256_) {
		this.datPayloadImpl._transportCertsSha256 = _transportCertsSha256_;
		return this;
	}


	final public DatPayloadBuilder _referringConnector_(URI _referringConnector_) {
		this.datPayloadImpl._referringConnector = _referringConnector_;
		return this;
	}


	final public DatPayloadBuilder _iss_(String _iss_) {
		this.datPayloadImpl._iss = _iss_;
		return this;
	}


	final public DatPayloadBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.datPayloadImpl._securityProfile = _securityProfile_;
		return this;
	}

	public final DatPayload build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(datPayloadImpl);
		return datPayloadImpl;
	}
}
