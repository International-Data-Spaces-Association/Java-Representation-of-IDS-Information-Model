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

public class ConnectorEndpointBuilder {

	private ConnectorEndpointImpl connectorEndpointImpl;

	public ConnectorEndpointBuilder() {
		connectorEndpointImpl = new ConnectorEndpointImpl();
	}

	public ConnectorEndpointBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		connectorEndpointImpl.id = id;
	}

	final public ConnectorEndpointBuilder _endpointArtifact_(Artifact _endpointArtifact_) {
		this.connectorEndpointImpl._endpointArtifact = _endpointArtifact_;
		return this;
	}


	final public ConnectorEndpointBuilder _endpointInformation_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _endpointInformation_) {
		this.connectorEndpointImpl._endpointInformation = _endpointInformation_;
		return this;
	}


	final public ConnectorEndpointBuilder _endpointDocumentation_(java.util.ArrayList<? extends URI> _endpointDocumentation_) {
		this.connectorEndpointImpl._endpointDocumentation = _endpointDocumentation_;
		return this;
	}


	final public ConnectorEndpointBuilder _accessURL_(URI _accessURL_) {
		this.connectorEndpointImpl._accessURL = _accessURL_;
		return this;
	}


	final public ConnectorEndpointBuilder _path_(String _path_) {
		this.connectorEndpointImpl._path = _path_;
		return this;
	}


	final public ConnectorEndpointBuilder _inboundPath_(String _inboundPath_) {
		this.connectorEndpointImpl._inboundPath = _inboundPath_;
		return this;
	}


	final public ConnectorEndpointBuilder _outboundPath_(String _outboundPath_) {
		this.connectorEndpointImpl._outboundPath = _outboundPath_;
		return this;
	}

	public final ConnectorEndpoint build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(connectorEndpointImpl);
		return connectorEndpointImpl;
	}
}
