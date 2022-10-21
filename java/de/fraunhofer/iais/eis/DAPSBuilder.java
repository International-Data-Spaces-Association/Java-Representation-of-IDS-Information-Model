package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DAPSBuilder implements Builder<DAPS> {

    private DAPSImpl dAPSImpl;

    public DAPSBuilder() {
        dAPSImpl = new DAPSImpl();
    }

    public DAPSBuilder(URI id) {
        this();
        dAPSImpl.id = id;
    }

    /**
     * This function allows setting a value for _maintainer
     * 
     * @param _maintainer_ desired value to be set
     * @return Builder object with new value for _maintainer
     */
    public DAPSBuilder _maintainer_(URI _maintainer_) {
        this.dAPSImpl.setMaintainer(_maintainer_);
        return this;
    }

    /**
     * This function allows setting a value for _curator
     * 
     * @param _curator_ desired value to be set
     * @return Builder object with new value for _curator
     */
    public DAPSBuilder _curator_(URI _curator_) {
        this.dAPSImpl.setCurator(_curator_);
        return this;
    }

    /**
     * This function allows setting a value for _physicalLocation
     * 
     * @param _physicalLocation_ desired value to be set
     * @return Builder object with new value for _physicalLocation
     */
    public DAPSBuilder _physicalLocation_(Location _physicalLocation_) {
        this.dAPSImpl.setPhysicalLocation(_physicalLocation_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be set
     * @return Builder object with new value for _inboundModelVersion
     */
    public DAPSBuilder _inboundModelVersion_(List<String> _inboundModelVersion_) {
        this.dAPSImpl.setInboundModelVersion(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows adding a value to the List _inboundModelVersion
     * 
     * @param _inboundModelVersion_ desired value to be added
     * @return Builder object with new value for _inboundModelVersion
     */
    public DAPSBuilder _inboundModelVersion_(String _inboundModelVersion_) {
        this.dAPSImpl.getInboundModelVersion().add(_inboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundModelVersion
     * 
     * @param _outboundModelVersion_ desired value to be set
     * @return Builder object with new value for _outboundModelVersion
     */
    public DAPSBuilder _outboundModelVersion_(String _outboundModelVersion_) {
        this.dAPSImpl.setOutboundModelVersion(_outboundModelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _componentCertification
     * 
     * @param _componentCertification_ desired value to be set
     * @return Builder object with new value for _componentCertification
     */
    public DAPSBuilder _componentCertification_(ComponentCertification _componentCertification_) {
        this.dAPSImpl.setComponentCertification(_componentCertification_);
        return this;
    }

    /**
     * This function allows setting a value for _publicKey
     * 
     * @param _publicKey_ desired value to be set
     * @return Builder object with new value for _publicKey
     */
    public DAPSBuilder _publicKey_(PublicKey _publicKey_) {
        this.dAPSImpl.setPublicKey(_publicKey_);
        return this;
    }

    /**
     * This function allows setting a value for _version
     * 
     * @param _version_ desired value to be set
     * @return Builder object with new value for _version
     */
    public DAPSBuilder _version_(String _version_) {
        this.dAPSImpl.setVersion(_version_);
        return this;
    }

    /**
     * This function allows setting a value for _title
     * 
     * @param _title_ desired value to be set
     * @return Builder object with new value for _title
     */
    public DAPSBuilder _title_(List<TypedLiteral> _title_) {
        this.dAPSImpl.setTitle(_title_);
        return this;
    }

    /**
     * This function allows adding a value to the List _title
     * 
     * @param _title_ desired value to be added
     * @return Builder object with new value for _title
     */
    public DAPSBuilder _title_(TypedLiteral _title_) {
        this.dAPSImpl.getTitle().add(_title_);
        return this;
    }

    /**
     * This function allows setting a value for _description
     * 
     * @param _description_ desired value to be set
     * @return Builder object with new value for _description
     */
    public DAPSBuilder _description_(List<TypedLiteral> _description_) {
        this.dAPSImpl.setDescription(_description_);
        return this;
    }

    /**
     * This function allows adding a value to the List _description
     * 
     * @param _description_ desired value to be added
     * @return Builder object with new value for _description
     */
    public DAPSBuilder _description_(TypedLiteral _description_) {
        this.dAPSImpl.getDescription().add(_description_);
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
    public DAPS build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(dAPSImpl);
        return dAPSImpl;
    }
}
