package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorbasedRequestBuilder implements Builder<ConnectorbasedRequest> {

    private ConnectorbasedRequestImpl connectorbasedRequestImpl;

    public ConnectorbasedRequestBuilder() {
        connectorbasedRequestImpl = new ConnectorbasedRequestImpl();
    }

    public ConnectorbasedRequestBuilder(URI id) {
        this();
        connectorbasedRequestImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public ConnectorbasedRequestBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.connectorbasedRequestImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public ConnectorbasedRequestBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.connectorbasedRequestImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public ConnectorbasedRequestBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.connectorbasedRequestImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public ConnectorbasedRequestBuilder _provider_(URI _provider_) {
        this.connectorbasedRequestImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public ConnectorbasedRequestBuilder _consumer_(URI _consumer_) {
        this.connectorbasedRequestImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public ConnectorbasedRequestBuilder _contractDocument_(TextResource _contractDocument_) {
        this.connectorbasedRequestImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public ConnectorbasedRequestBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.connectorbasedRequestImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public ConnectorbasedRequestBuilder _permission_(List<Permission> _permission_) {
        this.connectorbasedRequestImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public ConnectorbasedRequestBuilder _permission_(Permission _permission_) {
        this.connectorbasedRequestImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public ConnectorbasedRequestBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.connectorbasedRequestImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public ConnectorbasedRequestBuilder _prohibition_(Prohibition _prohibition_) {
        this.connectorbasedRequestImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public ConnectorbasedRequestBuilder _obligation_(List<Duty> _obligation_) {
        this.connectorbasedRequestImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public ConnectorbasedRequestBuilder _obligation_(Duty _obligation_) {
        this.connectorbasedRequestImpl.getObligation().add(_obligation_);
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
    public ConnectorbasedRequest build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorbasedRequestImpl);
        return connectorbasedRequestImpl;
    }
}
