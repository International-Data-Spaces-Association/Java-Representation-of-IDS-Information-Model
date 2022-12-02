package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ArtifactRequestMessageBuilder implements Builder<ArtifactRequestMessage> {

    private ArtifactRequestMessageImpl artifactRequestMessageImpl;

    public ArtifactRequestMessageBuilder() {
        artifactRequestMessageImpl = new ArtifactRequestMessageImpl();
    }

    public ArtifactRequestMessageBuilder(URI id) {
        this();
        artifactRequestMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _requestedArtifact
     * 
     * @param _requestedArtifact_ desired value to be set
     * @return Builder object with new value for _requestedArtifact
     */
    public ArtifactRequestMessageBuilder _requestedArtifact_(URI _requestedArtifact_) {
        this.artifactRequestMessageImpl.setRequestedArtifact(_requestedArtifact_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ArtifactRequestMessageBuilder _modelVersion_(String _modelVersion_) {
        this.artifactRequestMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ArtifactRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.artifactRequestMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ArtifactRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.artifactRequestMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ArtifactRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.artifactRequestMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ArtifactRequestMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.artifactRequestMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ArtifactRequestMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.artifactRequestMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ArtifactRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.artifactRequestMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ArtifactRequestMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.artifactRequestMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ArtifactRequestMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.artifactRequestMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ArtifactRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.artifactRequestMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ArtifactRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.artifactRequestMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ArtifactRequestMessageBuilder _transferContract_(URI _transferContract_) {
        this.artifactRequestMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ArtifactRequestMessageBuilder _contentVersion_(String _contentVersion_) {
        this.artifactRequestMessageImpl.setContentVersion(_contentVersion_);
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
    public ArtifactRequestMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(artifactRequestMessageImpl);
        return artifactRequestMessageImpl;
    }
}
