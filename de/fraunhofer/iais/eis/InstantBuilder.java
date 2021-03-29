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

public class InstantBuilder {

	private InstantImpl instantImpl;

	public InstantBuilder() {
		instantImpl = new InstantImpl();
	}

	public InstantBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		instantImpl.id = id;
	}

	final public InstantBuilder _dateTime_(XMLGregorianCalendar _dateTime_) {
		this.instantImpl._dateTime = _dateTime_;
		return this;
	}


	final public InstantBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
		this.instantImpl._hasDuration = _hasDuration_;
		return this;
	}



	public final Instant build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(instantImpl);
		return instantImpl;
	}
}
