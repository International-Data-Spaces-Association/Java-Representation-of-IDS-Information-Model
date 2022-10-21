package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class EndpointBuilder implements Builder<Endpoint> {

    private EndpointImpl endpointImpl;

    public EndpointBuilder() {
        endpointImpl = new EndpointImpl();
    }

    public EndpointBuilder(URI id) {
        this();
        endpointImpl.id = id;
    }

    /**
     * This function allows setting a value for _accessURL
     * 
     * @param _accessURL_ desired value to be set
     * @return Builder object with new value for _accessURL
     */
    public EndpointBuilder _accessURL_(URI _accessURL_) {
        this.endpointImpl.setAccessURL(_accessURL_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be set
     * @return Builder object with new value for _endpointInformation
     */
    public EndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
        this.endpointImpl.setEndpointInformation(_endpointInformation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be added
     * @return Builder object with new value for _endpointInformation
     */
    public EndpointBuilder _endpointInformation_(TypedLiteral _endpointInformation_) {
        this.endpointImpl.getEndpointInformation().add(_endpointInformation_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be set
     * @return Builder object with new value for _endpointDocumentation
     */
    public EndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
        this.endpointImpl.setEndpointDocumentation(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be added
     * @return Builder object with new value for _endpointDocumentation
     */
    public EndpointBuilder _endpointDocumentation_(URI _endpointDocumentation_) {
        this.endpointImpl.getEndpointDocumentation().add(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows setting a value for _path
     * 
     * @param _path_ desired value to be set
     * @return Builder object with new value for _path
     */
    public EndpointBuilder _path_(String _path_) {
        this.endpointImpl.setPath(_path_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundPath
     * 
     * @param _inboundPath_ desired value to be set
     * @return Builder object with new value for _inboundPath
     */
    public EndpointBuilder _inboundPath_(String _inboundPath_) {
        this.endpointImpl.setInboundPath(_inboundPath_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundPath
     * 
     * @param _outboundPath_ desired value to be set
     * @return Builder object with new value for _outboundPath
     */
    public EndpointBuilder _outboundPath_(String _outboundPath_) {
        this.endpointImpl.setOutboundPath(_outboundPath_);
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
    public Endpoint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(endpointImpl);
        return endpointImpl;
    }
}
