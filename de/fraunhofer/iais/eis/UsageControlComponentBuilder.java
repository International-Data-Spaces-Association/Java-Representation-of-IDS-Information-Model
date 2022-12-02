package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class UsageControlComponentBuilder implements Builder<UsageControlComponent> {

    private UsageControlComponentImpl usageControlComponentImpl;

    public UsageControlComponentBuilder() {
        usageControlComponentImpl = new UsageControlComponentImpl();
    }

    public UsageControlComponentBuilder(URI id) {
        this();
        usageControlComponentImpl.id = id;
    }

    /**
     * This function allows setting a value for _interfaceDescription
     * 
     * @param _interfaceDescription_ desired value to be set
     * @return Builder object with new value for _interfaceDescription
     */
    public UsageControlComponentBuilder _interfaceDescription_(URI _interfaceDescription_) {
        this.usageControlComponentImpl.setInterfaceDescription(_interfaceDescription_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointURI
     * 
     * @param _endpointURI_ desired value to be set
     * @return Builder object with new value for _endpointURI
     */
    public UsageControlComponentBuilder _endpointURI_(URI _endpointURI_) {
        this.usageControlComponentImpl.setEndpointURI(_endpointURI_);
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
    public UsageControlComponent build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(usageControlComponentImpl);
        return usageControlComponentImpl;
    }
}
