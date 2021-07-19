package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorUnavailableMessageBuilder implements Builder<ConnectorUnavailableMessage> {

    private ConnectorUnavailableMessageImpl connectorUnavailableMessageImpl;

    public ConnectorUnavailableMessageBuilder() {
        connectorUnavailableMessageImpl = new ConnectorUnavailableMessageImpl();
    }

    public ConnectorUnavailableMessageBuilder(URI id) {
        this();
        connectorUnavailableMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedConnector
     * 
     * @param _affectedConnector_ desired value to be set
     * @return Builder object with new value for _affectedConnector
     */
    public ConnectorUnavailableMessageBuilder _affectedConnector_(URI _affectedConnector_) {
        this.connectorUnavailableMessageImpl.setAffectedConnector(_affectedConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ConnectorUnavailableMessageBuilder _modelVersion_(String _modelVersion_) {
        this.connectorUnavailableMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ConnectorUnavailableMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.connectorUnavailableMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ConnectorUnavailableMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.connectorUnavailableMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ConnectorUnavailableMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.connectorUnavailableMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorUnavailableMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.connectorUnavailableMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorUnavailableMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.connectorUnavailableMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ConnectorUnavailableMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.connectorUnavailableMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorUnavailableMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.connectorUnavailableMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorUnavailableMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.connectorUnavailableMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ConnectorUnavailableMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.connectorUnavailableMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ConnectorUnavailableMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.connectorUnavailableMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ConnectorUnavailableMessageBuilder _transferContract_(URI _transferContract_) {
        this.connectorUnavailableMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ConnectorUnavailableMessageBuilder _contentVersion_(String _contentVersion_) {
        this.connectorUnavailableMessageImpl.setContentVersion(_contentVersion_);
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
    public ConnectorUnavailableMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorUnavailableMessageImpl);
        return connectorUnavailableMessageImpl;
    }
}
