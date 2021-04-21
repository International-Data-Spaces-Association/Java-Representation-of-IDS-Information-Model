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
* "Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ParticipantImpl.class)
})
public interface Participant extends Agent, ManagedEntity {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	@NotNull
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	public String toRdf();

	// getter and setter for generic property map
	public Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	/**
	* This function returns a hash code value for the Participant for the benefit of e.g. hash tables.
	* @return a hash code value for the Participant
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Participant is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Indicates membership of a person to an organization."@en
	* @return Returns the List of Persons for the property _memberPerson.
	* More information under https://w3id.org/idsa/core/memberPerson
	*/
	@JsonProperty("ids:memberPerson")
	public List<Person> getMemberPerson();

	/**
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	* @return Returns the List of Participants for the property _memberParticipant.
	* More information under https://w3id.org/idsa/core/memberParticipant
	*/
	@JsonProperty("ids:memberParticipant")
	public List<Participant> getMemberParticipant();

	/**
	* "Email address for contacting the participant on a general level."@en
	* @return Returns the List of Strings for the property _corporateEmailAddress.
	* More information under https://w3id.org/idsa/core/corporateEmailAddress
	*/
	@JsonProperty("ids:corporateEmailAddress")
	public List<String> getCorporateEmailAddress();

	/**
	* "Company identifiers, described via ids:BusinessIdentifier."@en
	* @return Returns the List of BusinessIdentifiers for the property _businessIdentifier.
	* More information under https://w3id.org/idsa/core/businessIdentifier
	*/
	@JsonProperty("ids:businessIdentifier")
	public List<BusinessIdentifier> getBusinessIdentifier();

	/**
	* "The complete legal name of a Participant. Unlike the title property for the participant which refers to the commonly used name or term for the Participant, a legal name identifies a participant for legal, administrative and other official purposes."@en
	* @return Returns the List of Strings for the property _legalName.
	* More information under https://w3id.org/idsa/core/legalName
	*/
	@JsonProperty("ids:legalName")
	public List<String> getLegalName();

	/**
	* "Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	* @return Returns the Site for the property _primarySite.
	* More information under https://w3id.org/idsa/core/primarySite
	*/
	@JsonProperty("ids:primarySite")
	public Site getPrimarySite();

	/**
	* "General official homepage of the participant."@en
	* @return Returns the URI for the property _corporateHomepage.
	* More information under https://w3id.org/idsa/core/corporateHomepage
	*/
	@JsonProperty("ids:corporateHomepage")
	public URI getCorporateHomepage();

	/**
	* "Certification issued for the given Participant."@en
	* @return Returns the ParticipantCertification for the property _participantCertification.
	* More information under https://w3id.org/idsa/core/participantCertification
	*/
	@JsonProperty("ids:participantCertification")
	public ParticipantCertification getParticipantCertification();

	/**
	* "Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	* @return Returns the AbstractConstraint for the property _participantRefinement.
	* More information under https://w3id.org/idsa/core/participantRefinement
	*/
	@JsonProperty("ids:participantRefinement")
	public AbstractConstraint getParticipantRefinement();

	/**
	* "The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which is liable for Value Added Tax."@en
	* @return Returns the String for the property _vatID.
	* More information under https://w3id.org/idsa/core/vatID
	*/
	@JsonProperty("ids:vatID")
	public String getVatID();

	/**
	* "Legal form of the participant. It is advisable to use an existing standard such as ISO-20275."@en
	* @return Returns the String for the property _legalForm.
	* More information under https://w3id.org/idsa/core/legalForm
	*/
	@NotNull
	@JsonProperty("ids:legalForm")
	public String getLegalForm();

	/**
	* "jurisdiction / court which is responsible for the entity. The use of existing standards such as ISO 3166-2 is recommended."@en
	* @return Returns the String for the property _jurisdiction.
	* More information under https://w3id.org/idsa/core/jurisdiction
	*/
	@JsonProperty("ids:jurisdiction")
	public String getJurisdiction();

}
