package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class HTTPAuthenticationBuilder implements Builder<HTTPAuthentication> {

    private HTTPAuthenticationImpl hTTPAuthenticationImpl;

    public HTTPAuthenticationBuilder() {
        hTTPAuthenticationImpl = new HTTPAuthenticationImpl();
    }

    public HTTPAuthenticationBuilder(URI id) {
        this();
        hTTPAuthenticationImpl.id = id;
    }

    /**
     * This function allows setting a value for _httpAuthURI
     * 
     * @param _httpAuthURI_ desired value to be set
     * @return Builder object with new value for _httpAuthURI
     */
    public HTTPAuthenticationBuilder _httpAuthURI_(URI _httpAuthURI_) {
        this.hTTPAuthenticationImpl.setHttpAuthURI(_httpAuthURI_);
        return this;
    }

    /**
     * This function allows setting a value for _authPassword
     * 
     * @param _authPassword_ desired value to be set
     * @return Builder object with new value for _authPassword
     */
    public HTTPAuthenticationBuilder _authPassword_(String _authPassword_) {
        this.hTTPAuthenticationImpl.setAuthPassword(_authPassword_);
        return this;
    }

    /**
     * This function allows setting a value for _authUsername
     * 
     * @param _authUsername_ desired value to be set
     * @return Builder object with new value for _authUsername
     */
    public HTTPAuthenticationBuilder _authUsername_(String _authUsername_) {
        this.hTTPAuthenticationImpl.setAuthUsername(_authUsername_);
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
    public HTTPAuthentication build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(hTTPAuthenticationImpl);
        return hTTPAuthenticationImpl;
    }
}
