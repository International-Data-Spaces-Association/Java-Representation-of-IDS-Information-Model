package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class TrustedConnectorBuilder {

	private TrustedConnectorImpl trustedConnectorImpl;

	public TrustedConnectorBuilder() {
		trustedConnectorImpl = new TrustedConnectorImpl();
	}

	public TrustedConnectorBuilder(URI id) {
		this();
		trustedConnectorImpl.id = id;
	}


	/**
	* This function allows setting a value for hasEndpoint
	* @param _hasEndpoint_ desired value to be set
	* @return Builder object with new value for hasEndpoint
	*/
	final public TrustedConnectorBuilder _hasEndpoint_(ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.trustedConnectorImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for hasAgent
	* @param _hasAgent_ desired value to be set
	* @return Builder object with new value for hasAgent
	*/
	final public TrustedConnectorBuilder _hasAgent_(ArrayList<? extends URI> _hasAgent_) {
		this.trustedConnectorImpl._hasAgent = _hasAgent_;
		return this;
	}


	/**
	* This function allows setting a value for resourceCatalog
	* @param _resourceCatalog_ desired value to be set
	* @return Builder object with new value for resourceCatalog
	*/
	final public TrustedConnectorBuilder _resourceCatalog_(ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.trustedConnectorImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for hasDefaultEndpoint
	* @param _hasDefaultEndpoint_ desired value to be set
	* @return Builder object with new value for hasDefaultEndpoint
	*/
	final public TrustedConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.trustedConnectorImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for authInfo
	* @param _authInfo_ desired value to be set
	* @return Builder object with new value for authInfo
	*/
	final public TrustedConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
		this.trustedConnectorImpl._authInfo = _authInfo_;
		return this;
	}


	/**
	* This function allows setting a value for securityProfile
	* @param _securityProfile_ desired value to be set
	* @return Builder object with new value for securityProfile
	*/
	final public TrustedConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.trustedConnectorImpl._securityProfile = _securityProfile_;
		return this;
	}


	/**
	* This function allows setting a value for extendedGuarantee
	* @param _extendedGuarantee_ desired value to be set
	* @return Builder object with new value for extendedGuarantee
	*/
	final public TrustedConnectorBuilder _extendedGuarantee_(ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.trustedConnectorImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	/**
	* This function allows setting a value for maintainer
	* @param _maintainer_ desired value to be set
	* @return Builder object with new value for maintainer
	*/
	final public TrustedConnectorBuilder _maintainer_(URI _maintainer_) {
		this.trustedConnectorImpl._maintainer = _maintainer_;
		return this;
	}


	/**
	* This function allows setting a value for curator
	* @param _curator_ desired value to be set
	* @return Builder object with new value for curator
	*/
	final public TrustedConnectorBuilder _curator_(URI _curator_) {
		this.trustedConnectorImpl._curator = _curator_;
		return this;
	}


	/**
	* This function allows setting a value for inboundModelVersion
	* @param _inboundModelVersion_ desired value to be set
	* @return Builder object with new value for inboundModelVersion
	*/
	final public TrustedConnectorBuilder _inboundModelVersion_(ArrayList<? extends String> _inboundModelVersion_) {
		this.trustedConnectorImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for outboundModelVersion
	* @param _outboundModelVersion_ desired value to be set
	* @return Builder object with new value for outboundModelVersion
	*/
	final public TrustedConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.trustedConnectorImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for physicalLocation
	* @param _physicalLocation_ desired value to be set
	* @return Builder object with new value for physicalLocation
	*/
	final public TrustedConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
		this.trustedConnectorImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	/**
	* This function allows setting a value for componentCertification
	* @param _componentCertification_ desired value to be set
	* @return Builder object with new value for componentCertification
	*/
	final public TrustedConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.trustedConnectorImpl._componentCertification = _componentCertification_;
		return this;
	}


	/**
	* This function allows setting a value for publicKey
	* @param _publicKey_ desired value to be set
	* @return Builder object with new value for publicKey
	*/
	final public TrustedConnectorBuilder _publicKey_(PublicKey _publicKey_) {
		this.trustedConnectorImpl._publicKey = _publicKey_;
		return this;
	}


	/**
	* This function allows setting a value for version
	* @param _version_ desired value to be set
	* @return Builder object with new value for version
	*/
	final public TrustedConnectorBuilder _version_(String _version_) {
		this.trustedConnectorImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public TrustedConnectorBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.trustedConnectorImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public TrustedConnectorBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.trustedConnectorImpl._description = _description_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public TrustedConnector build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(trustedConnectorImpl);
		return trustedConnectorImpl;
	}
}
