package de.fraunhofer.iais.eis;

import java.net.URI;

import de.fraunhofer.iais.eis.util.*;

public class AppExecutionResourcesBuilder implements Builder<AppExecutionResources> {

    private AppExecutionResourcesImpl appExecutionResourcesImpl;

    public AppExecutionResourcesBuilder() {
        appExecutionResourcesImpl = new AppExecutionResourcesImpl();
    }

    public AppExecutionResourcesBuilder(URI id) {
        this();
        appExecutionResourcesImpl.id = id;
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
    public AppExecutionResources build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appExecutionResourcesImpl);
        return appExecutionResourcesImpl;
    }
}
