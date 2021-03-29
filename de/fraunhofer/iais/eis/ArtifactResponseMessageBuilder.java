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

public class ArtifactResponseMessageBuilder {

	private ArtifactResponseMessageImpl artifactResponseMessageImpl;

	public ArtifactResponseMessageBuilder() {
		artifactResponseMessageImpl = new ArtifactResponseMessageImpl();
	}

	public ArtifactResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		artifactResponseMessageImpl.id = id;
	}



	final public ArtifactResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.artifactResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.artifactResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.artifactResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.artifactResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.artifactResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.artifactResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.artifactResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.artifactResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.artifactResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.artifactResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public ArtifactResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.artifactResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final ArtifactResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(artifactResponseMessageImpl);
		return artifactResponseMessageImpl;
	}
}
