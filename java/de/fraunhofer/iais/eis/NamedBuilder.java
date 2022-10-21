package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class NamedBuilder implements Builder<Named> {

    private NamedImpl namedImpl;

    public NamedBuilder() {
        namedImpl = new NamedImpl();
    }

    public NamedBuilder(URI id) {
        this();
        namedImpl.id = id;
    }

    /**
     * This function allows setting a value for _name
     * 
     * @param _name_ desired value to be set
     * @return Builder object with new value for _name
     */
    public NamedBuilder _name_(String _name_) {
        this.namedImpl.setName(_name_);
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
    public Named build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(namedImpl);
        return namedImpl;
    }
}
