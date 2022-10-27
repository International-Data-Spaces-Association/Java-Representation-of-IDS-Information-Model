package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class TokenFormatBuilder implements Builder<TokenFormat> {

    private TokenFormatImpl tokenFormatImpl;

    public TokenFormatBuilder() {
        tokenFormatImpl = new TokenFormatImpl();
    }

    public TokenFormatBuilder(URI id) {
        this();
        tokenFormatImpl.id = id;
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
    public TokenFormat build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(tokenFormatImpl);
        return tokenFormatImpl;
    }
}
