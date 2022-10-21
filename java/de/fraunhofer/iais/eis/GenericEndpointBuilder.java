package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class GenericEndpointBuilder implements Builder<GenericEndpoint> {

    private GenericEndpointImpl genericEndpointImpl;

    public GenericEndpointBuilder() {
        genericEndpointImpl = new GenericEndpointImpl();
    }

    public GenericEndpointBuilder(URI id) {
        this();
        genericEndpointImpl.id = id;
    }

    /**
     * This function allows setting a value for _genericEndpointAuthentication
     * 
     * @param _genericEndpointAuthentication_ desired value to be set
     * @return Builder object with new value for _genericEndpointAuthentication
     */
    public GenericEndpointBuilder _genericEndpointAuthentication_(BasicAuthentication _genericEndpointAuthentication_) {
        this.genericEndpointImpl.setGenericEndpointAuthentication(_genericEndpointAuthentication_);
        return this;
    }

    /**
     * This function allows setting a value for _genericEndpointConfiguration
     * 
     * @param _genericEndpointConfiguration_ desired value to be set
     * @return Builder object with new value for _genericEndpointConfiguration
     */
    public GenericEndpointBuilder _genericEndpointConfiguration_(String _genericEndpointConfiguration_) {
        this.genericEndpointImpl.setGenericEndpointConfiguration(_genericEndpointConfiguration_);
        return this;
    }

    /**
     * This function allows setting a value for _accessURL
     * 
     * @param _accessURL_ desired value to be set
     * @return Builder object with new value for _accessURL
     */
    public GenericEndpointBuilder _accessURL_(URI _accessURL_) {
        this.genericEndpointImpl.setAccessURL(_accessURL_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be set
     * @return Builder object with new value for _endpointInformation
     */
    public GenericEndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
        this.genericEndpointImpl.setEndpointInformation(_endpointInformation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be added
     * @return Builder object with new value for _endpointInformation
     */
    public GenericEndpointBuilder _endpointInformation_(TypedLiteral _endpointInformation_) {
        this.genericEndpointImpl.getEndpointInformation().add(_endpointInformation_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be set
     * @return Builder object with new value for _endpointDocumentation
     */
    public GenericEndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
        this.genericEndpointImpl.setEndpointDocumentation(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be added
     * @return Builder object with new value for _endpointDocumentation
     */
    public GenericEndpointBuilder _endpointDocumentation_(URI _endpointDocumentation_) {
        this.genericEndpointImpl.getEndpointDocumentation().add(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows setting a value for _path
     * 
     * @param _path_ desired value to be set
     * @return Builder object with new value for _path
     */
    public GenericEndpointBuilder _path_(String _path_) {
        this.genericEndpointImpl.setPath(_path_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundPath
     * 
     * @param _inboundPath_ desired value to be set
     * @return Builder object with new value for _inboundPath
     */
    public GenericEndpointBuilder _inboundPath_(String _inboundPath_) {
        this.genericEndpointImpl.setInboundPath(_inboundPath_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundPath
     * 
     * @param _outboundPath_ desired value to be set
     * @return Builder object with new value for _outboundPath
     */
    public GenericEndpointBuilder _outboundPath_(String _outboundPath_) {
        this.genericEndpointImpl.setOutboundPath(_outboundPath_);
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
    public GenericEndpoint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(genericEndpointImpl);
        return genericEndpointImpl;
    }
}
