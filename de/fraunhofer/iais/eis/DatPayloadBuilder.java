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

public class DatPayloadBuilder {

	private DatPayloadImpl datPayloadImpl;

	public DatPayloadBuilder() {
		datPayloadImpl = new DatPayloadImpl();
	}

	public DatPayloadBuilder(URI id) {
		this();
		datPayloadImpl.id = id;
	}

	/**
	* This function allows setting a value for _extendedGuarantee
	* @param _extendedGuarantee_ desired value to be set
	* @return Builder object with new value for _extendedGuarantee
	*/
	final public DatPayloadBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
		this.datPayloadImpl._extendedGuarantee = _extendedGuarantee_;
		return this;
	}


	/**
	* This function allows setting a value for _transportCertsSha256
	* @param _transportCertsSha256_ desired value to be set
	* @return Builder object with new value for _transportCertsSha256
	*/
	final public DatPayloadBuilder _transportCertsSha256_(List<String> _transportCertsSha256_) {
		this.datPayloadImpl._transportCertsSha256 = _transportCertsSha256_;
		return this;
	}


	/**
	* This function allows setting a value for _aud
	* @param _aud_ desired value to be set
	* @return Builder object with new value for _aud
	*/
	final public DatPayloadBuilder _aud_(Audience _aud_) {
		this.datPayloadImpl._aud = _aud_;
		return this;
	}


	/**
	* This function allows setting a value for _exp
	* @param _exp_ desired value to be set
	* @return Builder object with new value for _exp
	*/
	final public DatPayloadBuilder _exp_(BigInteger _exp_) {
		this.datPayloadImpl._exp = _exp_;
		return this;
	}


	/**
	* This function allows setting a value for _iat
	* @param _iat_ desired value to be set
	* @return Builder object with new value for _iat
	*/
	final public DatPayloadBuilder _iat_(BigInteger _iat_) {
		this.datPayloadImpl._iat = _iat_;
		return this;
	}


	/**
	* This function allows setting a value for _iss
	* @param _iss_ desired value to be set
	* @return Builder object with new value for _iss
	*/
	final public DatPayloadBuilder _iss_(String _iss_) {
		this.datPayloadImpl._iss = _iss_;
		return this;
	}


	/**
	* This function allows setting a value for _nbf
	* @param _nbf_ desired value to be set
	* @return Builder object with new value for _nbf
	*/
	final public DatPayloadBuilder _nbf_(BigInteger _nbf_) {
		this.datPayloadImpl._nbf = _nbf_;
		return this;
	}


	/**
	* This function allows setting a value for _referringConnector
	* @param _referringConnector_ desired value to be set
	* @return Builder object with new value for _referringConnector
	*/
	final public DatPayloadBuilder _referringConnector_(URI _referringConnector_) {
		this.datPayloadImpl._referringConnector = _referringConnector_;
		return this;
	}


	/**
	* This function allows setting a value for _scope
	* @param _scope_ desired value to be set
	* @return Builder object with new value for _scope
	*/
	final public DatPayloadBuilder _scope_(String _scope_) {
		this.datPayloadImpl._scope = _scope_;
		return this;
	}


	/**
	* This function allows setting a value for _sub
	* @param _sub_ desired value to be set
	* @return Builder object with new value for _sub
	*/
	final public DatPayloadBuilder _sub_(String _sub_) {
		this.datPayloadImpl._sub = _sub_;
		return this;
	}


	/**
	* This function allows setting a value for _securityProfile
	* @param _securityProfile_ desired value to be set
	* @return Builder object with new value for _securityProfile
	*/
	final public DatPayloadBuilder _securityProfile_(SecurityProfile _securityProfile_) {
		this.datPayloadImpl._securityProfile = _securityProfile_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DatPayload build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(datPayloadImpl);
		return datPayloadImpl;
	}
}
