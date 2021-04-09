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

public class NotMoreThanNAgreementBuilder {

	private NotMoreThanNAgreementImpl notMoreThanNAgreementImpl;

	public NotMoreThanNAgreementBuilder() {
		notMoreThanNAgreementImpl = new NotMoreThanNAgreementImpl();
	}

	public NotMoreThanNAgreementBuilder(URI id) {
		this();
		notMoreThanNAgreementImpl.id = id;
	}



	/**
	* This function allows setting a value for permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for permission
	*/
	final public NotMoreThanNAgreementBuilder _permission_(ArrayList<? extends Permission> _permission_) {
		this.notMoreThanNAgreementImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for prohibition
	*/
	final public NotMoreThanNAgreementBuilder _prohibition_(ArrayList<? extends Prohibition> _prohibition_) {
		this.notMoreThanNAgreementImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for obligation
	*/
	final public NotMoreThanNAgreementBuilder _obligation_(ArrayList<? extends Duty> _obligation_) {
		this.notMoreThanNAgreementImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function allows setting a value for contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for contractStart
	*/
	final public NotMoreThanNAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.notMoreThanNAgreementImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for contractEnd
	*/
	final public NotMoreThanNAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.notMoreThanNAgreementImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for contractDate
	*/
	final public NotMoreThanNAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.notMoreThanNAgreementImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for provider
	*/
	final public NotMoreThanNAgreementBuilder _provider_(URI _provider_) {
		this.notMoreThanNAgreementImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for consumer
	*/
	final public NotMoreThanNAgreementBuilder _consumer_(URI _consumer_) {
		this.notMoreThanNAgreementImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for contractDocument
	*/
	final public NotMoreThanNAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
		this.notMoreThanNAgreementImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for contractAnnex
	*/
	final public NotMoreThanNAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.notMoreThanNAgreementImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public NotMoreThanNAgreement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(notMoreThanNAgreementImpl);
		return notMoreThanNAgreementImpl;
	}
}
