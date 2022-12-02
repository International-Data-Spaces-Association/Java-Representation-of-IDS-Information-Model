package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class BusinessIdentifierBuilder implements Builder<BusinessIdentifier> {

    private BusinessIdentifierImpl businessIdentifierImpl;

    public BusinessIdentifierBuilder() {
        businessIdentifierImpl = new BusinessIdentifierImpl();
    }

    public BusinessIdentifierBuilder(URI id) {
        this();
        businessIdentifierImpl.id = id;
    }

    /**
     * This function allows setting a value for _identifierSystem
     * 
     * @param _identifierSystem_ desired value to be set
     * @return Builder object with new value for _identifierSystem
     */
    public BusinessIdentifierBuilder _identifierSystem_(String _identifierSystem_) {
        this.businessIdentifierImpl.setIdentifierSystem(_identifierSystem_);
        return this;
    }

    /**
     * This function allows setting a value for _identifierNumber
     * 
     * @param _identifierNumber_ desired value to be set
     * @return Builder object with new value for _identifierNumber
     */
    public BusinessIdentifierBuilder _identifierNumber_(String _identifierNumber_) {
        this.businessIdentifierImpl.setIdentifierNumber(_identifierNumber_);
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
    public BusinessIdentifier build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(businessIdentifierImpl);
        return businessIdentifierImpl;
    }
}
