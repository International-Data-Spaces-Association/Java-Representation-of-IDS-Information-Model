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

public class DurationEntityBuilder {

	private DurationEntityImpl durationEntityImpl;

	public DurationEntityBuilder() {
		durationEntityImpl = new DurationEntityImpl();
	}

	public DurationEntityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		durationEntityImpl.id = id;
	}


	final public DurationEntityBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
		this.durationEntityImpl._hasDuration = _hasDuration_;
		return this;
	}


	public final DurationEntity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(durationEntityImpl);
		return durationEntityImpl;
	}
}
