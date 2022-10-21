package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class BoundingPolygonBuilder implements Builder<BoundingPolygon> {

    private BoundingPolygonImpl boundingPolygonImpl;

    public BoundingPolygonBuilder() {
        boundingPolygonImpl = new BoundingPolygonImpl();
    }

    public BoundingPolygonBuilder(URI id) {
        this();
        boundingPolygonImpl.id = id;
    }

    /**
     * This function allows setting a value for _geoPoint
     * 
     * @param _geoPoint_ desired value to be set
     * @return Builder object with new value for _geoPoint
     */
    public BoundingPolygonBuilder _geoPoint_(List<GeoPoint> _geoPoint_) {
        this.boundingPolygonImpl.setGeoPoint(_geoPoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _geoPoint
     * 
     * @param _geoPoint_ desired value to be added
     * @return Builder object with new value for _geoPoint
     */
    public BoundingPolygonBuilder _geoPoint_(GeoPoint _geoPoint_) {
        this.boundingPolygonImpl.getGeoPoint().add(_geoPoint_);
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
    public BoundingPolygon build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(boundingPolygonImpl);
        return boundingPolygonImpl;
    }
}
