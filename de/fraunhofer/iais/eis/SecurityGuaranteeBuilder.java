package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class SecurityGuaranteeBuilder implements Builder<SecurityGuarantee> {

    private SecurityGuaranteeImpl securityGuaranteeImpl;

    public SecurityGuaranteeBuilder() {
        securityGuaranteeImpl = new SecurityGuaranteeImpl();
    }

    public SecurityGuaranteeBuilder(URI id) {
        this();
        securityGuaranteeImpl.id = id;
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
    public SecurityGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(securityGuaranteeImpl);
        return securityGuaranteeImpl;
    }
}
