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

public class TemporalEntityBuilder {

	private TemporalEntityImpl temporalEntityImpl;

	public TemporalEntityBuilder() {
		temporalEntityImpl = new TemporalEntityImpl();
	}

	public TemporalEntityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		temporalEntityImpl.id = id;
	}

	final public TemporalEntityBuilder _hasDuration_(javax.xml.datatype.Duration _hasDuration_) {
		this.temporalEntityImpl._hasDuration = _hasDuration_;
		return this;
	}


	public final TemporalEntity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(temporalEntityImpl);
		return temporalEntityImpl;
	}
}
