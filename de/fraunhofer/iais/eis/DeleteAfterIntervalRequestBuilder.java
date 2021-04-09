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

public class DeleteAfterIntervalRequestBuilder {

	private DeleteAfterIntervalRequestImpl deleteAfterIntervalRequestImpl;

	public DeleteAfterIntervalRequestBuilder() {
		deleteAfterIntervalRequestImpl = new DeleteAfterIntervalRequestImpl();
	}

	public DeleteAfterIntervalRequestBuilder(URI id) {
		this();
		deleteAfterIntervalRequestImpl.id = id;
	}



	/**
	* This function allows setting a value for permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for permission
	*/
	final public DeleteAfterIntervalRequestBuilder _permission_(ArrayList<? extends Permission> _permission_) {
		this.deleteAfterIntervalRequestImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for prohibition
	*/
	final public DeleteAfterIntervalRequestBuilder _prohibition_(ArrayList<? extends Prohibition> _prohibition_) {
		this.deleteAfterIntervalRequestImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for obligation
	*/
	final public DeleteAfterIntervalRequestBuilder _obligation_(ArrayList<? extends Duty> _obligation_) {
		this.deleteAfterIntervalRequestImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function allows setting a value for contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for contractStart
	*/
	final public DeleteAfterIntervalRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.deleteAfterIntervalRequestImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for contractEnd
	*/
	final public DeleteAfterIntervalRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.deleteAfterIntervalRequestImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for contractDate
	*/
	final public DeleteAfterIntervalRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.deleteAfterIntervalRequestImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for provider
	*/
	final public DeleteAfterIntervalRequestBuilder _provider_(URI _provider_) {
		this.deleteAfterIntervalRequestImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for consumer
	*/
	final public DeleteAfterIntervalRequestBuilder _consumer_(URI _consumer_) {
		this.deleteAfterIntervalRequestImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for contractDocument
	*/
	final public DeleteAfterIntervalRequestBuilder _contractDocument_(TextResource _contractDocument_) {
		this.deleteAfterIntervalRequestImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for contractAnnex
	*/
	final public DeleteAfterIntervalRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.deleteAfterIntervalRequestImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DeleteAfterIntervalRequest build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(deleteAfterIntervalRequestImpl);
		return deleteAfterIntervalRequestImpl;
	}
}
