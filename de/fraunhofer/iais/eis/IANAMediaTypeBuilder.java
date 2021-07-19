package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class IANAMediaTypeBuilder implements Builder<IANAMediaType> {

    private IANAMediaTypeImpl iANAMediaTypeImpl;

    public IANAMediaTypeBuilder() {
        iANAMediaTypeImpl = new IANAMediaTypeImpl();
    }

    public IANAMediaTypeBuilder(URI id) {
        this();
        iANAMediaTypeImpl.id = id;
    }

    /**
     * This function allows setting a value for _filenameExtension
     * 
     * @param _filenameExtension_ desired value to be set
     * @return Builder object with new value for _filenameExtension
     */
    public IANAMediaTypeBuilder _filenameExtension_(String _filenameExtension_) {
        this.iANAMediaTypeImpl.setFilenameExtension(_filenameExtension_);
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
    public IANAMediaType build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(iANAMediaTypeImpl);
        return iANAMediaTypeImpl;
    }
}
