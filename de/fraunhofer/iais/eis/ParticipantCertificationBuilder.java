package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ParticipantCertificationBuilder implements Builder<ParticipantCertification> {

    private ParticipantCertificationImpl participantCertificationImpl;

    public ParticipantCertificationBuilder() {
        participantCertificationImpl = new ParticipantCertificationImpl();
    }

    public ParticipantCertificationBuilder(URI id) {
        this();
        participantCertificationImpl.id = id;
    }

    /**
     * This function allows setting a value for _membershipEnd
     * 
     * @param _membershipEnd_ desired value to be set
     * @return Builder object with new value for _membershipEnd
     */
    public ParticipantCertificationBuilder _membershipEnd_(XMLGregorianCalendar _membershipEnd_) {
        this.participantCertificationImpl.setMembershipEnd(_membershipEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _certificationLevel
     * 
     * @param _certificationLevel_ desired value to be set
     * @return Builder object with new value for _certificationLevel
     */
    public ParticipantCertificationBuilder _certificationLevel_(CertificationLevel _certificationLevel_) {
        this.participantCertificationImpl.setCertificationLevel(_certificationLevel_);
        return this;
    }

    /**
     * This function allows setting a value for _lastValidDate
     * 
     * @param _lastValidDate_ desired value to be set
     * @return Builder object with new value for _lastValidDate
     */
    public ParticipantCertificationBuilder _lastValidDate_(XMLGregorianCalendar _lastValidDate_) {
        this.participantCertificationImpl.setLastValidDate(_lastValidDate_);
        return this;
    }

    /**
     * This function allows setting a value for _evaluationFacility
     * 
     * @param _evaluationFacility_ desired value to be set
     * @return Builder object with new value for _evaluationFacility
     */
    public ParticipantCertificationBuilder _evaluationFacility_(EvaluationFacility _evaluationFacility_) {
        this.participantCertificationImpl.setEvaluationFacility(_evaluationFacility_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ParticipantCertificationBuilder _version_(String _version_) {
        this.participantCertificationImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ParticipantCertificationBuilder _title_(List<TypedLiteral> _title_) {
        this.participantCertificationImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ParticipantCertificationBuilder _title_(TypedLiteral _title_) {
        this.participantCertificationImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ParticipantCertificationBuilder _description_(List<TypedLiteral> _description_) {
        this.participantCertificationImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ParticipantCertificationBuilder _description_(TypedLiteral _description_) {
        this.participantCertificationImpl.getDescription().add(_description_);
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
    public ParticipantCertification build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantCertificationImpl);
        return participantCertificationImpl;
    }
}
