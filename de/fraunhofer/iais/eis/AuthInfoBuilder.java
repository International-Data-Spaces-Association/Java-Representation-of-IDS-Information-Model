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

public class AuthInfoBuilder {

	private AuthInfoImpl authInfoImpl;

	public AuthInfoBuilder() {
		authInfoImpl = new AuthInfoImpl();
	}

	public AuthInfoBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		authInfoImpl.id = id;
	}

	final public AuthInfoBuilder _authService_(URI _authService_) {
		this.authInfoImpl._authService = _authService_;
		return this;
	}


	final public AuthInfoBuilder _authStandard_(AuthStandard _authStandard_) {
		this.authInfoImpl._authStandard = _authStandard_;
		return this;
	}

	public final AuthInfo build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(authInfoImpl);
		return authInfoImpl;
	}
}
