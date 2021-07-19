package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class AssetCollectionBuilder implements Builder<AssetCollection> {

    private AssetCollectionImpl assetCollectionImpl;

    public AssetCollectionBuilder() {
        assetCollectionImpl = new AssetCollectionImpl();
    }

    public AssetCollectionBuilder(URI id) {
        this();
        assetCollectionImpl.id = id;
    }

    /**
     * This function allows setting a value for _assetSource
     * 
     * @param _assetSource_ desired value to be set
     * @return Builder object with new value for _assetSource
     */
    public AssetCollectionBuilder _assetSource_(URI _assetSource_) {
        this.assetCollectionImpl.setAssetSource(_assetSource_);
        return this;
    }

    /**
     * This function allows setting a value for _assetRefinement
     * 
     * @param _assetRefinement_ desired value to be set
     * @return Builder object with new value for _assetRefinement
     */
    public AssetCollectionBuilder _assetRefinement_(AbstractConstraint _assetRefinement_) {
        this.assetCollectionImpl.setAssetRefinement(_assetRefinement_);
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
    public AssetCollection build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(assetCollectionImpl);
        return assetCollectionImpl;
    }
}
