package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class AppStoreBuilder implements Builder<AppStore> {

    private AppStoreImpl appStoreImpl;

    public AppStoreBuilder() {
        appStoreImpl = new AppStoreImpl();
    }

    public AppStoreBuilder(URI id) {
        this();
        appStoreImpl.id = id;
    }

    /**
     * This function allows setting a value for _hasDefaultEndpoint
     * 
     * @param _hasDefaultEndpoint_ desired value to be set
     * @return Builder object with new value for _hasDefaultEndpoint
     */
    public AppStoreBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
        this.appStoreImpl.setHasDefaultEndpoint(_hasDefaultEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be set
     * @return Builder object with new value for _hasEndpoint
     */
    public AppStoreBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
        this.appStoreImpl.setHasEndpoint(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be added
     * @return Builder object with new value for _hasEndpoint
     */
    public AppStoreBuilder _hasEndpoint_(ConnectorEndpoint _hasEndpoint_) {
        this.appStoreImpl.getHasEndpoint().add(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _authInfo
     * 
     * @param _authInfo_ desired value to be set
     * @return Builder object with new value for _authInfo
     */
    public AppStoreBuilder _authInfo_(AuthInfo _authInfo_) {
        this.appStoreImpl.setAuthInfo(_authInfo_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be set
     * @return Builder object with new value for _resourceCatalog
     */
    public AppStoreBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
        this.appStoreImpl.setResourceCatalog(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be added
     * @return Builder object with new value for _resourceCatalog
     */
    public AppStoreBuilder _resourceCatalog_(ResourceCatalog _resourceCatalog_) {
        this.appStoreImpl.getResourceCatalog().add(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasAgent
     * 
     * @param _hasAgent_ desired value to be set
     * @return Builder object with new value for _hasAgent
     */
    public AppStoreBuilder _hasAgent_(List<URI> _hasAgent_) {
        this.appStoreImpl.setHasAgent(_hasAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasAgent
     * 
     * @param _hasAgent_ desired value to be added
     * @return Builder object with new value for _hasAgent
     */
    public AppStoreBuilder _hasAgent_(URI _hasAgent_) {
        this.appStoreImpl.getHasAgent().add(_hasAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public AppStoreBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.appStoreImpl.setSecurityProfile(_securityProfile_);
        return this;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public AppStoreBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.appStoreImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public AppStoreBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.appStoreImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public AppStoreBuilder _maintainer_(URI _maintainer_) {
        this.appStoreImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public AppStoreBuilder _curator_(URI _curator_) {
        this.appStoreImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public AppStoreBuilder _physicalLocation_(Location _physicalLocation_) {
        this.appStoreImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public AppStoreBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.appStoreImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public AppStoreBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.appStoreImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public AppStoreBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.appStoreImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public AppStoreBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.appStoreImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public AppStoreBuilder _publicKey_(PublicKey _publicKey_) {
        this.appStoreImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public AppStoreBuilder _version_(String _version_) {
        this.appStoreImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public AppStoreBuilder _title_(List<TypedLiteral> _title_) {
        this.appStoreImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public AppStoreBuilder _title_(TypedLiteral _title_) {
        this.appStoreImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public AppStoreBuilder _description_(List<TypedLiteral> _description_) {
        this.appStoreImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public AppStoreBuilder _description_(TypedLiteral _description_) {
        this.appStoreImpl.getDescription().add(_description_);
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
    public AppStore build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appStoreImpl);
        return appStoreImpl;
    }
}
