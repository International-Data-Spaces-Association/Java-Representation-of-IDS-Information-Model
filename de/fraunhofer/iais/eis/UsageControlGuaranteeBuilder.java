package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class UsageControlGuaranteeBuilder implements Builder<UsageControlGuarantee> {

    private UsageControlGuaranteeImpl usageControlGuaranteeImpl;

    public UsageControlGuaranteeBuilder() {
        usageControlGuaranteeImpl = new UsageControlGuaranteeImpl();
    }

    public UsageControlGuaranteeBuilder(URI id) {
        this();
        usageControlGuaranteeImpl.id = id;
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
    public UsageControlGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(usageControlGuaranteeImpl);
        return usageControlGuaranteeImpl;
    }
}
