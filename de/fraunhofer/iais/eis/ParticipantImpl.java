package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

/**
 * Default implementation of package de.fraunhofer.iais.eis.Participant
 * 
 * Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every
 * participant is given a unique identity by the Identity Provider.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("ids:Participant")
public class ParticipantImpl implements Participant {

    @JsonProperty("@id")
    @JsonAlias({"@id", "id"})
    @NotNull
    protected URI id;

    // List of all labels of this class
    @JsonIgnore
    protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Participant", "en"));

    // List of all comments of this class
    @JsonIgnore
    protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral(
        "Stakeholder in the International Data Spaces, assuming one or more of the predefined roles; every participant is given a unique identity by the Identity Provider.",
        "en"));

    // all classes have a generic property array
    @JsonIgnore
    protected Map<String, Object> properties;

    // instance fields as derived from the IDS Information Model ontology

    @JsonAlias({"ids:businessIdentifier", "businessIdentifier"})
    protected List<BusinessIdentifier> _businessIdentifier = new ArrayList<>();

    @JsonAlias({"ids:corporateEmailAddress", "corporateEmailAddress"})
    protected List<String> _corporateEmailAddress = new ArrayList<>();

    @JsonAlias({"ids:corporateHomepage", "corporateHomepage"})
    protected URI _corporateHomepage;

    @JsonAlias({"ids:description", "description"})
    protected List<TypedLiteral> _description = new ArrayList<>();

    @JsonAlias({"ids:jurisdiction", "jurisdiction"})
    protected String _jurisdiction;

    @NotNull
    @JsonAlias({"ids:legalForm", "legalForm"})
    protected String _legalForm;

    @JsonAlias({"ids:legalName", "legalName"})
    protected List<String> _legalName = new ArrayList<>();

    @JsonAlias({"ids:memberParticipant", "memberParticipant"})
    protected List<Participant> _memberParticipant = new ArrayList<>();

    @JsonAlias({"ids:memberPerson", "memberPerson"})
    protected List<Person> _memberPerson = new ArrayList<>();

    @JsonAlias({"ids:participantCertification", "participantCertification"})
    protected ParticipantCertification _participantCertification;

    @JsonAlias({"ids:participantRefinement", "participantRefinement"})
    protected AbstractConstraint _participantRefinement;

    @JsonAlias({"ids:primarySite", "primarySite"})
    protected Site _primarySite;

    @JsonAlias({"ids:title", "title"})
    protected List<TypedLiteral> _title = new ArrayList<>();

    @JsonAlias({"ids:vatID", "vatID"})
    protected String _vatID;

    @JsonAlias({"ids:version", "version"})
    protected String _version;

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

    @Override
    public String toString() {
        return this.toRdf();
    }

    public List<TypedLiteral> getLabel() {
        return this.label;
    }

    public List<TypedLiteral> getComment() {
        return this.comment;
    }

    // getter and setter for generic property map
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
        if (this.properties == null)
            return null;
        Iterator<String> iter = this.properties.keySet().iterator();
        Map<String, Object> resultset = new HashMap<String, Object>();
        while (iter.hasNext()) {
            String key = iter.next();
            resultset.put(key, urifyObjects(this.properties.get(key)));
        }
        return resultset;
    }

    public Object urifyObjects(Object value) {
        if (value instanceof String && value.toString().startsWith("http")) {
            try {
                value = new URI(value.toString());
            } catch (Exception e) {
                /* do nothing */ }
        } else if (value instanceof ArrayList) {
            ArrayList<Object> result_array = new ArrayList<Object>();
            ((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
            return result_array;
        } else if (value instanceof Map) {
            Map<String, Object> result_map = new HashMap<String, Object>();
            ((Map) value).forEach((k, v) -> result_map.put(k.toString(), urifyObjects(v)));
            return result_map;
        }
        return value;
    }

    @JsonAnySetter
    public void setProperty(String property, Object value) {
        if (this.properties == null)
            this.properties = new HashMap<String, Object>();
        if (property.startsWith("@")) {
            return;
        } ;
        this.properties.put(property, value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this._legalName,
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
            this._version);
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

    @Override
    public Participant deepCopy() {
        ParticipantBuilder builder = new ParticipantBuilder();
        for (String item : this._legalName) {
            builder._legalName_(item);
        }
        if (this._primarySite != null) {
            builder._primarySite_(this._primarySite.deepCopy());
        }
        for (String item : this._corporateEmailAddress) {
            builder._corporateEmailAddress_(item);
        }
        if (this._corporateHomepage != null) {
            builder._corporateHomepage_(URI.create(this._corporateHomepage.toString()));
        }
        for (Participant item : this._memberParticipant) {
            if (item != null) {
                builder._memberParticipant_(item.deepCopy());
            }
        }
        if (this._participantCertification != null) {
            builder._participantCertification_(this._participantCertification.deepCopy());
        }
        if (this._participantRefinement != null) {
            builder._participantRefinement_(this._participantRefinement.deepCopy());
        }
        for (BusinessIdentifier item : this._businessIdentifier) {
            if (item != null) {
                builder._businessIdentifier_(item.deepCopy());
            }
        }
        builder._vatID_(this._vatID);
        builder._legalForm_(this._legalForm);
        builder._jurisdiction_(this._jurisdiction);
        for (Person item : this._memberPerson) {
            if (item != null) {
                builder._memberPerson_(item.deepCopy());
            }
        }
        for (TypedLiteral item : this._title) {
            if (item != null && item.getLanguage() != null) {
                builder._title_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._title_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        for (TypedLiteral item : this._description) {
            if (item != null && item.getLanguage() != null) {
                builder._description_(new TypedLiteral(item.getValue(), item.getLanguage()));
            } else {
                builder._description_(new TypedLiteral(item.getValue(), URI.create(item.getType())));
            }
        }
        builder._version_(this._version);
        return builder.build();
    }

    // accessor method implementations as derived from the IDS Information Model ontology

    @Override
    public List<String> getLegalName() {
        return _legalName;
    }

    @Override
    public void setLegalName(List<String> _legalName_) {
        this._legalName = _legalName_;
    }

    @Override
    public Site getPrimarySite() {
        return _primarySite;
    }

    @Override
    public void setPrimarySite(Site _primarySite_) {
        this._primarySite = _primarySite_;
    }

    @Override
    public List<String> getCorporateEmailAddress() {
        return _corporateEmailAddress;
    }

    @Override
    public void setCorporateEmailAddress(List<String> _corporateEmailAddress_) {
        this._corporateEmailAddress = _corporateEmailAddress_;
    }

    @Override
    public URI getCorporateHomepage() {
        return _corporateHomepage;
    }

    @Override
    public void setCorporateHomepage(URI _corporateHomepage_) {
        this._corporateHomepage = _corporateHomepage_;
    }

    @Override
    public List<Participant> getMemberParticipant() {
        return _memberParticipant;
    }

    @Override
    public void setMemberParticipant(List<Participant> _memberParticipant_) {
        this._memberParticipant = _memberParticipant_;
    }

    @Override
    public ParticipantCertification getParticipantCertification() {
        return _participantCertification;
    }

    @Override
    public void setParticipantCertification(ParticipantCertification _participantCertification_) {
        this._participantCertification = _participantCertification_;
    }

    @Override
    public AbstractConstraint getParticipantRefinement() {
        return _participantRefinement;
    }

    @Override
    public void setParticipantRefinement(AbstractConstraint _participantRefinement_) {
        this._participantRefinement = _participantRefinement_;
    }

    @Override
    public List<BusinessIdentifier> getBusinessIdentifier() {
        return _businessIdentifier;
    }

    @Override
    public void setBusinessIdentifier(List<BusinessIdentifier> _businessIdentifier_) {
        this._businessIdentifier = _businessIdentifier_;
    }

    @Override
    public String getVatID() {
        return _vatID;
    }

    @Override
    public void setVatID(String _vatID_) {
        this._vatID = _vatID_;
    }

    @Override
    @NotNull
    public String getLegalForm() {
        return _legalForm;
    }

    @Override
    public void setLegalForm(String _legalForm_) {
        this._legalForm = _legalForm_;
    }

    @Override
    public String getJurisdiction() {
        return _jurisdiction;
    }

    @Override
    public void setJurisdiction(String _jurisdiction_) {
        this._jurisdiction = _jurisdiction_;
    }

    @Override
    public List<Person> getMemberPerson() {
        return _memberPerson;
    }

    @Override
    public void setMemberPerson(List<Person> _memberPerson_) {
        this._memberPerson = _memberPerson_;
    }

    @Override
    public List<TypedLiteral> getTitle() {
        return _title;
    }

    @Override
    public void setTitle(List<TypedLiteral> _title_) {
        this._title = _title_;
    }

    @Override
    public List<TypedLiteral> getDescription() {
        return _description;
    }

    @Override
    public void setDescription(List<TypedLiteral> _description_) {
        this._description = _description_;
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String _version_) {
        this._version = _version_;
    }

}
