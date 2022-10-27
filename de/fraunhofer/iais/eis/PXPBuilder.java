package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class PXPBuilder implements Builder<PXP> {

    private PXPImpl pXPImpl;

    public PXPBuilder() {
        pXPImpl = new PXPImpl();
    }

    public PXPBuilder(URI id) {
        this();
        pXPImpl.id = id;
    }

    /**
     * This function allows setting a value for _interfaceDescription
     * 
     * @param _interfaceDescription_ desired value to be set
     * @return Builder object with new value for _interfaceDescription
     */
    public PXPBuilder _interfaceDescription_(URI _interfaceDescription_) {
        this.pXPImpl.setInterfaceDescription(_interfaceDescription_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointURI
     * 
     * @param _endpointURI_ desired value to be set
     * @return Builder object with new value for _endpointURI
     */
    public PXPBuilder _endpointURI_(URI _endpointURI_) {
        this.pXPImpl.setEndpointURI(_endpointURI_);
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
    public PXP build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(pXPImpl);
        return pXPImpl;
    }
}
