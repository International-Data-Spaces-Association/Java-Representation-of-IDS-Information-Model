package de.fraunhofer.iais.eis;

import java.net.URI;



import de.fraunhofer.iais.eis.util.*;

public class GeoPointBuilder implements Builder<GeoPoint> {

    private GeoPointImpl geoPointImpl;

    public GeoPointBuilder() {
        geoPointImpl = new GeoPointImpl();
    }

    public GeoPointBuilder(URI id) {
        this();
        geoPointImpl.id = id;
    }

    /**
     * This function allows setting a value for _latitude
     * 
     * @param _latitude_ desired value to be set
     * @return Builder object with new value for _latitude
     */
    public GeoPointBuilder _latitude_(float _latitude_) {
        this.geoPointImpl.setLatitude(_latitude_);
        return this;
    }

    /**
     * This function allows setting a value for _longitude
     * 
     * @param _longitude_ desired value to be set
     * @return Builder object with new value for _longitude
     */
    public GeoPointBuilder _longitude_(float _longitude_) {
        this.geoPointImpl.setLongitude(_longitude_);
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
    public GeoPoint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(geoPointImpl);
        return geoPointImpl;
    }
}
