package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class AudienceBuilder implements Builder<Audience> {

    private AudienceImpl audienceImpl;

    public AudienceBuilder() {
        audienceImpl = new AudienceImpl();
    }

    public AudienceBuilder(URI id) {
        this();
        audienceImpl.id = id;
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
    public Audience build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(audienceImpl);
        return audienceImpl;
    }
}
