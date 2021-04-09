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

public class SpatialOfferBuilder {

	private SpatialOfferImpl spatialOfferImpl;

	public SpatialOfferBuilder() {
		spatialOfferImpl = new SpatialOfferImpl();
	}

	public SpatialOfferBuilder(URI id) {
		this();
		spatialOfferImpl.id = id;
	}



	/**
	* This function allows setting a value for permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for permission
	*/
	final public SpatialOfferBuilder _permission_(ArrayList<? extends Permission> _permission_) {
		this.spatialOfferImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for prohibition
	*/
	final public SpatialOfferBuilder _prohibition_(ArrayList<? extends Prohibition> _prohibition_) {
		this.spatialOfferImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for obligation
	*/
	final public SpatialOfferBuilder _obligation_(ArrayList<? extends Duty> _obligation_) {
		this.spatialOfferImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function allows setting a value for contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for contractStart
	*/
	final public SpatialOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.spatialOfferImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for contractEnd
	*/
	final public SpatialOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.spatialOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for contractDate
	*/
	final public SpatialOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.spatialOfferImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for provider
	*/
	final public SpatialOfferBuilder _provider_(URI _provider_) {
		this.spatialOfferImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for consumer
	*/
	final public SpatialOfferBuilder _consumer_(URI _consumer_) {
		this.spatialOfferImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for contractDocument
	*/
	final public SpatialOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.spatialOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for contractAnnex
	*/
	final public SpatialOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.spatialOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SpatialOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(spatialOfferImpl);
		return spatialOfferImpl;
	}
}
