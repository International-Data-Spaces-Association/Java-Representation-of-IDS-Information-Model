package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class BaseConnectorBuilder implements Builder<BaseConnector> {

    private BaseConnectorImpl baseConnectorImpl;

    public BaseConnectorBuilder() {
        baseConnectorImpl = new BaseConnectorImpl();
    }

    public BaseConnectorBuilder(URI id) {
        this();
        baseConnectorImpl.id = id;
    }

    /**
     * This function allows setting a value for _hasDefaultEndpoint
     * 
     * @param _hasDefaultEndpoint_ desired value to be set
     * @return Builder object with new value for _hasDefaultEndpoint
     */
    public BaseConnectorBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
        this.baseConnectorImpl.setHasDefaultEndpoint(_hasDefaultEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be set
     * @return Builder object with new value for _hasEndpoint
     */
    public BaseConnectorBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
        this.baseConnectorImpl.setHasEndpoint(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be added
     * @return Builder object with new value for _hasEndpoint
     */
    public BaseConnectorBuilder _hasEndpoint_(ConnectorEndpoint _hasEndpoint_) {
        this.baseConnectorImpl.getHasEndpoint().add(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _authInfo
     * 
     * @param _authInfo_ desired value to be set
     * @return Builder object with new value for _authInfo
     */
    public BaseConnectorBuilder _authInfo_(AuthInfo _authInfo_) {
        this.baseConnectorImpl.setAuthInfo(_authInfo_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be set
     * @return Builder object with new value for _resourceCatalog
     */
    public BaseConnectorBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
        this.baseConnectorImpl.setResourceCatalog(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be added
     * @return Builder object with new value for _resourceCatalog
     */
    public BaseConnectorBuilder _resourceCatalog_(ResourceCatalog _resourceCatalog_) {
        this.baseConnectorImpl.getResourceCatalog().add(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasAgent
     * 
     * @param _hasAgent_ desired value to be set
     * @return Builder object with new value for _hasAgent
     */
    public BaseConnectorBuilder _hasAgent_(List<URI> _hasAgent_) {
        this.baseConnectorImpl.setHasAgent(_hasAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasAgent
     * 
     * @param _hasAgent_ desired value to be added
     * @return Builder object with new value for _hasAgent
     */
    public BaseConnectorBuilder _hasAgent_(URI _hasAgent_) {
        this.baseConnectorImpl.getHasAgent().add(_hasAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public BaseConnectorBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.baseConnectorImpl.setSecurityProfile(_securityProfile_);
        return this;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public BaseConnectorBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.baseConnectorImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public BaseConnectorBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.baseConnectorImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public BaseConnectorBuilder _maintainer_(URI _maintainer_) {
        this.baseConnectorImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public BaseConnectorBuilder _curator_(URI _curator_) {
        this.baseConnectorImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public BaseConnectorBuilder _physicalLocation_(Location _physicalLocation_) {
        this.baseConnectorImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public BaseConnectorBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.baseConnectorImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public BaseConnectorBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.baseConnectorImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public BaseConnectorBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.baseConnectorImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public BaseConnectorBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.baseConnectorImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public BaseConnectorBuilder _publicKey_(PublicKey _publicKey_) {
        this.baseConnectorImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public BaseConnectorBuilder _version_(String _version_) {
        this.baseConnectorImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public BaseConnectorBuilder _title_(List<TypedLiteral> _title_) {
        this.baseConnectorImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public BaseConnectorBuilder _title_(TypedLiteral _title_) {
        this.baseConnectorImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public BaseConnectorBuilder _description_(List<TypedLiteral> _description_) {
        this.baseConnectorImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public BaseConnectorBuilder _description_(TypedLiteral _description_) {
        this.baseConnectorImpl.getDescription().add(_description_);
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
    public BaseConnector build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(baseConnectorImpl);
        return baseConnectorImpl;
    }
}
