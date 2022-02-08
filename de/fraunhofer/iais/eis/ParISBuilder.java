package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ParISBuilder implements Builder<ParIS> {

    private ParISImpl parISImpl;

    public ParISBuilder() {
        parISImpl = new ParISImpl();
    }

    public ParISBuilder(URI id) {
        this();
        parISImpl.id = id;
    }

    /**
     * This function allows setting a value for _participantCatalog
     * 
     * @param _participantCatalog_ desired value to be set
     * @return Builder object with new value for _participantCatalog
     */
    public ParISBuilder _participantCatalog_(List<ParticipantCatalog> _participantCatalog_) {
        this.parISImpl.setParticipantCatalog(_participantCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _participantCatalog
     * 
     * @param _participantCatalog_ desired value to be added
     * @return Builder object with new value for _participantCatalog
     */
    public ParISBuilder _participantCatalog_(ParticipantCatalog _participantCatalog_) {
        this.parISImpl.getParticipantCatalog().add(_participantCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasDefaultEndpoint
     * 
     * @param _hasDefaultEndpoint_ desired value to be set
     * @return Builder object with new value for _hasDefaultEndpoint
     */
    public ParISBuilder _hasDefaultEndpoint_(ConnectorEndpoint _hasDefaultEndpoint_) {
        this.parISImpl.setHasDefaultEndpoint(_hasDefaultEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be set
     * @return Builder object with new value for _hasEndpoint
     */
    public ParISBuilder _hasEndpoint_(List<ConnectorEndpoint> _hasEndpoint_) {
        this.parISImpl.setHasEndpoint(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasEndpoint
     * 
     * @param _hasEndpoint_ desired value to be added
     * @return Builder object with new value for _hasEndpoint
     */
    public ParISBuilder _hasEndpoint_(ConnectorEndpoint _hasEndpoint_) {
        this.parISImpl.getHasEndpoint().add(_hasEndpoint_);
        return this;
    }

    /**
     * This function allows setting a value for _authInfo
     * 
     * @param _authInfo_ desired value to be set
     * @return Builder object with new value for _authInfo
     */
    public ParISBuilder _authInfo_(AuthInfo _authInfo_) {
        this.parISImpl.setAuthInfo(_authInfo_);
        return this;
    }

    /**
     * This function allows setting a value for _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be set
     * @return Builder object with new value for _resourceCatalog
     */
    public ParISBuilder _resourceCatalog_(List<ResourceCatalog> _resourceCatalog_) {
        this.parISImpl.setResourceCatalog(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows adding a value to the List _resourceCatalog
     * 
     * @param _resourceCatalog_ desired value to be added
     * @return Builder object with new value for _resourceCatalog
     */
    public ParISBuilder _resourceCatalog_(ResourceCatalog _resourceCatalog_) {
        this.parISImpl.getResourceCatalog().add(_resourceCatalog_);
        return this;
    }

    /**
     * This function allows setting a value for _hasAgent
     * 
     * @param _hasAgent_ desired value to be set
     * @return Builder object with new value for _hasAgent
     */
    public ParISBuilder _hasAgent_(List<URI> _hasAgent_) {
        this.parISImpl.setHasAgent(_hasAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _hasAgent
     * 
     * @param _hasAgent_ desired value to be added
     * @return Builder object with new value for _hasAgent
     */
    public ParISBuilder _hasAgent_(URI _hasAgent_) {
        this.parISImpl.getHasAgent().add(_hasAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityProfile
     * 
     * @param _securityProfile_ desired value to be set
     * @return Builder object with new value for _securityProfile
     */
    public ParISBuilder _securityProfile_(SecurityProfile _securityProfile_) {
        this.parISImpl.setSecurityProfile(_securityProfile_);
        return this;
    }

    /**
     * This function allows setting a value for _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be set
     * @return Builder object with new value for _extendedGuarantee
     */
    public ParISBuilder _extendedGuarantee_(List<SecurityGuarantee> _extendedGuarantee_) {
        this.parISImpl.setExtendedGuarantee(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows adding a value to the List _extendedGuarantee
     * 
     * @param _extendedGuarantee_ desired value to be added
     * @return Builder object with new value for _extendedGuarantee
     */
    public ParISBuilder _extendedGuarantee_(SecurityGuarantee _extendedGuarantee_) {
        this.parISImpl.getExtendedGuarantee().add(_extendedGuarantee_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public ParISBuilder _maintainer_(URI _maintainer_) {
        this.parISImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public ParISBuilder _curator_(URI _curator_) {
        this.parISImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public ParISBuilder _physicalLocation_(Location _physicalLocation_) {
        this.parISImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public ParISBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.parISImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public ParISBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.parISImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public ParISBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.parISImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public ParISBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.parISImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public ParISBuilder _publicKey_(PublicKey _publicKey_) {
        this.parISImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ParISBuilder _version_(String _version_) {
        this.parISImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ParISBuilder _title_(List<TypedLiteral> _title_) {
        this.parISImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ParISBuilder _title_(TypedLiteral _title_) {
        this.parISImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ParISBuilder _description_(List<TypedLiteral> _description_) {
        this.parISImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ParISBuilder _description_(TypedLiteral _description_) {
        this.parISImpl.getDescription().add(_description_);
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
    public ParIS build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(parISImpl);
        return parISImpl;
    }
}
