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

public class AppEndpointBuilder {

	private AppEndpointImpl appEndpointImpl;

	public AppEndpointBuilder() {
		appEndpointImpl = new AppEndpointImpl();
	}

	public AppEndpointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appEndpointImpl.id = id;
	}

	final public AppEndpointBuilder _appEndpointType_(AppEndpointType _appEndpointType_) {
		this.appEndpointImpl._appEndpointType = _appEndpointType_;
		return this;
	}


	final public AppEndpointBuilder _appEndpointPort_(BigInteger _appEndpointPort_) {
		this.appEndpointImpl._appEndpointPort = _appEndpointPort_;
		return this;
	}


	final public AppEndpointBuilder _appEndpointMediaType_(MediaType _appEndpointMediaType_) {
		this.appEndpointImpl._appEndpointMediaType = _appEndpointMediaType_;
		return this;
	}


	final public AppEndpointBuilder _appEndpointProtocol_(String _appEndpointProtocol_) {
		this.appEndpointImpl._appEndpointProtocol = _appEndpointProtocol_;
		return this;
	}


	final public AppEndpointBuilder _language_(Language _language_) {
		this.appEndpointImpl._language = _language_;
		return this;
	}


	final public AppEndpointBuilder _endpointInformation_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation_) {
		this.appEndpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	final public AppEndpointBuilder _endpointDocumentation_(java.util.ArrayList<? extends URI> _endpointDocumentation_) {
		this.appEndpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	final public AppEndpointBuilder _accessURL_(URI _accessURL_) {
		this.appEndpointImpl._accessURL = _accessURL_;
		return this;
	}


	final public AppEndpointBuilder _path_(String _path_) {
		this.appEndpointImpl._path = _path_;
		return this;
	}


	final public AppEndpointBuilder _inboundPath_(String _inboundPath_) {
		this.appEndpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	final public AppEndpointBuilder _outboundPath_(String _outboundPath_) {
		this.appEndpointImpl._outboundPath = _outboundPath_;
		return this;
	}

	public final AppEndpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appEndpointImpl);
		return appEndpointImpl;
	}
}
