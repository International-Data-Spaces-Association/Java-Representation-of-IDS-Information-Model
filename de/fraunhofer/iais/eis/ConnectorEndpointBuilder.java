package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class ConnectorEndpointBuilder implements Builder<ConnectorEndpoint> {

    private ConnectorEndpointImpl connectorEndpointImpl;

    public ConnectorEndpointBuilder() {
        connectorEndpointImpl = new ConnectorEndpointImpl();
    }

    public ConnectorEndpointBuilder(URI id) {
        this();
        connectorEndpointImpl.id = id;
    }

    /**
     * This function allows setting a value for _endpointArtifact
     * 
     * @param _endpointArtifact_ desired value to be set
     * @return Builder object with new value for _endpointArtifact
     */
    public ConnectorEndpointBuilder _endpointArtifact_(Artifact _endpointArtifact_) {
        this.connectorEndpointImpl.setEndpointArtifact(_endpointArtifact_);
        return this;
    }

    /**
     * This function allows setting a value for _accessURL
     * 
     * @param _accessURL_ desired value to be set
     * @return Builder object with new value for _accessURL
     */
    public ConnectorEndpointBuilder _accessURL_(URI _accessURL_) {
        this.connectorEndpointImpl.setAccessURL(_accessURL_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be set
     * @return Builder object with new value for _endpointInformation
     */
    public ConnectorEndpointBuilder _endpointInformation_(List<TypedLiteral> _endpointInformation_) {
        this.connectorEndpointImpl.setEndpointInformation(_endpointInformation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointInformation
     * 
     * @param _endpointInformation_ desired value to be added
     * @return Builder object with new value for _endpointInformation
     */
    public ConnectorEndpointBuilder _endpointInformation_(TypedLiteral _endpointInformation_) {
        this.connectorEndpointImpl.getEndpointInformation().add(_endpointInformation_);
        return this;
    }

    /**
     * This function allows setting a value for _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be set
     * @return Builder object with new value for _endpointDocumentation
     */
    public ConnectorEndpointBuilder _endpointDocumentation_(List<URI> _endpointDocumentation_) {
        this.connectorEndpointImpl.setEndpointDocumentation(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows adding a value to the List _endpointDocumentation
     * 
     * @param _endpointDocumentation_ desired value to be added
     * @return Builder object with new value for _endpointDocumentation
     */
    public ConnectorEndpointBuilder _endpointDocumentation_(URI _endpointDocumentation_) {
        this.connectorEndpointImpl.getEndpointDocumentation().add(_endpointDocumentation_);
        return this;
    }

    /**
     * This function allows setting a value for _path
     * 
     * @param _path_ desired value to be set
     * @return Builder object with new value for _path
     */
    public ConnectorEndpointBuilder _path_(String _path_) {
        this.connectorEndpointImpl.setPath(_path_);
        return this;
    }

    /**
     * This function allows setting a value for _inboundPath
     * 
     * @param _inboundPath_ desired value to be set
     * @return Builder object with new value for _inboundPath
     */
    public ConnectorEndpointBuilder _inboundPath_(String _inboundPath_) {
        this.connectorEndpointImpl.setInboundPath(_inboundPath_);
        return this;
    }

    /**
     * This function allows setting a value for _outboundPath
     * 
     * @param _outboundPath_ desired value to be set
     * @return Builder object with new value for _outboundPath
     */
    public ConnectorEndpointBuilder _outboundPath_(String _outboundPath_) {
        this.connectorEndpointImpl.setOutboundPath(_outboundPath_);
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
    public ConnectorEndpoint build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorEndpointImpl);
        return connectorEndpointImpl;
    }
}
