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

public class SalesRequestBuilder {

	private SalesRequestImpl salesRequestImpl;

	public SalesRequestBuilder() {
		salesRequestImpl = new SalesRequestImpl();
	}

	public SalesRequestBuilder(URI id) {
		this();
		salesRequestImpl.id = id;
	}



	/**
	* This function allows setting a value for _contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for _contractStart
	*/
	final public SalesRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.salesRequestImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for _contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for _contractEnd
	*/
	final public SalesRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.salesRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for _contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for _contractDate
	*/
	final public SalesRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.salesRequestImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for _provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for _provider
	*/
	final public SalesRequestBuilder _provider_(URI _provider_) {
		this.salesRequestImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for _consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for _consumer
	*/
	final public SalesRequestBuilder _consumer_(URI _consumer_) {
		this.salesRequestImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for _contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for _contractDocument
	*/
	final public SalesRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.salesRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for _contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for _contractAnnex
	*/
	final public SalesRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.salesRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function allows setting a value for _permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for _permission
	*/
	final public SalesRequestBuilder _permission_(List<Permission> _permission_) {
		this.salesRequestImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for _prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for _prohibition
	*/
	final public SalesRequestBuilder _prohibition_(List<Prohibition> _prohibition_) {
		this.salesRequestImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for _obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for _obligation
	*/
	final public SalesRequestBuilder _obligation_(List<Duty> _obligation_) {
		this.salesRequestImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SalesRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(salesRequestImpl);
		return salesRequestImpl;
	}
}
