package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class IdsProtocolSpecificationBuilder implements Builder<IdsProtocolSpecification> {

    private IdsProtocolSpecificationImpl idsProtocolSpecificationImpl;

    public IdsProtocolSpecificationBuilder() {
        idsProtocolSpecificationImpl = new IdsProtocolSpecificationImpl();
    }

    public IdsProtocolSpecificationBuilder(URI id) {
        this();
        idsProtocolSpecificationImpl.id = id;
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
    public IdsProtocolSpecification build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(idsProtocolSpecificationImpl);
        return idsProtocolSpecificationImpl;
    }
}
