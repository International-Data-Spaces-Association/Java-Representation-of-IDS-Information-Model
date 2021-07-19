package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ConnectorCertificateRevokedMessageBuilder implements Builder<ConnectorCertificateRevokedMessage> {

    private ConnectorCertificateRevokedMessageImpl connectorCertificateRevokedMessageImpl;

    public ConnectorCertificateRevokedMessageBuilder() {
        connectorCertificateRevokedMessageImpl = new ConnectorCertificateRevokedMessageImpl();
    }

    public ConnectorCertificateRevokedMessageBuilder(URI id) {
        this();
        connectorCertificateRevokedMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _revocationReason
     * 
     * @param _revocationReason_ desired value to be set
     * @return Builder object with new value for _revocationReason
     */
    public ConnectorCertificateRevokedMessageBuilder _revocationReason_(TypedLiteral _revocationReason_) {
        this.connectorCertificateRevokedMessageImpl.setRevocationReason(_revocationReason_);
        return this;
    }

    /**
     * This function allows setting a value for _affectedConnector
     * 
     * @param _affectedConnector_ desired value to be set
     * @return Builder object with new value for _affectedConnector
     */
    public ConnectorCertificateRevokedMessageBuilder _affectedConnector_(URI _affectedConnector_) {
        this.connectorCertificateRevokedMessageImpl.setAffectedConnector(_affectedConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ConnectorCertificateRevokedMessageBuilder _modelVersion_(String _modelVersion_) {
        this.connectorCertificateRevokedMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ConnectorCertificateRevokedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.connectorCertificateRevokedMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ConnectorCertificateRevokedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.connectorCertificateRevokedMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ConnectorCertificateRevokedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.connectorCertificateRevokedMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorCertificateRevokedMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.connectorCertificateRevokedMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ConnectorCertificateRevokedMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.connectorCertificateRevokedMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ConnectorCertificateRevokedMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.connectorCertificateRevokedMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorCertificateRevokedMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.connectorCertificateRevokedMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ConnectorCertificateRevokedMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.connectorCertificateRevokedMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ConnectorCertificateRevokedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.connectorCertificateRevokedMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ConnectorCertificateRevokedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.connectorCertificateRevokedMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ConnectorCertificateRevokedMessageBuilder _transferContract_(URI _transferContract_) {
        this.connectorCertificateRevokedMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ConnectorCertificateRevokedMessageBuilder _contentVersion_(String _contentVersion_) {
        this.connectorCertificateRevokedMessageImpl.setContentVersion(_contentVersion_);
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
    public ConnectorCertificateRevokedMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(connectorCertificateRevokedMessageImpl);
        return connectorCertificateRevokedMessageImpl;
    }
}
