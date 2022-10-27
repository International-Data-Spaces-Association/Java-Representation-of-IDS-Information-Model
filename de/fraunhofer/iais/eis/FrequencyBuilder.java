package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class FrequencyBuilder implements Builder<Frequency> {

    private FrequencyImpl frequencyImpl;

    public FrequencyBuilder() {
        frequencyImpl = new FrequencyImpl();
    }

    public FrequencyBuilder(URI id) {
        this();
        frequencyImpl.id = id;
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
    public Frequency build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(frequencyImpl);
        return frequencyImpl;
    }
}
