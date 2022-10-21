package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ParticipantCertificateRevokedMessageBuilder implements Builder<ParticipantCertificateRevokedMessage> {

    private ParticipantCertificateRevokedMessageImpl participantCertificateRevokedMessageImpl;

    public ParticipantCertificateRevokedMessageBuilder() {
        participantCertificateRevokedMessageImpl = new ParticipantCertificateRevokedMessageImpl();
    }

    public ParticipantCertificateRevokedMessageBuilder(URI id) {
        this();
        participantCertificateRevokedMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _revocationReason
     * 
     * @param _revocationReason_ desired value to be set
     * @return Builder object with new value for _revocationReason
     */
    public ParticipantCertificateRevokedMessageBuilder _revocationReason_(TypedLiteral _revocationReason_) {
        this.participantCertificateRevokedMessageImpl.setRevocationReason(_revocationReason_);
        return this;
    }

    /**
     * This function allows setting a value for _affectedParticipant
     * 
     * @param _affectedParticipant_ desired value to be set
     * @return Builder object with new value for _affectedParticipant
     */
    public ParticipantCertificateRevokedMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
        this.participantCertificateRevokedMessageImpl.setAffectedParticipant(_affectedParticipant_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ParticipantCertificateRevokedMessageBuilder _modelVersion_(String _modelVersion_) {
        this.participantCertificateRevokedMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ParticipantCertificateRevokedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.participantCertificateRevokedMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ParticipantCertificateRevokedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.participantCertificateRevokedMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ParticipantCertificateRevokedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.participantCertificateRevokedMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantCertificateRevokedMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.participantCertificateRevokedMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantCertificateRevokedMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.participantCertificateRevokedMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ParticipantCertificateRevokedMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.participantCertificateRevokedMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantCertificateRevokedMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.participantCertificateRevokedMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantCertificateRevokedMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.participantCertificateRevokedMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ParticipantCertificateRevokedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.participantCertificateRevokedMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ParticipantCertificateRevokedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.participantCertificateRevokedMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ParticipantCertificateRevokedMessageBuilder _transferContract_(URI _transferContract_) {
        this.participantCertificateRevokedMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ParticipantCertificateRevokedMessageBuilder _contentVersion_(String _contentVersion_) {
        this.participantCertificateRevokedMessageImpl.setContentVersion(_contentVersion_);
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
    public ParticipantCertificateRevokedMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantCertificateRevokedMessageImpl);
        return participantCertificateRevokedMessageImpl;
    }
}
