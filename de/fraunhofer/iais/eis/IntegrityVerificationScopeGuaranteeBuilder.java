package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class IntegrityVerificationScopeGuaranteeBuilder implements Builder<IntegrityVerificationScopeGuarantee> {

    private IntegrityVerificationScopeGuaranteeImpl integrityVerificationScopeGuaranteeImpl;

    public IntegrityVerificationScopeGuaranteeBuilder() {
        integrityVerificationScopeGuaranteeImpl = new IntegrityVerificationScopeGuaranteeImpl();
    }

    public IntegrityVerificationScopeGuaranteeBuilder(URI id) {
        this();
        integrityVerificationScopeGuaranteeImpl.id = id;
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
    public IntegrityVerificationScopeGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(integrityVerificationScopeGuaranteeImpl);
        return integrityVerificationScopeGuaranteeImpl;
    }
}
