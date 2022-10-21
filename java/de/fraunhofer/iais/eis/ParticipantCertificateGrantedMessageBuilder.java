package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ParticipantCertificateGrantedMessageBuilder implements Builder<ParticipantCertificateGrantedMessage> {

    private ParticipantCertificateGrantedMessageImpl participantCertificateGrantedMessageImpl;

    public ParticipantCertificateGrantedMessageBuilder() {
        participantCertificateGrantedMessageImpl = new ParticipantCertificateGrantedMessageImpl();
    }

    public ParticipantCertificateGrantedMessageBuilder(URI id) {
        this();
        participantCertificateGrantedMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedParticipant
     * 
     * @param _affectedParticipant_ desired value to be set
     * @return Builder object with new value for _affectedParticipant
     */
    public ParticipantCertificateGrantedMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
        this.participantCertificateGrantedMessageImpl.setAffectedParticipant(_affectedParticipant_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ParticipantCertificateGrantedMessageBuilder _modelVersion_(String _modelVersion_) {
        this.participantCertificateGrantedMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ParticipantCertificateGrantedMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.participantCertificateGrantedMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ParticipantCertificateGrantedMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.participantCertificateGrantedMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ParticipantCertificateGrantedMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.participantCertificateGrantedMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantCertificateGrantedMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.participantCertificateGrantedMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantCertificateGrantedMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.participantCertificateGrantedMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ParticipantCertificateGrantedMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.participantCertificateGrantedMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantCertificateGrantedMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.participantCertificateGrantedMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantCertificateGrantedMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.participantCertificateGrantedMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ParticipantCertificateGrantedMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.participantCertificateGrantedMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ParticipantCertificateGrantedMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.participantCertificateGrantedMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ParticipantCertificateGrantedMessageBuilder _transferContract_(URI _transferContract_) {
        this.participantCertificateGrantedMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ParticipantCertificateGrantedMessageBuilder _contentVersion_(String _contentVersion_) {
        this.participantCertificateGrantedMessageImpl.setContentVersion(_contentVersion_);
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
    public ParticipantCertificateGrantedMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantCertificateGrantedMessageImpl);
        return participantCertificateGrantedMessageImpl;
    }
}
