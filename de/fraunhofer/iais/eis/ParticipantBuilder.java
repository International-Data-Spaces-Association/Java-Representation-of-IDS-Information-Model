package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ParticipantBuilder implements Builder<Participant> {

    private ParticipantImpl participantImpl;

    public ParticipantBuilder() {
        participantImpl = new ParticipantImpl();
    }

    public ParticipantBuilder(URI id) {
        this();
        participantImpl.id = id;
    }

    /**
     * This function allows setting a value for _legalName
     * 
     * @param _legalName_ desired value to be set
     * @return Builder object with new value for _legalName
     */
    public ParticipantBuilder _legalName_(List<String> _legalName_) {
        this.participantImpl.setLegalName(_legalName_);
        return this;
    }

    /**
     * This function allows adding a value to the List _legalName
     * 
     * @param _legalName_ desired value to be added
     * @return Builder object with new value for _legalName
     */
    public ParticipantBuilder _legalName_(String _legalName_) {
        this.participantImpl.getLegalName().add(_legalName_);
        return this;
    }

    /**
     * This function allows setting a value for _primarySite
     * 
     * @param _primarySite_ desired value to be set
     * @return Builder object with new value for _primarySite
     */
    public ParticipantBuilder _primarySite_(Site _primarySite_) {
        this.participantImpl.setPrimarySite(_primarySite_);
        return this;
    }

    /**
     * This function allows setting a value for _corporateEmailAddress
     * 
     * @param _corporateEmailAddress_ desired value to be set
     * @return Builder object with new value for _corporateEmailAddress
     */
    public ParticipantBuilder _corporateEmailAddress_(List<String> _corporateEmailAddress_) {
        this.participantImpl.setCorporateEmailAddress(_corporateEmailAddress_);
        return this;
    }

    /**
     * This function allows adding a value to the List _corporateEmailAddress
     * 
     * @param _corporateEmailAddress_ desired value to be added
     * @return Builder object with new value for _corporateEmailAddress
     */
    public ParticipantBuilder _corporateEmailAddress_(String _corporateEmailAddress_) {
        this.participantImpl.getCorporateEmailAddress().add(_corporateEmailAddress_);
        return this;
    }

    /**
     * This function allows setting a value for _corporateHomepage
     * 
     * @param _corporateHomepage_ desired value to be set
     * @return Builder object with new value for _corporateHomepage
     */
    public ParticipantBuilder _corporateHomepage_(URI _corporateHomepage_) {
        this.participantImpl.setCorporateHomepage(_corporateHomepage_);
        return this;
    }

    /**
     * This function allows setting a value for _memberParticipant
     * 
     * @param _memberParticipant_ desired value to be set
     * @return Builder object with new value for _memberParticipant
     */
    public ParticipantBuilder _memberParticipant_(List<Participant> _memberParticipant_) {
        this.participantImpl.setMemberParticipant(_memberParticipant_);
        return this;
    }

    /**
     * This function allows adding a value to the List _memberParticipant
     * 
     * @param _memberParticipant_ desired value to be added
     * @return Builder object with new value for _memberParticipant
     */
    public ParticipantBuilder _memberParticipant_(Participant _memberParticipant_) {
        this.participantImpl.getMemberParticipant().add(_memberParticipant_);
        return this;
    }

    /**
     * This function allows setting a value for _participantCertification
     * 
     * @param _participantCertification_ desired value to be set
     * @return Builder object with new value for _participantCertification
     */
    public ParticipantBuilder _participantCertification_(ParticipantCertification _participantCertification_) {
        this.participantImpl.setParticipantCertification(_participantCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _participantRefinement
     * 
     * @param _participantRefinement_ desired value to be set
     * @return Builder object with new value for _participantRefinement
     */
    public ParticipantBuilder _participantRefinement_(AbstractConstraint _participantRefinement_) {
        this.participantImpl.setParticipantRefinement(_participantRefinement_);
        return this;
    }

    /**
     * This function allows setting a value for _businessIdentifier
     * 
     * @param _businessIdentifier_ desired value to be set
     * @return Builder object with new value for _businessIdentifier
     */
    public ParticipantBuilder _businessIdentifier_(List<BusinessIdentifier> _businessIdentifier_) {
        this.participantImpl.setBusinessIdentifier(_businessIdentifier_);
        return this;
    }

    /**
     * This function allows adding a value to the List _businessIdentifier
     * 
     * @param _businessIdentifier_ desired value to be added
     * @return Builder object with new value for _businessIdentifier
     */
    public ParticipantBuilder _businessIdentifier_(BusinessIdentifier _businessIdentifier_) {
        this.participantImpl.getBusinessIdentifier().add(_businessIdentifier_);
        return this;
    }

    /**
     * This function allows setting a value for _vatID
     * 
     * @param _vatID_ desired value to be set
     * @return Builder object with new value for _vatID
     */
    public ParticipantBuilder _vatID_(String _vatID_) {
        this.participantImpl.setVatID(_vatID_);
        return this;
    }

    /**
     * This function allows setting a value for _legalForm
     * 
     * @param _legalForm_ desired value to be set
     * @return Builder object with new value for _legalForm
     */
    public ParticipantBuilder _legalForm_(String _legalForm_) {
        this.participantImpl.setLegalForm(_legalForm_);
        return this;
    }

    /**
     * This function allows setting a value for _jurisdiction
     * 
     * @param _jurisdiction_ desired value to be set
     * @return Builder object with new value for _jurisdiction
     */
    public ParticipantBuilder _jurisdiction_(String _jurisdiction_) {
        this.participantImpl.setJurisdiction(_jurisdiction_);
        return this;
    }

    /**
     * This function allows setting a value for _memberPerson
     * 
     * @param _memberPerson_ desired value to be set
     * @return Builder object with new value for _memberPerson
     */
    public ParticipantBuilder _memberPerson_(List<Person> _memberPerson_) {
        this.participantImpl.setMemberPerson(_memberPerson_);
        return this;
    }

    /**
     * This function allows adding a value to the List _memberPerson
     * 
     * @param _memberPerson_ desired value to be added
     * @return Builder object with new value for _memberPerson
     */
    public ParticipantBuilder _memberPerson_(Person _memberPerson_) {
        this.participantImpl.getMemberPerson().add(_memberPerson_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ParticipantBuilder _title_(List<TypedLiteral> _title_) {
        this.participantImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ParticipantBuilder _title_(TypedLiteral _title_) {
        this.participantImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ParticipantBuilder _description_(List<TypedLiteral> _description_) {
        this.participantImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ParticipantBuilder _description_(TypedLiteral _description_) {
        this.participantImpl.getDescription().add(_description_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ParticipantBuilder _version_(String _version_) {
        this.participantImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    @Override
    public Participant build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantImpl);
        return participantImpl;
    }
}
