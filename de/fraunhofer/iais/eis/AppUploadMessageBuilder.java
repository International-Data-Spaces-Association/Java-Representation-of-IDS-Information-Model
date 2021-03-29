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

public class AppUploadMessageBuilder {

	private AppUploadMessageImpl appUploadMessageImpl;

	public AppUploadMessageBuilder() {
		appUploadMessageImpl = new AppUploadMessageImpl();
	}

	public AppUploadMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appUploadMessageImpl.id = id;
	}

	final public AppUploadMessageBuilder _appArtifactReference_(URI _appArtifactReference_) {
		this.appUploadMessageImpl._appArtifactReference = _appArtifactReference_;
		return this;
	}




	final public AppUploadMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appUploadMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppUploadMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appUploadMessageImpl._issued = _issued_;
		return this;
	}


	final public AppUploadMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appUploadMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppUploadMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appUploadMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppUploadMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appUploadMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppUploadMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appUploadMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppUploadMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appUploadMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppUploadMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appUploadMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppUploadMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appUploadMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppUploadMessageBuilder _transferContract_(URI _transferContract_) {
		this.appUploadMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppUploadMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appUploadMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppUploadMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appUploadMessageImpl);
		return appUploadMessageImpl;
	}
}
