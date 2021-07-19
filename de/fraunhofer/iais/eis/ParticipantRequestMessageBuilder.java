package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ParticipantRequestMessageBuilder implements Builder<ParticipantRequestMessage> {

    private ParticipantRequestMessageImpl participantRequestMessageImpl;

    public ParticipantRequestMessageBuilder() {
        participantRequestMessageImpl = new ParticipantRequestMessageImpl();
    }

    public ParticipantRequestMessageBuilder(URI id) {
        this();
        participantRequestMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _requestedParticipant
     * 
     * @param _requestedParticipant_ desired value to be set
     * @return Builder object with new value for _requestedParticipant
     */
    public ParticipantRequestMessageBuilder _requestedParticipant_(URI _requestedParticipant_) {
        this.participantRequestMessageImpl.setRequestedParticipant(_requestedParticipant_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ParticipantRequestMessageBuilder _modelVersion_(String _modelVersion_) {
        this.participantRequestMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ParticipantRequestMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.participantRequestMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ParticipantRequestMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.participantRequestMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ParticipantRequestMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.participantRequestMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantRequestMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.participantRequestMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantRequestMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.participantRequestMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ParticipantRequestMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.participantRequestMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantRequestMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.participantRequestMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantRequestMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.participantRequestMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ParticipantRequestMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.participantRequestMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ParticipantRequestMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.participantRequestMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ParticipantRequestMessageBuilder _transferContract_(URI _transferContract_) {
        this.participantRequestMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ParticipantRequestMessageBuilder _contentVersion_(String _contentVersion_) {
        this.participantRequestMessageImpl.setContentVersion(_contentVersion_);
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
    public ParticipantRequestMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantRequestMessageImpl);
        return participantRequestMessageImpl;
    }
}
