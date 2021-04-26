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
import java.util.Objects;
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

public class BrokerBuilder {

	private BrokerImpl brokerImpl;

	public BrokerBuilder() {
		brokerImpl = new BrokerImpl();
	}

	public BrokerBuilder(URI id) {
		this();
		brokerImpl.id = id;
	}

	/**
	* This function allows setting a value for _connectorCatalog
	* @param _connectorCatalog_ desired value to be set
	* @return Builder object with new value for _connectorCatalog
	*/
	final public BrokerBuilder _connectorCatalog_(List<ConnectorCatalog> _connectorCatalog_) {
		this.brokerImpl._connectorCatalog = _connectorCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for _hasDefaultEndpoint
	* @param _hasDefaultEndpoint_ desired value to be set
	* @return Builder object with new value for _hasDefaultEndpoint
	*/
	final public BrokerBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.brokerImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _hasEndpoint
	* @param _hasEndpoint_ desired value to be set
	* @return Builder object with new value for _hasEndpoint
	*/
	final public BrokerBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
		this.brokerImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _authInfo
	* @param _authInfo_ desired value to be set
	* @return Builder object with new value for _authInfo
	*/
	final public BrokerBuilder _authInfo_(AuthInfo _authInfo_) {
		this.brokerImpl._authInfo = _authInfo_;
		return this;
	}


	/**
	* This function allows setting a value for _resourceCatalog
	* @param _resourceCatalog_ desired value to be set
	* @return Builder object with new value for _resourceCatalog
	*/
	final public BrokerBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
		this.brokerImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for _hasAgent
	* @param _hasAgent_ desired value to be set
	* @return Builder object with new value for _hasAgent
	*/
	final public BrokerBuilder _hasAgent_(List<URI> _hasAgent_) {
		this.brokerImpl._hasAgent = _hasAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _securityProfile
	* @param _securityProfile_ desired value to be set
	* @return Builder object with new value for _securityProfile
	*/
	final public BrokerBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.brokerImpl._securityProfile = _securityProfile_;
		return this;
	}


	/**
	* This function allows setting a value for _extendedGuarantee
	* @param _extendedGuarantee_ desired value to be set
	* @return Builder object with new value for _extendedGuarantee
	*/
	final public BrokerBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
		this.brokerImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	/**
	* This function allows setting a value for _maintainer
	* @param _maintainer_ desired value to be set
	* @return Builder object with new value for _maintainer
	*/
	final public BrokerBuilder _maintainer_(URI _maintainer_) {
		this.brokerImpl._maintainer = _maintainer_;
		return this;
	}


	/**
	* This function allows setting a value for _curator
	* @param _curator_ desired value to be set
	* @return Builder object with new value for _curator
	*/
	final public BrokerBuilder _curator_(URI _curator_) {
		this.brokerImpl._curator = _curator_;
		return this;
	}


	/**
	* This function allows setting a value for _physicalLocation
	* @param _physicalLocation_ desired value to be set
	* @return Builder object with new value for _physicalLocation
	*/
	final public BrokerBuilder _physicalLocation_(Location _physicalLocation_) {
		this.brokerImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	/**
	* This function allows setting a value for _inboundModelVersion
	* @param _inboundModelVersion_ desired value to be set
	* @return Builder object with new value for _inboundModelVersion
	*/
	final public BrokerBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
		this.brokerImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _outboundModelVersion
	* @param _outboundModelVersion_ desired value to be set
	* @return Builder object with new value for _outboundModelVersion
	*/
	final public BrokerBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.brokerImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _componentCertification
	* @param _componentCertification_ desired value to be set
	* @return Builder object with new value for _componentCertification
	*/
	final public BrokerBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.brokerImpl._componentCertification = _componentCertification_;
		return this;
	}


	/**
	* This function allows setting a value for _publicKey
	* @param _publicKey_ desired value to be set
	* @return Builder object with new value for _publicKey
	*/
	final public BrokerBuilder _publicKey_(PublicKey _publicKey_) {
		this.brokerImpl._publicKey = _publicKey_;
		return this;
	}


	/**
	* This function allows setting a value for _version
	* @param _version_ desired value to be set
	* @return Builder object with new value for _version
	*/
	final public BrokerBuilder _version_(String _version_) {
		this.brokerImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public BrokerBuilder _title_(List<TypedLiteral> _title_) {
		this.brokerImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public BrokerBuilder _description_(List<TypedLiteral> _description_) {
		this.brokerImpl._description = _description_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Broker build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(brokerImpl);
		return brokerImpl;
	}
}
