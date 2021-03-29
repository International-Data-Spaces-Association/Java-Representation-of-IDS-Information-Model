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

	"Stakeholder in the Industrial Data Space, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ParticipantImpl.class),})
public interface Participant extends Agent
, ManagedEntity {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"memberPerson"@en

	"Indicates membership of a person to an organization."@en
	*/
	
	
	@JsonProperty("ids:memberPerson")
	java.util.ArrayList<? extends Person> getMemberPerson();
	/**
	"member participant"@en

	"Indicates that a participant has a member which is again a participant. This is useful for defining hierarchical relations in a participant\'s organization as well as identifying groups of participants to capture, e.g., members of a collaboration."@en
	*/
	
	
	@JsonProperty("ids:memberParticipant")
	java.util.ArrayList<? extends Participant> getMemberParticipant();
	/**
	"corporateEmailAddress"@en

	"Email address for contacting the participant on a general level."@en
	*/
	
	
	@JsonProperty("ids:corporateEmailAddress")
	java.util.ArrayList<? extends String> getCorporateEmailAddress();
	/**
	"primarySite"@en

	"Indicates a primary site for the Organization, this is the default means by which an Organization can be contacted and is not necessarily the formal headquarters."@en
	*/
	
	
	@JsonProperty("ids:primarySite")
	Site getPrimarySite();
	/**
	"corporateHomepage"@en

	"General official homepage of the participant."@en
	*/
	
	
	@JsonProperty("ids:corporateHomepage")
	URI getCorporateHomepage();
	/**
	"participant certification"@en

	"Certification issued for the given Participant."@en
	*/
	
	
	@JsonProperty("ids:participantCertification")
	ParticipantCertification getParticipantCertification();
	/**
	"participant refinment"@en

	"Conditions which needs to be satisfied that a single Participant can be seen as a member of the subject Participant. For instance, all Participants with their headquarter in Europe might be a potential consumer of GDPR-releated data."@en
	*/
	
	
	@JsonProperty("ids:participantRefinement")
	AbstractConstraint getParticipantRefinement();
}
