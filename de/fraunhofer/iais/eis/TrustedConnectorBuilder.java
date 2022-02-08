package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class TrustedConnectorBuilder implements Builder<TrustedConnector> {

    private TrustedConnectorImpl trustedConnectorImpl;

    public TrustedConnectorBuilder() {
        trustedConnectorImpl = new TrustedConnectorImpl();
    }

    public TrustedConnectorBuilder(URI id) {
        this();
        trustedConnectorImpl.id = id;
    }

    /**
     * This function allows setting a value for _hasDefaultEndpoint
     * 
     * @param _hasDefaultEndpoint_ desired value to be set
     * @return Builder object with new value for _hasDefaultEndpoint
     */
    public TrustedConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
        this.trustedConnectorImpl.setHasDefaultEndpoint(_hasDefaultEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be set
     * @return Builder object with new value for _hasEndpoint
     */
    public TrustedConnectorBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
        this.trustedConnectorImpl.setHasEndpoint(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be added
     * @return Builder object with new value for _hasEndpoint
     */
    public TrustedConnectorBuilder _hasEndpoint_(ConnectorEndpoint _hasEndpoint_) {
        this.trustedConnectorImpl.getHasEndpoint().add(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _authInfo
     * 
     * @param _authInfo_ desired value to be set
     * @return Builder object with new value for _authInfo
     */
    public TrustedConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
        this.trustedConnectorImpl.setAuthInfo(_authInfo_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be set
     * @return Builder object with new value for _resourceCatalog
     */
    public TrustedConnectorBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
        this.trustedConnectorImpl.setResourceCatalog(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be added
     * @return Builder object with new value for _resourceCatalog
     */
    public TrustedConnectorBuilder _resourceCatalog_(ResourceCatalog _resourceCatalog_) {
        this.trustedConnectorImpl.getResourceCatalog().add(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasAgent
     * 
     * @param _hasAgent_ desired value to be set
     * @return Builder object with new value for _hasAgent
     */
    public TrustedConnectorBuilder _hasAgent_(List<URI> _hasAgent_) {
        this.trustedConnectorImpl.setHasAgent(_hasAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasAgent
     * 
     * @param _hasAgent_ desired value to be added
     * @return Builder object with new value for _hasAgent
     */
    public TrustedConnectorBuilder _hasAgent_(URI _hasAgent_) {
        this.trustedConnectorImpl.getHasAgent().add(_hasAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public TrustedConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.trustedConnectorImpl.setSecurityProfile(_securityProfile_);
        return this;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public TrustedConnectorBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.trustedConnectorImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public TrustedConnectorBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.trustedConnectorImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public TrustedConnectorBuilder _maintainer_(URI _maintainer_) {
        this.trustedConnectorImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public TrustedConnectorBuilder _curator_(URI _curator_) {
        this.trustedConnectorImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public TrustedConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
        this.trustedConnectorImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public TrustedConnectorBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.trustedConnectorImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public TrustedConnectorBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.trustedConnectorImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public TrustedConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.trustedConnectorImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public TrustedConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.trustedConnectorImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public TrustedConnectorBuilder _publicKey_(PublicKey _publicKey_) {
        this.trustedConnectorImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public TrustedConnectorBuilder _version_(String _version_) {
        this.trustedConnectorImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public TrustedConnectorBuilder _title_(List<TypedLiteral> _title_) {
        this.trustedConnectorImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public TrustedConnectorBuilder _title_(TypedLiteral _title_) {
        this.trustedConnectorImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public TrustedConnectorBuilder _description_(List<TypedLiteral> _description_) {
        this.trustedConnectorImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public TrustedConnectorBuilder _description_(TypedLiteral _description_) {
        this.trustedConnectorImpl.getDescription().add(_description_);
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
    public TrustedConnector build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(trustedConnectorImpl);
        return trustedConnectorImpl;
    }
}
