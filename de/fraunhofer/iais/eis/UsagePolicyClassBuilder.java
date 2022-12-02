package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class UsagePolicyClassBuilder implements Builder<UsagePolicyClass> {

    private UsagePolicyClassImpl usagePolicyClassImpl;

    public UsagePolicyClassBuilder() {
        usagePolicyClassImpl = new UsagePolicyClassImpl();
    }

    public UsagePolicyClassBuilder(URI id) {
        this();
        usagePolicyClassImpl.id = id;
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
    public UsagePolicyClass build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(usagePolicyClassImpl);
        return usagePolicyClassImpl;
    }
}
