package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class NotMoreThanNAgreementBuilder implements Builder<NotMoreThanNAgreement> {

    private NotMoreThanNAgreementImpl notMoreThanNAgreementImpl;

    public NotMoreThanNAgreementBuilder() {
        notMoreThanNAgreementImpl = new NotMoreThanNAgreementImpl();
    }

    public NotMoreThanNAgreementBuilder(URI id) {
        this();
        notMoreThanNAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public NotMoreThanNAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.notMoreThanNAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public NotMoreThanNAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.notMoreThanNAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public NotMoreThanNAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.notMoreThanNAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public NotMoreThanNAgreementBuilder _provider_(URI _provider_) {
        this.notMoreThanNAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public NotMoreThanNAgreementBuilder _consumer_(URI _consumer_) {
        this.notMoreThanNAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public NotMoreThanNAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.notMoreThanNAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public NotMoreThanNAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.notMoreThanNAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public NotMoreThanNAgreementBuilder _permission_(List<Permission> _permission_) {
        this.notMoreThanNAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public NotMoreThanNAgreementBuilder _permission_(Permission _permission_) {
        this.notMoreThanNAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public NotMoreThanNAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.notMoreThanNAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public NotMoreThanNAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.notMoreThanNAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public NotMoreThanNAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.notMoreThanNAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public NotMoreThanNAgreementBuilder _obligation_(Duty _obligation_) {
        this.notMoreThanNAgreementImpl.getObligation().add(_obligation_);
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
    public NotMoreThanNAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(notMoreThanNAgreementImpl);
        return notMoreThanNAgreementImpl;
    }
}
