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

public class ArtifactRequestMessageBuilder {

	private ArtifactRequestMessageImpl artifactRequestMessageImpl;

	public ArtifactRequestMessageBuilder() {
		artifactRequestMessageImpl = new ArtifactRequestMessageImpl();
	}

	public ArtifactRequestMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		artifactRequestMessageImpl.id = id;
	}

	final public ArtifactRequestMessageBuilder _requestedArtifact_(URI _requestedArtifact_) {
		this.artifactRequestMessageImpl._requestedArtifact = _requestedArtifact_;
		return this;
	}



	final public ArtifactRequestMessageBuilder _modelVersion_(String _modelVersion_) {
		this.artifactRequestMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.artifactRequestMessageImpl._issued = _issued_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.artifactRequestMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.artifactRequestMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.artifactRequestMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.artifactRequestMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.artifactRequestMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.artifactRequestMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.artifactRequestMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _transferContract_(URI _transferContract_) {
		this.artifactRequestMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ArtifactRequestMessageBuilder _contentVersion_(String _contentVersion_) {
		this.artifactRequestMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ArtifactRequestMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(artifactRequestMessageImpl);
		return artifactRequestMessageImpl;
	}
}
