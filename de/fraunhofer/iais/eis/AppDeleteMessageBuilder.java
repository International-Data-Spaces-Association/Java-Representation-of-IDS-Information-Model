package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class AppDeleteMessageBuilder implements Builder<AppDeleteMessage> {

    private AppDeleteMessageImpl appDeleteMessageImpl;

    public AppDeleteMessageBuilder() {
        appDeleteMessageImpl = new AppDeleteMessageImpl();
    }

    public AppDeleteMessageBuilder(URI id) {
        this();
        appDeleteMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedResource
     * 
     * @param _affectedResource_ desired value to be set
     * @return Builder object with new value for _affectedResource
     */
    public AppDeleteMessageBuilder _affectedResource_(URI _affectedResource_) {
        this.appDeleteMessageImpl.setAffectedResource(_affectedResource_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public AppDeleteMessageBuilder _modelVersion_(String _modelVersion_) {
        this.appDeleteMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public AppDeleteMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.appDeleteMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public AppDeleteMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.appDeleteMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public AppDeleteMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.appDeleteMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public AppDeleteMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.appDeleteMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public AppDeleteMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.appDeleteMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public AppDeleteMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.appDeleteMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public AppDeleteMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.appDeleteMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public AppDeleteMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.appDeleteMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public AppDeleteMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.appDeleteMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public AppDeleteMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.appDeleteMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public AppDeleteMessageBuilder _transferContract_(URI _transferContract_) {
        this.appDeleteMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public AppDeleteMessageBuilder _contentVersion_(String _contentVersion_) {
        this.appDeleteMessageImpl.setContentVersion(_contentVersion_);
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
    public AppDeleteMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appDeleteMessageImpl);
        return appDeleteMessageImpl;
    }
}
