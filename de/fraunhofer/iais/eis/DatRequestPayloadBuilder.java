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

public class DatRequestPayloadBuilder {

	private DatRequestPayloadImpl datRequestPayloadImpl;

	public DatRequestPayloadBuilder() {
		datRequestPayloadImpl = new DatRequestPayloadImpl();
	}

	public DatRequestPayloadBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		datRequestPayloadImpl.id = id;
	}


	final public DatRequestPayloadBuilder _aud_(Audience _aud_) {
		this.datRequestPayloadImpl._aud = _aud_;
		return this;
	}


	final public DatRequestPayloadBuilder _sub_(String _sub_) {
		this.datRequestPayloadImpl._sub = _sub_;
		return this;
	}


	final public DatRequestPayloadBuilder _nbf_(BigInteger _nbf_) {
		this.datRequestPayloadImpl._nbf = _nbf_;
		return this;
	}


	final public DatRequestPayloadBuilder _exp_(BigInteger _exp_) {
		this.datRequestPayloadImpl._exp = _exp_;
		return this;
	}


	final public DatRequestPayloadBuilder _iat_(BigInteger _iat_) {
		this.datRequestPayloadImpl._iat = _iat_;
		return this;
	}


	final public DatRequestPayloadBuilder _scope_(String _scope_) {
		this.datRequestPayloadImpl._scope = _scope_;
		return this;
	}


	final public DatRequestPayloadBuilder _transportCertsSha256_(java.util.ArrayList<? extends String> _transportCertsSha256_) {
		this.datRequestPayloadImpl._transportCertsSha256 = _transportCertsSha256_;
		return this;
	}


	final public DatRequestPayloadBuilder _referringConnector_(URI _referringConnector_) {
		this.datRequestPayloadImpl._referringConnector = _referringConnector_;
		return this;
	}


	final public DatRequestPayloadBuilder _iss_(String _iss_) {
		this.datRequestPayloadImpl._iss = _iss_;
		return this;
	}


	final public DatRequestPayloadBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.datRequestPayloadImpl._securityProfile = _securityProfile_;
		return this;
	}

	public final DatRequestPayload build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(datRequestPayloadImpl);
		return datRequestPayloadImpl;
	}
}
