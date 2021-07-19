package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class TokenBuilder implements Builder<Token> {

    private TokenImpl tokenImpl;

    public TokenBuilder() {
        tokenImpl = new TokenImpl();
    }

    public TokenBuilder(URI id) {
        this();
        tokenImpl.id = id;
    }

    /**
     * This function allows setting a value for _tokenValue
     * 
     * @param _tokenValue_ desired value to be set
     * @return Builder object with new value for _tokenValue
     */
    public TokenBuilder _tokenValue_(String _tokenValue_) {
        this.tokenImpl.setTokenValue(_tokenValue_);
        return this;
    }

    /**
     * This function allows setting a value for _tokenFormat
     * 
     * @param _tokenFormat_ desired value to be set
     * @return Builder object with new value for _tokenFormat
     */
    public TokenBuilder _tokenFormat_(TokenFormat _tokenFormat_) {
        this.tokenImpl.setTokenFormat(_tokenFormat_);
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
    public Token build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(tokenImpl);
        return tokenImpl;
    }
}
