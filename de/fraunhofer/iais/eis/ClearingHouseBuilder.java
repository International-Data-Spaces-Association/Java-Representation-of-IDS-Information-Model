package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ClearingHouseBuilder implements Builder<ClearingHouse> {

    private ClearingHouseImpl clearingHouseImpl;

    public ClearingHouseBuilder() {
        clearingHouseImpl = new ClearingHouseImpl();
    }

    public ClearingHouseBuilder(URI id) {
        this();
        clearingHouseImpl.id = id;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public ClearingHouseBuilder _maintainer_(URI _maintainer_) {
        this.clearingHouseImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _maintainerAsParticipant
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainerAsParticipant
     */
    public ClearingHouseBuilder _maintainerAsParticipant_(Participant _maintainer_) {
        this.clearingHouseImpl.setMaintainerAsParticipant(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public ClearingHouseBuilder _curator_(URI _curator_) {
        this.clearingHouseImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _curatorAsParticipant
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curatorAsParticipant
     */
    public ClearingHouseBuilder _curatorAsParticipant_(Participant _curator_) {
        this.clearingHouseImpl.setCuratorAsParticipant(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public ClearingHouseBuilder _physicalLocation_(Location _physicalLocation_) {
        this.clearingHouseImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public ClearingHouseBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.clearingHouseImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public ClearingHouseBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.clearingHouseImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public ClearingHouseBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.clearingHouseImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public ClearingHouseBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.clearingHouseImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public ClearingHouseBuilder _publicKey_(PublicKey _publicKey_) {
        this.clearingHouseImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public ClearingHouseBuilder _version_(String _version_) {
        this.clearingHouseImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public ClearingHouseBuilder _title_(List<TypedLiteral> _title_) {
        this.clearingHouseImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public ClearingHouseBuilder _title_(TypedLiteral _title_) {
        this.clearingHouseImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public ClearingHouseBuilder _description_(List<TypedLiteral> _description_) {
        this.clearingHouseImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public ClearingHouseBuilder _description_(TypedLiteral _description_) {
        this.clearingHouseImpl.getDescription().add(_description_);
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
    public ClearingHouse build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(clearingHouseImpl);
        return clearingHouseImpl;
    }
}
