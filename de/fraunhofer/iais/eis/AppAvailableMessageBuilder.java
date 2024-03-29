package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import de.fraunhofer.iais.eis.util.*;

public class AppAvailableMessageBuilder implements Builder<AppAvailableMessage> {

    private AppAvailableMessageImpl appAvailableMessageImpl;

    public AppAvailableMessageBuilder() {
        appAvailableMessageImpl = new AppAvailableMessageImpl();
    }

    public AppAvailableMessageBuilder(URI id) {
        this();
        appAvailableMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedResource
     * 
     * @param _affectedResource_ desired value to be set
     * @return Builder object with new value for _affectedResource
     */
    public AppAvailableMessageBuilder _affectedResource_(URI _affectedResource_) {
        this.appAvailableMessageImpl.setAffectedResource(_affectedResource_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public AppAvailableMessageBuilder _modelVersion_(String _modelVersion_) {
        this.appAvailableMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public AppAvailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.appAvailableMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public AppAvailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.appAvailableMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public AppAvailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.appAvailableMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public AppAvailableMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.appAvailableMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public AppAvailableMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.appAvailableMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public AppAvailableMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.appAvailableMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public AppAvailableMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.appAvailableMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public AppAvailableMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.appAvailableMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public AppAvailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.appAvailableMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public AppAvailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.appAvailableMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public AppAvailableMessageBuilder _transferContract_(URI _transferContract_) {
        this.appAvailableMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public AppAvailableMessageBuilder _contentVersion_(String _contentVersion_) {
        this.appAvailableMessageImpl.setContentVersion(_contentVersion_);
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
    public AppAvailableMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(appAvailableMessageImpl);
        return appAvailableMessageImpl;
    }
}
