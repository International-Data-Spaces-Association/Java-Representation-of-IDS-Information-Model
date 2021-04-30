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

/** 
* "Participant"@en
* "Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Participant")
public class ParticipantImpl implements Participant {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "has business identifier"@en
	* "Company identifiers, described via ids:BusinessIdentifier."@en
	*/
	@JsonAlias({"ids:businessIdentifier", "businessIdentifier"})
	protected List<BusinessIdentifier> _businessIdentifier;


	/**
	* "corporateEmailAddress"@en
	* "Email address for contacting the participant on a general level."@en
	*/
	@JsonAlias({"ids:corporateEmailAddress", "corporateEmailAddress"})
	protected List<String> _corporateEmailAddress;


	/**
	* "corporateHomepage"@en
	* "General official homepage of the participant."@en
	*/
	@JsonAlias({"ids:corporateHomepage", "corporateHomepage"})
	protected URI _corporateHomepage;


	/**
	* "description"@en
	* "Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	protected List<TypedLiteral> _description;


	/**
	* "legal form"@en
	* "jurisdiction / court which is responsible for the entity. The use of existing standards such as ISO 3166-2 is recommended."@en
	*/
	@JsonAlias({"ids:jurisdiction", "jurisdiction"})
	protected String _jurisdiction;


	/**
	* "legal form"@en
	* "Legal form of the participant. It is advisable to use an existing standard such as ISO-20275."@en
	*/
	@NotNull
	@JsonAlias({"ids:legalForm", "legalForm"})
	protected String _legalForm;


	/**
	* "legal name"@en
	* "The complete legal name of a Participant. Unlike the title property for the participant which refers to the commonly used name or term for the Participant, a legal name identifies a participant for legal, administrative and other official purposes."@en
	*/
	@JsonAlias({"ids:legalName", "legalName"})
	protected List<String> _legalName;


	/**
	* "member participant"@en
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	*/
	@JsonAlias({"ids:memberParticipant", "memberParticipant"})
	protected List<Participant> _memberParticipant;


	/**
	* "memberPerson"@en
	* "Indicates membership of a person to an organization."@en
	*/
	@JsonAlias({"ids:memberPerson", "memberPerson"})
	protected List<Person> _memberPerson;


	/**
	* "participant certification"@en
	* "Certification issued for the given Participant."@en
	*/
	@JsonAlias({"ids:participantCertification", "participantCertification"})
	protected ParticipantCertification _participantCertification;


	/**
	* "participant refinment"@en
	* "Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	*/
	@JsonAlias({"ids:participantRefinement", "participantRefinement"})
	protected AbstractConstraint _participantRefinement;


	/**
	* "primarySite"@en
	* "Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	*/
	@JsonAlias({"ids:primarySite", "primarySite"})
	protected Site _primarySite;


	/**
	* "title"@en
	* "(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	protected List<TypedLiteral> _title;


	/**
	* "vat ID"@en
	* "The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which is liable for Value Added Tax."@en
	*/
	@JsonAlias({"ids:vatID", "vatID"})
	protected String _vatID;


	/**
	* "version"@en
	* "Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	protected String _version;


	// no manual construction
	protected ParticipantImpl() {
		id = VocabUtil.getInstance().createRandomUrl("participant");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
		if (this.properties == null) this.properties = new HashMap<String,Object>();
		if (property.startsWith("@")) {return ;};
		this.properties.put(property, value) ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this._legalName,
			this._primarySite,
			this._corporateEmailAddress,
			this._corporateHomepage,
			this._memberParticipant,
			this._participantCertification,
			this._participantRefinement,
			this._businessIdentifier,
			this._vatID,
			this._legalForm,
			this._jurisdiction,
			this._memberPerson,
			this._title,
			this._description,
			this._version});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			ParticipantImpl other = (ParticipantImpl) obj;
			return Objects.equals(this._legalName, other._legalName) &&
				Objects.equals(this._primarySite, other._primarySite) &&
				Objects.equals(this._corporateEmailAddress, other._corporateEmailAddress) &&
				Objects.equals(this._corporateHomepage, other._corporateHomepage) &&
				Objects.equals(this._memberParticipant, other._memberParticipant) &&
				Objects.equals(this._participantCertification, other._participantCertification) &&
				Objects.equals(this._participantRefinement, other._participantRefinement) &&
				Objects.equals(this._businessIdentifier, other._businessIdentifier) &&
				Objects.equals(this._vatID, other._vatID) &&
				Objects.equals(this._legalForm, other._legalForm) &&
				Objects.equals(this._jurisdiction, other._jurisdiction) &&
				Objects.equals(this._memberPerson, other._memberPerson) &&
				Objects.equals(this._title, other._title) &&
				Objects.equals(this._description, other._description) &&
				Objects.equals(this._version, other._version);
		}
	}


	// accessor method implementations as derived from the IDSA Information Model ontology


	@JsonProperty("ids:legalName")
	final public List<String> getLegalName() {
		return _legalName;
	}
	
	final public void setLegalName (List<String> _legalName_) {
		this._legalName = _legalName_;
	}

	@JsonProperty("ids:primarySite")
	final public Site getPrimarySite() {
		return _primarySite;
	}
	
	final public void setPrimarySite (Site _primarySite_) {
		this._primarySite = _primarySite_;
	}

	@JsonProperty("ids:corporateEmailAddress")
	final public List<String> getCorporateEmailAddress() {
		return _corporateEmailAddress;
	}
	
	final public void setCorporateEmailAddress (List<String> _corporateEmailAddress_) {
		this._corporateEmailAddress = _corporateEmailAddress_;
	}

	@JsonProperty("ids:corporateHomepage")
	final public URI getCorporateHomepage() {
		return _corporateHomepage;
	}
	
	final public void setCorporateHomepage (URI _corporateHomepage_) {
		this._corporateHomepage = _corporateHomepage_;
	}

	@JsonProperty("ids:memberParticipant")
	final public List<Participant> getMemberParticipant() {
		return _memberParticipant;
	}
	
	final public void setMemberParticipant (List<Participant> _memberParticipant_) {
		this._memberParticipant = _memberParticipant_;
	}

	@JsonProperty("ids:participantCertification")
	final public ParticipantCertification getParticipantCertification() {
		return _participantCertification;
	}
	
	final public void setParticipantCertification (ParticipantCertification _participantCertification_) {
		this._participantCertification = _participantCertification_;
	}

	@JsonProperty("ids:participantRefinement")
	final public AbstractConstraint getParticipantRefinement() {
		return _participantRefinement;
	}
	
	final public void setParticipantRefinement (AbstractConstraint _participantRefinement_) {
		this._participantRefinement = _participantRefinement_;
	}

	@JsonProperty("ids:businessIdentifier")
	final public List<BusinessIdentifier> getBusinessIdentifier() {
		return _businessIdentifier;
	}
	
	final public void setBusinessIdentifier (List<BusinessIdentifier> _businessIdentifier_) {
		this._businessIdentifier = _businessIdentifier_;
	}

	@JsonProperty("ids:vatID")
	final public String getVatID() {
		return _vatID;
	}
	
	final public void setVatID (String _vatID_) {
		this._vatID = _vatID_;
	}

	@NotNull
	@JsonProperty("ids:legalForm")
	final public String getLegalForm() {
		return _legalForm;
	}
	
	final public void setLegalForm (String _legalForm_) {
		this._legalForm = _legalForm_;
	}

	@JsonProperty("ids:jurisdiction")
	final public String getJurisdiction() {
		return _jurisdiction;
	}
	
	final public void setJurisdiction (String _jurisdiction_) {
		this._jurisdiction = _jurisdiction_;
	}

	@JsonProperty("ids:memberPerson")
	final public List<Person> getMemberPerson() {
		return _memberPerson;
	}
	
	final public void setMemberPerson (List<Person> _memberPerson_) {
		this._memberPerson = _memberPerson_;
	}


	@JsonProperty("ids:title")
	final public List<TypedLiteral> getTitle() {
		return _title;
	}
	
	final public void setTitle (List<TypedLiteral> _title_) {
		this._title = _title_;
	}

	@JsonProperty("ids:description")
	final public List<TypedLiteral> getDescription() {
		return _description;
	}
	
	final public void setDescription (List<TypedLiteral> _description_) {
		this._description = _description_;
	}



	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}
	
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

}
