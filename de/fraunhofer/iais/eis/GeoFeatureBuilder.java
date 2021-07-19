package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class GeoFeatureBuilder implements Builder<GeoFeature> {

    private GeoFeatureImpl geoFeatureImpl;

    public GeoFeatureBuilder() {
        geoFeatureImpl = new GeoFeatureImpl();
    }

    public GeoFeatureBuilder(URI id) {
        this();
        geoFeatureImpl.id = id;
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
    public GeoFeature build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(geoFeatureImpl);
        return geoFeatureImpl;
    }
}
