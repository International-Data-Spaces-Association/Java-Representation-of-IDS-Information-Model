package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ValueBuilder implements Builder<Value> {

    private ValueImpl valueImpl;

    public ValueBuilder() {
        valueImpl = new ValueImpl();
    }

    public ValueBuilder(URI id) {
        this();
        valueImpl.id = id;
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
    public Value build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(valueImpl);
        return valueImpl;
    }
}
