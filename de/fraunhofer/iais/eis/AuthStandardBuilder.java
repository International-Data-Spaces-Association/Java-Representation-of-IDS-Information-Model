package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class AuthStandardBuilder implements Builder<AuthStandard> {

    private AuthStandardImpl authStandardImpl;

    public AuthStandardBuilder() {
        authStandardImpl = new AuthStandardImpl();
    }

    public AuthStandardBuilder(URI id) {
        this();
        authStandardImpl.id = id;
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
    public AuthStandard build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(authStandardImpl);
        return authStandardImpl;
    }
}
