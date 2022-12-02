package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorUpdateMessageBuilder implements Builder<ConnectorUpdateMessage> {

    private ConnectorUpdateMessageImpl connectorUpdateMessageImpl;

    public ConnectorUpdateMessageBuilder() {
        connectorUpdateMessageImpl = new ConnectorUpdateMessageImpl();
    }

    public ConnectorUpdateMessageBuilder(URI id) {
        this();
        connectorUpdateMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedConnector
     * 
     * @param _affectedConnector_ desired value to be set
     * @return Builder object with new value for _affectedConnector
     */
    public ConnectorUpdateMessageBuilder _affectedConnector_(URI _affectedConnector_) {
        this.connectorUpdateMessageImpl.setAffectedConnector(_affectedConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ConnectorUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
        this.connectorUpdateMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ConnectorUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.connectorUpdateMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ConnectorUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.connectorUpdateMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ConnectorUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.connectorUpdateMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorUpdateMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.connectorUpdateMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorUpdateMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.connectorUpdateMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ConnectorUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.connectorUpdateMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorUpdateMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.connectorUpdateMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorUpdateMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.connectorUpdateMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ConnectorUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.connectorUpdateMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ConnectorUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.connectorUpdateMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ConnectorUpdateMessageBuilder _transferContract_(URI _transferContract_) {
        this.connectorUpdateMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ConnectorUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
        this.connectorUpdateMessageImpl.setContentVersion(_contentVersion_);
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
    public ConnectorUpdateMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorUpdateMessageImpl);
        return connectorUpdateMessageImpl;
    }
}
