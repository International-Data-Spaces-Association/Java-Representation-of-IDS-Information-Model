package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class BrokerBuilder implements Builder<Broker> {

    private BrokerImpl brokerImpl;

    public BrokerBuilder() {
        brokerImpl = new BrokerImpl();
    }

    public BrokerBuilder(URI id) {
        this();
        brokerImpl.id = id;
    }

    /**
     * This function allows setting a value for _connectorCatalog
     * 
     * @param _connectorCatalog_ desired value to be set
     * @return Builder object with new value for _connectorCatalog
     */
    public BrokerBuilder _connectorCatalog_(List<ConnectorCatalog> _connectorCatalog_) {
        this.brokerImpl.setConnectorCatalog(_connectorCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _connectorCatalog
     * 
     * @param _connectorCatalog_ desired value to be added
     * @return Builder object with new value for _connectorCatalog
     */
    public BrokerBuilder _connectorCatalog_(ConnectorCatalog _connectorCatalog_) {
        this.brokerImpl.getConnectorCatalog().add(_connectorCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasDefaultEndpoint
     * 
     * @param _hasDefaultEndpoint_ desired value to be set
     * @return Builder object with new value for _hasDefaultEndpoint
     */
    public BrokerBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
        this.brokerImpl.setHasDefaultEndpoint(_hasDefaultEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be set
     * @return Builder object with new value for _hasEndpoint
     */
    public BrokerBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
        this.brokerImpl.setHasEndpoint(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be added
     * @return Builder object with new value for _hasEndpoint
     */
    public BrokerBuilder _hasEndpoint_(ConnectorEndpoint _hasEndpoint_) {
        this.brokerImpl.getHasEndpoint().add(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _authInfo
     * 
     * @param _authInfo_ desired value to be set
     * @return Builder object with new value for _authInfo
     */
    public BrokerBuilder _authInfo_(AuthInfo _authInfo_) {
        this.brokerImpl.setAuthInfo(_authInfo_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be set
     * @return Builder object with new value for _resourceCatalog
     */
    public BrokerBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
        this.brokerImpl.setResourceCatalog(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be added
     * @return Builder object with new value for _resourceCatalog
     */
    public BrokerBuilder _resourceCatalog_(ResourceCatalog _resourceCatalog_) {
        this.brokerImpl.getResourceCatalog().add(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasAgent
     * 
     * @param _hasAgent_ desired value to be set
     * @return Builder object with new value for _hasAgent
     */
    public BrokerBuilder _hasAgent_(List<URI> _hasAgent_) {
        this.brokerImpl.setHasAgent(_hasAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasAgent
     * 
     * @param _hasAgent_ desired value to be added
     * @return Builder object with new value for _hasAgent
     */
    public BrokerBuilder _hasAgent_(URI _hasAgent_) {
        this.brokerImpl.getHasAgent().add(_hasAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public BrokerBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.brokerImpl.setSecurityProfile(_securityProfile_);
        return this;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public BrokerBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.brokerImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public BrokerBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.brokerImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public BrokerBuilder _maintainer_(URI _maintainer_) {
        this.brokerImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public BrokerBuilder _curator_(URI _curator_) {
        this.brokerImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public BrokerBuilder _physicalLocation_(Location _physicalLocation_) {
        this.brokerImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public BrokerBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.brokerImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public BrokerBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.brokerImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public BrokerBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.brokerImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public BrokerBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.brokerImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public BrokerBuilder _publicKey_(PublicKey _publicKey_) {
        this.brokerImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public BrokerBuilder _version_(String _version_) {
        this.brokerImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public BrokerBuilder _title_(List<TypedLiteral> _title_) {
        this.brokerImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public BrokerBuilder _title_(TypedLiteral _title_) {
        this.brokerImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public BrokerBuilder _description_(List<TypedLiteral> _description_) {
        this.brokerImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public BrokerBuilder _description_(TypedLiteral _description_) {
        this.brokerImpl.getDescription().add(_description_);
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
    public Broker build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(brokerImpl);
        return brokerImpl;
    }
}
