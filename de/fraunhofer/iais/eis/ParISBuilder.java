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

public class ParISBuilder {

	private ParISImpl parISImpl;

	public ParISBuilder() {
		parISImpl = new ParISImpl();
	}

	public ParISBuilder(URI id) {
		this();
		parISImpl.id = id;
	}

	/**
	* This function allows setting a value for _participantCatalog
	* @param _participantCatalog_ desired value to be set
	* @return Builder object with new value for _participantCatalog
	*/
	final public ParISBuilder _participantCatalog_(List<ParticipantCatalog> _participantCatalog_) {
		this.parISImpl._participantCatalog = _participantCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for _hasEndpoint
	* @param _hasEndpoint_ desired value to be set
	* @return Builder object with new value for _hasEndpoint
	*/
	final public ParISBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
		this.parISImpl._hasEndpoint = _hasEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _hasAgent
	* @param _hasAgent_ desired value to be set
	* @return Builder object with new value for _hasAgent
	*/
	final public ParISBuilder _hasAgent_(List<URI> _hasAgent_) {
		this.parISImpl._hasAgent = _hasAgent_;
		return this;
	}


	/**
	* This function allows setting a value for _resourceCatalog
	* @param _resourceCatalog_ desired value to be set
	* @return Builder object with new value for _resourceCatalog
	*/
	final public ParISBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
		this.parISImpl._resourceCatalog = _resourceCatalog_;
		return this;
	}


	/**
	* This function allows setting a value for _hasDefaultEndpoint
	* @param _hasDefaultEndpoint_ desired value to be set
	* @return Builder object with new value for _hasDefaultEndpoint
	*/
	final public ParISBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
		this.parISImpl._hasDefaultEndpoint = _hasDefaultEndpoint_;
		return this;
	}


	/**
	* This function allows setting a value for _authInfo
	* @param _authInfo_ desired value to be set
	* @return Builder object with new value for _authInfo
	*/
	final public ParISBuilder _authInfo_(AuthInfo _authInfo_) {
		this.parISImpl._authInfo = _authInfo_;
		return this;
	}


	/**
	* This function allows setting a value for _securityProfile
	* @param _securityProfile_ desired value to be set
	* @return Builder object with new value for _securityProfile
	*/
	final public ParISBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.parISImpl._securityProfile = _securityProfile_;
		return this;
	}


	/**
	* This function allows setting a value for _extendedGuarantee
	* @param _extendedGuarantee_ desired value to be set
	* @return Builder object with new value for _extendedGuarantee
	*/
	final public ParISBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
		this.parISImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	/**
	* This function allows setting a value for _maintainer
	* @param _maintainer_ desired value to be set
	* @return Builder object with new value for _maintainer
	*/
	final public ParISBuilder _maintainer_(URI _maintainer_) {
		this.parISImpl._maintainer = _maintainer_;
		return this;
	}


	/**
	* This function allows setting a value for _curator
	* @param _curator_ desired value to be set
	* @return Builder object with new value for _curator
	*/
	final public ParISBuilder _curator_(URI _curator_) {
		this.parISImpl._curator = _curator_;
		return this;
	}


	/**
	* This function allows setting a value for _inboundModelVersion
	* @param _inboundModelVersion_ desired value to be set
	* @return Builder object with new value for _inboundModelVersion
	*/
	final public ParISBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
		this.parISImpl._inboundModelVersion = _inboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _outboundModelVersion
	* @param _outboundModelVersion_ desired value to be set
	* @return Builder object with new value for _outboundModelVersion
	*/
	final public ParISBuilder _outboundModelVersion_(String _outboundModelVersion_) {
		this.parISImpl._outboundModelVersion = _outboundModelVersion_;
		return this;
	}


	/**
	* This function allows setting a value for _physicalLocation
	* @param _physicalLocation_ desired value to be set
	* @return Builder object with new value for _physicalLocation
	*/
	final public ParISBuilder _physicalLocation_(Location _physicalLocation_) {
		this.parISImpl._physicalLocation = _physicalLocation_;
		return this;
	}


	/**
	* This function allows setting a value for _componentCertification
	* @param _componentCertification_ desired value to be set
	* @return Builder object with new value for _componentCertification
	*/
	final public ParISBuilder _componentCertification_(ComponentCertification _componentCertification_) {
		this.parISImpl._componentCertification = _componentCertification_;
		return this;
	}


	/**
	* This function allows setting a value for _publicKey
	* @param _publicKey_ desired value to be set
	* @return Builder object with new value for _publicKey
	*/
	final public ParISBuilder _publicKey_(PublicKey _publicKey_) {
		this.parISImpl._publicKey = _publicKey_;
		return this;
	}


	/**
	* This function allows setting a value for _version
	* @param _version_ desired value to be set
	* @return Builder object with new value for _version
	*/
	final public ParISBuilder _version_(String _version_) {
		this.parISImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public ParISBuilder _title_(List<TypedLiteral> _title_) {
		this.parISImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public ParISBuilder _description_(List<TypedLiteral> _description_) {
		this.parISImpl._description = _description_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ParIS build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(parISImpl);
		return parISImpl;
	}
}
