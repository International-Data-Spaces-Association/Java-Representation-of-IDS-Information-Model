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

public class EventBuilder {

	private EventImpl eventImpl;

	public EventBuilder() {
		eventImpl = new EventImpl();
	}

	public EventBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventImpl.id = id;
	}


	public final Event build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventImpl);
		return eventImpl;
	}
}
