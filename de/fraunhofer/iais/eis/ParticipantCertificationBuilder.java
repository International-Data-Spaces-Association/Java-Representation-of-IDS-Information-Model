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

public class ParticipantCertificationBuilder {

	private ParticipantCertificationImpl participantCertificationImpl;

	public ParticipantCertificationBuilder() {
		participantCertificationImpl = new ParticipantCertificationImpl();
	}

	public ParticipantCertificationBuilder(URI id) {
		this();
		participantCertificationImpl.id = id;
	}

	/**
	* This function allows setting a value for membershipEnd
	* @param _membershipEnd_ desired value to be set
	* @return Builder object with new value for membershipEnd
	*/
	final public ParticipantCertificationBuilder _membershipEnd_(XMLGregorianCalendar _membershipEnd_) {
		this.participantCertificationImpl._membershipEnd = _membershipEnd_;
		return this;
	}


	/**
	* This function allows setting a value for certificationLevel
	* @param _certificationLevel_ desired value to be set
	* @return Builder object with new value for certificationLevel
	*/
	final public ParticipantCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
		this.participantCertificationImpl._certificationLevel = _certificationLevel_;
		return this;
	}


	/**
	* This function allows setting a value for lastValidDate
	* @param _lastValidDate_ desired value to be set
	* @return Builder object with new value for lastValidDate
	*/
	final public ParticipantCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
		this.participantCertificationImpl._lastValidDate = _lastValidDate_;
		return this;
	}


	/**
	* This function allows setting a value for evaluationFacility
	* @param _evaluationFacility_ desired value to be set
	* @return Builder object with new value for evaluationFacility
	*/
	final public ParticipantCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
		this.participantCertificationImpl._evaluationFacility = _evaluationFacility_;
		return this;
	}


	/**
	* This function allows setting a value for version
	* @param _version_ desired value to be set
	* @return Builder object with new value for version
	*/
	final public ParticipantCertificationBuilder _version_(String _version_) {
		this.participantCertificationImpl._version = _version_;
		return this;
	}


	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public ParticipantCertificationBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.participantCertificationImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public ParticipantCertificationBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.participantCertificationImpl._description = _description_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ParticipantCertification build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantCertificationImpl);
		return participantCertificationImpl;
	}
}
