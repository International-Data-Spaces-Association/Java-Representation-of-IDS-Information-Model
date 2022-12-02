package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class LocalDataConfidentialityGuaranteeBuilder implements Builder<LocalDataConfidentialityGuarantee> {

    private LocalDataConfidentialityGuaranteeImpl localDataConfidentialityGuaranteeImpl;

    public LocalDataConfidentialityGuaranteeBuilder() {
        localDataConfidentialityGuaranteeImpl = new LocalDataConfidentialityGuaranteeImpl();
    }

    public LocalDataConfidentialityGuaranteeBuilder(URI id) {
        this();
        localDataConfidentialityGuaranteeImpl.id = id;
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
    public LocalDataConfidentialityGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(localDataConfidentialityGuaranteeImpl);
        return localDataConfidentialityGuaranteeImpl;
    }
}
