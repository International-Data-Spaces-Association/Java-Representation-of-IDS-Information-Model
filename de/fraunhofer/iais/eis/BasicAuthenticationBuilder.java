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

public class BasicAuthenticationBuilder {

	private BasicAuthenticationImpl basicAuthenticationImpl;

	public BasicAuthenticationBuilder() {
		basicAuthenticationImpl = new BasicAuthenticationImpl();
	}

	public BasicAuthenticationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		basicAuthenticationImpl.id = id;
	}

	final public BasicAuthenticationBuilder _authPassword_(String _authPassword_) {
		this.basicAuthenticationImpl._authPassword = _authPassword_;
		return this;
	}


	final public BasicAuthenticationBuilder _authUsername_(String _authUsername_) {
		this.basicAuthenticationImpl._authUsername = _authUsername_;
		return this;
	}

	public final BasicAuthentication build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(basicAuthenticationImpl);
		return basicAuthenticationImpl;
	}
}
