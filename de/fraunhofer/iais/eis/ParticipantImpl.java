package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Participant"@en

	"Stakeholder in the Industrial Data Space, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Participant")
public class ParticipantImpl implements Serializable, Participant {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant", "en"));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Stakeholder in the Industrial Data Space, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"corporateEmailAddress"@en

	"Email address for contacting the participant on a general level."@en
	*/
	@JsonAlias({"ids:corporateEmailAddress", "corporateEmailAddress"})
	 java.util.ArrayList<? extends String> _corporateEmailAddress;

	/**
	"corporateHomepage"@en

	"General official homepage of the participant."@en
	*/
	@JsonAlias({"ids:corporateHomepage", "corporateHomepage"})
	 URI _corporateHomepage;

	/**
	"description"@en

	"Explanation of the resource in a natural language text."@en
	*/
	@JsonAlias({"ids:description", "description"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description;

	/**
	"member participant"@en

	"Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	*/
	@JsonAlias({"ids:memberParticipant", "memberParticipant"})
	 java.util.ArrayList<? extends Participant> _memberParticipant;

	/**
	"memberPerson"@en

	"Indicates membership of a person to an organization."@en
	*/
	@JsonAlias({"ids:memberPerson", "memberPerson"})
	 java.util.ArrayList<? extends Person> _memberPerson;

	/**
	"participant certification"@en

	"Certification issued for the given Participant."@en
	*/
	@JsonAlias({"ids:participantCertification", "participantCertification"})
	 ParticipantCertification _participantCertification;

	/**
	"participant refinment"@en

	"Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	*/
	@JsonAlias({"ids:participantRefinement", "participantRefinement"})
	 AbstractConstraint _participantRefinement;

	/**
	"primarySite"@en

	"Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	*/
	@JsonAlias({"ids:primarySite", "primarySite"})
	 Site _primarySite;

	/**
	"title"@en

	"(Localized) name of the entity."@en
	*/
	@JsonAlias({"ids:title", "title"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title;

	/**
	"version"@en

	"Version identifier of the Managed Entity"@en
	*/
	@JsonAlias({"ids:version", "version"})
	 String _version;

	// no manual construction
	ParticipantImpl() {
		id = VocabUtil.getInstance().createRandomUrl("participant");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("ids:memberPerson")
	java.util.ArrayList<? extends Person> getMemberPerson() {
		return _memberPerson;
	}
	final public void setMemberPerson (java.util.ArrayList<? extends Person> _memberPerson_) {
		this._memberPerson = _memberPerson_;
	}

	final public 
	
	
	@JsonProperty("ids:memberParticipant")
	java.util.ArrayList<? extends Participant> getMemberParticipant() {
		return _memberParticipant;
	}
	final public void setMemberParticipant (java.util.ArrayList<? extends Participant> _memberParticipant_) {
		this._memberParticipant = _memberParticipant_;
	}

	final public 
	
	
	@JsonProperty("ids:corporateEmailAddress")
	java.util.ArrayList<? extends String> getCorporateEmailAddress() {
		return _corporateEmailAddress;
	}
	final public void setCorporateEmailAddress (java.util.ArrayList<? extends String> _corporateEmailAddress_) {
		this._corporateEmailAddress = _corporateEmailAddress_;
	}

	final public 
	
	
	@JsonProperty("ids:primarySite")
	Site getPrimarySite() {
		return _primarySite;
	}
	final public void setPrimarySite (Site _primarySite_) {
		this._primarySite = _primarySite_;
	}

	final public 
	
	
	@JsonProperty("ids:corporateHomepage")
	URI getCorporateHomepage() {
		return _corporateHomepage;
	}
	final public void setCorporateHomepage (URI _corporateHomepage_) {
		this._corporateHomepage = _corporateHomepage_;
	}

	final public 
	
	
	@JsonProperty("ids:participantCertification")
	ParticipantCertification getParticipantCertification() {
		return _participantCertification;
	}
	final public void setParticipantCertification (ParticipantCertification _participantCertification_) {
		this._participantCertification = _participantCertification_;
	}

	final public 
	
	
	@JsonProperty("ids:participantRefinement")
	AbstractConstraint getParticipantRefinement() {
		return _participantRefinement;
	}
	final public void setParticipantRefinement (AbstractConstraint _participantRefinement_) {
		this._participantRefinement = _participantRefinement_;
	}


	final public 
	
	
	@JsonProperty("ids:title")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getTitle() {
		return _title;
	}
	final public void setTitle (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _title_) {
		this._title = _title_;
	}

	final public 
	
	
	@JsonProperty("ids:description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getDescription() {
		return _description;
	}
	final public void setDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _description_) {
		this._description = _description_;
	}



	final public 
	
	
	@JsonProperty("ids:version")
	String getVersion() {
		return _version;
	}
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

}
