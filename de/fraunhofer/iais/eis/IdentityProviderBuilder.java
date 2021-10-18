package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class IdentityProviderBuilder implements Builder<IdentityProvider> {

    private IdentityProviderImpl identityProviderImpl;

    public IdentityProviderBuilder() {
        identityProviderImpl = new IdentityProviderImpl();
    }

    public IdentityProviderBuilder(URI id) {
        this();
        identityProviderImpl.id = id;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public IdentityProviderBuilder _maintainer_(URI _maintainer_) {
        this.identityProviderImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public IdentityProviderBuilder _curator_(URI _curator_) {
        this.identityProviderImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public IdentityProviderBuilder _physicalLocation_(Location _physicalLocation_) {
        this.identityProviderImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public IdentityProviderBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.identityProviderImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public IdentityProviderBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.identityProviderImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public IdentityProviderBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.identityProviderImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public IdentityProviderBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.identityProviderImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public IdentityProviderBuilder _publicKey_(PublicKey _publicKey_) {
        this.identityProviderImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public IdentityProviderBuilder _version_(String _version_) {
        this.identityProviderImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public IdentityProviderBuilder _title_(List<TypedLiteral> _title_) {
        this.identityProviderImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public IdentityProviderBuilder _title_(TypedLiteral _title_) {
        this.identityProviderImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public IdentityProviderBuilder _description_(List<TypedLiteral> _description_) {
        this.identityProviderImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public IdentityProviderBuilder _description_(TypedLiteral _description_) {
        this.identityProviderImpl.getDescription().add(_description_);
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
    public IdentityProvider build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(identityProviderImpl);
        return identityProviderImpl;
    }
}
