package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import de.fraunhofer.iais.eis.util.*;

public class MessageProcessedNotificationMessageBuilder implements Builder<MessageProcessedNotificationMessage> {

    private MessageProcessedNotificationMessageImpl messageProcessedNotificationMessageImpl;

    public MessageProcessedNotificationMessageBuilder() {
        messageProcessedNotificationMessageImpl = new MessageProcessedNotificationMessageImpl();
    }

    public MessageProcessedNotificationMessageBuilder(URI id) {
        this();
        messageProcessedNotificationMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public MessageProcessedNotificationMessageBuilder _modelVersion_(String _modelVersion_) {
        this.messageProcessedNotificationMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public MessageProcessedNotificationMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.messageProcessedNotificationMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public MessageProcessedNotificationMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.messageProcessedNotificationMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public MessageProcessedNotificationMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.messageProcessedNotificationMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public MessageProcessedNotificationMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.messageProcessedNotificationMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public MessageProcessedNotificationMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.messageProcessedNotificationMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public MessageProcessedNotificationMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.messageProcessedNotificationMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public MessageProcessedNotificationMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.messageProcessedNotificationMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public MessageProcessedNotificationMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.messageProcessedNotificationMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public MessageProcessedNotificationMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.messageProcessedNotificationMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public MessageProcessedNotificationMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.messageProcessedNotificationMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public MessageProcessedNotificationMessageBuilder _transferContract_(URI _transferContract_) {
        this.messageProcessedNotificationMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public MessageProcessedNotificationMessageBuilder _contentVersion_(String _contentVersion_) {
        this.messageProcessedNotificationMessageImpl.setContentVersion(_contentVersion_);
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
    public MessageProcessedNotificationMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(messageProcessedNotificationMessageImpl);
        return messageProcessedNotificationMessageImpl;
    }
}
