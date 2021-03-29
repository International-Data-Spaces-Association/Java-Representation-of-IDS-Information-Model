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

public class EndpointBuilder {

	private EndpointImpl endpointImpl;

	public EndpointBuilder() {
		endpointImpl = new EndpointImpl();
	}

	public EndpointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		endpointImpl.id = id;
	}

	final public EndpointBuilder _endpointInformation_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation_) {
		this.endpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	final public EndpointBuilder _endpointDocumentation_(java.util.ArrayList<? extends URI> _endpointDocumentation_) {
		this.endpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	final public EndpointBuilder _accessURL_(URI _accessURL_) {
		this.endpointImpl._accessURL = _accessURL_;
		return this;
	}


	final public EndpointBuilder _path_(String _path_) {
		this.endpointImpl._path = _path_;
		return this;
	}


	final public EndpointBuilder _inboundPath_(String _inboundPath_) {
		this.endpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	final public EndpointBuilder _outboundPath_(String _outboundPath_) {
		this.endpointImpl._outboundPath = _outboundPath_;
		return this;
	}

	public final Endpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(endpointImpl);
		return endpointImpl;
	}
}
