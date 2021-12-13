package de.fraunhofer.iais.eis.mixins;

import java.net.URI;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.*;
import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Participant")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
public interface ParticipantMixin {
    @JsonProperty("ids:legalName")
    public List<String> getLegalName();

    @JsonProperty("ids:legalName")
    public void setLegalName(List<String> _legalName_);

    @JsonProperty("ids:primarySite")
    public Site getPrimarySite();

    @JsonProperty("ids:primarySite")
    public void setPrimarySite(Site _primarySite_);

    @JsonProperty("ids:corporateEmailAddress")
    public List<String> getCorporateEmailAddress();

    @JsonProperty("ids:corporateEmailAddress")
    public void setCorporateEmailAddress(List<String> _corporateEmailAddress_);

    @JsonProperty("ids:corporateHomepage")
    public URI getCorporateHomepage();

    @JsonProperty("ids:corporateHomepage")
    public void setCorporateHomepage(URI _corporateHomepage_);

    @JsonProperty("ids:memberParticipant")
    public List<Participant> getMemberParticipant();

    @JsonProperty("ids:memberParticipant")
    public void setMemberParticipant(List<Participant> _memberParticipant_);

    @JsonProperty("ids:participantCertification")
    public ParticipantCertification getParticipantCertification();

    @JsonProperty("ids:participantCertification")
    public void setParticipantCertification(ParticipantCertification _participantCertification_);

    @JsonProperty("ids:participantRefinement")
    public AbstractConstraint getParticipantRefinement();

    @JsonProperty("ids:participantRefinement")
    public void setParticipantRefinement(AbstractConstraint _participantRefinement_);

    @JsonProperty("ids:businessIdentifier")
    public List<BusinessIdentifier> getBusinessIdentifier();

    @JsonProperty("ids:businessIdentifier")
    public void setBusinessIdentifier(List<BusinessIdentifier> _businessIdentifier_);

    @JsonProperty("ids:vatID")
    public String getVatID();

    @JsonProperty("ids:vatID")
    public void setVatID(String _vatID_);

    @JsonProperty("ids:legalForm")
    @NotNull
    public String getLegalForm();

    @JsonProperty("ids:legalForm")
    public void setLegalForm(String _legalForm_);

    @JsonProperty("ids:jurisdiction")
    public String getJurisdiction();

    @JsonProperty("ids:jurisdiction")
    public void setJurisdiction(String _jurisdiction_);

    @JsonProperty("ids:memberPerson")
    public List<Person> getMemberPerson();

    @JsonProperty("ids:memberPerson")
    public void setMemberPerson(List<Person> _memberPerson_);
}
