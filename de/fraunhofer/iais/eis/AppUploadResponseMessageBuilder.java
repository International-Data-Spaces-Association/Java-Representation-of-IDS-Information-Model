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

public class AppUploadResponseMessageBuilder {

	private AppUploadResponseMessageImpl appUploadResponseMessageImpl;

	public AppUploadResponseMessageBuilder() {
		appUploadResponseMessageImpl = new AppUploadResponseMessageImpl();
	}

	public AppUploadResponseMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		appUploadResponseMessageImpl.id = id;
	}




	final public AppUploadResponseMessageBuilder _modelVersion_(String _modelVersion_) {
		this.appUploadResponseMessageImpl._modelVersion = _modelVersion_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
		this.appUploadResponseMessageImpl._issued = _issued_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _issuerConnector_(URI _issuerConnector_) {
		this.appUploadResponseMessageImpl._issuerConnector = _issuerConnector_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _recipientConnector_(java.util.ArrayList<? extends URI> _recipientConnector_) {
		this.appUploadResponseMessageImpl._recipientConnector = _recipientConnector_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
		this.appUploadResponseMessageImpl._securityToken = _securityToken_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _senderAgent_(URI _senderAgent_) {
		this.appUploadResponseMessageImpl._senderAgent = _senderAgent_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _recipientAgent_(java.util.ArrayList<? extends URI> _recipientAgent_) {
		this.appUploadResponseMessageImpl._recipientAgent = _recipientAgent_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _correlationMessage_(URI _correlationMessage_) {
		this.appUploadResponseMessageImpl._correlationMessage = _correlationMessage_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _authorizationToken_(Token _authorizationToken_) {
		this.appUploadResponseMessageImpl._authorizationToken = _authorizationToken_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _transferContract_(URI _transferContract_) {
		this.appUploadResponseMessageImpl._transferContract = _transferContract_;
		return this;
	}


	final public AppUploadResponseMessageBuilder _contentVersion_(String _contentVersion_) {
		this.appUploadResponseMessageImpl._contentVersion = _contentVersion_;
		return this;
	}

	public final AppUploadResponseMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(appUploadResponseMessageImpl);
		return appUploadResponseMessageImpl;
	}
}
