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

public class IntervalBuilder {

	private IntervalImpl intervalImpl;

	public IntervalBuilder() {
		intervalImpl = new IntervalImpl();
	}

	public IntervalBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		intervalImpl.id = id;
	}

	final public IntervalBuilder _begin_(Instant _begin_) {
		this.intervalImpl._begin = _begin_;
		return this;
	}


	final public IntervalBuilder _end_(Instant _end_) {
		this.intervalImpl._end = _end_;
		return this;
	}


	final public IntervalBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
		this.intervalImpl._hasDuration = _hasDuration_;
		return this;
	}




	public final Interval build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(intervalImpl);
		return intervalImpl;
	}
}
