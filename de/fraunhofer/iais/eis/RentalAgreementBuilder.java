package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class RentalAgreementBuilder implements Builder<RentalAgreement> {

    private RentalAgreementImpl rentalAgreementImpl;

    public RentalAgreementBuilder() {
        rentalAgreementImpl = new RentalAgreementImpl();
    }

    public RentalAgreementBuilder(URI id) {
        this();
        rentalAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public RentalAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.rentalAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public RentalAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.rentalAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public RentalAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.rentalAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public RentalAgreementBuilder _provider_(URI _provider_) {
        this.rentalAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public RentalAgreementBuilder _consumer_(URI _consumer_) {
        this.rentalAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public RentalAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.rentalAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public RentalAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.rentalAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public RentalAgreementBuilder _permission_(List<Permission> _permission_) {
        this.rentalAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public RentalAgreementBuilder _permission_(Permission _permission_) {
        this.rentalAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public RentalAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.rentalAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public RentalAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.rentalAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public RentalAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.rentalAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public RentalAgreementBuilder _obligation_(Duty _obligation_) {
        this.rentalAgreementImpl.getObligation().add(_obligation_);
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
    public RentalAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(rentalAgreementImpl);
        return rentalAgreementImpl;
    }
}
