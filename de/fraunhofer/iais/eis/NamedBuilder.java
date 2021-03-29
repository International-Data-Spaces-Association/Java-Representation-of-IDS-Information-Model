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

public class NamedBuilder {

	private NamedImpl namedImpl;

	public NamedBuilder() {
		namedImpl = new NamedImpl();
	}

	public NamedBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		namedImpl.id = id;
	}

	final public NamedBuilder _name_(String _name_) {
		this.namedImpl._name = _name_;
		return this;
	}

	public final Named build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(namedImpl);
		return namedImpl;
	}
}
