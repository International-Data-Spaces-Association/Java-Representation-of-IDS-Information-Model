package de.fraunhofer.iais.eis;

import java.net.URI;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import de.fraunhofer.iais.eis.util.*;

public class RejectionMessageBuilder implements Builder<RejectionMessage> {

    private RejectionMessageImpl rejectionMessageImpl;

    public RejectionMessageBuilder() {
        rejectionMessageImpl = new RejectionMessageImpl();
    }

    public RejectionMessageBuilder(URI id) {
        this();
        rejectionMessageImpl.id = id;
    }

    /**
     * This function allows setting a value for _rejectionReason
     * 
     * @param _rejectionReason_ desired value to be set
     * @return Builder object with new value for _rejectionReason
     */
    public RejectionMessageBuilder _rejectionReason_(RejectionReason _rejectionReason_) {
        this.rejectionMessageImpl.setRejectionReason(_rejectionReason_);
        return this;
    }

    /**
     * This function allows setting a value for _modelVersion
     * 
     * @param _modelVersion_ desired value to be set
     * @return Builder object with new value for _modelVersion
     */
    public RejectionMessageBuilder _modelVersion_(String _modelVersion_) {
        this.rejectionMessageImpl.setModelVersion(_modelVersion_);
        return this;
    }

    /**
     * This function allows setting a value for _issued
     * 
     * @param _issued_ desired value to be set
     * @return Builder object with new value for _issued
     */
    public RejectionMessageBuilder _issued_(XMLGregorianCalendar _issued_) {
        this.rejectionMessageImpl.setIssued(_issued_);
        return this;
    }

    /**
     * This function allows setting a value for _correlationMessage
     * 
     * @param _correlationMessage_ desired value to be set
     * @return Builder object with new value for _correlationMessage
     */
    public RejectionMessageBuilder _correlationMessage_(URI _correlationMessage_) {
        this.rejectionMessageImpl.setCorrelationMessage(_correlationMessage_);
        return this;
    }

    /**
     * This function allows setting a value for _issuerConnector
     * 
     * @param _issuerConnector_ desired value to be set
     * @return Builder object with new value for _issuerConnector
     */
    public RejectionMessageBuilder _issuerConnector_(URI _issuerConnector_) {
        this.rejectionMessageImpl.setIssuerConnector(_issuerConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be set
     * @return Builder object with new value for _recipientConnector
     */
    public RejectionMessageBuilder _recipientConnector_(List<URI> _recipientConnector_) {
        this.rejectionMessageImpl.setRecipientConnector(_recipientConnector_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientConnector
     * 
     * @param _recipientConnector_ desired value to be added
     * @return Builder object with new value for _recipientConnector
     */
    public RejectionMessageBuilder _recipientConnector_(URI _recipientConnector_) {
        this.rejectionMessageImpl.getRecipientConnector().add(_recipientConnector_);
        return this;
    }

    /**
     * This function allows setting a value for _senderAgent
     * 
     * @param _senderAgent_ desired value to be set
     * @return Builder object with new value for _senderAgent
     */
    public RejectionMessageBuilder _senderAgent_(URI _senderAgent_) {
        this.rejectionMessageImpl.setSenderAgent(_senderAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be set
     * @return Builder object with new value for _recipientAgent
     */
    public RejectionMessageBuilder _recipientAgent_(List<URI> _recipientAgent_) {
        this.rejectionMessageImpl.setRecipientAgent(_recipientAgent_);
        return this;
    }

    /**
     * This function allows adding a value to the List _recipientAgent
     * 
     * @param _recipientAgent_ desired value to be added
     * @return Builder object with new value for _recipientAgent
     */
    public RejectionMessageBuilder _recipientAgent_(URI _recipientAgent_) {
        this.rejectionMessageImpl.getRecipientAgent().add(_recipientAgent_);
        return this;
    }

    /**
     * This function allows setting a value for _securityToken
     * 
     * @param _securityToken_ desired value to be set
     * @return Builder object with new value for _securityToken
     */
    public RejectionMessageBuilder _securityToken_(DynamicAttributeToken _securityToken_) {
        this.rejectionMessageImpl.setSecurityToken(_securityToken_);
        return this;
    }

    /**
     * This function allows setting a value for _authorizationToken
     * 
     * @param _authorizationToken_ desired value to be set
     * @return Builder object with new value for _authorizationToken
     */
    public RejectionMessageBuilder _authorizationToken_(Token _authorizationToken_) {
        this.rejectionMessageImpl.setAuthorizationToken(_authorizationToken_);
        return this;
    }

    /**
     * This function allows setting a value for _transferContract
     * 
     * @param _transferContract_ desired value to be set
     * @return Builder object with new value for _transferContract
     */
    public RejectionMessageBuilder _transferContract_(URI _transferContract_) {
        this.rejectionMessageImpl.setTransferContract(_transferContract_);
        return this;
    }

    /**
     * This function allows setting a value for _contentVersion
     * 
     * @param _contentVersion_ desired value to be set
     * @return Builder object with new value for _contentVersion
     */
    public RejectionMessageBuilder _contentVersion_(String _contentVersion_) {
        this.rejectionMessageImpl.setContentVersion(_contentVersion_);
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
    public RejectionMessage build() throws ConstraintViolationException {
        VocabUtil.getInstance().validate(rejectionMessageImpl);
        return rejectionMessageImpl;
    }
}
