package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class ServiceIsolationGuaranteeBuilder implements Builder<ServiceIsolationGuarantee> {

    private ServiceIsolationGuaranteeImpl serviceIsolationGuaranteeImpl;

    public ServiceIsolationGuaranteeBuilder() {
        serviceIsolationGuaranteeImpl = new ServiceIsolationGuaranteeImpl();
    }

    public ServiceIsolationGuaranteeBuilder(URI id) {
        this();
        serviceIsolationGuaranteeImpl.id = id;
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
    public ServiceIsolationGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(serviceIsolationGuaranteeImpl);
        return serviceIsolationGuaranteeImpl;
    }
}
