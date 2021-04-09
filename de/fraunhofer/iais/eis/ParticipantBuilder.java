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
	* This function allows setting a value for memberPerson
	* @param _memberPerson_ desired value to be set
	* @return Builder object with new value for memberPerson
	*/
	final public ParticipantBuilder _memberPerson_(ArrayList<? extends Person> _memberPerson_) {
		this.participantImpl._memberPerson = _memberPerson_;
		return this;
	}


	/**
	* This function allows setting a value for memberParticipant
	* @param _memberParticipant_ desired value to be set
	* @return Builder object with new value for memberParticipant
	*/
	final public ParticipantBuilder _memberParticipant_(ArrayList<? extends Participant> _memberParticipant_) {
		this.participantImpl._memberParticipant = _memberParticipant_;
		return this;
	}


	/**
	* This function allows setting a value for corporateEmailAddress
	* @param _corporateEmailAddress_ desired value to be set
	* @return Builder object with new value for corporateEmailAddress
	*/
	final public ParticipantBuilder _corporateEmailAddress_(ArrayList<? extends String> _corporateEmailAddress_) {
		this.participantImpl._corporateEmailAddress = _corporateEmailAddress_;
		return this;
	}


	/**
	* This function allows setting a value for primarySite
	* @param _primarySite_ desired value to be set
	* @return Builder object with new value for primarySite
	*/
	final public ParticipantBuilder _primarySite_(Site _primarySite_) {
		this.participantImpl._primarySite = _primarySite_;
		return this;
	}


	/**
	* This function allows setting a value for corporateHomepage
	* @param _corporateHomepage_ desired value to be set
	* @return Builder object with new value for corporateHomepage
	*/
	final public ParticipantBuilder _corporateHomepage_(URI _corporateHomepage_) {
		this.participantImpl._corporateHomepage = _corporateHomepage_;
		return this;
	}


	/**
	* This function allows setting a value for participantCertification
	* @param _participantCertification_ desired value to be set
	* @return Builder object with new value for participantCertification
	*/
	final public ParticipantBuilder _participantCertification_(ParticipantCertification _participantCertification_) {
		this.participantImpl._participantCertification = _participantCertification_;
		return this;
	}


	/**
	* This function allows setting a value for participantRefinement
	* @param _participantRefinement_ desired value to be set
	* @return Builder object with new value for participantRefinement
	*/
	final public ParticipantBuilder _participantRefinement_(AbstractConstraint _participantRefinement_) {
		this.participantImpl._participantRefinement = _participantRefinement_;
		return this;
	}



	/**
	* This function allows setting a value for title
	* @param _title_ desired value to be set
	* @return Builder object with new value for title
	*/
	final public ParticipantBuilder _title_(ArrayList<? extends TypedLiteral> _title_) {
		this.participantImpl._title = _title_;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param _description_ desired value to be set
	* @return Builder object with new value for description
	*/
	final public ParticipantBuilder _description_(ArrayList<? extends TypedLiteral> _description_) {
		this.participantImpl._description = _description_;
		return this;
	}




	/**
	* This function allows setting a value for version
	* @param _version_ desired value to be set
	* @return Builder object with new value for version
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
