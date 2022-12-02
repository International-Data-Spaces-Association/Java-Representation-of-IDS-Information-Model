package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DatPayloadBuilder implements Builder<DatPayload> {

    private DatPayloadImpl datPayloadImpl;

    public DatPayloadBuilder() {
        datPayloadImpl = new DatPayloadImpl();
    }

    public DatPayloadBuilder(URI id) {
        this();
        datPayloadImpl.id = id;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public DatPayloadBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.datPayloadImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public DatPayloadBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.datPayloadImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _transportCertsSha256
     * 
     * @param _transportCertsSha256_ desired value to be set
     * @return Builder object with new value for _transportCertsSha256
     */
    public DatPayloadBuilder _transportCertsSha256_(List<String> _transportCertsSha256_) {
        this.datPayloadImpl.setTransportCertsSha256(_transportCertsSha256_);
        return this;
    }

    /**
     * This function allows adding a value to the List _transportCertsSha256
     * 
     * @param _transportCertsSha256_ desired value to be added
     * @return Builder object with new value for _transportCertsSha256
     */
    public DatPayloadBuilder _transportCertsSha256_(String _transportCertsSha256_) {
        this.datPayloadImpl.getTransportCertsSha256().add(_transportCertsSha256_);
        return this;
    }

    /**
     * This function allows setting a value for _aud
     * 
     * @param _aud_ desired value to be set
     * @return Builder object with new value for _aud
     */
    public DatPayloadBuilder _aud_(Audience _aud_) {
        this.datPayloadImpl.setAud(_aud_);
        return this;
    }

    /**
     * This function allows setting a value for _exp
     * 
     * @param _exp_ desired value to be set
     * @return Builder object with new value for _exp
     */
    public DatPayloadBuilder _exp_(BigInteger _exp_) {
        this.datPayloadImpl.setExp(_exp_);
        return this;
    }

    /**
     * This function allows setting a value for _iat
     * 
     * @param _iat_ desired value to be set
     * @return Builder object with new value for _iat
     */
    public DatPayloadBuilder _iat_(BigInteger _iat_) {
        this.datPayloadImpl.setIat(_iat_);
        return this;
    }

    /**
     * This function allows setting a value for _iss
     * 
     * @param _iss_ desired value to be set
     * @return Builder object with new value for _iss
     */
    public DatPayloadBuilder _iss_(String _iss_) {
        this.datPayloadImpl.setIss(_iss_);
        return this;
    }

    /**
     * This function allows setting a value for _nbf
     * 
     * @param _nbf_ desired value to be set
     * @return Builder object with new value for _nbf
     */
    public DatPayloadBuilder _nbf_(BigInteger _nbf_) {
        this.datPayloadImpl.setNbf(_nbf_);
        return this;
    }

    /**
     * This function allows setting a value for _referringConnector
     * 
     * @param _referringConnector_ desired value to be set
     * @return Builder object with new value for _referringConnector
     */
    public DatPayloadBuilder _referringConnector_(URI _referringConnector_) {
        this.datPayloadImpl.setReferringConnector(_referringConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _scope
     * 
     * @param _scope_ desired value to be set
     * @return Builder object with new value for _scope
     */
    public DatPayloadBuilder _scope_(String _scope_) {
        this.datPayloadImpl.setScope(_scope_);
        return this;
    }

    /**
     * This function allows setting a value for _sub
     * 
     * @param _sub_ desired value to be set
     * @return Builder object with new value for _sub
     */
    public DatPayloadBuilder _sub_(String _sub_) {
        this.datPayloadImpl.setSub(_sub_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public DatPayloadBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.datPayloadImpl.setSecurityProfile(_securityProfile_);
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
    public DatPayload build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(datPayloadImpl);
        return datPayloadImpl;
    }
}
