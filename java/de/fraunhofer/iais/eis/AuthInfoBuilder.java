package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class AuthInfoBuilder implements Builder<AuthInfo> {

    private AuthInfoImpl authInfoImpl;

    public AuthInfoBuilder() {
        authInfoImpl = new AuthInfoImpl();
    }

    public AuthInfoBuilder(URI id) {
        this();
        authInfoImpl.id = id;
    }

    /**
     * This function allows setting a value for _authService
     * 
     * @param _authService_ desired value to be set
     * @return Builder object with new value for _authService
     */
    public AuthInfoBuilder _authService_(URI _authService_) {
        this.authInfoImpl.setAuthService(_authService_);
        return this;
    }

    /**
     * This function allows setting a value for _authStandard
     * 
     * @param _authStandard_ desired value to be set
     * @return Builder object with new value for _authStandard
     */
    public AuthInfoBuilder _authStandard_(AuthStandard _authStandard_) {
        this.authInfoImpl.setAuthStandard(_authStandard_);
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
    public AuthInfo build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(authInfoImpl);
        return authInfoImpl;
    }
}
