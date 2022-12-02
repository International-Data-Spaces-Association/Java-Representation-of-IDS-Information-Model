package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ClearingHouseCatalogBuilder implements Builder<ClearingHouseCatalog> {

    private ClearingHouseCatalogImpl clearingHouseCatalogImpl;

    public ClearingHouseCatalogBuilder() {
        clearingHouseCatalogImpl = new ClearingHouseCatalogImpl();
    }

    public ClearingHouseCatalogBuilder(URI id) {
        this();
        clearingHouseCatalogImpl.id = id;
    }

    /**
     * This function allows setting a value for _listedClearingHouse
     * 
     * @param _listedClearingHouse_ desired value to be set
     * @return Builder object with new value for _listedClearingHouse
     */
    public ClearingHouseCatalogBuilder _listedClearingHouse_(List<ClearingHouse> _listedClearingHouse_) {
        this.clearingHouseCatalogImpl.setListedClearingHouse(_listedClearingHouse_);
        return this;
    }

    /**
     * This function allows adding a value to the List _listedClearingHouse
     * 
     * @param _listedClearingHouse_ desired value to be added
     * @return Builder object with new value for _listedClearingHouse
     */
    public ClearingHouseCatalogBuilder _listedClearingHouse_(ClearingHouse _listedClearingHouse_) {
        this.clearingHouseCatalogImpl.getListedClearingHouse().add(_listedClearingHouse_);
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
    public ClearingHouseCatalog build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(clearingHouseCatalogImpl);
        return clearingHouseCatalogImpl;
    }
}
