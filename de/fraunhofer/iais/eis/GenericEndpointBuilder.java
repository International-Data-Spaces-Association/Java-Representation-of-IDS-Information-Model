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

public class GenericEndpointBuilder {

	private GenericEndpointImpl genericEndpointImpl;

	public GenericEndpointBuilder() {
		genericEndpointImpl = new GenericEndpointImpl();
	}

	public GenericEndpointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		genericEndpointImpl.id = id;
	}

	final public GenericEndpointBuilder _genericEndpointAuthentication_(BasicAuthentication _genericEndpointAuthentication_) {
		this.genericEndpointImpl._genericEndpointAuthentication = _genericEndpointAuthentication_;
		return this;
	}


	final public GenericEndpointBuilder _genericEndpointConfiguration_(String _genericEndpointConfiguration_) {
		this.genericEndpointImpl._genericEndpointConfiguration = _genericEndpointConfiguration_;
		return this;
	}


	final public GenericEndpointBuilder _endpointInformation_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation_) {
		this.genericEndpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	final public GenericEndpointBuilder _endpointDocumentation_(java.util.ArrayList<? extends URI> _endpointDocumentation_) {
		this.genericEndpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	final public GenericEndpointBuilder _accessURL_(URI _accessURL_) {
		this.genericEndpointImpl._accessURL = _accessURL_;
		return this;
	}


	final public GenericEndpointBuilder _path_(String _path_) {
		this.genericEndpointImpl._path = _path_;
		return this;
	}


	final public GenericEndpointBuilder _inboundPath_(String _inboundPath_) {
		this.genericEndpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	final public GenericEndpointBuilder _outboundPath_(String _outboundPath_) {
		this.genericEndpointImpl._outboundPath = _outboundPath_;
		return this;
	}

	public final GenericEndpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(genericEndpointImpl);
		return genericEndpointImpl;
	}
}
