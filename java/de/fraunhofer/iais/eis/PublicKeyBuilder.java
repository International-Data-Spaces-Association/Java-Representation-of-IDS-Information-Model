package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class PublicKeyBuilder implements Builder<PublicKey> {

    private PublicKeyImpl publicKeyImpl;

    public PublicKeyBuilder() {
        publicKeyImpl = new PublicKeyImpl();
    }

    public PublicKeyBuilder(URI id) {
        this();
        publicKeyImpl.id = id;
    }

    /**
     * This function allows setting a value for _keyType
     * 
     * @param _keyType_ desired value to be set
     * @return Builder object with new value for _keyType
     */
    public PublicKeyBuilder _keyType_(KeyType _keyType_) {
        this.publicKeyImpl.setKeyType(_keyType_);
        return this;
    }

    /**
     * This function allows setting a value for _keyValue
     * 
     * @param _keyValue_ desired value to be set
     * @return Builder object with new value for _keyValue
     */
    public PublicKeyBuilder _keyValue_(byte[] _keyValue_) {
        this.publicKeyImpl.setKeyValue(_keyValue_);
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
    public PublicKey build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(publicKeyImpl);
        return publicKeyImpl;
    }
}
