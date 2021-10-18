package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.fraunhofer.iais.eis.util.*;

/**
 * Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every
 * participant is given a unique identity by the Identity Provider.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ParticipantImpl.class)
})
public interface Participant extends Agent, ManagedEntity {

    // standard methods

    @Beta
    public Participant deepCopy();

    // accessor methods as derived from the IDS Information Model ontology

    /**
     * The complete legal name of a Participant. Unlike the title property for the participant which
     * refers to the commonly used name or term for the Participant, a legal name identifies a
     * participant for legal, administrative and other official purposes.
     *
     * More information under https://w3id.org/idsa/core/legalName
     *
     * @return Returns the List of Strings for the property _legalName.
     */
    @JsonProperty("ids:legalName")
    List<String> getLegalName();

    /**
     * The complete legal name of a Participant. Unlike the title property for the participant which
     * refers to the commonly used name or term for the Participant, a legal name identifies a
     * participant for legal, administrative and other official purposes.
     *
     * More information under https://w3id.org/idsa/core/legalName
     *
     * @param _legalName_ desired value for the property _legalName.
     */
    void setLegalName(List<String> _legalName_);

    /**
     * Indicates a primary site for the Organization, this is the default means by which an Organization
     * can be contacted and is not necessarily the formal headquarters.
     *
     * More information under https://w3id.org/idsa/core/primarySite
     *
     * @return Returns the Site for the property _primarySite.
     */
    @JsonProperty("ids:primarySite")
    Site getPrimarySite();

    /**
     * Indicates a primary site for the Organization, this is the default means by which an Organization
     * can be contacted and is not necessarily the formal headquarters.
     *
     * More information under https://w3id.org/idsa/core/primarySite
     *
     * @param _primarySite_ desired value for the property _primarySite.
     */
    void setPrimarySite(Site _primarySite_);

    /**
     * Email address for contacting the participant on a general level.
     *
     * More information under https://w3id.org/idsa/core/corporateEmailAddress
     *
     * @return Returns the List of Strings for the property _corporateEmailAddress.
     */
    @JsonProperty("ids:corporateEmailAddress")
    List<String> getCorporateEmailAddress();

    /**
     * Email address for contacting the participant on a general level.
     *
     * More information under https://w3id.org/idsa/core/corporateEmailAddress
     *
     * @param _corporateEmailAddress_ desired value for the property _corporateEmailAddress.
     */
    void setCorporateEmailAddress(List<String> _corporateEmailAddress_);

    /**
     * General official homepage of the participant.
     *
     * More information under https://w3id.org/idsa/core/corporateHomepage
     *
     * @return Returns the URI for the property _corporateHomepage.
     */
    @JsonProperty("ids:corporateHomepage")
    URI getCorporateHomepage();

    /**
     * General official homepage of the participant.
     *
     * More information under https://w3id.org/idsa/core/corporateHomepage
     *
     * @param _corporateHomepage_ desired value for the property _corporateHomepage.
     */
    void setCorporateHomepage(URI _corporateHomepage_);

    /**
     * Indicates that a participant has a member which is again a participant. This is useful for
     * defining hierarchical relations in a participant's organization as well as identifying groups of
     * participants to capture, e.g., members of a collaboration.
     *
     * More information under https://w3id.org/idsa/core/memberParticipant
     *
     * @return Returns the List of Participants for the property _memberParticipant.
     */
    @JsonProperty("ids:memberParticipant")
    List<Participant> getMemberParticipant();

    /**
     * Indicates that a participant has a member which is again a participant. This is useful for
     * defining hierarchical relations in a participant's organization as well as identifying groups of
     * participants to capture, e.g., members of a collaboration.
     *
     * More information under https://w3id.org/idsa/core/memberParticipant
     *
     * @param _memberParticipant_ desired value for the property _memberParticipant.
     */
    void setMemberParticipant(List<Participant> _memberParticipant_);

    /**
     * Certification issued for the given Participant.
     *
     * More information under https://w3id.org/idsa/core/participantCertification
     *
     * @return Returns the ParticipantCertification for the property _participantCertification.
     */
    @JsonProperty("ids:participantCertification")
    ParticipantCertification getParticipantCertification();

    /**
     * Certification issued for the given Participant.
     *
     * More information under https://w3id.org/idsa/core/participantCertification
     *
     * @param _participantCertification_ desired value for the property _participantCertification.
     */
    void setParticipantCertification(ParticipantCertification _participantCertification_);

    /**
     * Conditions which needs to be satisfied that a single Participant can be seen as a member of the
     * subject Participant. For instance, all Participants with their headquarter in Europe might be a
     * potential consumer of GDPR-releated data.
     *
     * More information under https://w3id.org/idsa/core/participantRefinement
     *
     * @return Returns the AbstractConstraint for the property _participantRefinement.
     */
    @JsonProperty("ids:participantRefinement")
    AbstractConstraint getParticipantRefinement();

    /**
     * Conditions which needs to be satisfied that a single Participant can be seen as a member of the
     * subject Participant. For instance, all Participants with their headquarter in Europe might be a
     * potential consumer of GDPR-releated data.
     *
     * More information under https://w3id.org/idsa/core/participantRefinement
     *
     * @param _participantRefinement_ desired value for the property _participantRefinement.
     */
    void setParticipantRefinement(AbstractConstraint _participantRefinement_);

    /**
     * Company identifiers, described via ids:BusinessIdentifier.
     *
     * More information under https://w3id.org/idsa/core/businessIdentifier
     *
     * @return Returns the List of BusinessIdentifiers for the property _businessIdentifier.
     */
    @JsonProperty("ids:businessIdentifier")
    List<BusinessIdentifier> getBusinessIdentifier();

    /**
     * Company identifiers, described via ids:BusinessIdentifier.
     *
     * More information under https://w3id.org/idsa/core/businessIdentifier
     *
     * @param _businessIdentifier_ desired value for the property _businessIdentifier.
     */
    void setBusinessIdentifier(List<BusinessIdentifier> _businessIdentifier_);

    /**
     * The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which
     * is liable for Value Added Tax.
     *
     * More information under https://w3id.org/idsa/core/vatID
     *
     * @return Returns the String for the property _vatID.
     */
    @JsonProperty("ids:vatID")
    String getVatID();

    /**
     * The Value Added Tax ID (VAT ID) is used in the EU to clearly identify a company or entity which
     * is liable for Value Added Tax.
     *
     * More information under https://w3id.org/idsa/core/vatID
     *
     * @param _vatID_ desired value for the property _vatID.
     */
    void setVatID(String _vatID_);

    /**
     * Legal form of the participant. It is advisable to use an existing standard such as ISO-20275.
     *
     * More information under https://w3id.org/idsa/core/legalForm
     *
     * @return Returns the String for the property _legalForm.
     */
    @NotNull
    @JsonProperty("ids:legalForm")
    String getLegalForm();

    /**
     * Legal form of the participant. It is advisable to use an existing standard such as ISO-20275.
     *
     * More information under https://w3id.org/idsa/core/legalForm
     *
     * @param _legalForm_ desired value for the property _legalForm.
     */
    void setLegalForm(String _legalForm_);

    /**
     * jurisdiction / court which is responsible for the entity. The use of existing standards such as
     * ISO 3166-2 is recommended.
     *
     * More information under https://w3id.org/idsa/core/jurisdiction
     *
     * @return Returns the String for the property _jurisdiction.
     */
    @JsonProperty("ids:jurisdiction")
    String getJurisdiction();

    /**
     * jurisdiction / court which is responsible for the entity. The use of existing standards such as
     * ISO 3166-2 is recommended.
     *
     * More information under https://w3id.org/idsa/core/jurisdiction
     *
     * @param _jurisdiction_ desired value for the property _jurisdiction.
     */
    void setJurisdiction(String _jurisdiction_);

    /**
     * Indicates membership of a person to an organization.
     *
     * More information under https://w3id.org/idsa/core/memberPerson
     *
     * @return Returns the List of Persons for the property _memberPerson.
     */
    @JsonProperty("ids:memberPerson")
    List<Person> getMemberPerson();

    /**
     * Indicates membership of a person to an organization.
     *
     * More information under https://w3id.org/idsa/core/memberPerson
     *
     * @param _memberPerson_ desired value for the property _memberPerson.
     */
    void setMemberPerson(List<Person> _memberPerson_);

}
