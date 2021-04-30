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

public class ParticipantBuilder {

	private ParticipantImpl participantImpl;

	public ParticipantBuilder() {
		participantImpl = new ParticipantImpl();
	}

	public ParticipantBuilder(URI id) {
		this();
		participantImpl.id = id;
	}

	/**
	* This function allows setting a value for _legalName
	* @param _legalName_ desired value to be set
	* @return Builder object with new value for _legalName
	*/
	final public ParticipantBuilder _legalName_(List<String> _legalName_) {
		this.participantImpl._legalName = _legalName_;
		return this;
	}


	/**
	* This function allows setting a value for _primarySite
	* @param _primarySite_ desired value to be set
	* @return Builder object with new value for _primarySite
	*/
	final public ParticipantBuilder _primarySite_(Site _primarySite_) {
		this.participantImpl._primarySite = _primarySite_;
		return this;
	}


	/**
	* This function allows setting a value for _corporateEmailAddress
	* @param _corporateEmailAddress_ desired value to be set
	* @return Builder object with new value for _corporateEmailAddress
	*/
	final public ParticipantBuilder _corporateEmailAddress_(List<String> _corporateEmailAddress_) {
		this.participantImpl._corporateEmailAddress = _corporateEmailAddress_;
		return this;
	}


	/**
	* This function allows setting a value for _corporateHomepage
	* @param _corporateHomepage_ desired value to be set
	* @return Builder object with new value for _corporateHomepage
	*/
	final public ParticipantBuilder _corporateHomepage_(URI _corporateHomepage_) {
		this.participantImpl._corporateHomepage = _corporateHomepage_;
		return this;
	}


	/**
	* This function allows setting a value for _memberParticipant
	* @param _memberParticipant_ desired value to be set
	* @return Builder object with new value for _memberParticipant
	*/
	final public ParticipantBuilder _memberParticipant_(List<Participant> _memberParticipant_) {
		this.participantImpl._memberParticipant = _memberParticipant_;
		return this;
	}


	/**
	* This function allows setting a value for _participantCertification
	* @param _participantCertification_ desired value to be set
	* @return Builder object with new value for _participantCertification
	*/
	final public ParticipantBuilder _participantCertification_(ParticipantCertification _participantCertification_) {
		this.participantImpl._participantCertification = _participantCertification_;
		return this;
	}


	/**
	* This function allows setting a value for _participantRefinement
	* @param _participantRefinement_ desired value to be set
	* @return Builder object with new value for _participantRefinement
	*/
	final public ParticipantBuilder _participantRefinement_(AbstractConstraint _participantRefinement_) {
		this.participantImpl._participantRefinement = _participantRefinement_;
		return this;
	}


	/**
	* This function allows setting a value for _businessIdentifier
	* @param _businessIdentifier_ desired value to be set
	* @return Builder object with new value for _businessIdentifier
	*/
	final public ParticipantBuilder _businessIdentifier_(List<BusinessIdentifier> _businessIdentifier_) {
		this.participantImpl._businessIdentifier = _businessIdentifier_;
		return this;
	}


	/**
	* This function allows setting a value for _vatID
	* @param _vatID_ desired value to be set
	* @return Builder object with new value for _vatID
	*/
	final public ParticipantBuilder _vatID_(String _vatID_) {
		this.participantImpl._vatID = _vatID_;
		return this;
	}


	/**
	* This function allows setting a value for _legalForm
	* @param _legalForm_ desired value to be set
	* @return Builder object with new value for _legalForm
	*/
	final public ParticipantBuilder _legalForm_(String _legalForm_) {
		this.participantImpl._legalForm = _legalForm_;
		return this;
	}


	/**
	* This function allows setting a value for _jurisdiction
	* @param _jurisdiction_ desired value to be set
	* @return Builder object with new value for _jurisdiction
	*/
	final public ParticipantBuilder _jurisdiction_(String _jurisdiction_) {
		this.participantImpl._jurisdiction = _jurisdiction_;
		return this;
	}


	/**
	* This function allows setting a value for _memberPerson
	* @param _memberPerson_ desired value to be set
	* @return Builder object with new value for _memberPerson
	*/
	final public ParticipantBuilder _memberPerson_(List<Person> _memberPerson_) {
		this.participantImpl._memberPerson = _memberPerson_;
		return this;
	}



	/**
	* This function allows setting a value for _title
	* @param _title_ desired value to be set
	* @return Builder object with new value for _title
	*/
	final public ParticipantBuilder _title_(List<TypedLiteral> _title_) {
		this.participantImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for _description
	* @param _description_ desired value to be set
	* @return Builder object with new value for _description
	*/
	final public ParticipantBuilder _description_(List<TypedLiteral> _description_) {
		this.participantImpl._description = _description_;
		return this;
	}




	/**
	* This function allows setting a value for _version
	* @param _version_ desired value to be set
	* @return Builder object with new value for _version
	*/
	final public ParticipantBuilder _version_(String _version_) {
		this.participantImpl._version = _version_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Participant build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(participantImpl);
		return participantImpl;
	}
}
