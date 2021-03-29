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

public class DynamicAttributeTokenBuilder {

	private DynamicAttributeTokenImpl dynamicAttributeTokenImpl;

	public DynamicAttributeTokenBuilder() {
		dynamicAttributeTokenImpl = new DynamicAttributeTokenImpl();
	}

	public DynamicAttributeTokenBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dynamicAttributeTokenImpl.id = id;
	}


	final public DynamicAttributeTokenBuilder _tokenValue_(String _tokenValue_) {
		this.dynamicAttributeTokenImpl._tokenValue = _tokenValue_;
		return this;
	}


	final public DynamicAttributeTokenBuilder _tokenFormat_(TokenFormat _tokenFormat_) {
		this.dynamicAttributeTokenImpl._tokenFormat = _tokenFormat_;
		return this;
	}

	public final DynamicAttributeToken build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dynamicAttributeTokenImpl);
		return dynamicAttributeTokenImpl;
	}
}
