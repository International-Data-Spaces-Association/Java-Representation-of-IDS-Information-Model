package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class AppEndpointTypeBuilder implements Builder<AppEndpointType> {

    private AppEndpointTypeImpl appEndpointTypeImpl;

    public AppEndpointTypeBuilder() {
        appEndpointTypeImpl = new AppEndpointTypeImpl();
    }

    public AppEndpointTypeBuilder(URI id) {
        this();
        appEndpointTypeImpl.id = id;
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
    public AppEndpointType build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appEndpointTypeImpl);
        return appEndpointTypeImpl;
    }
}
