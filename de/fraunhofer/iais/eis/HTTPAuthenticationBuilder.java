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

public class HTTPAuthenticationBuilder {

	private HTTPAuthenticationImpl hTTPAuthenticationImpl;

	public HTTPAuthenticationBuilder() {
		hTTPAuthenticationImpl = new HTTPAuthenticationImpl();
	}

	public HTTPAuthenticationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		hTTPAuthenticationImpl.id = id;
	}

	final public HTTPAuthenticationBuilder _httpAuthURI_(URI _httpAuthURI_) {
		this.hTTPAuthenticationImpl._httpAuthURI = _httpAuthURI_;
		return this;
	}


	final public HTTPAuthenticationBuilder _authPassword_(String _authPassword_) {
		this.hTTPAuthenticationImpl._authPassword = _authPassword_;
		return this;
	}


	final public HTTPAuthenticationBuilder _authUsername_(String _authUsername_) {
		this.hTTPAuthenticationImpl._authUsername = _authUsername_;
		return this;
	}

	public final HTTPAuthentication build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(hTTPAuthenticationImpl);
		return hTTPAuthenticationImpl;
	}
}
