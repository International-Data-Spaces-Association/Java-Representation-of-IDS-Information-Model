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

/** 
* "Participant"@en
* "Stakeholder in the Industrial Data Space, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Participant")
public class ParticipantImpl implements Serializable, Participant {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@NotNull
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant", "en"));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Stakeholder in the Industrial Data Space, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	protected Map<String,Object> properties;

	// instance fields as derived from the IDSA Information Model ontology

	/**
	* "has business identifier"@en
	* "Company identifiers, described via ids:BusinessIdentifier."@en
	*/
	@JsonAlias({"ids:businessIdentifier", "businessIdentifier"})
	protected ArrayList<? extends BusinessIdentifier> _businessIdentifier;


	/**
	* "corporateEmailAddress"@en
	* "Email address for contacting the participant on a general level."@en
	*/
	@JsonAlias({"ids:corporateEmailAddress", "corporateEmailAddress"})
	protected ArrayList<? extends String> _corporateEmailAddress;


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
	protected ArrayList<? extends TypedLiteral> _description;


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
	protected ArrayList<? extends String> _legalName;


	/**
	* "member participant"@en
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	*/
	@JsonAlias({"ids:memberParticipant", "memberParticipant"})
	protected ArrayList<? extends Participant> _memberParticipant;


	/**
	* "memberPerson"@en
	* "Indicates membership of a person to an organization."@en
	*/
	@JsonAlias({"ids:memberPerson", "memberPerson"})
	protected ArrayList<? extends Person> _memberPerson;


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
	protected ArrayList<? extends TypedLiteral> _title;


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

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
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

	// accessor method implementations as derived from the IDSA Information Model ontology


	/**
	* "Indicates membership of a person to an organization."@en
	* @return Returns the ArrayList of Person for the property memberPerson.
	* More information under https://w3id.org/idsa/core/memberPerson
	*/
	@JsonProperty("ids:memberPerson")
	final public ArrayList<? extends Person> getMemberPerson() {
		return _memberPerson;
	}

	
	/**
	* "Indicates membership of a person to an organization."@en
	* @param _memberPerson_ desired value for the property memberPerson.
	* More information under https://w3id.org/idsa/core/memberPerson
	*/
	final public void setMemberPerson (ArrayList<? extends Person> _memberPerson_) {
		this._memberPerson = _memberPerson_;
	}

	/**
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	* @return Returns the ArrayList of Participant for the property memberParticipant.
	* More information under https://w3id.org/idsa/core/memberParticipant
	*/
	@JsonProperty("ids:memberParticipant")
	final public ArrayList<? extends Participant> getMemberParticipant() {
		return _memberParticipant;
	}

	
	/**
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	* @param _memberParticipant_ desired value for the property memberParticipant.
	* More information under https://w3id.org/idsa/core/memberParticipant
	*/
	final public void setMemberParticipant (ArrayList<? extends Participant> _memberParticipant_) {
		this._memberParticipant = _memberParticipant_;
	}

	/**
	* "Email address for contacting the participant on a general level."@en
	* @return Returns the ArrayList of String for the property corporateEmailAddress.
	* More information under https://w3id.org/idsa/core/corporateEmailAddress
	*/
	@JsonProperty("ids:corporateEmailAddress")
	final public ArrayList<? extends String> getCorporateEmailAddress() {
		return _corporateEmailAddress;
	}

	
	/**
	* "Email address for contacting the participant on a general level."@en
	* @param _corporateEmailAddress_ desired value for the property corporateEmailAddress.
	* More information under https://w3id.org/idsa/core/corporateEmailAddress
	*/
	final public void setCorporateEmailAddress (ArrayList<? extends String> _corporateEmailAddress_) {
		this._corporateEmailAddress = _corporateEmailAddress_;
	}

	/**
	* "Company identifiers, described via ids:BusinessIdentifier."@en
	* @return Returns the ArrayList of BusinessIdentifier for the property businessIdentifier.
	* More information under https://w3id.org/idsa/core/businessIdentifier
	*/
	@JsonProperty("ids:businessIdentifier")
	final public ArrayList<? extends BusinessIdentifier> getBusinessIdentifier() {
		return _businessIdentifier;
	}

	
	/**
	* "Company identifiers, described via ids:BusinessIdentifier."@en
	* @param _businessIdentifier_ desired value for the property businessIdentifier.
	* More information under https://w3id.org/idsa/core/businessIdentifier
	*/
	final public void setBusinessIdentifier (ArrayList<? extends BusinessIdentifier> _businessIdentifier_) {
		this._businessIdentifier = _businessIdentifier_;
	}

	/**
	* "The complete legal name of a Participant. Unlike the title property for the participant which refers to the commonly used name or term for the Participant, a legal name identifies a participant for legal, administrative and other official purposes."@en
	* @return Returns the ArrayList of String for the property legalName.
	* More information under https://w3id.org/idsa/core/legalName
	*/
	@JsonProperty("ids:legalName")
	final public ArrayList<? extends String> getLegalName() {
		return _legalName;
	}

	
	/**
	* "The complete legal name of a Participant. Unlike the title property for the participant which refers to the commonly used name or term for the Participant, a legal name identifies a participant for legal, administrative and other official purposes."@en
	* @param _legalName_ desired value for the property legalName.
	* More information under https://w3id.org/idsa/core/legalName
	*/
	final public void setLegalName (ArrayList<? extends String> _legalName_) {
		this._legalName = _legalName_;
	}

	/**
	* "Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	* @return Returns the Site for the property primarySite.
	* More information under https://w3id.org/idsa/core/primarySite
	*/
	@JsonProperty("ids:primarySite")
	final public Site getPrimarySite() {
		return _primarySite;
	}

	
	/**
	* "Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	* @param _primarySite_ desired value for the property primarySite.
	* More information under https://w3id.org/idsa/core/primarySite
	*/
	final public void setPrimarySite (Site _primarySite_) {
		this._primarySite = _primarySite_;
	}

	/**
	* "General official homepage of the participant."@en
	* @return Returns the URI for the property corporateHomepage.
	* More information under https://w3id.org/idsa/core/corporateHomepage
	*/
	@JsonProperty("ids:corporateHomepage")
	final public URI getCorporateHomepage() {
		return _corporateHomepage;
	}

	
	/**
	* "General official homepage of the participant."@en
	* @param _corporateHomepage_ desired value for the property corporateHomepage.
	* More information under https://w3id.org/idsa/core/corporateHomepage
	*/
	final public void setCorporateHomepage (URI _corporateHomepage_) {
		this._corporateHomepage = _corporateHomepage_;
	}

	/**
	* "Certification issued for the given Participant."@en
	* @return Returns the ParticipantCertification for the property participantCertification.
	* More information under https://w3id.org/idsa/core/participantCertification
	*/
	@JsonProperty("ids:participantCertification")
	final public ParticipantCertification getParticipantCertification() {
		return _participantCertification;
	}

	
	/**
	* "Certification issued for the given Participant."@en
	* @param _participantCertification_ desired value for the property participantCertification.
	* More information under https://w3id.org/idsa/core/participantCertification
	*/
	final public void setParticipantCertification (ParticipantCertification _participantCertification_) {
		this._participantCertification = _participantCertification_;
	}

	/**
	* "Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	* @return Returns the AbstractConstraint for the property participantRefinement.
	* More information under https://w3id.org/idsa/core/participantRefinement
	*/
	@JsonProperty("ids:participantRefinement")
	final public AbstractConstraint getParticipantRefinement() {
		return _participantRefinement;
	}

	
	/**
	* "Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	* @param _participantRefinement_ desired value for the property participantRefinement.
	* More information under https://w3id.org/idsa/core/participantRefinement
	*/
	final public void setParticipantRefinement (AbstractConstraint _participantRefinement_) {
		this._participantRefinement = _participantRefinement_;
	}

	/**
	* "The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which is liable for Value Added Tax."@en
	* @return Returns the String for the property vatID.
	* More information under https://w3id.org/idsa/core/vatID
	*/
	@JsonProperty("ids:vatID")
	final public String getVatID() {
		return _vatID;
	}

	
	/**
	* "The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which is liable for Value Added Tax."@en
	* @param _vatID_ desired value for the property vatID.
	* More information under https://w3id.org/idsa/core/vatID
	*/
	final public void setVatID (String _vatID_) {
		this._vatID = _vatID_;
	}

	/**
	* "Legal form of the participant. It is advisable to use an existing standard such as ISO-20275."@en
	* @return Returns the String for the property legalForm.
	* More information under https://w3id.org/idsa/core/legalForm
	*/
	@NotNull
	@JsonProperty("ids:legalForm")
	final public String getLegalForm() {
		return _legalForm;
	}

	
	/**
	* "Legal form of the participant. It is advisable to use an existing standard such as ISO-20275."@en
	* @param _legalForm_ desired value for the property legalForm.
	* More information under https://w3id.org/idsa/core/legalForm
	*/
	final public void setLegalForm (String _legalForm_) {
		this._legalForm = _legalForm_;
	}

	/**
	* "jurisdiction / court which is responsible for the entity. The use of existing standards such as ISO 3166-2 is recommended."@en
	* @return Returns the String for the property jurisdiction.
	* More information under https://w3id.org/idsa/core/jurisdiction
	*/
	@JsonProperty("ids:jurisdiction")
	final public String getJurisdiction() {
		return _jurisdiction;
	}

	
	/**
	* "jurisdiction / court which is responsible for the entity. The use of existing standards such as ISO 3166-2 is recommended."@en
	* @param _jurisdiction_ desired value for the property jurisdiction.
	* More information under https://w3id.org/idsa/core/jurisdiction
	*/
	final public void setJurisdiction (String _jurisdiction_) {
		this._jurisdiction = _jurisdiction_;
	}


	/**
	* "(Localized) name of the entity."@en
	* @return Returns the ArrayList of TypedLiteral for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	@JsonProperty("ids:title")
	final public ArrayList<? extends TypedLiteral> getTitle() {
		return _title;
	}

	
	/**
	* "(Localized) name of the entity."@en
	* @param _title_ desired value for the property title.
	* More information under https://w3id.org/idsa/core/title
	*/
	final public void setTitle (ArrayList<? extends TypedLiteral> _title_) {
		this._title = _title_;
	}

	/**
	* "Explanation of the resource in a natural language text."@en
	* @return Returns the ArrayList of TypedLiteral for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	@JsonProperty("ids:description")
	final public ArrayList<? extends TypedLiteral> getDescription() {
		return _description;
	}

	
	/**
	* "Explanation of the resource in a natural language text."@en
	* @param _description_ desired value for the property description.
	* More information under https://w3id.org/idsa/core/description
	*/
	final public void setDescription (ArrayList<? extends TypedLiteral> _description_) {
		this._description = _description_;
	}



	/**
	* "Version identifier of the Managed Entity"@en
	* @return Returns the String for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	@JsonProperty("ids:version")
	final public String getVersion() {
		return _version;
	}

	
	/**
	* "Version identifier of the Managed Entity"@en
	* @param _version_ desired value for the property version.
	* More information under https://w3id.org/idsa/core/version
	*/
	final public void setVersion (String _version_) {
		this._version = _version_;
	}

}
