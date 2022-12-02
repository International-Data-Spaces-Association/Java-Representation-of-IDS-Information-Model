package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class DynamicAttributeTokenBuilder implements Builder<DynamicAttributeToken> {

    private DynamicAttributeTokenImpl dynamicAttributeTokenImpl;

    public DynamicAttributeTokenBuilder() {
        dynamicAttributeTokenImpl = new DynamicAttributeTokenImpl();
    }

    public DynamicAttributeTokenBuilder(URI id) {
        this();
        dynamicAttributeTokenImpl.id = id;
    }

    /**
     * This function allows setting a value for _tokenValue
     * 
     * @param _tokenValue_ desired value to be set
     * @return Builder object with new value for _tokenValue
     */
    public DynamicAttributeTokenBuilder _tokenValue_(String _tokenValue_) {
        this.dynamicAttributeTokenImpl.setTokenValue(_tokenValue_);
        return this;
    }

    /**
     * This function allows setting a value for _tokenFormat
     * 
     * @param _tokenFormat_ desired value to be set
     * @return Builder object with new value for _tokenFormat
     */
    public DynamicAttributeTokenBuilder _tokenFormat_(TokenFormat _tokenFormat_) {
        this.dynamicAttributeTokenImpl.setTokenFormat(_tokenFormat_);
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
    public DynamicAttributeToken build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(dynamicAttributeTokenImpl);
        return dynamicAttributeTokenImpl;
    }
}
