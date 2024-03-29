package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class ParticipantCertificationLevelBuilder implements Builder<ParticipantCertificationLevel> {

    private ParticipantCertificationLevelImpl participantCertificationLevelImpl;

    public ParticipantCertificationLevelBuilder() {
        participantCertificationLevelImpl = new ParticipantCertificationLevelImpl();
    }

    public ParticipantCertificationLevelBuilder(URI id) {
        this();
        participantCertificationLevelImpl.id = id;
    }

    /**
     * This function allows setting a value for _includedCertificationLevel
     * 
     * @param _includedCertificationLevel_ desired value to be set
     * @return Builder object with new value for _includedCertificationLevel
     */
    public ParticipantCertificationLevelBuilder _includedCertificationLevel_(CertificationLevel _includedCertificationLevel_) {
        this.participantCertificationLevelImpl.setIncludedCertificationLevel(_includedCertificationLevel_);
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
    public ParticipantCertificationLevel build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantCertificationLevelImpl);
        return participantCertificationLevelImpl;
    }
}
