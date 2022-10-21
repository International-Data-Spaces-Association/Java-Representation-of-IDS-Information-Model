package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class BasicAuthenticationBuilder implements Builder<BasicAuthentication> {

    private BasicAuthenticationImpl basicAuthenticationImpl;

    public BasicAuthenticationBuilder() {
        basicAuthenticationImpl = new BasicAuthenticationImpl();
    }

    public BasicAuthenticationBuilder(URI id) {
        this();
        basicAuthenticationImpl.id = id;
    }

    /**
     * This function allows setting a value for _authPassword
     * 
     * @param _authPassword_ desired value to be set
     * @return Builder object with new value for _authPassword
     */
    public BasicAuthenticationBuilder _authPassword_(String _authPassword_) {
        this.basicAuthenticationImpl.setAuthPassword(_authPassword_);
        return this;
    }

    /**
     * This function allows setting a value for _authUsername
     * 
     * @param _authUsername_ desired value to be set
     * @return Builder object with new value for _authUsername
     */
    public BasicAuthenticationBuilder _authUsername_(String _authUsername_) {
        this.basicAuthenticationImpl.setAuthUsername(_authUsername_);
        return this;
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
    public BasicAuthentication build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(basicAuthenticationImpl);
        return basicAuthenticationImpl;
    }
}
