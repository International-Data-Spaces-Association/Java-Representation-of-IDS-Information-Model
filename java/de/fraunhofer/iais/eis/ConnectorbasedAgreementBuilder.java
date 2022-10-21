package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorbasedAgreementBuilder implements Builder<ConnectorbasedAgreement> {

    private ConnectorbasedAgreementImpl connectorbasedAgreementImpl;

    public ConnectorbasedAgreementBuilder() {
        connectorbasedAgreementImpl = new ConnectorbasedAgreementImpl();
    }

    public ConnectorbasedAgreementBuilder(URI id) {
        this();
        connectorbasedAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public ConnectorbasedAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.connectorbasedAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public ConnectorbasedAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.connectorbasedAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public ConnectorbasedAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.connectorbasedAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public ConnectorbasedAgreementBuilder _provider_(URI _provider_) {
        this.connectorbasedAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public ConnectorbasedAgreementBuilder _consumer_(URI _consumer_) {
        this.connectorbasedAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public ConnectorbasedAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.connectorbasedAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public ConnectorbasedAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.connectorbasedAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public ConnectorbasedAgreementBuilder _permission_(List<Permission> _permission_) {
        this.connectorbasedAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public ConnectorbasedAgreementBuilder _permission_(Permission _permission_) {
        this.connectorbasedAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public ConnectorbasedAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.connectorbasedAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public ConnectorbasedAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.connectorbasedAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public ConnectorbasedAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.connectorbasedAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public ConnectorbasedAgreementBuilder _obligation_(Duty _obligation_) {
        this.connectorbasedAgreementImpl.getObligation().add(_obligation_);
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
    public ConnectorbasedAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorbasedAgreementImpl);
        return connectorbasedAgreementImpl;
    }
}
