package de.fraunhofer.iais.eis;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class AppEndpointBuilder implements Builder<AppEndpoint> {

    private AppEndpointImpl appEndpointImpl;

    public AppEndpointBuilder() {
        appEndpointImpl = new AppEndpointImpl();
    }

    public AppEndpointBuilder(URI id) {
        this();
        appEndpointImpl.id = id;
    }

    /**
     * This function allows setting a value for _appEndpointType
     * 
     * @param _appEndpointType_ desired value to be set
     * @return Builder object with new value for _appEndpointType
     */
    public AppEndpointBuilder _appEndpointType_(AppEndpointType _appEndpointType_) {
        this.appEndpointImpl.setAppEndpointType(_appEndpointType_);
        return this;
    }

    /**
     * This function allows setting a value for _appEndpointPort
     * 
     * @param _appEndpointPort_ desired value to be set
     * @return Builder object with new value for _appEndpointPort
     */
    public AppEndpointBuilder _appEndpointPort_(BigInteger _appEndpointPort_) {
        this.appEndpointImpl.setAppEndpointPort(_appEndpointPort_);
        return this;
    }

    /**
     * This function allows setting a value for _appEndpointMediaType
     * 
     * @param _appEndpointMediaType_ desired value to be set
     * @return Builder object with new value for _appEndpointMediaType
     */
    public AppEndpointBuilder _appEndpointMediaType_(MediaType _appEndpointMediaType_) {
        this.appEndpointImpl.setAppEndpointMediaType(_appEndpointMediaType_);
        return this;
    }

    /**
     * This function allows setting a value for _appEndpointProtocol
     * 
     * @param _appEndpointProtocol_ desired value to be set
     * @return Builder object with new value for _appEndpointProtocol
     */
    public AppEndpointBuilder _appEndpointProtocol_(String _appEndpointProtocol_) {
        this.appEndpointImpl.setAppEndpointProtocol(_appEndpointProtocol_);
        return this;
    }

    /**
     * This function allows setting a value for _language
     * 
     * @param _language_ desired value to be set
     * @return Builder object with new value for _language
     */
    public AppEndpointBuilder _language_(Language _language_) {
        this.appEndpointImpl.setLanguage(_language_);
        return this;
    }

    /**
     * This function allows setting a value for _accessURL
     * 
     * @param _accessURL_ desired value to be set
     * @return Builder object with new value for _accessURL
     */
    public AppEndpointBuilder _accessURL_(URI _accessURL_) {
        this.appEndpointImpl.setAccessURL(_accessURL_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be set
     * @return Builder object with new value for _endpointInformation
     */
    public AppEndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
        this.appEndpointImpl.setEndpointInformation(_endpointInformation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be added
     * @return Builder object with new value for _endpointInformation
     */
    public AppEndpointBuilder _endpointInformation_(TypedLiteral _endpointInformation_) {
        this.appEndpointImpl.getEndpointInformation().add(_endpointInformation_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be set
     * @return Builder object with new value for _endpointDocumentation
     */
    public AppEndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
        this.appEndpointImpl.setEndpointDocumentation(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be added
     * @return Builder object with new value for _endpointDocumentation
     */
    public AppEndpointBuilder _endpointDocumentation_(URI _endpointDocumentation_) {
        this.appEndpointImpl.getEndpointDocumentation().add(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows setting a value for _path
     * 
     * @param _path_ desired value to be set
     * @return Builder object with new value for _path
     */
    public AppEndpointBuilder _path_(String _path_) {
        this.appEndpointImpl.setPath(_path_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundPath
     * 
     * @param _inboundPath_ desired value to be set
     * @return Builder object with new value for _inboundPath
     */
    public AppEndpointBuilder _inboundPath_(String _inboundPath_) {
        this.appEndpointImpl.setInboundPath(_inboundPath_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundPath
     * 
     * @param _outboundPath_ desired value to be set
     * @return Builder object with new value for _outboundPath
     */
    public AppEndpointBuilder _outboundPath_(String _outboundPath_) {
        this.appEndpointImpl.setOutboundPath(_outboundPath_);
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
    public AppEndpoint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appEndpointImpl);
        return appEndpointImpl;
    }
}
