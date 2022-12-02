package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ResourceUpdateMessageBuilder implements Builder<ResourceUpdateMessage> {

    private ResourceUpdateMessageImpl resourceUpdateMessageImpl;

    public ResourceUpdateMessageBuilder() {
        resourceUpdateMessageImpl = new ResourceUpdateMessageImpl();
    }

    public ResourceUpdateMessageBuilder(URI id) {
        this();
        resourceUpdateMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedResource
     * 
     * @param _affectedResource_ desired value to be set
     * @return Builder object with new value for _affectedResource
     */
    public ResourceUpdateMessageBuilder _affectedResource_(URI _affectedResource_) {
        this.resourceUpdateMessageImpl.setAffectedResource(_affectedResource_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ResourceUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
        this.resourceUpdateMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ResourceUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.resourceUpdateMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ResourceUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.resourceUpdateMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ResourceUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.resourceUpdateMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ResourceUpdateMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.resourceUpdateMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ResourceUpdateMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.resourceUpdateMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ResourceUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.resourceUpdateMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ResourceUpdateMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.resourceUpdateMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ResourceUpdateMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.resourceUpdateMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ResourceUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.resourceUpdateMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ResourceUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.resourceUpdateMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ResourceUpdateMessageBuilder _transferContract_(URI _transferContract_) {
        this.resourceUpdateMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ResourceUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
        this.resourceUpdateMessageImpl.setContentVersion(_contentVersion_);
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
    public ResourceUpdateMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(resourceUpdateMessageImpl);
        return resourceUpdateMessageImpl;
    }
}
