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

public class BaseConnectorBuilder {

	private BaseConnectorImpl baseConnectorImpl;

	public BaseConnectorBuilder() {
		baseConnectorImpl = new BaseConnectorImpl();
	}

	public BaseConnectorBuilder(URI id) {
		this();
		baseConnectorImpl.id = id;
	}


	/**
	* This function allows setting a value for hasEndpoint
	* @param _hasEndpoint_ desired value to be set
	* @return Builder object with new value for hasEndpoint
	*/
	final public BaseConnectorBuilder _hasEndpoint_(ArrayList<? extends ConnectorEndpoint> _hasEndpoint_) {
		this.baseConnectorImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for hasAgent
	* @param _hasAgent_ desired value to be set
	* @return Builder object with new value for hasAgent
	*/
	final public BaseConnectorBuilder _hasAgent_(ArrayList<? extends URI> _hasAgent_) {
		this.baseConnectorImpl._hasAgent = _hasAgent_;
		return this;
	}


	/**
	* This function allows setting a value for resourceCatalog
	* @param _resourceCatalog_ desired value to be set
	* @return Builder object with new value for resourceCatalog
	*/
	final public BaseConnectorBuilder _resourceCatalog_(ArrayList<? extends ResourceCatalog> _resourceCatalog_) {
		this.baseConnectorImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for hasDefaultEndpoint
	* @param _hasDefaultEndpoint_ desired value to be set
	* @return Builder object with new value for hasDefaultEndpoint
	*/
	final public BaseConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.baseConnectorImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for authInfo
	* @param _authInfo_ desired value to be set
	* @return Builder object with new value for authInfo
	*/
	final public BaseConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
		this.baseConnectorImpl._authInfo = _authInfo_;
		return this;
	}


	/**
	* This function allows setting a value for securityProfile
	* @param _securityProfile_ desired value to be set
	* @return Builder object with new value for securityProfile
	*/
	final public BaseConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.baseConnectorImpl._securityProfile = _securityProfile_;
		return this;
	}


	/**
	* This function allows setting a value for extendedGuarantee
	* @param _extendedGuarantee_ desired value to be set
	* @return Builder object with new value for extendedGuarantee
	*/
	final public BaseConnectorBuilder _extendedGuarantee_(ArrayList<? extends SecurityGuarantee> _extendedGuarantee_) {
		this.baseConnectorImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	/**
	* This function allows setting a value for maintainer
	* @param _maintainer_ desired value to be set
	* @return Builder object with new value for maintainer
	*/
	final public BaseConnectorBuilder _maintainer_(URI _maintainer_) {
		this.baseConnectorImpl._maintainer = _maintainer_;
		return this;
	}


	/**
	* This function allows setting a value for curator
	* @param _curator_ desired value to be set
	* @return Builder object with new value for curator
	*/
	final public BaseConnectorBuilder _curator_(URI _curator_) {
		this.baseConnectorImpl._curator = _curator_;
		return this;
	}


	/**
	* This function allows setting a value for inboundModelVersion
	* @param _inboundModelVersion_ desired value to be set
	* @return Builder object with new value for inboundModelVersion
	*/
	final public BaseConnectorBuilder _inboundModelVersion_(ArrayList<? extends String> _inboundModelVersion_) {
		this.baseConnectorImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for outboundModelVersion
	* @param _outboundModelVersion_ desired value to be set
	* @return Builder object with new value for outboundModelVersion
	*/
	final public BaseConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.baseConnectorImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for physicalLocation
	* @param _physicalLocation_ desired value to be set
	* @return Builder object with new value for physicalLocation
	*/
	final public BaseConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
		this.baseConnectorImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	/**
	* This function allows setting a value for componentCertification
	* @param _componentCertification_ desired value to be set
	* @return Builder object with new value for componentCertification
	*/
	final public BaseConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.baseConnectorImpl._componentCertification = _componentCertification_;
		return this;
	}


	/**
	* This function allows setting a value for publicKey
	* @param _publicKey_ desired value to be set
	* @return Builder object with new value for publicKey
	*/
	final public BaseConnectorBuilder _publicKey_(PublicKey _publicKey_) {
		this.baseConnectorImpl._publicKey = _publicKey_;
		return this;
	}


	/**
	* This function allows setting a value for version
	* @param _version_ desired value to be set
	* @return Builder object with new value for version
	*/
	final public BaseConnectorBuilder _version_(String _version_) {
		this.baseConnectorImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public BaseConnectorBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.baseConnectorImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public BaseConnectorBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.baseConnectorImpl._description = _description_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public BaseConnector build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(baseConnectorImpl);
		return baseConnectorImpl;
	}
}
