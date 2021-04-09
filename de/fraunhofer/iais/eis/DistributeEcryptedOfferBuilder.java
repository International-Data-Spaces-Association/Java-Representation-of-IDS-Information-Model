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

public class DistributeEcryptedOfferBuilder {

	private DistributeEcryptedOfferImpl distributeEcryptedOfferImpl;

	public DistributeEcryptedOfferBuilder() {
		distributeEcryptedOfferImpl = new DistributeEcryptedOfferImpl();
	}

	public DistributeEcryptedOfferBuilder(URI id) {
		this();
		distributeEcryptedOfferImpl.id = id;
	}



	/**
	* This function allows setting a value for permission
	* @param _permission_ desired value to be set
	* @return Builder object with new value for permission
	*/
	final public DistributeEcryptedOfferBuilder _permission_(ArrayList<? extends Permission> _permission_) {
		this.distributeEcryptedOfferImpl._permission = _permission_;
		return this;
	}


	/**
	* This function allows setting a value for prohibition
	* @param _prohibition_ desired value to be set
	* @return Builder object with new value for prohibition
	*/
	final public DistributeEcryptedOfferBuilder _prohibition_(ArrayList<? extends Prohibition> _prohibition_) {
		this.distributeEcryptedOfferImpl._prohibition = _prohibition_;
		return this;
	}


	/**
	* This function allows setting a value for obligation
	* @param _obligation_ desired value to be set
	* @return Builder object with new value for obligation
	*/
	final public DistributeEcryptedOfferBuilder _obligation_(ArrayList<? extends Duty> _obligation_) {
		this.distributeEcryptedOfferImpl._obligation = _obligation_;
		return this;
	}


	/**
	* This function allows setting a value for contractStart
	* @param _contractStart_ desired value to be set
	* @return Builder object with new value for contractStart
	*/
	final public DistributeEcryptedOfferBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
		this.distributeEcryptedOfferImpl._contractStart = _contractStart_;
		return this;
	}


	/**
	* This function allows setting a value for contractEnd
	* @param _contractEnd_ desired value to be set
	* @return Builder object with new value for contractEnd
	*/
	final public DistributeEcryptedOfferBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
		this.distributeEcryptedOfferImpl._contractEnd = _contractEnd_;
		return this;
	}


	/**
	* This function allows setting a value for contractDate
	* @param _contractDate_ desired value to be set
	* @return Builder object with new value for contractDate
	*/
	final public DistributeEcryptedOfferBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
		this.distributeEcryptedOfferImpl._contractDate = _contractDate_;
		return this;
	}


	/**
	* This function allows setting a value for provider
	* @param _provider_ desired value to be set
	* @return Builder object with new value for provider
	*/
	final public DistributeEcryptedOfferBuilder _provider_(URI _provider_) {
		this.distributeEcryptedOfferImpl._provider = _provider_;
		return this;
	}


	/**
	* This function allows setting a value for consumer
	* @param _consumer_ desired value to be set
	* @return Builder object with new value for consumer
	*/
	final public DistributeEcryptedOfferBuilder _consumer_(URI _consumer_) {
		this.distributeEcryptedOfferImpl._consumer = _consumer_;
		return this;
	}


	/**
	* This function allows setting a value for contractDocument
	* @param _contractDocument_ desired value to be set
	* @return Builder object with new value for contractDocument
	*/
	final public DistributeEcryptedOfferBuilder _contractDocument_(TextResource _contractDocument_) {
		this.distributeEcryptedOfferImpl._contractDocument = _contractDocument_;
		return this;
	}


	/**
	* This function allows setting a value for contractAnnex
	* @param _contractAnnex_ desired value to be set
	* @return Builder object with new value for contractAnnex
	*/
	final public DistributeEcryptedOfferBuilder _contractAnnex_(Resource _contractAnnex_) {
		this.distributeEcryptedOfferImpl._contractAnnex = _contractAnnex_;
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public DistributeEcryptedOffer build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(distributeEcryptedOfferImpl);
		return distributeEcryptedOfferImpl;
	}
}
