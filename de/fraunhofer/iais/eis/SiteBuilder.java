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

public class SiteBuilder {

	private SiteImpl siteImpl;

	public SiteBuilder() {
		siteImpl = new SiteImpl();
	}

	public SiteBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		siteImpl.id = id;
	}

	final public SiteBuilder _siteAddress_(String _siteAddress_) {
		this.siteImpl._siteAddress = _siteAddress_;
		return this;
	}


	public final Site build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(siteImpl);
		return siteImpl;
	}
}
