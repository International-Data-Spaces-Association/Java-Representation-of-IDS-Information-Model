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

public class DurationOfferBuilder {

	private DurationOfferImpl durationOfferImpl;

	public DurationOfferBuilder() {
		durationOfferImpl = new DurationOfferImpl();
	}

	public DurationOfferBuilder(URI id) {
		this();
		durationOfferImpl.id = id;
	}



	/**
	* This function allows setting a value for _contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for _contractStart
	*/
	final public DurationOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.durationOfferImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for _contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for _contractEnd
	*/
	final public DurationOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.durationOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for _contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for _contractDate
	*/
	final public DurationOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.durationOfferImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for _provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for _provider
	*/
	final public DurationOfferBuilder _provider_(URI _provider_) {
		this.durationOfferImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for _consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for _consumer
	*/
	final public DurationOfferBuilder _consumer_(URI _consumer_) {
		this.durationOfferImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for _contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for _contractDocument
	*/
	final public DurationOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.durationOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for _contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for _contractAnnex
	*/
	final public DurationOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.durationOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function allows setting a value for _permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for _permission
	*/
	final public DurationOfferBuilder _permission_(List<Permission> _permission_) {
		this.durationOfferImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for _prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for _prohibition
	*/
	final public DurationOfferBuilder _prohibition_(List<Prohibition> _prohibition_) {
		this.durationOfferImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for _obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for _obligation
	*/
	final public DurationOfferBuilder _obligation_(List<Duty> _obligation_) {
		this.durationOfferImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DurationOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(durationOfferImpl);
		return durationOfferImpl;
	}
}
