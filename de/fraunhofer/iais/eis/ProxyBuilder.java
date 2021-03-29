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

public class ProxyBuilder {

	private ProxyImpl proxyImpl;

	public ProxyBuilder() {
		proxyImpl = new ProxyImpl();
	}

	public ProxyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		proxyImpl.id = id;
	}

	final public ProxyBuilder _noProxy_(java.util.ArrayList<? extends URI> _noProxy_) {
		this.proxyImpl._noProxy = _noProxy_;
		return this;
	}


	final public ProxyBuilder _proxyURI_(URI _proxyURI_) {
		this.proxyImpl._proxyURI = _proxyURI_;
		return this;
	}


	final public ProxyBuilder _proxyAuthentication_(BasicAuthentication _proxyAuthentication_) {
		this.proxyImpl._proxyAuthentication = _proxyAuthentication_;
		return this;
	}

	public final Proxy build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(proxyImpl);
		return proxyImpl;
	}
}
