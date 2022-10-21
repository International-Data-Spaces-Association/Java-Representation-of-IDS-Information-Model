package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class SecurityAgreementBuilder implements Builder<SecurityAgreement> {

    private SecurityAgreementImpl securityAgreementImpl;

    public SecurityAgreementBuilder() {
        securityAgreementImpl = new SecurityAgreementImpl();
    }

    public SecurityAgreementBuilder(URI id) {
        this();
        securityAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public SecurityAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.securityAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public SecurityAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.securityAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public SecurityAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.securityAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public SecurityAgreementBuilder _provider_(URI _provider_) {
        this.securityAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public SecurityAgreementBuilder _consumer_(URI _consumer_) {
        this.securityAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public SecurityAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.securityAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public SecurityAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.securityAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public SecurityAgreementBuilder _permission_(List<Permission> _permission_) {
        this.securityAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public SecurityAgreementBuilder _permission_(Permission _permission_) {
        this.securityAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public SecurityAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.securityAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public SecurityAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.securityAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public SecurityAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.securityAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public SecurityAgreementBuilder _obligation_(Duty _obligation_) {
        this.securityAgreementImpl.getObligation().add(_obligation_);
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
    public SecurityAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(securityAgreementImpl);
        return securityAgreementImpl;
    }
}
