package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class BinaryOperatorBuilder implements Builder<BinaryOperator> {

    private BinaryOperatorImpl binaryOperatorImpl;

    public BinaryOperatorBuilder() {
        binaryOperatorImpl = new BinaryOperatorImpl();
    }

    public BinaryOperatorBuilder(URI id) {
        this();
        binaryOperatorImpl.id = id;
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
    public BinaryOperator build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(binaryOperatorImpl);
        return binaryOperatorImpl;
    }
}
