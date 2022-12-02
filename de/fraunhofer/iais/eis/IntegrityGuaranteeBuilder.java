package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class IntegrityGuaranteeBuilder implements Builder<IntegrityGuarantee> {

    private IntegrityGuaranteeImpl integrityGuaranteeImpl;

    public IntegrityGuaranteeBuilder() {
        integrityGuaranteeImpl = new IntegrityGuaranteeImpl();
    }

    public IntegrityGuaranteeBuilder(URI id) {
        this();
        integrityGuaranteeImpl.id = id;
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
    public IntegrityGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(integrityGuaranteeImpl);
        return integrityGuaranteeImpl;
    }
}
