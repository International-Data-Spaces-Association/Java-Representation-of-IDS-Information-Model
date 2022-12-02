package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class CustomMediaTypeBuilder implements Builder<CustomMediaType> {

    private CustomMediaTypeImpl customMediaTypeImpl;

    public CustomMediaTypeBuilder() {
        customMediaTypeImpl = new CustomMediaTypeImpl();
    }

    public CustomMediaTypeBuilder(URI id) {
        this();
        customMediaTypeImpl.id = id;
    }

    /**
     * This function allows setting a value for _filenameExtension
     * 
     * @param _filenameExtension_ desired value to be set
     * @return Builder object with new value for _filenameExtension
     */
    public CustomMediaTypeBuilder _filenameExtension_(String _filenameExtension_) {
        this.customMediaTypeImpl.setFilenameExtension(_filenameExtension_);
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
    public CustomMediaType build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(customMediaTypeImpl);
        return customMediaTypeImpl;
    }
}
