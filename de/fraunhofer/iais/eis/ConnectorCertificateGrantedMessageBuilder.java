package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorCertificateGrantedMessageBuilder implements Builder<ConnectorCertificateGrantedMessage> {

    private ConnectorCertificateGrantedMessageImpl connectorCertificateGrantedMessageImpl;

    public ConnectorCertificateGrantedMessageBuilder() {
        connectorCertificateGrantedMessageImpl = new ConnectorCertificateGrantedMessageImpl();
    }

    public ConnectorCertificateGrantedMessageBuilder(URI id) {
        this();
        connectorCertificateGrantedMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedConnector
     * 
     * @param _affectedConnector_ desired value to be set
     * @return Builder object with new value for _affectedConnector
     */
    public ConnectorCertificateGrantedMessageBuilder _affectedConnector_(URI _affectedConnector_) {
        this.connectorCertificateGrantedMessageImpl.setAffectedConnector(_affectedConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ConnectorCertificateGrantedMessageBuilder _modelVersion_(String _modelVersion_) {
        this.connectorCertificateGrantedMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ConnectorCertificateGrantedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.connectorCertificateGrantedMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ConnectorCertificateGrantedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.connectorCertificateGrantedMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ConnectorCertificateGrantedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.connectorCertificateGrantedMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorCertificateGrantedMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.connectorCertificateGrantedMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorCertificateGrantedMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.connectorCertificateGrantedMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ConnectorCertificateGrantedMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.connectorCertificateGrantedMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorCertificateGrantedMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.connectorCertificateGrantedMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorCertificateGrantedMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.connectorCertificateGrantedMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ConnectorCertificateGrantedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.connectorCertificateGrantedMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ConnectorCertificateGrantedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.connectorCertificateGrantedMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ConnectorCertificateGrantedMessageBuilder _transferContract_(URI _transferContract_) {
        this.connectorCertificateGrantedMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ConnectorCertificateGrantedMessageBuilder _contentVersion_(String _contentVersion_) {
        this.connectorCertificateGrantedMessageImpl.setContentVersion(_contentVersion_);
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
    public ConnectorCertificateGrantedMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorCertificateGrantedMessageImpl);
        return connectorCertificateGrantedMessageImpl;
    }
}
