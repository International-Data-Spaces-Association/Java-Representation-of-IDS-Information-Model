package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class SpatialAgreementBuilder {

    private SpatialAgreementImpl spatialAgreementImpl;

    public SpatialAgreementBuilder() {
        spatialAgreementImpl = new SpatialAgreementImpl();
    }

    public SpatialAgreementBuilder(URI id) {
        this();
        spatialAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public SpatialAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.spatialAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public SpatialAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.spatialAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public SpatialAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.spatialAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public SpatialAgreementBuilder _provider_(URI _provider_) {
        this.spatialAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public SpatialAgreementBuilder _consumer_(URI _consumer_) {
        this.spatialAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public SpatialAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.spatialAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public SpatialAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.spatialAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public SpatialAgreementBuilder _permission_(List<Permission> _permission_) {
        this.spatialAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public SpatialAgreementBuilder _permission_(Permission _permission_) {
        this.spatialAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public SpatialAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.spatialAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public SpatialAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.spatialAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public SpatialAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.spatialAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public SpatialAgreementBuilder _obligation_(Duty _obligation_) {
        this.spatialAgreementImpl.getObligation().add(_obligation_);
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
    final public SpatialAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(spatialAgreementImpl);
        return spatialAgreementImpl;
    }
}
