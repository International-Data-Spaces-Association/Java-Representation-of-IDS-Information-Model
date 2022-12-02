package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class AuthenticationGuaranteeBuilder implements Builder<AuthenticationGuarantee> {

    private AuthenticationGuaranteeImpl authenticationGuaranteeImpl;

    public AuthenticationGuaranteeBuilder() {
        authenticationGuaranteeImpl = new AuthenticationGuaranteeImpl();
    }

    public AuthenticationGuaranteeBuilder(URI id) {
        this();
        authenticationGuaranteeImpl.id = id;
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
    public AuthenticationGuarantee build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(authenticationGuaranteeImpl);
        return authenticationGuaranteeImpl;
    }
}
