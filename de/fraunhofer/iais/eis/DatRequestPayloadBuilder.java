package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DatRequestPayloadBuilder implements Builder<DatRequestPayload> {

    private DatRequestPayloadImpl datRequestPayloadImpl;

    public DatRequestPayloadBuilder() {
        datRequestPayloadImpl = new DatRequestPayloadImpl();
    }

    public DatRequestPayloadBuilder(URI id) {
        this();
        datRequestPayloadImpl.id = id;
    }

    /**
     * This function allows setting a value for _transportCertsSha256
     * 
     * @param _transportCertsSha256_ desired value to be set
     * @return Builder object with new value for _transportCertsSha256
     */
    public DatRequestPayloadBuilder _transportCertsSha256_(List<String> _transportCertsSha256_) {
        this.datRequestPayloadImpl.setTransportCertsSha256(_transportCertsSha256_);
        return this;
    }

    /**
     * This function allows adding a value to the List _transportCertsSha256
     * 
     * @param _transportCertsSha256_ desired value to be added
     * @return Builder object with new value for _transportCertsSha256
     */
    public DatRequestPayloadBuilder _transportCertsSha256_(String _transportCertsSha256_) {
        this.datRequestPayloadImpl.getTransportCertsSha256().add(_transportCertsSha256_);
        return this;
    }

    /**
     * This function allows setting a value for _aud
     * 
     * @param _aud_ desired value to be set
     * @return Builder object with new value for _aud
     */
    public DatRequestPayloadBuilder _aud_(Audience _aud_) {
        this.datRequestPayloadImpl.setAud(_aud_);
        return this;
    }

    /**
     * This function allows setting a value for _exp
     * 
     * @param _exp_ desired value to be set
     * @return Builder object with new value for _exp
     */
    public DatRequestPayloadBuilder _exp_(BigInteger _exp_) {
        this.datRequestPayloadImpl.setExp(_exp_);
        return this;
    }

    /**
     * This function allows setting a value for _iat
     * 
     * @param _iat_ desired value to be set
     * @return Builder object with new value for _iat
     */
    public DatRequestPayloadBuilder _iat_(BigInteger _iat_) {
        this.datRequestPayloadImpl.setIat(_iat_);
        return this;
    }

    /**
     * This function allows setting a value for _iss
     * 
     * @param _iss_ desired value to be set
     * @return Builder object with new value for _iss
     */
    public DatRequestPayloadBuilder _iss_(String _iss_) {
        this.datRequestPayloadImpl.setIss(_iss_);
        return this;
    }

    /**
     * This function allows setting a value for _nbf
     * 
     * @param _nbf_ desired value to be set
     * @return Builder object with new value for _nbf
     */
    public DatRequestPayloadBuilder _nbf_(BigInteger _nbf_) {
        this.datRequestPayloadImpl.setNbf(_nbf_);
        return this;
    }

    /**
     * This function allows setting a value for _referringConnector
     * 
     * @param _referringConnector_ desired value to be set
     * @return Builder object with new value for _referringConnector
     */
    public DatRequestPayloadBuilder _referringConnector_(URI _referringConnector_) {
        this.datRequestPayloadImpl.setReferringConnector(_referringConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _scope
     * 
     * @param _scope_ desired value to be set
     * @return Builder object with new value for _scope
     */
    public DatRequestPayloadBuilder _scope_(String _scope_) {
        this.datRequestPayloadImpl.setScope(_scope_);
        return this;
    }

    /**
     * This function allows setting a value for _sub
     * 
     * @param _sub_ desired value to be set
     * @return Builder object with new value for _sub
     */
    public DatRequestPayloadBuilder _sub_(String _sub_) {
        this.datRequestPayloadImpl.setSub(_sub_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public DatRequestPayloadBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.datRequestPayloadImpl.setSecurityProfile(_securityProfile_);
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
    public DatRequestPayload build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(datRequestPayloadImpl);
        return datRequestPayloadImpl;
    }
}
