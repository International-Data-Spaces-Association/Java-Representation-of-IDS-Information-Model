package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class AppResourceCatalogBuilder implements Builder<AppResourceCatalog> {

    private AppResourceCatalogImpl appResourceCatalogImpl;

    public AppResourceCatalogBuilder() {
        appResourceCatalogImpl = new AppResourceCatalogImpl();
    }

    public AppResourceCatalogBuilder(URI id) {
        this();
        appResourceCatalogImpl.id = id;
    }

    /**
     * This function allows setting a value for _listedAppResource
     * 
     * @param _listedAppResource_ desired value to be set
     * @return Builder object with new value for _listedAppResource
     */
    public AppResourceCatalogBuilder _listedAppResource_(List<AppResource> _listedAppResource_) {
        this.appResourceCatalogImpl.setListedAppResource(_listedAppResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _listedAppResource
     * 
     * @param _listedAppResource_ desired value to be added
     * @return Builder object with new value for _listedAppResource
     */
    public AppResourceCatalogBuilder _listedAppResource_(AppResource _listedAppResource_) {
        this.appResourceCatalogImpl.getListedAppResource().add(_listedAppResource_);
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
    public AppResourceCatalog build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appResourceCatalogImpl);
        return appResourceCatalogImpl;
    }
}
