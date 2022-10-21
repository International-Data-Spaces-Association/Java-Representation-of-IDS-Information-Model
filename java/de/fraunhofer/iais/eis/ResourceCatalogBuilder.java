package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ResourceCatalogBuilder implements Builder<ResourceCatalog> {

    private ResourceCatalogImpl resourceCatalogImpl;

    public ResourceCatalogBuilder() {
        resourceCatalogImpl = new ResourceCatalogImpl();
    }

    public ResourceCatalogBuilder(URI id) {
        this();
        resourceCatalogImpl.id = id;
    }

    /**
     * This function allows setting a value for _offeredResource
     * 
     * @param _offeredResource_ desired value to be set
     * @return Builder object with new value for _offeredResource
     */
    public ResourceCatalogBuilder _offeredResource_(List<Resource> _offeredResource_) {
        this.resourceCatalogImpl.setOfferedResource(_offeredResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _offeredResource
     * 
     * @param _offeredResource_ desired value to be added
     * @return Builder object with new value for _offeredResource
     */
    public ResourceCatalogBuilder _offeredResource_(Resource _offeredResource_) {
        this.resourceCatalogImpl.getOfferedResource().add(_offeredResource_);
        return this;
    }

    /**
     * This function allows setting a value for _requestedResource
     * 
     * @param _requestedResource_ desired value to be set
     * @return Builder object with new value for _requestedResource
     */
    public ResourceCatalogBuilder _requestedResource_(List<Resource> _requestedResource_) {
        this.resourceCatalogImpl.setRequestedResource(_requestedResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _requestedResource
     * 
     * @param _requestedResource_ desired value to be added
     * @return Builder object with new value for _requestedResource
     */
    public ResourceCatalogBuilder _requestedResource_(Resource _requestedResource_) {
        this.resourceCatalogImpl.getRequestedResource().add(_requestedResource_);
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
    public ResourceCatalog build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(resourceCatalogImpl);
        return resourceCatalogImpl;
    }
}
