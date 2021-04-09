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

public class ProxyBuilder {

	private ProxyImpl proxyImpl;

	public ProxyBuilder() {
		proxyImpl = new ProxyImpl();
	}

	public ProxyBuilder(URI id) {
		this();
		proxyImpl.id = id;
	}

	/**
	* This function allows setting a value for noProxy
	* @param _noProxy_ desired value to be set
	* @return Builder object with new value for noProxy
	*/
	final public ProxyBuilder _noProxy_(ArrayList<? extends URI> _noProxy_) {
		this.proxyImpl._noProxy = _noProxy_;
		return this;
	}


	/**
	* This function allows setting a value for proxyURI
	* @param _proxyURI_ desired value to be set
	* @return Builder object with new value for proxyURI
	*/
	final public ProxyBuilder _proxyURI_(URI _proxyURI_) {
		this.proxyImpl._proxyURI = _proxyURI_;
		return this;
	}


	/**
	* This function allows setting a value for proxyAuthentication
	* @param _proxyAuthentication_ desired value to be set
	* @return Builder object with new value for proxyAuthentication
	*/
	final public ProxyBuilder _proxyAuthentication_(BasicAuthentication _proxyAuthentication_) {
		this.proxyImpl._proxyAuthentication = _proxyAuthentication_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Proxy build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(proxyImpl);
		return proxyImpl;
	}
}
