package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class LoggingAgreementBuilder implements Builder<LoggingAgreement> {

    private LoggingAgreementImpl loggingAgreementImpl;

    public LoggingAgreementBuilder() {
        loggingAgreementImpl = new LoggingAgreementImpl();
    }

    public LoggingAgreementBuilder(URI id) {
        this();
        loggingAgreementImpl.id = id;
    }

    /**
     * This function allows setting a value for _contractStart
     * 
     * @param _contractStart_ desired value to be set
     * @return Builder object with new value for _contractStart
     */
    public LoggingAgreementBuilder _contractStart_(XMLGregorianCalendar _contractStart_) {
        this.loggingAgreementImpl.setContractStart(_contractStart_);
        return this;
    }

    /**
     * This function allows setting a value for _contractEnd
     * 
     * @param _contractEnd_ desired value to be set
     * @return Builder object with new value for _contractEnd
     */
    public LoggingAgreementBuilder _contractEnd_(XMLGregorianCalendar _contractEnd_) {
        this.loggingAgreementImpl.setContractEnd(_contractEnd_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDate
     * 
     * @param _contractDate_ desired value to be set
     * @return Builder object with new value for _contractDate
     */
    public LoggingAgreementBuilder _contractDate_(XMLGregorianCalendar _contractDate_) {
        this.loggingAgreementImpl.setContractDate(_contractDate_);
        return this;
    }

    /**
     * This function allows setting a value for _provider
     * 
     * @param _provider_ desired value to be set
     * @return Builder object with new value for _provider
     */
    public LoggingAgreementBuilder _provider_(URI _provider_) {
        this.loggingAgreementImpl.setProvider(_provider_);
        return this;
    }

    /**
     * This function allows setting a value for _consumer
     * 
     * @param _consumer_ desired value to be set
     * @return Builder object with new value for _consumer
     */
    public LoggingAgreementBuilder _consumer_(URI _consumer_) {
        this.loggingAgreementImpl.setConsumer(_consumer_);
        return this;
    }

    /**
     * This function allows setting a value for _contractDocument
     * 
     * @param _contractDocument_ desired value to be set
     * @return Builder object with new value for _contractDocument
     */
    public LoggingAgreementBuilder _contractDocument_(TextResource _contractDocument_) {
        this.loggingAgreementImpl.setContractDocument(_contractDocument_);
        return this;
    }

    /**
     * This function allows setting a value for _contractAnnex
     * 
     * @param _contractAnnex_ desired value to be set
     * @return Builder object with new value for _contractAnnex
     */
    public LoggingAgreementBuilder _contractAnnex_(Resource _contractAnnex_) {
        this.loggingAgreementImpl.setContractAnnex(_contractAnnex_);
        return this;
    }

    /**
     * This function allows setting a value for _permission
     * 
     * @param _permission_ desired value to be set
     * @return Builder object with new value for _permission
     */
    public LoggingAgreementBuilder _permission_(List<Permission> _permission_) {
        this.loggingAgreementImpl.setPermission(_permission_);
        return this;
    }

    /**
     * This function allows adding a value to the List _permission
     * 
     * @param _permission_ desired value to be added
     * @return Builder object with new value for _permission
     */
    public LoggingAgreementBuilder _permission_(Permission _permission_) {
        this.loggingAgreementImpl.getPermission().add(_permission_);
        return this;
    }

    /**
     * This function allows setting a value for _prohibition
     * 
     * @param _prohibition_ desired value to be set
     * @return Builder object with new value for _prohibition
     */
    public LoggingAgreementBuilder _prohibition_(List<Prohibition> _prohibition_) {
        this.loggingAgreementImpl.setProhibition(_prohibition_);
        return this;
    }

    /**
     * This function allows adding a value to the List _prohibition
     * 
     * @param _prohibition_ desired value to be added
     * @return Builder object with new value for _prohibition
     */
    public LoggingAgreementBuilder _prohibition_(Prohibition _prohibition_) {
        this.loggingAgreementImpl.getProhibition().add(_prohibition_);
        return this;
    }

    /**
     * This function allows setting a value for _obligation
     * 
     * @param _obligation_ desired value to be set
     * @return Builder object with new value for _obligation
     */
    public LoggingAgreementBuilder _obligation_(List<Duty> _obligation_) {
        this.loggingAgreementImpl.setObligation(_obligation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _obligation
     * 
     * @param _obligation_ desired value to be added
     * @return Builder object with new value for _obligation
     */
    public LoggingAgreementBuilder _obligation_(Duty _obligation_) {
        this.loggingAgreementImpl.getObligation().add(_obligation_);
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
    public LoggingAgreement build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(loggingAgreementImpl);
        return loggingAgreementImpl;
    }
}
