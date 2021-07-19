package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class BrokerCatalogBuilder implements Builder<BrokerCatalog> {

    private BrokerCatalogImpl brokerCatalogImpl;

    public BrokerCatalogBuilder() {
        brokerCatalogImpl = new BrokerCatalogImpl();
    }

    public BrokerCatalogBuilder(URI id) {
        this();
        brokerCatalogImpl.id = id;
    }

    /**
     * This function allows setting a value for _listedConnector
     * 
     * @param _listedConnector_ desired value to be set
     * @return Builder object with new value for _listedConnector
     */
    public BrokerCatalogBuilder _listedConnector_(List<Connector> _listedConnector_) {
        this.brokerCatalogImpl.setListedConnector(_listedConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _listedConnector
     * 
     * @param _listedConnector_ desired value to be added
     * @return Builder object with new value for _listedConnector
     */
    public BrokerCatalogBuilder _listedConnector_(Connector _listedConnector_) {
        this.brokerCatalogImpl.getListedConnector().add(_listedConnector_);
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
    public BrokerCatalog build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(brokerCatalogImpl);
        return brokerCatalogImpl;
    }
}
