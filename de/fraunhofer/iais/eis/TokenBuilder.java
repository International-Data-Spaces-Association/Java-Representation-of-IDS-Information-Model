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

public class TokenBuilder {

	private TokenImpl tokenImpl;

	public TokenBuilder() {
		tokenImpl = new TokenImpl();
	}

	public TokenBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		tokenImpl.id = id;
	}

	final public TokenBuilder _tokenValue_(String _tokenValue_) {
		this.tokenImpl._tokenValue = _tokenValue_;
		return this;
	}


	final public TokenBuilder _tokenFormat_(TokenFormat _tokenFormat_) {
		this.tokenImpl._tokenFormat = _tokenFormat_;
		return this;
	}

	public final Token build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(tokenImpl);
		return tokenImpl;
	}
}
