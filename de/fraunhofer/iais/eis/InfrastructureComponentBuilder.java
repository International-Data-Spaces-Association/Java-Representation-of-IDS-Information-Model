package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class InfrastructureComponentBuilder implements Builder<InfrastructureComponent> {

    private InfrastructureComponentImpl infrastructureComponentImpl;

    public InfrastructureComponentBuilder() {
        infrastructureComponentImpl = new InfrastructureComponentImpl();
    }

    public InfrastructureComponentBuilder(URI id) {
        this();
        infrastructureComponentImpl.id = id;
    }

    /**
     * This function allows setting a value for _maintainerAsObject
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainerAsObject
     */
    public InfrastructureComponentBuilder _maintainerAsObject_(Participant _maintainer_) {
        this.infrastructureComponentImpl.setMaintainerAsObject(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainerAsUri
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainerAsUri
     */
    public InfrastructureComponentBuilder _maintainerAsUri_(URI _maintainer_) {
        this.infrastructureComponentImpl.setMaintainerAsUri(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curatorAsObject
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curatorAsObject
     */
    public InfrastructureComponentBuilder _curatorAsObject_(Participant _curator_) {
        this.infrastructureComponentImpl.setCuratorAsObject(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _curatorAsUri
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curatorAsUri
     */
    public InfrastructureComponentBuilder _curatorAsUri_(URI _curator_) {
        this.infrastructureComponentImpl.setCuratorAsUri(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public InfrastructureComponentBuilder _physicalLocation_(Location _physicalLocation_) {
        this.infrastructureComponentImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public InfrastructureComponentBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.infrastructureComponentImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public InfrastructureComponentBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.infrastructureComponentImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public InfrastructureComponentBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.infrastructureComponentImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public InfrastructureComponentBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.infrastructureComponentImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public InfrastructureComponentBuilder _publicKey_(PublicKey _publicKey_) {
        this.infrastructureComponentImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public InfrastructureComponentBuilder _version_(String _version_) {
        this.infrastructureComponentImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public InfrastructureComponentBuilder _title_(List<TypedLiteral> _title_) {
        this.infrastructureComponentImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public InfrastructureComponentBuilder _title_(TypedLiteral _title_) {
        this.infrastructureComponentImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public InfrastructureComponentBuilder _description_(List<TypedLiteral> _description_) {
        this.infrastructureComponentImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public InfrastructureComponentBuilder _description_(TypedLiteral _description_) {
        this.infrastructureComponentImpl.getDescription().add(_description_);
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
    public InfrastructureComponent build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(infrastructureComponentImpl);
        return infrastructureComponentImpl;
    }
}
