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

	// accessor methods as derived from the IDSA Information Model ontology


	/**
	* "Indicates membership of a person to an organization."@en
	* @return Returns the ArrayList of Person for the property memberPerson.
	* More information under https://w3id.org/idsa/core/memberPerson
	*/
	@JsonProperty("ids:memberPerson")
	public ArrayList<? extends Person> getMemberPerson();

	/**
	* "Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	* @return Returns the ArrayList of Participant for the property memberParticipant.
	* More information under https://w3id.org/idsa/core/memberParticipant
	*/
	@JsonProperty("ids:memberParticipant")
	public ArrayList<? extends Participant> getMemberParticipant();

	/**
	* "Email address for contacting the participant on a general level."@en
	* @return Returns the ArrayList of String for the property corporateEmailAddress.
	* More information under https://w3id.org/idsa/core/corporateEmailAddress
	*/
	@JsonProperty("ids:corporateEmailAddress")
	public ArrayList<? extends String> getCorporateEmailAddress();

	/**
	* "Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	* @return Returns the Site for the property primarySite.
	* More information under https://w3id.org/idsa/core/primarySite
	*/
	@JsonProperty("ids:primarySite")
	public Site getPrimarySite();

	/**
	* "General official homepage of the participant."@en
	* @return Returns the URI for the property corporateHomepage.
	* More information under https://w3id.org/idsa/core/corporateHomepage
	*/
	@JsonProperty("ids:corporateHomepage")
	public URI getCorporateHomepage();

	/**
	* "Certification issued for the given Participant."@en
	* @return Returns the ParticipantCertification for the property participantCertification.
	* More information under https://w3id.org/idsa/core/participantCertification
	*/
	@JsonProperty("ids:participantCertification")
	public ParticipantCertification getParticipantCertification();

	/**
	* "Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	* @return Returns the AbstractConstraint for the property participantRefinement.
	* More information under https://w3id.org/idsa/core/participantRefinement
	*/
	@JsonProperty("ids:participantRefinement")
	public AbstractConstraint getParticipantRefinement();

}
