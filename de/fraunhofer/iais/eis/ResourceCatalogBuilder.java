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
     * This function allows setting a value for _offeredResourceAsObject
     * 
     * @param _offeredResource_ desired value to be set
     * @return Builder object with new value for _offeredResourceAsObject
     */
    public ResourceCatalogBuilder _offeredResourceAsObject_(List<Resource> _offeredResource_) {
        this.resourceCatalogImpl.setOfferedResourceAsObject(_offeredResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _offeredResourceAsObject
     * 
     * @param _offeredResource_ desired value to be added
     * @return Builder object with new value for _offeredResourceAsObject
     */
    public ResourceCatalogBuilder _offeredResourceAsObject_(Resource _offeredResource_) {
        this.resourceCatalogImpl.getOfferedResourceAsObject().add(_offeredResource_);
        return this;
    }

    /**
     * This function allows setting a value for _offeredResourceAsUri
     * 
     * @param _offeredResource_ desired value to be set
     * @return Builder object with new value for _offeredResourceAsUri
     */
    public ResourceCatalogBuilder _offeredResourceAsUri_(List<URI> _offeredResource_) {
        this.resourceCatalogImpl.setOfferedResourceAsUri(_offeredResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _offeredResourceAsUri
     * 
     * @param _offeredResource_ desired value to be added
     * @return Builder object with new value for _offeredResourceAsUri
     */
    public ResourceCatalogBuilder _offeredResourceAsUri_(URI _offeredResource_) {
        this.resourceCatalogImpl.getOfferedResourceAsUri().add(_offeredResource_);
        return this;
    }

    /**
     * This function allows setting a value for _requestedResourceAsObject
     * 
     * @param _requestedResource_ desired value to be set
     * @return Builder object with new value for _requestedResourceAsObject
     */
    public ResourceCatalogBuilder _requestedResourceAsObject_(List<Resource> _requestedResource_) {
        this.resourceCatalogImpl.setRequestedResourceAsObject(_requestedResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _requestedResourceAsObject
     * 
     * @param _requestedResource_ desired value to be added
     * @return Builder object with new value for _requestedResourceAsObject
     */
    public ResourceCatalogBuilder _requestedResourceAsObject_(Resource _requestedResource_) {
        this.resourceCatalogImpl.getRequestedResourceAsObject().add(_requestedResource_);
        return this;
    }

    /**
     * This function allows setting a value for _requestedResourceAsUri
     * 
     * @param _requestedResource_ desired value to be set
     * @return Builder object with new value for _requestedResourceAsUri
     */
    public ResourceCatalogBuilder _requestedResourceAsUri_(List<URI> _requestedResource_) {
        this.resourceCatalogImpl.setRequestedResourceAsUri(_requestedResource_);
        return this;
    }

    /**
     * This function allows adding a value to the List _requestedResourceAsUri
     * 
     * @param _requestedResource_ desired value to be added
     * @return Builder object with new value for _requestedResourceAsUri
     */
    public ResourceCatalogBuilder _requestedResourceAsUri_(URI _requestedResource_) {
        this.resourceCatalogImpl.getRequestedResourceAsUri().add(_requestedResource_);
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
