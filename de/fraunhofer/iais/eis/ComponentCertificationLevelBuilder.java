package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ComponentCertificationLevelBuilder implements Builder<ComponentCertificationLevel> {

    private ComponentCertificationLevelImpl componentCertificationLevelImpl;

    public ComponentCertificationLevelBuilder() {
        componentCertificationLevelImpl = new ComponentCertificationLevelImpl();
    }

    public ComponentCertificationLevelBuilder(URI id) {
        this();
        componentCertificationLevelImpl.id = id;
    }

    /**
     * This function allows setting a value for _includedCertificationLevel
     * 
     * @param _includedCertificationLevel_ desired value to be set
     * @return Builder object with new value for _includedCertificationLevel
     */
    public ComponentCertificationLevelBuilder _includedCertificationLevel_(CertificationLevel _includedCertificationLevel_) {
        this.componentCertificationLevelImpl.setIncludedCertificationLevel(_includedCertificationLevel_);
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
    public ComponentCertificationLevel build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(componentCertificationLevelImpl);
        return componentCertificationLevelImpl;
    }
}
