package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class ParticipantUpdateMessageBuilder implements Builder<ParticipantUpdateMessage> {

    private ParticipantUpdateMessageImpl participantUpdateMessageImpl;

    public ParticipantUpdateMessageBuilder() {
        participantUpdateMessageImpl = new ParticipantUpdateMessageImpl();
    }

    public ParticipantUpdateMessageBuilder(URI id) {
        this();
        participantUpdateMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _affectedParticipant
     * 
     * @param _affectedParticipant_ desired value to be set
     * @return Builder object with new value for _affectedParticipant
     */
    public ParticipantUpdateMessageBuilder _affectedParticipant_(URI _affectedParticipant_) {
        this.participantUpdateMessageImpl.setAffectedParticipant(_affectedParticipant_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public ParticipantUpdateMessageBuilder _modelVersion_(String _modelVersion_) {
        this.participantUpdateMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public ParticipantUpdateMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.participantUpdateMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public ParticipantUpdateMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.participantUpdateMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public ParticipantUpdateMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.participantUpdateMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantUpdateMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.participantUpdateMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public ParticipantUpdateMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.participantUpdateMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public ParticipantUpdateMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.participantUpdateMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantUpdateMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.participantUpdateMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public ParticipantUpdateMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.participantUpdateMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public ParticipantUpdateMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.participantUpdateMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public ParticipantUpdateMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.participantUpdateMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public ParticipantUpdateMessageBuilder _transferContract_(URI _transferContract_) {
        this.participantUpdateMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public ParticipantUpdateMessageBuilder _contentVersion_(String _contentVersion_) {
        this.participantUpdateMessageImpl.setContentVersion(_contentVersion_);
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
    public ParticipantUpdateMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(participantUpdateMessageImpl);
        return participantUpdateMessageImpl;
    }
}
