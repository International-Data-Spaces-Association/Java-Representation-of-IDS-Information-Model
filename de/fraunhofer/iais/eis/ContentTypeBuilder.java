package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class ContentTypeBuilder implements Builder<ContentType> {

    private ContentTypeImpl contentTypeImpl;

    public ContentTypeBuilder() {
        contentTypeImpl = new ContentTypeImpl();
    }

    public ContentTypeBuilder(URI id) {
        this();
        contentTypeImpl.id = id;
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
    public ContentType build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(contentTypeImpl);
        return contentTypeImpl;
    }
}
